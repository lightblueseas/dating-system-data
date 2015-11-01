package de.alpharogroup.dating.system.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.UserProfileDao;
import de.alpharogroup.dating.system.entities.UserProfile;
import de.alpharogroup.dating.system.service.api.UserProfileService;
import de.alpharogroup.dating.system.service.utils.HqlStringCreator;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.resource.system.application.model.ResourcesModel;
import de.alpharogroup.resource.system.entities.Resources;
import de.alpharogroup.resource.system.service.api.ResourcesService;
import de.alpharogroup.user.management.application.models.UserModelConverter;
import de.alpharogroup.user.management.entities.Users;

/**
 * The Class UserProfileBusinessService.
 */
@Transactional
@Service("userProfileService")
public class UserProfileBusinessService extends AbstractBusinessService<UserProfile, Integer, UserProfileDao> implements UserProfileService {

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The resources business service. */
	@Autowired	
	private ResourcesService resourcesService;

	/**
	 * Sets the user profile dao.
	 *
	 * @param userProfileDao the new user profile dao
	 */
	@Autowired
	public void setUserProfileDao(UserProfileDao userProfileDao) {
		setDao(userProfileDao);
	}	

	/**
	 * {@inheritDoc}
	 */
	public List<UserProfile> findUserProfiles(final Users user) {
		return find(user);
	}
	
	@SuppressWarnings("unchecked")
	public List<UserProfile> find(final Users user) {
		if(user != null) {
			final String hqlString = HqlStringCreator.forUserProfile(user);
			final Query query = getQuery(hqlString);
			query.setParameter("user", user);
			final List<UserProfile> userProfiles = query.getResultList();
			return userProfiles;			
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public UserProfile findUserProfile(Users user) {
		final List<UserProfile> userProfiles = findUserProfiles(user);
		if(userProfiles != null && !userProfiles.isEmpty()){
			return userProfiles.get(0);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Resources findProfileImage(Users user) {
		UserProfile profile = findUserProfile(user);
		if( profile!=null) {
			return profile.getUserImage();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Resources persistProfileImage(ResourcesModel resourceModel, final Users user) {
		Resources image = UserModelConverter.convert(resourceModel);
		UserProfile profile = findUserProfile(user);
		if(profile.getUserImage() != null) {
			Integer imgId = profile.getUserImage().getId();
			profile.setUserImage(null);
			profile = merge(profile);
			// do not delete default images... 
			if(3<imgId) {
				resourcesService.delete(imgId);				
			}
		} 
		image = resourcesService.merge(image);	
		profile.setUserImage(image);
		merge(profile);	
		return image;
	}

	/**
	 * {@inheritDoc}
	 */	
	public UserProfile persistDefaultProfileImage(final Users user) {
		Resources defaultImage = resourcesService.getDefaultPlaceholder();
		return persistDefaultProfileImage(user, defaultImage);		
	}

	/**
	 * {@inheritDoc}
	 */	
	public UserProfile persistDefaultProfileImage(final Users user, Resources defaultImage) {
		UserProfile profile = findUserProfile(user);
		if(profile != null && profile.getUserImage() != null) {
			Integer imgId = profile.getUserImage().getId();			 
			if(3 < imgId) {
				return profile;							
			}
		}
		if(defaultImage != null && profile != null) {
			profile.setUserImage(defaultImage);
			profile = merge(profile);
		}
		return profile;		
	}

}