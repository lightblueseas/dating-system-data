package de.alpharogroup.dating.system.service.locator;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.alpharogroup.address.book.service.api.AddressesService;
import de.alpharogroup.address.book.service.api.CountriesService;
import de.alpharogroup.address.book.service.api.FederalstatesService;
import de.alpharogroup.address.book.service.api.ZipcodesService;
import de.alpharogroup.dating.system.service.api.FavoriteMembersService;
import de.alpharogroup.dating.system.service.api.FriendshipRequestsService;
import de.alpharogroup.dating.system.service.api.ProfileNoticeService;
import de.alpharogroup.dating.system.service.api.ProfileRatingsService;
import de.alpharogroup.dating.system.service.api.ProfileVisitorsService;
import de.alpharogroup.dating.system.service.api.SearchCriteriaService;
import de.alpharogroup.dating.system.service.api.UserProfileService;
import de.alpharogroup.db.resource.bundles.service.api.ResourcebundlesService;
import de.alpharogroup.message.system.service.api.MessageRecipientsService;
import de.alpharogroup.message.system.service.api.MessagesService;
import de.alpharogroup.resource.system.service.api.ResourcesService;
import de.alpharogroup.user.management.service.api.ContactmethodsService;
import de.alpharogroup.user.management.service.api.PermissionsService;
import de.alpharogroup.user.management.service.api.RecommendationsService;
import de.alpharogroup.user.management.service.api.RelationPermissionsService;
import de.alpharogroup.user.management.service.api.ResetPasswordsService;
import de.alpharogroup.user.management.service.api.RobinsonsService;
import de.alpharogroup.user.management.service.api.RolesService;
import de.alpharogroup.user.management.service.api.RuleViolationsService;
import de.alpharogroup.user.management.service.api.UserCreditsService;
import de.alpharogroup.user.management.service.api.UserDataService;
import de.alpharogroup.user.management.service.api.UserManagementService;
import de.alpharogroup.user.management.service.api.UsersService;

/**
 * The Class ServiceLocatorImpl.
 * 
 * @author Asterios Raptis
 */
@Service("serviceLocator")
public class ServiceLocatorImpl implements Serializable, ServiceLocator {

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
		
	/** The RecommendationsService service. */
	@Autowired
	private RecommendationsService recommendationsService;

	/** The addresses business service. */
	@Autowired
	private AddressesService addressesService;
	
	/** The RelationPermissions business service. */
	@Autowired
	private RelationPermissionsService relationPermissionsService;

	/** The contactmethods business service. */
	@Autowired
	private ContactmethodsService contactmethodsService;

	/** The countries business service. */
	@Autowired
	private CountriesService countriesService;


	/** The Favorite Members business service. */
	@Autowired
	private FavoriteMembersService favoriteMembersService;

	/** The federalstates business service. */
	@Autowired
	private FederalstatesService federalstatesService;

	/** The FriendshipRequests business service. */
	@Autowired
	private FriendshipRequestsService friendshipRequestsService;

	/** The images business service. */
	@Autowired
	private ResourcesService resourcesService;

	/** The message recipients business service. */
	@Autowired
	private MessageRecipientsService messageRecipientsService;

	/** The messages business service. */
	@Autowired
	private MessagesService messagesService;

	/** The permission business service. */
	@Autowired
	private PermissionsService permissionService;

	/** The Profile Notice business service. */
	@Autowired
	private ProfileNoticeService profileNoticeService;

	/** The ProfileRatings business service. */
	@Autowired
	private ProfileRatingsService profileRatingsService;

	/** The ProfileVisitors business service. */
	@Autowired
	private ProfileVisitorsService profileVisitorsService;

	/** The reset passwords business service. */
	@Autowired
	private ResetPasswordsService resetPasswordsService;

	/** The Resourcebundles business service. */
	@Autowired
	private ResourcebundlesService resourcebundlesService;

	/** The roles business service. */
	@Autowired
	private RolesService rolesService;

	/** The search criteria business service. */
	@Autowired
	private SearchCriteriaService searchCriteriaService;

	/** The UserCredits business service. */
	@Autowired
	private UserCreditsService userCreditsService;

	/** The users data business service. */
	@Autowired
	private UserDataService userDataService;

	/** The user management business service. */
	@Autowired
	private UserManagementService userManagementService;

	/** The user profile business service. */
	@Autowired
	private UserProfileService userProfileService;

	/** The users business service. */
	@Autowired
	private UsersService usersService;

	/** The zipcodes business service. */
	@Autowired
	private ZipcodesService zipcodesService;

	/** The RuleViolations business service. */
	@Autowired
	private RuleViolationsService ruleViolationsService;

	/** The Robinsons business service. */
	@Autowired
	private RobinsonsService robinsonsService;

