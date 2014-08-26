package org.plivo.ee.test.call;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.api.response.response.GenericResponse;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.test.common.AbstractTest;


public class TransferCallTest extends AbstractTest {

	@Test
	public void test() {

		getParameters().put("call_uuid", "6653422-91b6-4716-9fad-9463daaeeec2");
		/**
		 * Optional Parameters
		 * 
		 * legs : 'aleg', 'bleg' or 'both' aleg_url : URL to transfer for aleg,
		 * mandatory if legs is 'aleg' or 'both'. aleg_method : HTTP method GET
		 * or POST to use for aleg_url. POST is used by default. bleg_url : URL
		 * to transfer for bridged leg, mandatory if legs is 'bleg' or 'both'.
		 * bleg_method : HTTP method GET or POST to use for bleg_url. POST is
		 * used by default.
		 */

		getParameters().put("bleg_url", "http://myxmlserver.com/xmldial");
		try {
			GenericResponse response = getRestApi().transferCall(
					getParameters());
			Assert.assertNotNull(response.getApiId());
		} catch (PlivoException plivoException) {
			plivoException.printStackTrace();
		}
	}

}
