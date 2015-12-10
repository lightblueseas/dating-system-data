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
import de.alpharogroup.dating.system.service.api.ProfileNoticesService;
import de.alpharogroup.dating.system.service.api.ProfileRatingsService;
import de.alpharogroup.dating.system.service.api.ProfileVisitorsService;
import de.alpharogroup.dating.system.service.api.SearchCriteriasService;
import de.alpharogroup.dating.system.service.api.UserProfilesService;
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
import de.alpharogroup.user.management.service.api.UserDatasService;
import de.alpharogroup.user.management.service.api.UsersManagementService;
import de.alpharogroup.user.management.service.api.UsersService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ServiceLocatorImpl.
 *
 * @author Asterios Raptis
 */
@Getter
@Setter
@NoArgsConstructor
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
	private PermissionsService permissionsService;

	/** The Profile Notice business service. */
	@Autowired
	private ProfileNoticesService profileNoticesService;

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
	private SearchCriteriasService searchCriteriasService;

	/** The UserCredits business service. */
	@Autowired
	private UserCreditsService userCreditsService;

	/** The users data business service. */
	@Autowired
	private UserDatasService userDatasService;

	/** The user management business service. */
	@Autowired
	private UsersManagementService userManagementService;

	/** The user profile business service. */
	@Autowired
	private UserProfilesService userProfilesService;

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

}