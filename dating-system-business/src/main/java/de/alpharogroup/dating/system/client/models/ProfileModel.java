package de.alpharogroup.dating.system.client.models;

import java.util.List;

import de.alpharogroup.address.book.application.model.LocationModel;
import de.alpharogroup.address.book.entities.Addresses;
import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.dating.system.entities.ProfileNotice;
import de.alpharogroup.dating.system.entities.ProfileVisitors;
import de.alpharogroup.dating.system.entities.SearchCriteria;
import de.alpharogroup.dating.system.entities.UserProfile;
import de.alpharogroup.user.management.entities.Users;
import de.alpharogroup.user.management.enums.Gender;
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
	private Users profileOwner;

	/** The user profile. */
	private UserProfile userProfile;

	/** The age search criteria starting 'from'. */
	private Integer fromAge;

	/** The gender search criteria 'search'. */
	private Gender searchGender;

	/** The age search criteria ending 'until'. */
	private Integer untilAge;

	/** The website. */
	private String website;

	/** The profile notice. */
	private ProfileNotice profileNotice;

	/** The favorite members. */
	private FavoriteMembers favoriteMembers;

	/** The friendship requests. */
	private FriendshipRequests friendshipRequests;

	/** The profile visitors. */
	private List<ProfileVisitors> profileVisitors;

	/** The gender. */
	private Gender gender;
	
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
	public SearchCriteria getSearchCriteria() {
		return userProfile.getSearchCriteria();
	}

	/**
	 * Sets the search criteria.
	 *
	 * @param searchCriteria the new search criteria
	 */
	public void setSearchCriteria(SearchCriteria searchCriteria) {
		userProfile.setSearchCriteria(searchCriteria);
	}

}
