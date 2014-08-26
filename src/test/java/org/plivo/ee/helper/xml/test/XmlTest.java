package org.plivo.ee.helper.xml.test;

import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.xml.Conference;
import org.plivo.ee.helper.xml.Dial;
import org.plivo.ee.helper.xml.GetDigits;
import org.plivo.ee.helper.xml.Language;
import org.plivo.ee.helper.xml.Method;
import org.plivo.ee.helper.xml.Number;
import org.plivo.ee.helper.xml.Response;
import org.plivo.ee.helper.xml.Speak;

public class XmlTest
{

   @Test
   public void dialWithNumbers()
   {
      try
      {
         StringWriter sw = new StringWriter();
         Response response = new Response();
         Dial dial = new Dial();
         dial.callerId = "12345678901";
         Number number1 = new Number("123456");
         Number number2 = new Number("789120");

         dial.action = "http://http://myserverurl/setredirect/";
         dial.method = Method.GET;
         dial.numbers = new ArrayList<>();
         dial.numbers.add(number1);
         dial.numbers.add(number2);
         response.dial = dial;

         JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
         jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.FALSE);

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);

         jaxbMarshaller.marshal(response, sw);
         Assert.assertEquals(
                  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><Dial action=\"http://http://myserverurl/setredirect/\" method=\"GET\" callerId=\"12345678901\"><Number>123456</Number><Number>789120</Number></Dial></Response>",
                  sw.toString());

      }
      catch (JAXBException e)
      {
         e.printStackTrace();
      }
   }

   @Test
   public void conference()
   {
      try
      {
         Response response = new Response();
         response.conference = new Conference("ciao");
         response.conference.relayDTMF = true;
         StringWriter sw = new StringWriter();
         JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);

         jaxbMarshaller.marshal(response, sw);
         Assert.assertEquals(
                  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><Conference relayDTMF=\"true\">ciao</Conference></Response>",
                  sw.toString());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   @Test
   public void getDigits()
   {
      try
      {
         GetDigits getDigits = new GetDigits();
         getDigits.speak = new Speak("ciao come va");
         getDigits.speak.language = Language.Italian;
         StringWriter sw = new StringWriter();
         JAXBContext jaxbContext = JAXBContext.newInstance(GetDigits.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);

         jaxbMarshaller.marshal(getDigits, sw);
         Assert.assertEquals(
                  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><GetDigits><Speak language=\"it-IT\" loop=\"0\">ciao come va</Speak></GetDigits>",
                  sw.toString());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
