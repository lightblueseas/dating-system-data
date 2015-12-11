package de.alpharogroup.dating.system.rest.client;

import de.alpharogroup.cxf.rest.client.AbstractRestClient;
import de.alpharogroup.dating.system.rest.api.FavoriteMembersResource;
import de.alpharogroup.dating.system.rest.api.FriendshipRequestsResource;
import de.alpharogroup.dating.system.rest.api.ProfileNoticesResource;
import de.alpharogroup.dating.system.rest.api.ProfileRatingsResource;
import de.alpharogroup.dating.system.rest.api.ProfileVisitorsResource;
import de.alpharogroup.dating.system.rest.api.SearchCriteriasResource;
import de.alpharogroup.dating.system.rest.api.UserProfilesResource;
import lombok.Getter;

/**
 * The class {@link DatingSystemRestClient} is a rest client for the
 * dating-system that are persists in the database.
 */
public class DatingSystemRestClient extends AbstractRestClient
{

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
	 * Instantiates a new {@link DatingSystemRestClient} with the default base url.
	 */
	public DatingSystemRestClient()
	{
		this(DEFAULT_BASE_URL);
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
	}

}
