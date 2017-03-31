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
package de.alpharogroup.dating.system.factories;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import de.alpharogroup.address.book.entities.Addresses;
import de.alpharogroup.address.book.entities.Countries;
import de.alpharogroup.address.book.entities.Federalstates;
import de.alpharogroup.address.book.entities.Zipcodes;
import de.alpharogroup.address.book.factories.AddressBookFactory;
import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.dating.system.entities.ProfileNotices;
import de.alpharogroup.dating.system.entities.ProfileVisitors;
import de.alpharogroup.dating.system.entities.SearchCriterias;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.dating.system.enums.EducationState;
import de.alpharogroup.dating.system.enums.FigureType;
import de.alpharogroup.dating.system.enums.FriendshipRequestsState;
import de.alpharogroup.dating.system.enums.HaircolorType;
import de.alpharogroup.dating.system.enums.InterestsType;
import de.alpharogroup.dating.system.enums.RelationshipState;
import de.alpharogroup.dating.system.enums.SmokerState;
import de.alpharogroup.dating.system.enums.ZodiacSignType;
import de.alpharogroup.message.system.entities.MessageRecipients;
import de.alpharogroup.message.system.entities.Messages;
import de.alpharogroup.message.system.enums.MessageState;
import de.alpharogroup.message.system.enums.MessageType;
import de.alpharogroup.message.system.factories.MessageSystemFactory;
import de.alpharogroup.resource.system.entities.Resources;
import de.alpharogroup.resource.system.factories.ResourceSystemFactory;
import de.alpharogroup.user.entities.Permissions;
import de.alpharogroup.user.entities.ResetPasswords;
import de.alpharogroup.user.entities.Roles;
import de.alpharogroup.user.entities.Users;
import de.alpharogroup.user.management.entities.Contactmethods;
import de.alpharogroup.user.management.enums.ContactmethodType;
import de.alpharogroup.user.management.enums.GenderType;
import de.alpharogroup.user.management.factories.UserManagementFactory;

/**
 * DAO factory implementation author: auto-generated
 */
