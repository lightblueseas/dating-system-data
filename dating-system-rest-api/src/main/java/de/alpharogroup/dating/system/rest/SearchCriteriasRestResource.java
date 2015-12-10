package de.alpharogroup.dating.system.rest;

import de.alpharogroup.dating.system.domain.SearchCriteria;
import de.alpharogroup.dating.system.rest.api.SearchCriteriasResource;
import de.alpharogroup.dating.system.service.api.SearchCriteriaService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class SearchCriteriasRestResource
	extends
		AbstractRestfulResource<Integer, SearchCriteria, SearchCriteriaService>
	implements
		SearchCriteriasResource
{

}
