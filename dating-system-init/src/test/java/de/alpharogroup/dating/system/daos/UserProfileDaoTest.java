package de.alpharogroup.dating.system.daos;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.dating.system.service.api.UserProfilesService;

@ContextConfiguration(locations = "classpath:test-applicationContext.xml")
public class UserProfileDaoTest extends AbstractTestNGSpringContextTests {

    @Autowired
	private UserProfilesService userProfileService;

	@Test(enabled=false)
	public void getAllUserProfile() {
		initUserProfile() ;
		final List<UserProfiles> list = userProfileService.findAll();
		AssertJUnit.assertEquals(2, list.size());
	}

	protected void initUserProfile() {
		UserProfiles userProfile = new UserProfiles();
		// TODO init model class
		userProfileService.merge(userProfile);

		userProfile = new UserProfiles();
		// TODO init model class
		userProfileService.merge(userProfile);

	}

}
