package org.plivo.ee.test.conference;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;

public class PlayMemberTest extends AbstractTest {

	@Test
	public void test() {

		getParameters().put("conference_name", "1234");
		getParameters().put("member_id", "1,2");
		/*
		 * single member_id or multiple or 'all'
		 */
		getParameters().put("url", "http:/mystorageserver/music.mp3");
		try {
			GenericResponse response = getRestApi().playMember(getParameters());
			Assert.assertNotNull(response.getApiId());
		} catch (PlivoException plivoException) {

			plivoException.printStackTrace();
		}

	}

}
