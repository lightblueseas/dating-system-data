package de.alpharogroup.dating.system.rest;

import de.alpharogroup.dating.system.domain.ProfileNotice;
import de.alpharogroup.dating.system.rest.api.ProfileNoticesResource;
import de.alpharogroup.dating.system.service.api.ProfileNoticeService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class ProfileNoticesRestResource
	extends
		AbstractRestfulResource<Integer, ProfileNotice, ProfileNoticeService>
	implements
		ProfileNoticesResource
{

}
