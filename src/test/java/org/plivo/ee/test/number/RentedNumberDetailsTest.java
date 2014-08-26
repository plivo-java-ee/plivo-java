package org.plivo.ee.test.number;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class RentedNumberDetailsTest extends AbstractTest {

	@Test
	public void test() {

		getParameters().put("number", "123456789");
		// Scanner scanner = new Scanner(System.in);
		// System.out.print("enter the rented number : ");

		// rentedNumber = scanner.nextLine();
		try {
			GenericResponse numberDetails = getRestApi().rentNumber(
					getParameters());
			Assert.assertNotNull(numberDetails.getApiId());
		} catch (PlivoException plivoException) {
			plivoException.printStackTrace();
		}

	}
}
