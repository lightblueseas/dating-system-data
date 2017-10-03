/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.dating.system.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.collections.list.ListExtensions;
import de.alpharogroup.dating.system.daos.FriendshipRequestsDao;
import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.dating.system.enums.FriendshipRequestsState;
import de.alpharogroup.dating.system.service.api.FriendshipRequestsService;
import de.alpharogroup.dating.system.service.utils.HqlStringCreator;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.user.entities.Users;

@Transactional
@Service("friendshipRequestsService")
public class FriendshipRequestsBusinessService
	extends
		AbstractBusinessService<FriendshipRequests, Integer, FriendshipRequestsDao>
	implements
		FriendshipRequestsService
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public FriendshipRequests find(Users requestor, Users requestedUser)
	{
		return find(requestor, requestedUser, null);
	}

	@Override
	public FriendshipRequests find(Users requestor, Users requestedUser,
		FriendshipRequestsState state)
	{
		final List<FriendshipRequests> friendshipRequests = findAll(requestor, requestedUser,
			state);
		return ListExtensions.getFirst(friendshipRequests);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<FriendshipRequests> findAll(Users requestor, Users requestedUser,
		FriendshipRequestsState state)
	{
		final String hqlString = HqlStringCreator.forFriendshipRequests(requestor, requestedUser,
			state);
		final Query query = getQuery(hqlString);
		if (requestor != null)
		{
			query.setParameter("requestor", requestor);
		}
		if (requestedUser != null)
		{
			query.setParameter("requestedUser", requestedUser);
		}
		if (state != null)
		{
			query.setParameter("state", state);
		}
		final List<FriendshipRequests> friendshipRequests = query.getResultList();
		return friendshipRequests;
	}

	@Autowired
	public void setFriendshipRequestsDao(FriendshipRequestsDao friendshipRequestsDao)
	{
		setDao(friendshipRequestsDao);
	}
}