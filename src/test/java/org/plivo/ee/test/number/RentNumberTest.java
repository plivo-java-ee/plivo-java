package org.plivo.ee.test.number;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.number.NumberResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class RentNumberTest extends AbstractTest {

	@Test
	public void test() {

		NumberResponse numbers = new NumberResponse();
		// Mandatory Parameter - group_id
		getParameters().put("group_id", "11542695876496");

		// Optional Parameters - number_type, prefix, region, services, limit,
		// offset
		/*
		 * getParameters().put("number_type", "BE");
		 * getParameters().put("prefix", "12345"); getParameters().put("region",
		 * "California"); getParameters().put("services", "voice");
		 * getParameters().put("limit", "10"); getParameters().put("offset",
		 * "705");
		 */

		try {
			numbers = getRestApi().rentNumbers(getParameters());
			Assert.assertNotNull(numbers.numberStatusList.get(0).number);
			System.out.println(numbers.numberStatusList.get(0).status);
			System.out.println(numbers.numberStatusList.get(1));
		} catch (PlivoException plivoException) {
			System.out.println(plivoException.getMessage());
		}
	}

}
