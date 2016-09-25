package de.alpharogroup.dating.system.service.api;

import java.util.List;

import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.db.service.api.BusinessService;
import de.alpharogroup.user.management.entities.Users;

/**
 * The Interface FavoriteMembersService.
 */
public interface FavoriteMembersService extends BusinessService<FavoriteMembers, Integer> {
	
	/**
	 * Gets a FavoriteMembers object from the given parameters that can be
	 * null if they shell be ignored in the query. If no result is found null
	 * will be returned.
	 *
	 * @param owner the owner
	 * @param favorite the favorite
	 * @return the favorite members
	 */
	FavoriteMembers find(Users owner, UserProfiles favorite);
	
	/**
	 * Gets a List from FavoriteMembers with the given parameters that can be
	 * null if they shell be ignored in the query.
	 *
	 * @param owner the owner
	 * @param favorite the favorite
	 * @return the list
	 */
	List<FavoriteMembers> findAll(Users owner, UserProfiles favorite);
	
	/**
	 * Gets  a List from FavoriteMembers that own the given Users object.
	 *
	 * @param owner the owner
	 * @return the list
	 */
	List<FavoriteMembers> find(Users owner);
}