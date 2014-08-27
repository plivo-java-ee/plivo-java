package org.plivo.ee.helper.xml.test;

import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.xml.Dial;
import org.plivo.ee.helper.xml.Number;
import org.plivo.ee.helper.xml.Response;
import org.plivo.ee.helper.xml.User;

public class DialTest
{

   @Test
   public void dialStatusReporting()
   {

   }

   @Test
   public void customCallerTone1()
   {

   }

   @Test
   public void customCallerTone2()
   {

   }

   @Test
   public void confirmToAnswerCall1()
   {

   }

   @Test
   public void confirmToAnswerCall2()
   {

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
