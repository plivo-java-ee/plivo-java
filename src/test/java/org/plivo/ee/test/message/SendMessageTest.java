package org.plivo.ee.test.message;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.message.MessageResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class SendMessageTest extends AbstractTest {

	@Test
	public void test() {

		// TODO Auto-generated method stub
		addSrc();
		addDst();
		getParameters().put("text", "Hello");
		getParameters().put("url", "http://server/message/notification/");

		try {
			MessageResponse msgResponse = getRestApi().sendMessage(parameters);
			Assert.assertNotNull(msgResponse.apiId);
			if (msgResponse.serverCode == 202) {
				System.out.println(msgResponse.messageUuids.get(0).toString());
			} else {
				System.out.println(msgResponse.error);
			}
		} catch (PlivoException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
