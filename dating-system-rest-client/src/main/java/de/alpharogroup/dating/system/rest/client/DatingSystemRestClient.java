package de.alpharogroup.dating.system.rest.client;

import de.alpharogroup.address.book.rest.api.AddressesResource;
import de.alpharogroup.address.book.rest.api.CountriesResource;
import de.alpharogroup.address.book.rest.api.FederalstatesResource;
import de.alpharogroup.address.book.rest.api.ZipcodesResource;
import de.alpharogroup.cxf.rest.client.AbstractRestClient;
import de.alpharogroup.dating.system.rest.api.FavoriteMembersResource;
import de.alpharogroup.dating.system.rest.api.FriendshipRequestsResource;
import de.alpharogroup.dating.system.rest.api.ProfileNoticesResource;
import de.alpharogroup.dating.system.rest.api.ProfileRatingsResource;
import de.alpharogroup.dating.system.rest.api.ProfileVisitorsResource;
import de.alpharogroup.dating.system.rest.api.SearchCriteriasResource;
import de.alpharogroup.dating.system.rest.api.UserProfilesResource;
import de.alpharogroup.db.resource.bundles.rest.api.ResourcebundlesResource;
import de.alpharogroup.message.system.rest.api.MessageRecipientsResource;
import de.alpharogroup.message.system.rest.api.MessagesResource;
import de.alpharogroup.resource.system.rest.api.ResourcesResource;
import de.alpharogroup.user.management.rest.api.AuthenticationsResource;
import de.alpharogroup.user.management.rest.api.ContactmethodsResource;
import de.alpharogroup.user.management.rest.api.PermissionsResource;
import de.alpharogroup.user.management.rest.api.RecommendationsResource;
import de.alpharogroup.user.management.rest.api.RelationPermissionsResource;
import de.alpharogroup.user.management.rest.api.ResetPasswordsResource;
import de.alpharogroup.user.management.rest.api.RobinsonsResource;
import de.alpharogroup.user.management.rest.api.RolesResource;
import de.alpharogroup.user.management.rest.api.RuleViolationsResource;
import de.alpharogroup.user.management.rest.api.UserCreditsResource;
import de.alpharogroup.user.management.rest.api.UserDatasResource;
import de.alpharogroup.user.management.rest.api.UsersResource;
import lombok.Getter;

/**
 * The class {@link DatingSystemRestClient} is a rest client for the
 * dating-system that are persists in the database.
 */
public class DatingSystemRestClient extends AbstractRestClient
{

	/**
	 * The {@link AddressesResource}.
	 */
	@Getter
	private final AddressesResource addressesResource;

	/**
	 * The {@link CountriesResource}.
	 */
	@Getter
	private final CountriesResource countriesResource;

	/**
	 * The {@link FederalstatesResource}.
	 */
	@Getter
	private final FederalstatesResource federalstatesResource;

	/**
	 * The {@link ZipcodesResource}.
	 */
	@Getter
	private final ZipcodesResource zipcodesResource;

	/**
	 * The {@link ResourcebundlesResource}.
	 */
	@Getter
	private final ResourcebundlesResource resourcebundlesResource;

	/**
	 * The {@link FavoriteMembersResource}.
	 */
	@Getter
	private final FavoriteMembersResource favoriteMembersResource;

	/**
	 * The {@link FriendshipRequestsResource}.
	 */
	@Getter
	private final FriendshipRequestsResource friendshipRequestsResource;

	/**
	 * The {@link ProfileNoticesResource}.
	 */
	@Getter
	private final ProfileNoticesResource profileNoticesResource;

	/**
	 * The {@link ProfileRatingsResource}.
	 */
	@Getter
	private final ProfileRatingsResource profileRatingsResource;

	/**
	 * The {@link ProfileVisitorsResource}.
	 */
	@Getter
	private final ProfileVisitorsResource profileVisitorsResource;

	/**
	 * The {@link SearchCriteriasResource}.
	 */
	@Getter
	private final SearchCriteriasResource searchCriteriasResource;

	/**
	 * The {@link UserProfilesResource}.
	 */
	@Getter
	private final UserProfilesResource userProfilesResource;