public class FlirtAndDateObjectFactory implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/** The Constant instance. */
	private static final FlirtAndDateObjectFactory instance = new FlirtAndDateObjectFactory();

	/**
	 * Gets the single instance of DomainObjectFactory.
	 *
	 * @return single instance of DomainObjectFactory
	 */
	public static FlirtAndDateObjectFactory getInstance() {
		return instance;
	}

	/**
	 * Instantiates a new domain object factory.
	 */
	private FlirtAndDateObjectFactory() {
		super();
	}

	/**
	 * Data pool factory for Addresses.
	 *
	 * @param addressComment
	 *            the address comment
	 * @param federalstate
	 *            A valid Federalstates object
	 * @param geohash
	 *            the geohash
	 * @param id
	 *            the id
	 * @param latitude
	 *            the latitude
	 * @param longitude
	 *            the longitude
	 * @param street
	 *            the street
	 * @param streetnumber
	 *            the streetnumber
	 * @param zipcode
	 *            A valid Zipcodes object
	 * @return Addresses A Addresses object
	 */
	public Addresses newAddresses(final String addressComment, final Federalstates federalstate, final String geohash,
			final Integer id, final String latitude, final String longitude, final String street,
			final String streetnumber, final Zipcodes zipcode) {
		return AddressBookFactory.getInstance().newAddresses(addressComment, federalstate, geohash, id, latitude,
				longitude, street, streetnumber, zipcode);
	}

	/**
	 * Domain object factory for Contactmethods.
	 *
	 * @param contactmethod
	 *            the contactmethod
	 * @param contactvalue
	 *            the contactvalue
	 * @param id
	 *            the id
	 * @return ContactmethodsA Contactmethods object
	 */
	public Contactmethods newContactmethods(final ContactmethodType contactmethod, final String contactvalue,
			final Integer id) {
		return UserManagementFactory.getInstance().newContactmethods(contactmethod, contactvalue, id);
	}

	/**
	 * Domain object factory for Countries.
	 *
	 * @param id
	 *            the id
	 * @param iso3166A2name
	 *            the iso3166 a2name
	 * @param iso3166A3name
	 *            the iso3166 a3name
	 * @param iso3166Number
	 *            the iso3166 number
	 * @param name
	 *            the name
	 * @return CountriesA Countries object
	 */
	public Countries newCountries(final Integer id, final String iso3166A2name, final String iso3166A3name,
			final String iso3166Number, final String name) {
		return AddressBookFactory.getInstance().newCountries(id, iso3166A2name, iso3166A3name, iso3166Number, name);
	}

	/**
	 * New favorite members.
	 *
	 * @param favorite
	 *            the favorite
	 * @param owner
	 *            the owner
	 * @return the favorite members
	 */
	public FavoriteMembers newFavoriteMembers(final UserProfiles favorite, final Users owner) {
		final FavoriteMembers favoriteMembers = new FavoriteMembers();
		favoriteMembers.setFavorite(favorite);
		favoriteMembers.setOwner(owner);
		return favoriteMembers;
	}

	/**
	 * Data pool factory for Federalstates.
	 *
	 * @param country
	 *            A valid Countries object
	 * @param id
	 *            the id
	 * @param iso3166A2code
	 *            the iso3166 a2code
	 * @param name
	 *            the name
	 * @param subdivisionCategory
	 *            the subdivision category
	 * @param subdivisionName
	 *            the subdivision name
	 * @return Federalstates A Federalstates object
	 */
	public Federalstates newFederalstates(final Countries country, final Integer id, final String iso3166A2code,
			final String name, final String subdivisionCategory, final String subdivisionName) {
		return AddressBookFactory.getInstance().newFederalstates(country, id, iso3166A2code, name, subdivisionCategory,
				subdivisionName);
	}

	/**
	 * New friendship requests.
	 *
	 * @param requestor
	 *            the requestor
	 * @param requestedUser
	 *            the requested user
	 * @param state
	 *            the state
	 * @return the friendship requests
	 */
	public FriendshipRequests newFriendshipRequests(final Users requestor, final Users requestedUser,
			final FriendshipRequestsState state) {
		final FriendshipRequests friendshipRequests = new FriendshipRequests();
		friendshipRequests.setRequestor(requestor);
		friendshipRequests.setRequestedUser(requestedUser);
		friendshipRequests.setState(state);
		return friendshipRequests;
	}

	/**
	 * Data pool factory for MessageRecipients.
	 *
	 * @param id
	 *            the id
	 * @param message
	 *            A valid Messages object
	 * @param recipient
	 *            A valid Users object
	 * @return MessageRecipients A MessageRecipients object
	 */
	public MessageRecipients newMessageRecipients(final Integer id, final Messages message, final Users recipient) {
		return MessageSystemFactory.getInstance().newMessageRecipients(id, message, recipient);
	}

	/**
	 * Data pool factory for Messages.
	 *
	 * @param deletedFlag
	 *            the deleted flag
	 * @param failed2sentemail
	 *            the failed2sentemail
	 * @param folder
	 *            the folder
	 * @param id
	 *            the id
	 * @param messageContent
	 *            the message content
	 * @param messagetype
	 *            the messagetype
	 * @param readFlag
	 *            the read flag
	 * @param sender
	 *            A valid Users object
	 * @param sentDate
	 *            the sent date
	 * @param spamFlag
	 *            the spam flag
	 * @param state
	 *            the state
	 * @param subject
	 *            the subject
	 * @param parent
	 *            the parent
	 * @return Messages A Messages object
	 */
	public Messages newMessages(final Boolean deletedFlag, final Boolean failed2sentemail, final String folder,
			final Integer id, final String messageContent, final MessageType messagetype, final Boolean readFlag,
			final Users sender, final Date sentDate, final Boolean spamFlag, final MessageState state,
			final String subject, final Messages parent) {
		return MessageSystemFactory.getInstance().newMessages(deletedFlag, failed2sentemail, folder, id, messageContent,
				messagetype, readFlag, sender, sentDate, spamFlag, state, subject, parent, Boolean.FALSE);
	}

	/**
	 * Domain object factory for Permissions.
	 *
	 * @param description
	 *            the description
	 * @param id
	 *            the id
	 * @param permission
	 *            the permission
	 * @param shortcut
	 *            the shortcut
	 * @return PermissionsA Permissions object
	 */
	public Permissions newPermissions(final String description, final Integer id, final String permission,
			final String shortcut) {
		return UserManagementFactory.getInstance().newPermissions(id, permission, description, shortcut);
	}

	/**
	 * New profile notice.
	 *
	 * @param notice
	 *            the notice
	 * @param user
	 *            the user
	 * @param userProfile
	 *            the user profile
	 * @return the profile notice
	 */
	public ProfileNotices newProfileNotice(final String notice, final Users user, final UserProfiles userProfile) {
		final ProfileNotices profileNotice = new ProfileNotices();
		profileNotice.setNotice(notice);
		profileNotice.setUser(user);
		profileNotice.setUserProfile(userProfile);
		return profileNotice;
	}

	/**
	 * New profile visitors.
	 *
	 * @param visitingDate
	 *            the visiting date
	 * @param visitor
	 *            the visitor
	 * @param visitedProfile
	 *            the visited profile
	 * @param count
	 *            the count
	 * @return the profile visitors
	 */
	public ProfileVisitors newProfileVisitors(final Date visitingDate, final Users visitor,
			final UserProfiles visitedProfile, final Integer count) {
		final ProfileVisitors profileVisitors = new ProfileVisitors();
		profileVisitors.setVisitor(visitor);
		profileVisitors.setVisitedProfile(visitedProfile);
		profileVisitors.setVisitingDate(visitingDate);
		profileVisitors.setCount(count);
		return profileVisitors;
	}

	/**
	 * Data pool factory for ResetPasswords.
	 *
	 * @param id
	 *            the id
	 * @param expiryDate
	 *            the expiry date
	 * @param generatedPassword
	 *            the generated password
	 * @param starttime
	 *            the starttime
	 * @param user
	 *            A valid Users object
	 * @return ResetPasswords A ResetPasswords object
	 */
	public ResetPasswords newResetPasswords(final Integer id, final Date expiryDate, final String generatedPassword,
			final Date starttime, final Users user) {
		return UserManagementFactory.getInstance().newResetPasswords(id, expiryDate, generatedPassword, starttime,
				user);
	}

	/**
	 * Domain object factory for Images.
	 *
	 * @param description
	 *            the description
	 * @param filename
	 *            the filename
	 * @param filesize
	 *            the filesize
	 * @param filetype
	 *            the filetype
	 * @param id
	 *            the id
	 * @param image
	 *            the image
	 * @param created
	 *            the created
	 * @param deletedFlag
	 *            the deleted flag
	 * @param checksum
	 *            the checksum
	 * @return ImagesA Images object
	 */
	public Resources newResources(final String description, final String filename, final String filesize,
			final String filetype, final Integer id, final Byte[] image, final Date created, final Boolean deletedFlag,
			final String checksum) {
		return ResourceSystemFactory.getInstance().newResources(id, description, filename, filesize, filetype, image,
				created, deletedFlag, checksum);
	}

	/**
	 * Domain object factory for Roles.
	 *
	 * @param description
	 *            the description
	 * @param id
	 *            the id
	 * @param rolename
	 *            the rolename
	 * @param permissions
	 *            the permissions
	 * @return RolesA Roles object
	 */
	public Roles newRoles(final String description, final Integer id, final String rolename,
			final Set<Permissions> permissions) {
		return UserManagementFactory.getInstance().newRoles(id, rolename, description, permissions);
	}

	/**
	 * New search criteria.
	 *
	 * @param fromAge
	 *            the from age
	 * @param untilAge
	 *            the until age
	 * @param searchGender
	 *            the search gender
	 * @return the search criteria
	 */
	public SearchCriterias newSearchCriteria(final Integer fromAge, final Integer untilAge,
			final GenderType searchGender) {
		final SearchCriterias searchCriteria = new SearchCriterias();
		searchCriteria.setFromAge(fromAge);
		searchCriteria.setUntilAge(untilAge);
		searchCriteria.setSearchGender(searchGender);
		return searchCriteria;
	}

	/**
	 * New user profile.
	 *
	 * @param age
	 *            the age
	 * @param educationState
	 *            the education state
	 * @param figure
	 *            the figure
	 * @param haircolor
	 *            the haircolor
	 * @param height
	 *            the height
	 * @param interests
	 *            the interests
	 * @param occupation
	 *            the occupation
	 * @param profileText
	 *            the profile text
	 * @param relationshipState
	 *            the relationship state
	 * @param smokerstate
	 *            the smokerstate
	 * @param user
	 *            the user
	 * @param userImage
	 *            the user image
	 * @param weight
	 *            the weight
	 * @param zodiacSign
	 *            the zodiac sign
	 * @param searchCriteria
	 *            the search criteria
	 * @return the user profile
	 */
	public UserProfiles newUserProfile(final Integer age, final EducationState educationState, final FigureType figure,
			final HaircolorType haircolor, final Integer height, final InterestsType interests, final String occupation,
			final String profileText, final RelationshipState relationshipState, final SmokerState smokerstate,
			final Users user, final Resources userImage, final Integer weight, final ZodiacSignType zodiacSign,
			final SearchCriterias searchCriteria) {
		final UserProfiles userProfile = new UserProfiles();
		userProfile.setAge(age);
		userProfile.setEducationState(educationState);
		userProfile.setFigure(figure);
		userProfile.setHaircolor(haircolor);
		userProfile.setHeight(height);
		userProfile.setInterests(interests);
		userProfile.setOccupation(occupation);
		userProfile.setProfileText(profileText);
		userProfile.setRelationshipState(relationshipState);
		userProfile.setSmokerstate(smokerstate);
		userProfile.setUser(user);
		userProfile.setUserImage(userImage);
		userProfile.setWeight(weight);
		userProfile.setZodiacSign(zodiacSign);
		userProfile.setSearchCriteria(searchCriteria);
		return userProfile;
	}

	/**
	 * Domain object factory for Users.
	 *
	 * @param active
	 *            the active
	 * @param pw
	 *            the pw
	 * @param salt
	 *            the salt
	 * @param username
	 *            the username
	 * @param locked
	 *            the locked
	 * @param userData
	 *            the user data
	 * @param roles
	 *            the roles
	 * @return UsersA Users object
	 */
	public Users newUsers(final Boolean active, final String pw, final String salt, final String username,
			final Boolean locked, final Set<Roles> roles) {
		return UserManagementFactory.getInstance().newUsers(active, pw, salt, username, locked, roles);
	}

	/**
	 * Domain object factory for Zipcodes.
	 *
	 * @param id
	 *            the id
	 * @param country
	 *            the country
	 * @param city
	 *            the city
	 * @param zipcode
	 *            the zipcode
	 * @return ZipcodesA Zipcodes object
	 */
	public Zipcodes newZipcodes(final Integer id, final Countries country, final String city, final String zipcode) {
		return AddressBookFactory.getInstance().newZipcodes(id, country, city, zipcode);
	}
}
