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

public class DatingSystemRestClientTest
{

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
	@Test(enabled = false)
	public void testGetStringWithBundleKey()
	{
		final String baseName = "test";
		final String[] paramsBritain = { "Fritz", "Germany" };
		// url can be invoked with a post request, so dont try this to invoke in
		// a browser...
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
