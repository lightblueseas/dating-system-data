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

import de.alpharogroup.collections.ListExtensions;
import de.alpharogroup.dating.system.daos.FavoriteMembersDao;
import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.dating.system.service.api.FavoriteMembersService;
import de.alpharogroup.dating.system.service.utils.HqlStringCreator;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.user.entities.Users;

@Transactional
@Service("favoriteMembersService")
public class FavoriteMembersBusinessService extends
		AbstractBusinessService<FavoriteMembers, Integer, FavoriteMembersDao> implements FavoriteMembersService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public List<FavoriteMembers> find(Users owner) {
		final String hqlString = HqlStringCreator.forFavoriteMembers(owner, null);
		final Query query = getQuery(hqlString);
		query.setParameter("owner", owner);
		final List<FavoriteMembers> favoriteMembers = query.getResultList();
		return favoriteMembers;
	}

	@Transactional
	public FavoriteMembers find(Users owner, UserProfiles favorite) {
		final List<FavoriteMembers> favoriteMembers = findAll(owner, favorite);
		return ListExtensions.getFirst(favoriteMembers);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<FavoriteMembers> findAll(Users owner, UserProfiles favorite) {
		final String hqlString = HqlStringCreator.forFavoriteMembers(owner, favorite);
		final Query query = getQuery(hqlString);
		if (owner != null) {
			query.setParameter("owner", owner);
		}
		if (favorite != null) {
			query.setParameter("favorite", favorite);
		}
		final List<FavoriteMembers> favoriteMembers = query.getResultList();
		return favoriteMembers;
	}

	@Autowired
	public void setFavoriteMembersDao(FavoriteMembersDao favoriteMembersDao) {
		setDao(favoriteMembersDao);
	}

}