	/**
	 * Instantiates a new service locator.
	 */
	public ServiceLocatorImpl() {
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public RelationPermissionsService getRelationPermissionsService() {
		return relationPermissionsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setRelationPermissionsService(
			RelationPermissionsService relationPermissionsService) {
		this.relationPermissionsService = relationPermissionsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public AddressesService getAddressesService() {
		return addressesService;
	}


	/**
     * {@inheritDoc}
     */
	@Override
	public ContactmethodsService getContactmethodsService() {
		return contactmethodsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public CountriesService getCountriesService() {
		return countriesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public FavoriteMembersService getFavoriteMembersService() {
		return favoriteMembersService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public FederalstatesService getFederalstatesService() {
		return federalstatesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public FriendshipRequestsService getFriendshipRequestsService() {
		return this.friendshipRequestsService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public ResourcesService getResourcesService() {
		return resourcesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public MessageRecipientsService getMessageRecipientsService() {
		return messageRecipientsService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public MessagesService getMessagesService() {
		return messagesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public PermissionsService getPermissionService() {
		return permissionService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public ProfileNoticeService getProfileNoticeService() {
		return profileNoticeService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public ProfileRatingsService getProfileRatingsService() {
		return this.profileRatingsService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public ProfileVisitorsService getProfileVisitorsService() {
		return this.profileVisitorsService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public ResetPasswordsService getResetPasswordsService() {
		return resetPasswordsService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public ResourcebundlesService getResourcebundlesService() {
		return resourcebundlesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public RolesService getRolesService() {
		return rolesService;
	}

    /**
     * {@inheritDoc}
     */
    public SearchCriteriaService getSearchCriteriaService() {
		return searchCriteriaService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public UserCreditsService getUserCreditsService() {
		return this.userCreditsService;
	}

    /**
     * {@inheritDoc}
     */
    @Override
	public UserDataService getUserDataService() {
		return this.userDataService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public UserManagementService getUserManagementService() {
		return userManagementService;
	}

    /**
     * {@inheritDoc}
     */
    public UserProfileService getUserProfileService() {
		return userProfileService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public UsersService getUsersService() {
		return usersService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public ZipcodesService getZipcodesService() {
		return zipcodesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setAddressesService(
			final AddressesService addressesService) {
		this.addressesService = addressesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setContactmethodsService(
			ContactmethodsService contactmethodsService) {
		this.contactmethodsService = contactmethodsService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setCountriesService(
			final CountriesService countriesService) {
		this.countriesService = countriesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setFavoriteMembersService(
			FavoriteMembersService favoriteMembersService) {
		this.favoriteMembersService = favoriteMembersService;		
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setFederalstatesService(
			final FederalstatesService federalstatesService) {
		this.federalstatesService = federalstatesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setFriendshipRequestsService(
			FriendshipRequestsService friendshipRequestsService) {
		this.friendshipRequestsService = friendshipRequestsService;		
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setResourcesService(
			final ResourcesService imagesService) {
		this.resourcesService = imagesService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setMessageRecipientsService(
			MessageRecipientsService messageRecipientsService) {
		this.messageRecipientsService = messageRecipientsService;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setMessagesService(
			final MessagesService messagesService) {
		this.messagesService = messagesService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setPermissionService(
			final PermissionsService permissionService) {
		this.permissionService = permissionService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setProfileNoticeService(
			ProfileNoticeService profileNoticeService) {
		this.profileNoticeService = profileNoticeService;		
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setProfileRatingsService(
			ProfileRatingsService profileRatingsService) {
		this.profileRatingsService = profileRatingsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setProfileVisitorsService(
			ProfileVisitorsService profileVisitorsService) {
		this.profileVisitorsService = profileVisitorsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setResetPasswordsService(
			ResetPasswordsService resetPasswordsService) {
		this.resetPasswordsService = resetPasswordsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setResourcebundlesService(
			ResourcebundlesService resourcebundlesService) {
		this.resourcebundlesService = resourcebundlesService;		
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setRolesService(
			final RolesService rolesService) {
		this.rolesService = rolesService;
	}

	/**
     * {@inheritDoc}
     */
    public void setSearchCriteriaService(SearchCriteriaService searchCriteriaService) {
		this.searchCriteriaService = searchCriteriaService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setUserCreditsService(UserCreditsService userCreditsService) {
		this.userCreditsService = userCreditsService;
	}

	/**
     * {@inheritDoc}
     */
    @Override
	public void setUserDataService(UserDataService userDataService) {
		this.userDataService = userDataService;		
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setUserManagementService(
			final UserManagementService userManagementService) {
		this.userManagementService = userManagementService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setUserProfileService(UserProfileService userProfileService) {
		this.userProfileService = userProfileService;		
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setUsersService(
			final UsersService usersService) {
		this.usersService = usersService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setZipcodesService(
			final ZipcodesService zipcodesService) {
		this.zipcodesService = zipcodesService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public RuleViolationsService getRuleViolationsService() {
		return ruleViolationsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setRuleViolationsService(RuleViolationsService ruleViolationsService) {
		this.ruleViolationsService = ruleViolationsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public RobinsonsService getRobinsonsService() {
		return robinsonsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setRobinsonsService(RobinsonsService robinsonsService) {
		this.robinsonsService = robinsonsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public RecommendationsService getRecommendationsService() {
		return recommendationsService;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void setRecommendationsService(
			RecommendationsService recommendationsService) {
		this.recommendationsService = recommendationsService;
		
	}

}