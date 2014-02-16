package org.plivo.ee.test.conference;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class HangUpConferenceMemberTest extends AbstractTest {

	@Test
	public void test() {

		getParameters().put("conference_name", "1234");
		getParameters().put("member_id", "5");
		try {
			GenericResponse response = getRestApi().hangupMember(
					getParameters());
			Assert.assertNotNull(response.message);
		} catch (PlivoException plivoException) {

			plivoException.printStackTrace();
		}

	}

}
