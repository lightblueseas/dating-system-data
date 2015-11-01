package de.alpharogroup.dating.system.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.ProfileNoticeDao;
import de.alpharogroup.dating.system.entities.ProfileNotice;
import de.alpharogroup.dating.system.entities.UserProfile;
import de.alpharogroup.dating.system.service.api.ProfileNoticeService;
import de.alpharogroup.dating.system.service.utils.HqlStringCreator;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.user.management.entities.Users;

@Transactional
@Service("profileNoticeService")
public class ProfileNoticeBusinessService extends AbstractBusinessService<ProfileNotice, Integer, ProfileNoticeDao> implements ProfileNoticeService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	public void setProfileRatingsDao(ProfileNoticeDao profileNoticeDao) {
		setDao(profileNoticeDao);
	}
	
	public ProfileNotice findProfileNotice(Users user, UserProfile userProfile) {
		final List<ProfileNotice> profileNotices = findAll(user, userProfile);	
		if(profileNotices != null && !profileNotices.isEmpty()){
			return profileNotices.get(0);
		}
		return null;		
	}
	
	public List<ProfileNotice> find(Users user) {
		final List<ProfileNotice> profileNotices = findAll(user, null);		
		return profileNotices;		
	}
	
	@SuppressWarnings("unchecked")
	public List<ProfileNotice> findAll(Users user, UserProfile userProfile) {
		final String hqlString = HqlStringCreator.forProfileNotice(user, userProfile);
		final Query query = getQuery(hqlString);
		if(user != null){
			query.setParameter("user", user);
		}
		if(userProfile != null) {
			query.setParameter("userProfile", userProfile);
		}
		final List<ProfileNotice> profileNotices = query.getResultList();
		return profileNotices;
	}

}