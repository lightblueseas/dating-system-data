package de.alpharogroup.dating.system.rest;

import de.alpharogroup.dating.system.domain.ProfileRating;
import de.alpharogroup.dating.system.rest.api.ProfileRatingsResource;
import de.alpharogroup.dating.system.service.api.ProfileRatingService;
import de.alpharogroup.service.rs.AbstractRestfulResource;

public class ProfileRatingsRestResource
	extends
		AbstractRestfulResource<Integer, ProfileRating, ProfileRatingService>
	implements
		ProfileRatingsResource
{

}
