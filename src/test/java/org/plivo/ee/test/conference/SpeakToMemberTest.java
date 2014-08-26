package org.plivo.ee.test.conference;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class SpeakToMemberTest extends AbstractTest {

	@Test
	public void test() {

		getParameters().put("conference_name", "1234");
		getParameters().put("member_id", "1");
		/*
		 * single member_id or multiple or 'all'
		 */
		getParameters().put("text",
				"Hello! Member. Welcome to the conference 1234");

		/**
		 * Optional Parameters
		 * 
		 * voice : MAN, WOMAN, Defaults to WOMAN language : en-US,el-GR etc.
		 * 
		 * getParameters().put("voice", "MAN"); getParameters().put("language",
		 * "en-US");
		 */

		try {
			GenericResponse response = getRestApi()
					.speakMember(getParameters());
			Assert.assertNotNull(response.getApiId());
		} catch (PlivoException plivoException) {

			plivoException.printStackTrace();
		}

	}
}
