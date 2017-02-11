package de.alpharogroup.dating.system.factories;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import de.alpharogroup.address.book.entities.Addresses;
import de.alpharogroup.address.book.entities.Countries;
import de.alpharogroup.address.book.entities.Federalstates;
import de.alpharogroup.address.book.entities.Zipcodes;
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
import de.alpharogroup.resource.system.entities.Resources;
import de.alpharogroup.user.management.entities.Contactmethods;
import de.alpharogroup.user.management.entities.Permissions;
import de.alpharogroup.user.management.entities.ResetPasswords;
import de.alpharogroup.user.management.entities.Roles;
import de.alpharogroup.user.management.entities.Users;
import de.alpharogroup.user.management.enums.ContactmethodType;
import de.alpharogroup.user.management.enums.GenderType;

/**
 * A factory for creating DomainObject objects.
 */
public class DomainObjectFactory implements Serializable {

	/** The Constant instance. */
	private static final DomainObjectFactory instance = new DomainObjectFactory();

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Gets the single instance of DomainObjectFactory.
	 *
	 * @return single instance of DomainObjectFactory
	 */
	public static DomainObjectFactory getInstance() {
		return instance;
	}

	/** The seminars24 domain object factory. */
	private final FlirtAndDateObjectFactory flirtAndDateObjectFactory = FlirtAndDateObjectFactory
			.getInstance();

	/**
	 * Instantiates a new domain object factory.
	 */
	private DomainObjectFactory() {
		super();
	}

	/**
	 * Gets the addresses.
	 *
	 * @param addressComment the address comment
	 * @param federalstate the federalstate
	 * @param geohash the geohash
	 * @param latitude the latitude
	 * @param longitude the longitude
	 * @param street the street
	 * @param streetnumber the streetnumber
	 * @param zipcode the zipcode
	 * @return the addresses
	 */
	public Addresses newAddresses(final String addressComment,
			final Federalstates federalstate, final String geohash,
			final java.math.BigDecimal latitude,
			final java.math.BigDecimal longitude, final String street,
			final String streetnumber, final Zipcodes zipcode) {
		final String lat = (latitude != null) ? latitude.toString() : "";
		final String lng = (longitude != null) ? longitude.toString() : "";
		return flirtAndDateObjectFactory.newAddresses(addressComment,
				federalstate, geohash, null, lat, lng, street, streetnumber, zipcode);
	}

	/**
	 * Gets the contacts.
	 *
	 * @param contactmethod
	 *            the contactmethod
	 * @param contactvalue
	 *            the contactvalue
	 * @return the contacts
	 */
	public Contactmethods newContactmethods(final ContactmethodType contactmethod,
			final String contactvalue) {
		return flirtAndDateObjectFactory.newContactmethods(contactmethod,
				contactvalue, null);
	}

	/**
	 * Gets the countries.
	 *
	 * @param iso3166A2name
	 *            the iso3166 a2name
	 * @param iso3166A3name
	 *            the iso3166 a3name
	 * @param iso3166Number
	 *            the iso3166 number
	 * @param name
	 *            the name
	 * @return the countries
	 */
	public Countries newCountries(final String iso3166A2name,
			final String iso3166A3name, final String iso3166Number,
			final String name) {
		return flirtAndDateObjectFactory.newCountries(null, iso3166A2name, iso3166A3name,
				iso3166Number, name);
	}

	/**
	 * Gets the federalstates.
	 *
	 * @param country
	 *            the country
	 * @param iso3166A2code
	 *            the iso3166 a2code
	 * @param name
	 *            the name
	 * @param subdivisionCategory
	 *            the subdivision category
	 * @param subdivisionName
	 *            the subdivision name
	 * @return the federalstates
	 */
	public Federalstates newFederalstates(final Countries country,
			final String iso3166A2code, final String name,
			final String subdivisionCategory, final String subdivisionName) {
		return flirtAndDateObjectFactory.newFederalstates(country,
				null, iso3166A2code,
				name, subdivisionCategory, subdivisionName);
	}

	/**
	 * Gets the images.
	 *
	 * @param description            the description
	 * @param filename            the filename
	 * @param filesize            the filesize
	 * @param filetype            the filetype
	 * @param image            the image
	 * @param created the created
	 * @param deletedFlag the deleted flag
	 * @param checksum the checksum
	 * @return the images
	 */
	public Resources newResources(final String description, final String filename,
			final String filesize, final String filetype, final Byte[] image, final Date created, final Boolean deletedFlag, final String checksum) {
		return flirtAndDateObjectFactory.newResources(description, filename,
				filesize, filetype, null, image, created, deletedFlag, checksum);
	}

	/**
	 * Gets the message recipients.
	 *
	 * @param message
	 *            the message
	 * @param recipient
	 *            the recipient
	 * @return the message recipients
	 */
	public MessageRecipients newMessageRecipients(final Messages message,
			final Users recipient) {
		return flirtAndDateObjectFactory.newMessageRecipients(
				null, message,
				recipient);
	}

