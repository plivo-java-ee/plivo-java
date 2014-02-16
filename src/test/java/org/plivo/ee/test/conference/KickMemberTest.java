package org.plivo.ee.test.conference;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class KickMemberTest extends AbstractTest {

	@Test
	public void test() {

		/**
		 * getParameters() : member_id - one single id multiple member ids
		 * delimited by ',' 'all' - to kick all members of conference
		 */

		getParameters().put("conference_name", "1234");
		getParameters().put("member_id", "1,2,3");

		GenericResponse response = new GenericResponse();
		try {
			response = getRestApi().kickMember(getParameters());
			Assert.assertNotNull(response.apiId);
		} catch (PlivoException plivoException) {
			plivoException.printStackTrace();
		}

	}

}
