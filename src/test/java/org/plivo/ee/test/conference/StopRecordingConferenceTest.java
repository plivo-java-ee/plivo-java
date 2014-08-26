package org.plivo.ee.test.conference;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class StopRecordingConferenceTest extends AbstractTest {

	@Test
	public void test() {
		getParameters().put("conference_name", "1234");

		try {
			GenericResponse response = getRestApi().stopRecordConference(
					getParameters());
			Assert.assertNotNull(response.getApiId());
		} catch (PlivoException plivoException) {
			plivoException.printStackTrace();
		}
	}
}
