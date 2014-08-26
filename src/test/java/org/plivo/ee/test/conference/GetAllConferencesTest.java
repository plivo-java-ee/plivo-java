package org.plivo.ee.test.conference;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.conference.LiveConferenceFactory;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class GetAllConferencesTest extends AbstractTest {

	@Test
	public void test() {

		try {
			LiveConferenceFactory liveConferenceList = getRestApi()
					.getLiveConferences();
			Assert.assertNotNull(liveConferenceList.getApiId());
			for (String conferenceName : liveConferenceList.getConferences()) {
				Assert.assertNotNull(conferenceName);
			}
		} catch (PlivoException e) {
			e.printStackTrace();
		}

	}

}
