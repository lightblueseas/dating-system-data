package de.alpharogroup.dating.system.rest;

import de.alpharogroup.dating.system.domain.UserProfile;
import de.alpharogroup.dating.system.rest.api.UserProfilesResource;
import de.alpharogroup.dating.system.service.api.UserProfileService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class UserProfilesRestResource
	extends
		AbstractRestfulResource<Integer, UserProfile, UserProfileService>
	implements
		UserProfilesResource
{

}
