package de.alpharogroup.dating.system.rest;

import de.alpharogroup.dating.system.domain.FavoriteMember;
import de.alpharogroup.dating.system.rest.api.FavoriteMembersResource;
import de.alpharogroup.dating.system.service.api.FavoriteMemberService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class FavoriteMembersRestResource
	extends
		AbstractRestfulResource<Integer, FavoriteMember, FavoriteMemberService>
	implements
		FavoriteMembersResource
{

}
