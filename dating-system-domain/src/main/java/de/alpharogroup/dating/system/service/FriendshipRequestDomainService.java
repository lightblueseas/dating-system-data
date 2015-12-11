package de.alpharogroup.dating.system.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.FriendshipRequestsDao;
import de.alpharogroup.dating.system.domain.FriendshipRequest;
import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.dating.system.mapper.FriendshipRequestsMapper;
import de.alpharogroup.dating.system.service.api.FriendshipRequestService;
import de.alpharogroup.service.domain.AbstractDomainService;

@Transactional
@Service("friendshipRequestDomainService")
public class FriendshipRequestDomainService
	extends
		AbstractDomainService<Integer, FriendshipRequest, FriendshipRequests, FriendshipRequestsDao, FriendshipRequestsMapper>
	implements
		FriendshipRequestService
{

}
