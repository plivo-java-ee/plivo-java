package org.plivo.ee.test;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.call.Call;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;

public class SimpleMultiple extends AbstractTest {

	@Test
	public void test() {
		addFrom();
		getParameters().put("to", "3922274929<393408765448");
		getParameters()
				.put("answer_url",
						"http://plivo-twiliofaces1.rhcloud.com/demo-speak/readMessage.jsf");
		getParameters().put("hangup_url",
				"http://plivo-twiliofaces1.rhcloud.com/demo-speak/hangup.jsf");
		try {
			Call response = getRestApi().makeCall(getParameters());
			System.out.println(response.getError());
			System.out.println(response.getRequestUUID());
			Assert.assertNotNull(response.getApiId());
		} catch (PlivoException e) {
			System.out.println(e.getMessage());
		}

	}
}