package de.alpharogroup.dating.system.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.collections.ListExtensions;
import de.alpharogroup.dating.system.daos.FriendshipRequestsDao;
import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.dating.system.enums.FriendshipRequestsState;
import de.alpharogroup.dating.system.service.api.FriendshipRequestsService;
import de.alpharogroup.dating.system.service.utils.HqlStringCreator;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.user.management.entities.Users;

@Transactional
@Service("friendshipRequestsService")
public class FriendshipRequestsBusinessService extends AbstractBusinessService<FriendshipRequests, Integer, FriendshipRequestsDao> implements FriendshipRequestsService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	public void setFriendshipRequestsDao(FriendshipRequestsDao friendshipRequestsDao) {
		setDao(friendshipRequestsDao);
	}
	
	public FriendshipRequests find(Users requestor, Users requestedUser) {
		return find(requestor, requestedUser, null);	
	}
	
	public FriendshipRequests find(Users requestor, Users requestedUser, FriendshipRequestsState state) {
		final List<FriendshipRequests> friendshipRequests = findAll(requestor, requestedUser, state);
		return ListExtensions.getFirst(friendshipRequests);	
	}
	
	@SuppressWarnings("unchecked")
	public List<FriendshipRequests> findAll(Users requestor, Users requestedUser, FriendshipRequestsState state) {
		final String hqlString = HqlStringCreator.forFriendshipRequests(requestor, requestedUser, state);
		final Query query = getQuery(hqlString);
		if(requestor != null){
			query.setParameter("requestor", requestor);
		}
		if(requestedUser != null){
			query.setParameter("requestedUser", requestedUser);
		}
		if(state != null) {
			query.setParameter("state", state);
		}
		final List<FriendshipRequests> friendshipRequests = query.getResultList();
		return friendshipRequests;
	}
}