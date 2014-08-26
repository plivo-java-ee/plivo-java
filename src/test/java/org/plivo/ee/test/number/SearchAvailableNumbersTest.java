package org.plivo.ee.test.number;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.number.NumberGroupFactory;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class SearchAvailableNumbersTest extends AbstractTest {

	@Test
	public void test() {
		NumberGroupFactory numbers = new NumberGroupFactory();

		// Mandatory Parameter - country_iso
		getParameters().put("country_iso", "BE");

		// Optional Parameters - number_type, prefix, region, services, limit,
		// offset
		/*
		 * getParameters().put("number_type", "BE"); getParameters().put("prefix", "12345");
		 * getParameters().put("region", "California"); getParameters().put("services", "voice");
		 * getParameters().put("limit", "10"); getParameters().put("offset", "705");
		 */

		try {
			numbers = getRestApi().searchNumberGroups(getParameters());
			Assert.assertNotNull(numbers.getGroupList().get(0).getGroupId());
		} catch (PlivoException plivoException) {
			System.out.println(plivoException.getMessage());
		}
	}

}
