package de.alpharogroup.dating.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.ProfileRatingsDao;
import de.alpharogroup.dating.system.entities.ProfileRatings;
import de.alpharogroup.dating.system.service.api.ProfileRatingsService;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;

@Transactional
@Service("profileRatingsService")
public class ProfileRatingsBusinessService extends AbstractBusinessService<ProfileRatings, Integer, ProfileRatingsDao> implements ProfileRatingsService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	public void setProfileRatingsDao(ProfileRatingsDao profileRatingsDao) {
		setDao(profileRatingsDao);
	}

}