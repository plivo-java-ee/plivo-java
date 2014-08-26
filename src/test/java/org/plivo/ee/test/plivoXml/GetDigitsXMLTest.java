package org.plivo.ee.test.plivoXml;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.xml.elements.GetDigits;
import org.plivo.ee.helper.xml.elements.PlivoResponse;
import org.plivo.ee.helper.xml.elements.Speak;
import org.plivo.ee.test.common.AbstractTest;


public class GetDigitsXMLTest extends AbstractTest {

	@Test
	public void test() {
		PlivoResponse response = new PlivoResponse();
		Speak speak = new Speak("Press one for English. Press two for Spanish");
		GetDigits getdigits = new GetDigits();

		// Set the various attributes for Speak
		speak.setLanguage("en-US");
		speak.setVoice("WOMAN");

		// Set attributes for GetDigits
		getdigits.setAction("http://myserverurl/input/");
		getdigits.setMethod("GET");

		try {
			getdigits.append(speak);
			response.append(getdigits);
			System.out.println(response.toXML());
			Assert.assertNotNull(response.toXML());
		} catch (PlivoException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