	/**
	 * Gets the messages.
	 *
	 * @param deletedFlag the deleted flag
	 * @param failed2sentemail the failed2sentemail
	 * @param folder the folder
	 * @param messageContent the message content
	 * @param messagetype the messagetype
	 * @param readFlag the read flag
	 * @param sender the sender
	 * @param sentDate the sent date
	 * @param spamFlag the spam flag
	 * @param state the state
	 * @param subject the subject
	 * @param parent the parent
	 * @return the messages
	 */
	public Messages newMessages(final Boolean deletedFlag,
			final Boolean failed2sentemail, final String folder,
			final String messageContent, final MessageType messagetype,
			final Boolean readFlag, final Users sender, final Date sentDate,
			final Boolean spamFlag, final MessageState state,
			final String subject, final Messages parent) {
		return flirtAndDateObjectFactory.newMessages(deletedFlag,
				failed2sentemail, folder, null, messageContent, messagetype, readFlag,
				sender, sentDate, spamFlag, state, subject, parent);
	}

	/**
	 * Gets the permissions.
	 *
	 * @param description
	 *            the description
	 * @param permission
	 *            the permission
	 * @param shortcut
	 *            the shortcut
	 * @return the permissions
	 */
	public Permissions newPermissions(final String description,
			final String permission, final String shortcut) {
		return flirtAndDateObjectFactory.newPermissions(description,
				null, permission,
				shortcut);
	}

	/**
	 * Gets the reset passwords.
	 *
	 * @param expiryDate the expiry date
	 * @param generatedPassword the generated password
	 * @param starttime the starttime
	 * @param user the user
	 * @return the reset passwords
	 */
	public ResetPasswords newResetPasswords(final Date expiryDate,
			final String generatedPassword, final Date starttime,
			final Users user) {
		return flirtAndDateObjectFactory.newResetPasswords(null, expiryDate,
				generatedPassword, starttime, user);
	}

	/**
	 * Gets the roles.
	 *
	 * @param description            the description
	 * @param rolename            the rolename
	 * @param permissions the permissions
	 * @return the roles
	 */
	public Roles newRoles(final String description, final String rolename,
			final Set<Permissions> permissions) {
		return flirtAndDateObjectFactory.newRoles(description,
				null, rolename, permissions);
	}

	/**
	 * Gets the user profile.
	 *
	 * @param age the age
	 * @param educationState the education state
	 * @param figure the figure
	 * @param haircolor the haircolor
	 * @param height the height
	 * @param interests the interests
	 * @param occupation the occupation
	 * @param profileText the profile text
	 * @param relationshipState the relationship state
	 * @param smokerstate the smokerstate
	 * @param user the user
	 * @param userImage the user image
	 * @param weight the weight
	 * @param zodiacSign the zodiac sign
	 * @param searchCriteria the search criteria
	 * @return the user profile
	 */
	public UserProfiles newUserProfile(final Integer age,
			final EducationState educationState, final FigureType figure,
			final HaircolorType haircolor, final Integer height,
			final InterestsType interests, final String occupation, final String profileText,
			final RelationshipState relationshipState, final SmokerState smokerstate,
			final Users user, final Resources userImage, final Integer weight,
			final ZodiacSignType zodiacSign, final SearchCriterias searchCriteria) {
		return flirtAndDateObjectFactory.newUserProfile(age, educationState,
				figure, haircolor, height, interests, occupation,
				profileText, relationshipState, smokerstate, user, userImage,
				weight, zodiacSign, searchCriteria);
	}

	 public SearchCriterias newSearchCriteria(final Integer fromAge, final Integer untilAge, final GenderType searchGender){
		 return flirtAndDateObjectFactory.newSearchCriteria(fromAge, untilAge, searchGender);
	 }

	public Users newUsers(final Boolean active, final String pw, final String salt, final String username, final Boolean locked,
		final Set<Roles> roles)
	{
		return flirtAndDateObjectFactory.newUsers(active, pw, salt, username, locked, roles);
	}

	/**
	 * Gets the zipcodes.
	 *
	 * @param country the country
	 * @param city            the city
	 * @param zipcode            the zipcode
	 * @return the zipcodes
	 */
	public Zipcodes newZipcodes(final Countries country, final String city, final String zipcode) {
		return flirtAndDateObjectFactory.newZipcodes(null, country, city,
				zipcode);
	}

	public ProfileNotices newProfileNotice(final String notice, final Users user,
			final UserProfiles userProfile) {
		return flirtAndDateObjectFactory.newProfileNotice(notice, user, userProfile);
	}

	public FavoriteMembers newFavoriteMembers(final UserProfiles favorite, final Users owner){
		return flirtAndDateObjectFactory.newFavoriteMembers(favorite, owner);
	}

	public FriendshipRequests newFriendshipRequests(final Users requestor, final Users requestedUser, final FriendshipRequestsState state){
		return flirtAndDateObjectFactory.newFriendshipRequests(requestor, requestedUser, state);
	}

	public ProfileVisitors newProfileVisitors(final Date visitingDate, final Users visitor, final UserProfiles visitedProfile, final Integer count){
		return flirtAndDateObjectFactory.newProfileVisitors(visitingDate, visitor, visitedProfile, count);
	}

}
