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
package de.alpharogroup.dating.system.service.api;

import java.util.List;

import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.db.service.api.BusinessService;
import de.alpharogroup.user.entities.Users;

/**
 * The Interface FavoriteMembersService.
 */
public interface FavoriteMembersService extends BusinessService<FavoriteMembers, Integer>
{

	/**
	 * Gets a List from FavoriteMembers that own the given Users object.
	 *
	 * @param owner
	 *            the owner
	 * @return the list
	 */
	List<FavoriteMembers> find(Users owner);

	/**
	 * Gets a FavoriteMembers object from the given parameters that can be null if they shell be
	 * ignored in the query. If no result is found null will be returned.
	 *
	 * @param owner
	 *            the owner
	 * @param favorite
	 *            the favorite
	 * @return the favorite members
	 */
	FavoriteMembers find(Users owner, UserProfiles favorite);

	/**
	 * Gets a List from FavoriteMembers with the given parameters that can be null if they shell be
	 * ignored in the query.
	 *
	 * @param owner
	 *            the owner
	 * @param favorite
	 *            the favorite
	 * @return the list
	 */
	List<FavoriteMembers> findAll(Users owner, UserProfiles favorite);
}