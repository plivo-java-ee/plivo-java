package org.plivo.ee.helper.xml.test;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.xml.PreAnswer;
import org.plivo.ee.helper.xml.Response;
import org.plivo.ee.helper.xml.Speak;

public class PreAnswerTest
{

   @Test
   public void notifyCallers()
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
         jaxbMarshaller.marshal(response, System.out);
         System.out.println();
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
   public void notifyCallersFluent()
   {
      try
      {
         StringWriter sw = new StringWriter();
         Response response = new Response().preAnswer().speak("Hey, thanks for dropping by.");
         response.preAnswer.speak("This call will cost you $2 a minute.");
         JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
         jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.FALSE);
         jaxbMarshaller.marshal(response, System.out);
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
}
