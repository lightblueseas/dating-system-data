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

public class ProfileModel implements LocationModel {

	private static final long serialVersionUID = 1L;
	
	private Users profileOwner;

	private UserProfile userProfile;
	
	/** The age search criteria starting 'from'. */
	private Integer fromAge;
	
	/** The gender search criteria 'search'. */
	private Gender searchGender;
	
	/** The age search criteria ending 'until'. */
	private Integer untilAge;
	
	private String website;
	
	private ProfileNotice profileNotice;
	
	private FavoriteMembers favoriteMembers;
	
	private FriendshipRequests friendshipRequests;
	
	private List<ProfileVisitors> profileVisitors;
	
	private Gender gender;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Integer getFromAge() {
		return fromAge;
	}

	public Gender getSearchGender() {
		return searchGender;
	}

	public Integer getUntilAge() {
		return untilAge;
	}

	public void setFromAge(Integer fromAge) {
		this.fromAge = fromAge;
	}

	public void setSearchGender(final Gender searchGender) {
		this.searchGender = searchGender;
	}

	public void setUntilAge(Integer untilAge) {
		this.untilAge = untilAge;
	}

	public SearchCriteria getSearchCriteria() {
		return userProfile.getSearchCriteria();
	}

	public void setSearchCriteria(SearchCriteria searchCriteria) {
		userProfile.setSearchCriteria(searchCriteria);
	}
	
	
	public List<ProfileVisitors> getProfileVisitors() {
		return profileVisitors;
	}

	public void setProfileVisitors(List<ProfileVisitors> profileVisitors) {
		this.profileVisitors = profileVisitors;
	}
	private Addresses address;
	private String location;
	private String selectedCountryName;
	
	public FriendshipRequests getFriendshipRequests() {
		return friendshipRequests;
	}

	public void setFriendshipRequests(FriendshipRequests friendshipRequests) {
		this.friendshipRequests = friendshipRequests;
	}

	public FavoriteMembers getFavoriteMembers() {
		return favoriteMembers;
	}

	public void setFavoriteMembers(FavoriteMembers favoriteMembers) {
		this.favoriteMembers = favoriteMembers;
	}

	public ProfileNotice getProfileNotice() {
		return profileNotice;
	}

	public void setProfileNotice(ProfileNotice profileNotice) {
		this.profileNotice = profileNotice;
	}


	public Users getProfileOwner() {
		return profileOwner;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public String getWebsite() {
		return website;
	}

	public void setProfileOwner(Users profileOwner) {
		this.profileOwner = profileOwner;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Addresses getAddress() {
		return address;
	}
	public String getLocation() {
		return location;
	}
	public String getSelectedCountryName() {
		return selectedCountryName;
	}
	public void setAddress(Addresses address) {
		this.address = address;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSelectedCountryName(String selectedCountryName) {
		this.selectedCountryName = selectedCountryName;
	}
}
