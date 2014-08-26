package org.plivo.ee.test.call;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class HangupCallTest extends AbstractTest {

	@Test
	public void test() {
		getParameters().put("call_uuid", "6653422-91b6-4716-9fad-9463daaeeec2");
		try {
			GenericResponse response = getRestApi().hangupCall(getParameters());
			Assert.assertNotNull(response.getApiId());
		} catch (PlivoException plivoException) {
			plivoException.printStackTrace();
		}
	}

}
