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
import org.plivo.ee.helper.xml.Message;
import org.plivo.ee.helper.xml.Number;
import org.plivo.ee.helper.xml.PreAnswer;
import org.plivo.ee.helper.xml.Response;
import org.plivo.ee.helper.xml.Speak;
import org.plivo.ee.helper.xml.User;
import org.plivo.ee.helper.xml.type.MessageType;
import org.plivo.ee.helper.xml.type.Method;

public class XmlTest
{

   @Test
   public void preAnswer()
   {
      try
      {
         StringWriter sw = new StringWriter();
         Response response = new Response();
         response.preAnswer = new PreAnswer();
         response.preAnswer.speak = new Speak("This call will cost you $2 a minute.");
         response.speak = new Speak("Hey, thanks for dropping by.");
         JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
         jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.FALSE);

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
         jaxbMarshaller.marshal(response, sw);
         Assert.assertEquals(
                  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><PreAnswer><Speak>This call will cost you $2 a minute.</Speak></PreAnswer><Speak>Hey, thanks for dropping by.</Speak></Response>",
                  sw.toString());
      }
      catch (JAXBException e)
      {
         e.printStackTrace();
      }
   }

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
         response.dials = new ArrayList<>();
         response.dials.add(dial);

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
         Response response = new Response();
         response.getDigits = new GetDigits();
         response.getDigits.action = "http://www.foo.com/gather_pin/";
         response.getDigits.method = Method.POST;
         response.getDigits.speak = new Speak("Enter your 4-digit pin number, followed by the hash key");
         response.speak = new Speak("Input not received. Thank you");
         StringWriter sw = new StringWriter();
         JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
         jaxbMarshaller.marshal(response, sw);
         Assert.assertEquals(
                  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><GetDigits action=\"http://www.foo.com/gather_pin/\" method=\"POST\"><Speak>Enter your 4-digit pin number, followed by the hash key</Speak></GetDigits><Speak>Input not received. Thank you</Speak></Response>",
                  sw.toString());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   @Test
   public void message()
   {
      try
      {
         Response response = new Response();
         response.message = new Message("Hi, Message from Plivo");
         response.message.src = "12023222222";
         response.message.dst = "15671234567";
         response.message.type = MessageType.sms;
         response.message.callbackUrl = "http://foo.com/sms_status/";
         response.message.callbackMethod = Method.POST;
         StringWriter sw = new StringWriter();
         JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);

         jaxbMarshaller.marshal(response, sw);
         Assert.assertEquals(
                  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><Message src=\"12023222222\" dst=\"15671234567\" type=\"sms\" callbackUrl=\"http://foo.com/sms_status/\" callbackMethod=\"POST\">Hi, Message from Plivo</Message></Response>",
                  sw.toString());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   @Test
   public void sequentialDialing()
   {
      try
      {
         Response response = new Response();
         response.dials = new ArrayList<>();
         Dial dial1 = new Dial();
         dial1.timeout = 20;
         dial1.action = "http://foo.com/dial_action/";
         dial1.numbers = new ArrayList<>();
         dial1.numbers.add(new Number("18217654321"));
         response.dials.add(dial1);
         Dial dial2 = new Dial();
         dial2.numbers = new ArrayList<>();
         dial2.numbers.add(new Number("15671234567"));
         response.dials.add(dial2);
         StringWriter sw = new StringWriter();
         JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
         jaxbMarshaller.marshal(response, sw);
         Assert.assertEquals(
                  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><Dial action=\"http://foo.com/dial_action/\" timeout=\"20\"><Number>18217654321</Number></Dial><Dial><Number>15671234567</Number></Dial></Response>",
                  sw.toString());

      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   @Test
   public void simultaneousDialing()
   {
      try
      {
         Response response = new Response();
         response.dials = new ArrayList<>();
         Dial dial1 = new Dial();
         dial1.users = new ArrayList<>();
         dial1.users.add(new User("sip:alice1234@phone.plivo.com"));
         dial1.users.add(new User("sip:john1234@phone.plivo.com"));
         dial1.numbers = new ArrayList<>();
         dial1.numbers.add(new Number("15671234567"));
         response.dials.add(dial1);

         StringWriter sw = new StringWriter();
         JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);

         jaxbMarshaller.marshal(response, sw);
         Assert.assertEquals(
                  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><Dial><Number>15671234567</Number><User>sip:alice1234@phone.plivo.com</User><User>sip:john1234@phone.plivo.com</User></Dial></Response>",
                  sw.toString());

      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
