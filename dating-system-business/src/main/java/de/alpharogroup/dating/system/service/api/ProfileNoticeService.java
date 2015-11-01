package de.alpharogroup.dating.system.service.api;

import java.util.List;

import de.alpharogroup.dating.system.entities.ProfileNotice;
import de.alpharogroup.dating.system.entities.UserProfile;
import de.alpharogroup.db.service.jpa.BusinessService;
import de.alpharogroup.user.management.entities.Users;

public interface ProfileNoticeService extends BusinessService<ProfileNotice, Integer> {

	ProfileNotice findProfileNotice(Users user, UserProfile userProfile);
	
	List<ProfileNotice> find(Users user);
	
	List<ProfileNotice> findAll(Users user, UserProfile userProfile);
}
