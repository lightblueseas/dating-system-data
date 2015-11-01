package de.alpharogroup.dating.system.service.api;

import java.util.List;

import de.alpharogroup.dating.system.entities.UserProfile;
import de.alpharogroup.db.service.jpa.BusinessService;
import de.alpharogroup.resource.system.application.model.ResourcesModel;
import de.alpharogroup.resource.system.entities.Resources;
import de.alpharogroup.user.management.entities.Users;

/**
 * The Interface UserProfileService.
 */
public interface UserProfileService extends
		BusinessService<UserProfile, Integer> {

	/**
	 * Find all user profiles from the given user.
	 *
	 * @param user the user
	 * @return the list
	 */
	List<UserProfile> findUserProfiles(final Users user);
	
	/**
	 * Find the user profile from the given user.
	 *
	 * @param user the user
	 * @return the user profile or null if the given user has no profile
	 */
	UserProfile findUserProfile(final Users user);
	
	/**
	 * Find the profile image from the given user.
	 *
	 * @param user the user
	 * @return the profile image or null if there is no image
	 */
	Resources findProfileImage(Users user);
	
	/**
	 * Persists the given ResourceModel as the profile image from the given user.
	 *
	 * @param resourceModel the resource model
	 * @param user the user
	 * @return the resources
	 */
	Resources persistProfileImage(ResourcesModel resourceModel, final Users user);

	
	/**
	 * Persists the default image to the profile image from the given user. In case an image already exists this will be returned.
	 *
	 * @param user the user
	 * @return the default image or null if no default image exists.
	 */
	UserProfile persistDefaultProfileImage(final Users user);
	
	/**
	 * Persists the default image to the profile image from the given user. In case an image already exists this will be returned.
	 *
	 * @param user the user
	 * @param defaultImage the default image
	 * @return the default image or null if no default image exists.
	 */
	UserProfile persistDefaultProfileImage(final Users user, Resources defaultImage);
}