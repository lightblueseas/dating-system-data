package de.alpharogroup.dating.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.ProfileRatingsDao;
import de.alpharogroup.dating.system.domain.ProfileRating;
import de.alpharogroup.dating.system.entities.ProfileRatings;
import de.alpharogroup.dating.system.mapper.ProfileRatingsMapper;
import de.alpharogroup.dating.system.service.api.ProfileRatingService;
import de.alpharogroup.service.domain.AbstractDomainService;

@Transactional
@Service("profileRatingDomainService")
public class ProfileRatingDomainService
	extends
		AbstractDomainService<Integer, ProfileRating, ProfileRatings, ProfileRatingsDao, ProfileRatingsMapper>
	implements
		ProfileRatingService
{
	/**
	 * Sets the specific {@link ProfileRatingsMapper}.
	 *
	 * @param mapper
	 *            the new {@link ProfileRatingsMapper}.
	 */
	@Autowired
	public void setProfileRatingsMapper(ProfileRatingsMapper mapper) {
		setMapper(mapper);
	}


}
