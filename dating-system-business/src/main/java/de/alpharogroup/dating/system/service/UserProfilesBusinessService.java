package de.alpharogroup.dating.system.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.collections.ListExtensions;
import de.alpharogroup.dating.system.daos.UserProfilesDao;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.dating.system.service.api.UserProfilesService;
import de.alpharogroup.dating.system.service.utils.HqlStringCreator;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.resource.system.application.model.ModelSynchronizer;
import de.alpharogroup.resource.system.application.model.ResourcesModel;
import de.alpharogroup.resource.system.entities.Resources;
import de.alpharogroup.resource.system.service.api.ResourcesService;
import de.alpharogroup.user.entities.Users;

/**
 * The Class UserProfileBusinessService.
 */
@Transactional
@Service("userProfilesService")
public class UserProfilesBusinessService extends AbstractBusinessService<UserProfiles, Integer, UserProfilesDao> implements UserProfilesService {


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
	public void setUserProfilesDao(final UserProfilesDao userProfileDao) {
		setDao(userProfileDao);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UserProfiles> findUserProfiles(final Users user) {
		return find(user);
	}

	@SuppressWarnings("unchecked")
	public List<UserProfiles> find(final Users user) {
		if(user != null) {
			final String hqlString = HqlStringCreator.forUserProfile(user);
			final Query query = getQuery(hqlString);
			query.setParameter("user", user);
			final List<UserProfiles> userProfiles = query.getResultList();
			return userProfiles;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfiles findUserProfile(final Users user) {
		final List<UserProfiles> userProfiles = findUserProfiles(user);
		return ListExtensions.getFirst(userProfiles);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Resources findProfileImage(final Users user) {
		final UserProfiles profile = findUserProfile(user);
		if( profile!=null) {
			return profile.getUserImage();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Resources persistProfileImage(final ResourcesModel resourceModel, final Users user) {
		Resources image = ModelSynchronizer.convert(resourceModel);
		UserProfiles profile = findUserProfile(user);
		if(profile.getUserImage() != null) {
			final Integer imgId = profile.getUserImage().getId();
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
	@Override
	public UserProfiles persistDefaultProfileImage(final Users user) {
		final Resources defaultImage = resourcesService.getDefaultPlaceholder();
		return persistDefaultProfileImage(user, defaultImage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserProfiles persistDefaultProfileImage(final Users user, final Resources defaultImage) {
		UserProfiles profile = findUserProfile(user);
		if(profile != null && profile.getUserImage() != null) {
			final Integer imgId = profile.getUserImage().getId();
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