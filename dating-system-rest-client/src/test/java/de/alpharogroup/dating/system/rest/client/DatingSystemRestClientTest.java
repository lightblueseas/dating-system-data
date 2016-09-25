package de.alpharogroup.dating.system.rest.client;

import java.util.Locale;

import javax.ws.rs.core.Response;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import de.alpharogroup.collections.pairs.KeyValuePair;
import de.alpharogroup.db.resource.bundles.rest.api.ResourcebundlesResource;
import de.alpharogroup.resourcebundle.locale.BundleKey;
import de.alpharogroup.resourcebundle.locale.ResourceBundleKey;

public class DatingSystemRestClientTest {

	/** The rest client. */
	private DatingSystemRestClient restClient;

	/** The resourcebundles resource. */
	private ResourcebundlesResource resourcebundlesResource;

	/**
	 * Sets the up method.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	public void setUpMethod() throws Exception
	{
		if (restClient == null)
		{
			restClient = new DatingSystemRestClient();
			resourcebundlesResource = restClient.getResourcebundlesResource();
			AssertJUnit.assertNotNull(resourcebundlesResource);
		}
	}

	/**
	 * Tear down method.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@AfterMethod
	public void tearDownMethod() throws Exception
	{
	}
	

	/**
	 * Test method for {@link ResourcebundlesResource#getString(BundleKey)}.
	 */
	@SuppressWarnings("unchecked")
	@Test(enabled = true)
	public void testGetStringWithBundleKey()
	{
		final String baseName = "test";
		final String[] paramsBritain = { "Fritz", "Germany" };
		// url can be invoked with a post request, so dont try this to invoke in a browser...
		final Response response = resourcebundlesResource.getString(BundleKey.builder()
			.baseName(baseName).locale(Locale.UK)
			.resourceBundleKey(ResourceBundleKey.builder()
				.key("com.example.gui.prop.with.params.label").parameters(paramsBritain).build())
			.build());
		AssertJUnit.assertNotNull(response);

		final KeyValuePair<String, String> keyValuePair = response.readEntity(KeyValuePair.class);
		System.out.println(keyValuePair);
	}

}
