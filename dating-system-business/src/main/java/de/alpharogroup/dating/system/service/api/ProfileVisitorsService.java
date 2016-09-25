package de.alpharogroup.dating.system.service.api;

import java.util.List;

import de.alpharogroup.dating.system.entities.ProfileVisitors;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.db.service.api.BusinessService;
import de.alpharogroup.user.management.entities.Users;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProfileVisitorsService.
 */
public interface ProfileVisitorsService extends BusinessService<ProfileVisitors, Integer>{
	
	/**
	 * Find the first occurence from the given parameters.
	 *
	 * @param visitor the visitor
	 * @param visitedProfile the visited profile
	 * @return the profile visitors
	 */
	ProfileVisitors find(Users visitor, UserProfiles visitedProfile);
	
	/**
	 * Find all from the given parameters.
	 *
	 * @param visitor the visitor
	 * @param visitedProfile the visited profile
	 * @return the list
	 */
	List<ProfileVisitors> findAll(Users visitor, UserProfiles visitedProfile);
	
	/**
	 * Find profile visitors from the given profile.
	 *
	 * @param visitedProfile the visited profile
	 * @return the list
	 */
	List<ProfileVisitors> findProfileVisitors(UserProfiles visitedProfile);
}