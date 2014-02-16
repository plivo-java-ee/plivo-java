package org.plivo.ee.test.plivoXml;

import junit.framework.Assert;

import org.junit.Test;
import org.plivo.ee.helper.xml.elements.PlivoResponse;
import org.plivo.ee.test.common.AbstractTest;

public class NoXMLTest extends AbstractTest {

	@Test
	public void test() {
		PlivoResponse response = new PlivoResponse();
		System.out.println(response.toXML());
		Assert.assertNotNull(response.toXML());
	}
}
