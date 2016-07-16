package de.alpharogroup.dating.system.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.db.dao.jpa.JpaEntityManagerDao;
import lombok.Getter;
import lombok.Setter;

@Repository("friendshipRequestsDao")
public class FriendshipRequestsDao extends JpaEntityManagerDao<FriendshipRequests, Integer> {
	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The entity manager. */
	@PersistenceContext
	@Getter
	@Setter
	private EntityManager entityManager;
}
