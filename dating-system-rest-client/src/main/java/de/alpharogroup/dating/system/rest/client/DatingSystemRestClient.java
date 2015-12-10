package de.alpharogroup.dating.system.rest.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

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
public class DatingSystemRestClient
{

	/** The Constant DEFAULT_HTTP_PORT. */
	public static final int DEFAULT_HTTP_PORT = 8080;

	/** The Constant BASE_URL_PREFIX. */
	public static final String BASE_URL_PREFIX = "http://localhost";

	/** The Constant DEFAULT_BASE_URL. */
	public static final String DEFAULT_BASE_URL = BASE_URL_PREFIX + ":" + DEFAULT_HTTP_PORT;

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
		final List<Object> providers = new ArrayList<>();
		providers.add(new JacksonJsonProvider());

		favoriteMembersResource = JAXRSClientFactory.create(baseUrl, FavoriteMembersResource.class,
			providers);
		WebClient.client(favoriteMembersResource).accept(MediaType.APPLICATION_JSON);
		WebClient.client(favoriteMembersResource).type(MediaType.APPLICATION_JSON);

		friendshipRequestsResource = JAXRSClientFactory.create(baseUrl,
			FriendshipRequestsResource.class, providers);
		WebClient.client(friendshipRequestsResource).accept(MediaType.APPLICATION_JSON);
		WebClient.client(friendshipRequestsResource).type(MediaType.APPLICATION_JSON);

		profileNoticesResource = JAXRSClientFactory.create(baseUrl, ProfileNoticesResource.class,
			providers);
		WebClient.client(profileNoticesResource).accept(MediaType.APPLICATION_JSON);
		WebClient.client(profileNoticesResource).type(MediaType.APPLICATION_JSON);

		profileRatingsResource = JAXRSClientFactory.create(baseUrl, ProfileRatingsResource.class,
			providers);
		WebClient.client(profileRatingsResource).accept(MediaType.APPLICATION_JSON);
		WebClient.client(profileRatingsResource).type(MediaType.APPLICATION_JSON);

		profileVisitorsResource = JAXRSClientFactory.create(baseUrl, ProfileVisitorsResource.class,
			providers);
		WebClient.client(profileVisitorsResource).accept(MediaType.APPLICATION_JSON);
		WebClient.client(profileVisitorsResource).type(MediaType.APPLICATION_JSON);

		searchCriteriasResource = JAXRSClientFactory.create(baseUrl, SearchCriteriasResource.class,
			providers);
		WebClient.client(searchCriteriasResource).accept(MediaType.APPLICATION_JSON);
		WebClient.client(searchCriteriasResource).type(MediaType.APPLICATION_JSON);

		userProfilesResource = JAXRSClientFactory.create(baseUrl, UserProfilesResource.class,
			providers);
		WebClient.client(userProfilesResource).accept(MediaType.APPLICATION_JSON);
		WebClient.client(userProfilesResource).type(MediaType.APPLICATION_JSON);
	}

}
