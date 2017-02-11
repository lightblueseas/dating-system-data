package de.alpharogroup.dating.system.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.collections.ListExtensions;
import de.alpharogroup.dating.system.daos.ProfileNoticesDao;
import de.alpharogroup.dating.system.entities.ProfileNotices;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.dating.system.service.api.ProfileNoticesService;
import de.alpharogroup.dating.system.service.utils.HqlStringCreator;
import de.alpharogroup.db.service.jpa.AbstractBusinessService;
import de.alpharogroup.user.management.entities.Users;

@Transactional
@Service("profileNoticesService")
public class ProfileNoticesBusinessService extends AbstractBusinessService<ProfileNotices, Integer, ProfileNoticesDao> implements ProfileNoticesService {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	@Autowired
	public void setProfileNoticesDao(final ProfileNoticesDao profileNoticeDao) {
		setDao(profileNoticeDao);
	}

	@Override
	public ProfileNotices findProfileNotice(final Users user, final UserProfiles userProfile) {
		final List<ProfileNotices> profileNotices = findAll(user, userProfile);
		return ListExtensions.getFirst(profileNotices);
	}

	@Override
	public List<ProfileNotices> find(final Users user) {
		final List<ProfileNotices> profileNotices = findAll(user, null);
		return profileNotices;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ProfileNotices> findAll(final Users user, final UserProfiles userProfile) {
		final String hqlString = HqlStringCreator.forProfileNotice(user, userProfile);
		final Query query = getQuery(hqlString);
		if(user != null){
			query.setParameter("user", user);
		}
		if(userProfile != null) {
			query.setParameter("userProfile", userProfile);
		}
		final List<ProfileNotices> profileNotices = query.getResultList();
		return profileNotices;
	}

}