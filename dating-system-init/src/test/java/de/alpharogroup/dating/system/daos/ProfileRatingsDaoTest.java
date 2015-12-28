package de.alpharogroup.dating.system.daos;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import de.alpharogroup.dating.system.entities.ProfileRatings;
import de.alpharogroup.dating.system.service.api.ProfileRatingsService;

@ContextConfiguration(locations = "classpath:test-applicationContext.xml")
public class ProfileRatingsDaoTest extends AbstractTestNGSpringContextTests {

    @Autowired
	private ProfileRatingsService profileRatingsService;

	@Test(enabled=false)
	public void getAllProfileRatings() {
		initProfileRatings();
		final List<ProfileRatings> list = profileRatingsService.findAll();
		AssertJUnit.assertEquals(2, list.size());
	}

	protected void initProfileRatings() {
		ProfileRatings profileRatings = new ProfileRatings();
		// TODO init model class
		profileRatingsService.merge(profileRatings);

		profileRatings = new ProfileRatings();
		// TODO init model class
		profileRatingsService.merge(profileRatings);

	}

}
