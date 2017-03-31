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
package de.alpharogroup.dating.system.service.locator;

import de.alpharogroup.dating.system.service.api.FavoriteMembersService;
import de.alpharogroup.dating.system.service.api.FriendshipRequestsService;
import de.alpharogroup.dating.system.service.api.ProfileNoticesService;
import de.alpharogroup.dating.system.service.api.ProfileRatingsService;
import de.alpharogroup.dating.system.service.api.ProfileVisitorsService;
import de.alpharogroup.dating.system.service.api.SearchCriteriasService;
import de.alpharogroup.dating.system.service.api.UserProfilesService;

/**
 * The Interface ServiceLocator.
 */
public interface ServiceLocator 
extends 
de.alpharogroup.address.book.service.locator.ServiceLocator, 
de.alpharogroup.db.resource.bundles.service.locator.ServiceLocator,
de.alpharogroup.message.system.service.locator.ServiceLocator,
de.alpharogroup.resource.system.service.locator.ServiceLocator,
de.alpharogroup.user.management.service.locator.ServiceLocator
{

	/**
	 * Gets the favorite members service.
	 *
	 * @return the favorite members service
	 */
	FavoriteMembersService getFavoriteMembersService();

	/**
	 * Gets the friendship requests service.
	 *
	 * @return the friendship requests service
	 */
	FriendshipRequestsService getFriendshipRequestsService();

	/**
	 * Gets the profile notice service.
	 *
	 * @return the profile notice service
	 */
	ProfileNoticesService getProfileNoticesService();

	/**
	 * Gets the profile ratings service.
	 *
	 * @return the profile ratings service
	 */
	ProfileRatingsService getProfileRatingsService();
	
	/**
	 * Gets the profile visitors service.
	 *
	 * @return the profile visitors service
	 */
	ProfileVisitorsService getProfileVisitorsService();

	/**
	 * Gets the search criteria service.
	 *
	 * @return the search criteria service
	 */
	SearchCriteriasService getSearchCriteriasService();

	/**
	 * Gets the user profile service.
	 *
	 * @return the user profile service
	 */
	UserProfilesService getUserProfilesService();

	/**
	 * Sets the favorite members service.
	 *
	 * @param favoriteMembersService the favorite members service
	 */
	void setFavoriteMembersService(FavoriteMembersService favoriteMembersService);

	/**
	 * Sets the friendship requests service.
	 *
	 * @param friendshipRequestsService the friendship requests service
	 */
	void setFriendshipRequestsService(FriendshipRequestsService friendshipRequestsService);
	
	/**
	 * Sets the profile notice service.
	 *
	 * @param profileNoticeService the profile notice service
	 */
	void setProfileNoticesService(ProfileNoticesService profileNoticeService);
	
	/**
	 * Sets the profile ratings service.
	 *
	 * @param profileRatingsService the profile ratings service
	 */
	void setProfileRatingsService(ProfileRatingsService profileRatingsService);
	
	/**
	 * Sets the profile visitors service.
	 *
	 * @param profileVisitorsService the profile visitors service
	 */
	void setProfileVisitorsService(ProfileVisitorsService profileVisitorsService);
	
	/**
	 * Sets the search criteria service.
	 *
	 * @param searchCriteriaService the search criteria service
	 */
	void setSearchCriteriasService(SearchCriteriasService searchCriteriaService);
	
	/**
	 * Sets the user profile business service.
	 * 
	 * @param userProfileService
	 *            the new user profile business service
	 */
	void setUserProfilesService(UserProfilesService userProfileService );

}