	/**
	 * The {@link ResourcesResource}.
	 */
	@Getter
	private final ResourcesResource resourcesResource;

	/**
	 * The {@link AuthenticationsResource}.
	 */
	@Getter
	private final AuthenticationsResource authenticationsResource;

	/**
	 * The {@link ContactmethodsResource}.
	 */
	@Getter
	private final ContactmethodsResource contactmethodsResource;

	/**
	 * The {@link PermissionsResource}.
	 */
	@Getter
	private final PermissionsResource permissionsResource;

	/**
	 * The {@link RecommendationsResource}.
	 */
	@Getter
	private final RecommendationsResource recommendationsResource;

	/**
	 * The {@link RelationPermissionsResource}.
	 */
	@Getter
	private final RelationPermissionsResource relationPermissionsResource;

	/**
	 * The {@link ResetPasswordsResource}.
	 */
	@Getter
	private final ResetPasswordsResource resetPasswordsResource;

	/**
	 * The {@link RobinsonsResource}.
	 */
	@Getter
	private final RobinsonsResource robinsonsResource;

	/**
	 * The {@link RolesResource}.
	 */
	@Getter
	private final RolesResource rolesResource;

	/**
	 * The {@link RuleViolationsResource}.
	 */
	@Getter
	private final RuleViolationsResource ruleViolationsResource;

	/**
	 * The {@link UserCreditsResource}.
	 */
	@Getter
	private final UserCreditsResource userCreditsResource;

	/**
	 * The {@link UserDatasResource}.
	 */
	@Getter
	private final UserDatasResource userDatasResource;

	/**
	 * The {@link UsersResource}.
	 */
	@Getter
	private final UsersResource usersResource;

	/**
	 * The {@link MessagesResource}.
	 */
	@Getter
	private final MessagesResource messagesResource;

	/**
	 * The {@link MessageRecipientsResource}.
	 */
	@Getter
	private final MessageRecipientsResource messageRecipientsResource;

	/**
	 * Instantiates a new {@link DatingSystemRestClient} with the default base url.
	 */
	public DatingSystemRestClient()
	{
		this(DEFAULT_BASE_HTTP_URL);
	}

	/**
	 * Instantiates a new {@link DatingSystemRestClient}.
	 *
	 * @param baseUrl
	 *            the base url
	 */
	public DatingSystemRestClient(final String baseUrl)
	{
		super(baseUrl);

		favoriteMembersResource = newResource(FavoriteMembersResource.class);
		friendshipRequestsResource =  newResource(FriendshipRequestsResource.class);
		profileNoticesResource =  newResource(ProfileNoticesResource.class);
		profileRatingsResource =  newResource(ProfileRatingsResource.class);
		profileVisitorsResource = newResource(ProfileVisitorsResource.class);
		searchCriteriasResource = newResource(SearchCriteriasResource.class);
		userProfilesResource = newResource(UserProfilesResource.class);

		resourcebundlesResource = newResource(ResourcebundlesResource.class);

		addressesResource = newResource(AddressesResource.class);
		countriesResource = newResource(CountriesResource.class);
		federalstatesResource = newResource(FederalstatesResource.class);
		zipcodesResource =  newResource(ZipcodesResource.class);

        resourcesResource  = newResource(ResourcesResource.class);

		authenticationsResource = newResource(AuthenticationsResource.class);
		contactmethodsResource = newResource(ContactmethodsResource.class);
		permissionsResource = newResource(PermissionsResource.class);
		recommendationsResource = newResource(RecommendationsResource.class);
		relationPermissionsResource = newResource(RelationPermissionsResource.class);
		resetPasswordsResource = newResource(ResetPasswordsResource.class);
		robinsonsResource = newResource(RobinsonsResource.class);
		rolesResource = newResource(RolesResource.class);
		ruleViolationsResource = newResource(RuleViolationsResource.class);
		userCreditsResource = newResource(UserCreditsResource.class);
		userDatasResource = newResource(UserDatasResource.class);
		usersResource = newResource(UsersResource.class);

		messagesResource = newResource(MessagesResource.class);
		messageRecipientsResource = newResource(MessageRecipientsResource.class);
	}

}
