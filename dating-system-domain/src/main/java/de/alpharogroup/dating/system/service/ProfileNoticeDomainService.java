package de.alpharogroup.dating.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.ProfileNoticesDao;
import de.alpharogroup.dating.system.domain.ProfileNotice;
import de.alpharogroup.dating.system.entities.ProfileNotices;
import de.alpharogroup.dating.system.mapper.ProfileNoticesMapper;
import de.alpharogroup.dating.system.service.api.ProfileNoticeService;
import de.alpharogroup.service.domain.AbstractDomainService;

@Transactional
@Service("profileNoticeDomainService")
public class ProfileNoticeDomainService
	extends
		AbstractDomainService<Integer, ProfileNotice, ProfileNotices, ProfileNoticesDao, ProfileNoticesMapper>
	implements
		ProfileNoticeService
{
	/**
	 * Sets the specific {@link ProfileNoticesMapper}.
	 *
	 * @param mapper
	 *            the new {@link ProfileNoticesMapper}.
	 */
	@Autowired
	public void setProfileNoticesMapper(ProfileNoticesMapper mapper) {
		setMapper(mapper);
	}


}
