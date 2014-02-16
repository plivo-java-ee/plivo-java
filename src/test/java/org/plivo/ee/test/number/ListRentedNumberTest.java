package org.plivo.ee.test.number;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.number.NumberSearchFactory;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class ListRentedNumberTest extends AbstractTest {

	@Test
	public void test() {

		try {
			NumberSearchFactory numbers = getRestApi().getNumbers();
			Assert.assertNotNull(numbers.numberList.get(0).number);
		} catch (PlivoException plivoException) {
			plivoException.printStackTrace();
		}

	}

}
