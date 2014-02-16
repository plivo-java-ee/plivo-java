package org.plivo.ee.test.plivoXml;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.xml.elements.Dial;
import org.plivo.ee.helper.xml.elements.Number;
import org.plivo.ee.helper.xml.elements.PlivoResponse;
import org.plivo.ee.test.common.AbstractTest;


public class DialXMLTest extends AbstractTest {

	@Test
	public void test() {
		PlivoResponse response = new PlivoResponse();
		Dial dial = new Dial();
		dial.setCallerId("12345678901");
		Number number = new Number("12345678901");

		dial.setAction("http://http://myserverurl/setredirect/");
		dial.setMethod("GET");

		try {
			dial.append(number);
			response.append(dial);
			System.out.println(response.toXML());
			Assert.assertNotNull(response.toXML());
		} catch (PlivoException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
