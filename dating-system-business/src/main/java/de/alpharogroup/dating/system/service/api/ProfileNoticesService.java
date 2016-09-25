package de.alpharogroup.dating.system.service.api;

import java.util.List;

import de.alpharogroup.dating.system.entities.ProfileNotices;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.db.service.api.BusinessService;
import de.alpharogroup.user.management.entities.Users;

public interface ProfileNoticesService extends BusinessService<ProfileNotices, Integer> {

	ProfileNotices findProfileNotice(Users user, UserProfiles userProfile);
	
	List<ProfileNotices> find(Users user);
	
	List<ProfileNotices> findAll(Users user, UserProfiles userProfile);
}
