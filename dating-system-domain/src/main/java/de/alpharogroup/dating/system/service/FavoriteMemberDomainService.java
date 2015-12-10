package de.alpharogroup.dating.system.service;

import de.alpharogroup.dating.system.daos.FavoriteMembersDao;
import de.alpharogroup.dating.system.domain.FavoriteMember;
import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.mapper.FavoriteMembersMapper;
import de.alpharogroup.dating.system.service.api.FavoriteMemberService;
import de.alpharogroup.service.domain.AbstractDomainService;

public class FavoriteMemberDomainService
	extends
		AbstractDomainService<Integer, FavoriteMember, FavoriteMembers, FavoriteMembersDao, FavoriteMembersMapper>
	implements
		FavoriteMemberService
{

}
