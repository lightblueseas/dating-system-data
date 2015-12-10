package de.alpharogroup.dating.system.service;

import de.alpharogroup.dating.system.daos.FriendshipRequestsDao;
import de.alpharogroup.dating.system.domain.FriendshipRequest;
import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.dating.system.mapper.FriendshipRequestsMapper;
import de.alpharogroup.dating.system.service.api.FriendshipRequestService;
import de.alpharogroup.service.domain.AbstractDomainService;

public class FriendshipRequestDomainService
	extends
		AbstractDomainService<Integer, FriendshipRequest, FriendshipRequests, FriendshipRequestsDao, FriendshipRequestsMapper>
	implements
		FriendshipRequestService
{

}
