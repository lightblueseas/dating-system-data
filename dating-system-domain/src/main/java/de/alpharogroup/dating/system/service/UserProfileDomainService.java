package de.alpharogroup.dating.system.service;

import de.alpharogroup.dating.system.daos.UserProfilesDao;
import de.alpharogroup.dating.system.domain.UserProfile;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.dating.system.mapper.UserProfilesMapper;
import de.alpharogroup.dating.system.service.api.UserProfileService;
import de.alpharogroup.service.domain.AbstractDomainService;

public class UserProfileDomainService
	extends
		AbstractDomainService<Integer, UserProfile, UserProfiles, UserProfilesDao, UserProfilesMapper>
	implements
		UserProfileService
{

}
