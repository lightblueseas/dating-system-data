package de.alpharogroup.dating.system.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.FavoriteMembersDao;
import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.entities.UserProfile;
import de.alpharogroup.dating.system.service.api.FavoriteMembersService;
import de.alpharogroup.dating.system.service.utils.HqlStringCreator;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.user.management.entities.Users;

@Transactional
@Service("favoriteMembersService")
public class FavoriteMembersBusinessService extends AbstractBusinessService<FavoriteMembers, Integer, FavoriteMembersDao> implements FavoriteMembersService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	public void setFavoriteMembersDao(FavoriteMembersDao favoriteMembersDao) {
		setDao(favoriteMembersDao);
	}
	@Transactional
	public FavoriteMembers find(Users owner, UserProfile favorite) {
		final List<FavoriteMembers> favoriteMembers = findAll(owner, favorite);
		if(favoriteMembers != null && !favoriteMembers.isEmpty()){
			return favoriteMembers.get(0);
		}
		return null;	
	}
	@Transactional
	@SuppressWarnings("unchecked")	
	public List<FavoriteMembers> findAll(Users owner, UserProfile favorite) {
		final String hqlString = HqlStringCreator.forFavoriteMembers(owner, favorite);
		final Query query = getQuery(hqlString);
		if(owner != null) {
			query.setParameter("owner", owner);
		}
		if(favorite != null) {
			query.setParameter("favorite", favorite);
		}
		final List<FavoriteMembers> favoriteMembers = query.getResultList();
		return favoriteMembers;
	}
	
	@SuppressWarnings("unchecked")
	public List<FavoriteMembers> find(Users owner){
		final String hqlString = HqlStringCreator.forFavoriteMembers(owner, null);
		final Query query = getQuery(hqlString);
		query.setParameter("owner", owner);
		final List<FavoriteMembers> favoriteMembers = query.getResultList();
		return favoriteMembers;
	}

}