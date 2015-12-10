package de.alpharogroup.dating.system.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.alpharogroup.dating.system.entities.SearchCriterias;
import de.alpharogroup.db.dao.jpa.JpaEntityManagerDao;

@Repository("searchCriteriasDao")
public class SearchCriteriasDao extends JpaEntityManagerDao<SearchCriterias, Integer>{

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
