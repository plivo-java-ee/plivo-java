package org.plivo.ee.test.conference;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class HangupAllConferencesTest extends AbstractTest {

	@Test
	public void test() {
		try {
			GenericResponse genResponse = getRestApi().hangupAllConferences();
			Assert.assertNotNull(genResponse.getApiId());
		} catch (PlivoException plivoException) {
			plivoException.printStackTrace();
		}
	}

}
