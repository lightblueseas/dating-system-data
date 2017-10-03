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
import de.alpharogroup.dating.system.daos.ProfileVisitorsDao;
import de.alpharogroup.dating.system.entities.ProfileVisitors;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.dating.system.service.api.ProfileVisitorsService;
import de.alpharogroup.dating.system.service.utils.HqlStringCreator;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.user.entities.Users;

@Transactional
@Service("profileVisitorsService")
public class ProfileVisitorsBusinessService
	extends
		AbstractBusinessService<ProfileVisitors, Integer, ProfileVisitorsDao>
	implements
		ProfileVisitorsService
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ProfileVisitors find(Users visitor, UserProfiles visitedProfile)
	{
		final List<ProfileVisitors> profileVisitors = findAll(visitor, visitedProfile);
		return ListExtensions.getFirst(profileVisitors);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ProfileVisitors> findAll(Users visitor, UserProfiles visitedProfile)
	{
		final String hqlString = HqlStringCreator.forProfileVisitors(visitor, visitedProfile);
		final Query query = getQuery(hqlString);
		if (visitor != null)
		{
			query.setParameter("visitor", visitor);
		}
		if (visitedProfile != null)
		{
			query.setParameter("visitedProfile", visitedProfile);
		}
		final List<ProfileVisitors> profileVisitors = query.getResultList();
		return profileVisitors;
	}

	@Override
	public List<ProfileVisitors> findProfileVisitors(UserProfiles visitedProfile)
	{
		final List<ProfileVisitors> profileVisitors = findAll(null, visitedProfile);
		return profileVisitors;
	}

	@Autowired
	public void setProfileVisitorsDao(ProfileVisitorsDao profileVisitorsDao)
	{
		setDao(profileVisitorsDao);
	}

}