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

import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.db.service.api.BusinessService;
import de.alpharogroup.resource.system.application.model.ResourcesModel;
import de.alpharogroup.resource.system.entities.Resources;
import de.alpharogroup.user.entities.Users;

/**
 * The interface {@link UserProfilesService}.
 */
public interface UserProfilesService extends BusinessService<UserProfiles, Integer>
{

	/**
	 * Find the profile image from the given user.
	 *
	 * @param user
	 *            the user
	 * @return the profile image or null if there is no image
	 */
	Resources findProfileImage(Users user);

	/**
	 * Find the user profile from the given user.
	 *
	 * @param user
	 *            the user
	 * @return the user profile or null if the given user has no profile
	 */
	UserProfiles findUserProfile(final Users user);

	/**
	 * Find all user profiles from the given user.
	 *
	 * @param user
	 *            the user
	 * @return the list
	 */
	List<UserProfiles> findUserProfiles(final Users user);

	/**
	 * Persists the default image to the profile image from the given user. In case an image already
	 * exists this will be returned.
	 *
	 * @param user
	 *            the user
	 * @return the default image or null if no default image exists.
	 */
	UserProfiles persistDefaultProfileImage(final Users user);

	/**
	 * Persists the default image to the profile image from the given user. In case an image already
	 * exists this will be returned.
	 *
	 * @param user
	 *            the user
	 * @param defaultImage
	 *            the default image
	 * @return the default image or null if no default image exists.
	 */
	UserProfiles persistDefaultProfileImage(final Users user, Resources defaultImage);

	/**
	 * Persists the given ResourceModel as the profile image from the given user.
	 *
	 * @param resourceModel
	 *            the resource model
	 * @param user
	 *            the user
	 * @return the resources
	 */
	Resources persistProfileImage(ResourcesModel resourceModel, final Users user);
}