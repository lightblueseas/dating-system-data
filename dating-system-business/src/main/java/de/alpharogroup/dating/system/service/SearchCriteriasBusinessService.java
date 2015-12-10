package de.alpharogroup.dating.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.SearchCriteriasDao;
import de.alpharogroup.dating.system.entities.SearchCriterias;
import de.alpharogroup.dating.system.service.api.SearchCriteriasService;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;


@Transactional
@Service("searchCriteriasService")
public class SearchCriteriasBusinessService extends AbstractBusinessService<SearchCriterias, Integer, SearchCriteriasDao> implements SearchCriteriasService {

	private static final long serialVersionUID = 1L;

	@Autowired
	public void setSearchCriteriasDao(final SearchCriteriasDao searchCriteriaDao) {
		setDao(searchCriteriaDao);
	}

}