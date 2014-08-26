package org.plivo.ee.test.conference;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.conference.Conference;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;

public class RetrieveConferenceDetailsTest extends AbstractTest {

	@Test
	public void test() {
		getParameters().put("conference_name", "1234");
		try {
			Conference response = getRestApi().getLiveConference(
					getParameters());
			Assert.assertNotNull(response.getConferenceMemberCount());
		} catch (PlivoException e) {
			e.printStackTrace();
		}

	}

}
