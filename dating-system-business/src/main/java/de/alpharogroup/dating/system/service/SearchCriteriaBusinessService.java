package de.alpharogroup.dating.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.SearchCriteriaDao;
import de.alpharogroup.dating.system.entities.SearchCriteria;
import de.alpharogroup.dating.system.service.api.SearchCriteriaService;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;


@Transactional
@Service("searchCriteriaService")
public class SearchCriteriaBusinessService extends AbstractBusinessService<SearchCriteria, Integer, SearchCriteriaDao> implements SearchCriteriaService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	public void setSearchCriteriaDao(SearchCriteriaDao searchCriteriaDao) {
		setDao(searchCriteriaDao);
	}
	
}