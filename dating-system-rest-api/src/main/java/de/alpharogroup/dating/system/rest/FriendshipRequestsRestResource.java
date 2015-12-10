package de.alpharogroup.dating.system.rest;

import de.alpharogroup.dating.system.domain.FriendshipRequest;
import de.alpharogroup.dating.system.rest.api.FriendshipRequestsResource;
import de.alpharogroup.dating.system.service.api.FriendshipRequestService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class FriendshipRequestsRestResource
	extends
		AbstractRestfulResource<Integer, FriendshipRequest, FriendshipRequestService>
	implements
		FriendshipRequestsResource
{

}
