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
package de.alpharogroup.dating.system.client.models;

import java.util.List;

import de.alpharogroup.address.book.application.model.LocationModel;
import de.alpharogroup.address.book.entities.Addresses;
import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.dating.system.entities.ProfileNotices;
import de.alpharogroup.dating.system.entities.ProfileVisitors;
import de.alpharogroup.dating.system.entities.SearchCriterias;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.user.management.entities.UserDatas;
import de.alpharogroup.user.management.enums.GenderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The class {@link ProfileModel}.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfileModel implements LocationModel<Addresses> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The profile owner. */
	private UserDatas profileOwner;

	/** The user profile. */
	private UserProfiles userProfile;

	/** The age search criteria starting 'from'. */
	private Integer fromAge;

	/** The gender search criteria 'search'. */
	private GenderType searchGender;

	/** The age search criteria ending 'until'. */
	private Integer untilAge;

	/** The website. */
	private String website;

	/** The profile notice. */
	private ProfileNotices profileNotice;

	/** The favorite members. */
	private FavoriteMembers favoriteMembers;

	/** The friendship requests. */
	private FriendshipRequests friendshipRequests;

	/** The profile visitors. */
	private List<ProfileVisitors> profileVisitors;

	/** The gender. */
	private GenderType gender;
	
	/** The address. */
	private Addresses address;
	
	/** The location. */
	private String location;
	
	/** The selected country name. */
	private String selectedCountryName;

	/**
	 * Gets the search criteria.
	 *
	 * @return the search criteria
	 */
	public SearchCriterias getSearchCriteria() {
		return userProfile.getSearchCriteria();
	}

	/**
	 * Sets the search criteria.
	 *
	 * @param searchCriteria the new search criteria
	 */
	public void setSearchCriteria(SearchCriterias searchCriteria) {
		userProfile.setSearchCriteria(searchCriteria);
	}

}
