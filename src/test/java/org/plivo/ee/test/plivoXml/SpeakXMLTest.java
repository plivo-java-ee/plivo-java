package org.plivo.ee.test.plivoXml;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.xml.elements.PlivoResponse;
import org.plivo.ee.helper.xml.elements.Speak;
import org.plivo.ee.test.common.AbstractTest;


public class SpeakXMLTest extends AbstractTest {

	@Test
	public void test() {
		PlivoResponse response = new PlivoResponse();
		Speak speak = new Speak("Plivo calling.");

		// Set various attributes for speak
		speak.setLanguage("en-US");
		speak.setVoice("WOMAN");

		try {
			response.append(speak);
			Assert.assertNotNull(response.toXML());
			System.out.println(response.toXML());
		} catch (PlivoException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
