/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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
import de.alpharogroup.user.entities.Users;

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