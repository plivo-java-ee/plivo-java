package org.plivo.ee.test.call;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.Record;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class RecordCallTest extends AbstractTest {

	@Test
	public void test() {

		getParameters().put("call_uuid", "6653422-91b6-4716-9fad-9463daaeeec2");

		/**
		 * Optional Parameters : params.put("time_limit":"75");
		 * params.put("file_format":"mp3");
		 * params.put("callback_url":"http://someurl");
		 * params.put("callback_method":"GET" or "POST"); - Defaults to POST
		 */
		try {
			Record response = getRestApi().record(getParameters());
			Assert.assertNotNull(response.url);
		} catch (PlivoException plivoException) {
			plivoException.printStackTrace();
		}
	}

}
