package org.plivo.ee.helper.api.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.api.MessageApi;
import org.plivo.ee.helper.api.configuration.GlobalConstant;
import org.plivo.ee.helper.api.pojo.ApiResponse;
import org.plivo.ee.helper.api.pojo.ApiResponseList;
import org.plivo.ee.helper.api.pojo.Message;

public class MessageApiTest extends AbstractTest
{

   MessageApi messageApi = new MessageApi(client);

   @Test
   public void testGetDetailsAllMessages()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         ApiResponseList<Message> result = messageApi.getDetailsAllMessages(parameters);
         Assert.assertNotNull(result);
         System.out.println(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   @Test
   public void testGetMessageDetails()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.MESSGE_UUID, "5ae58ffe-2a0d-11e4-8ce7-22000ac7863c");
         Message result = messageApi.getMessageDetails(parameters);
         Assert.assertNotNull(result);
         System.out.println(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   @Test
   public void testSendMessage()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.SRC, number);
         parameters.put(GlobalConstant.DST, "+393922274929");
         parameters.put(GlobalConstant.TEXT, "ciao come va");
         parameters.put(GlobalConstant.TYPE, "sms");
         parameters.put(GlobalConstant.URL, "https://we.getdat.es/api/v1/plivo/sms/url");
         parameters.put(GlobalConstant.METHOD, "POST");
         parameters.put(GlobalConstant.LOG, "true");
         ApiResponse result = messageApi.sendMessage(parameters);
         Assert.assertNotNull(result);
         System.out.println(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   @Test
   public void testSendMessageFluently()
   {
      try
      {
         messageApi.put(GlobalConstant.AUTH_ID, auth_id)
                  .put(GlobalConstant.SRC, number)
                  .put(GlobalConstant.DST, "+393922274929")
                  .put(GlobalConstant.TEXT, "ciao come va")
                  .put(GlobalConstant.TYPE, "sms")
                  .put(GlobalConstant.URL, "https://we.getdat.es/api/v1/plivo/sms/url")
                  .put(GlobalConstant.METHOD, "POST")
                  .put(GlobalConstant.LOG, "true");
         ApiResponse result = messageApi.sendMessage();
         Assert.assertNotNull(result);
         System.out.println(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

}
