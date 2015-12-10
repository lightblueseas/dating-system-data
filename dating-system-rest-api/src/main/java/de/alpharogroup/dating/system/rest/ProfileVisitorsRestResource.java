package de.alpharogroup.dating.system.rest;

import de.alpharogroup.dating.system.domain.ProfileVisitor;
import de.alpharogroup.dating.system.rest.api.ProfileVisitorsResource;
import de.alpharogroup.dating.system.service.api.ProfileVisitorService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class ProfileVisitorsRestResource
	extends
		AbstractRestfulResource<Integer, ProfileVisitor, ProfileVisitorService>
	implements
		ProfileVisitorsResource
{

}
