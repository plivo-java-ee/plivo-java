package org.plivo.ee.helper.api.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.api.CallApi;
import org.plivo.ee.helper.api.configuration.GlobalConstant;
import org.plivo.ee.helper.api.pojo.ApiResponse;
import org.plivo.ee.helper.api.pojo.ApiResponseList;
import org.plivo.ee.helper.api.pojo.Call;

public class CallApiTest extends AbstractTest
{

   CallApi callApi = new CallApi(client);

   @Test
   public void testMakeOutboundCall()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.FROM, number);
         parameters.put(GlobalConstant.TO, "+393922274929");
         parameters.put(GlobalConstant.ANSWER_URL, "https://we.getdat.es/xml/answer.xml");
         parameters.put(GlobalConstant.ANSWER_METHOD, "GET");
         parameters.put(GlobalConstant.HANGUP_URL, "https://we.getdat.es/xml/hangup.xml");
         parameters.put(GlobalConstant.HANGUP_METHOD, "GET");
         parameters.put(GlobalConstant.FALLBACK_URL, "https://we.getdat.es/xml/response.xml");
         parameters.put(GlobalConstant.FALLBACK_METHOD, "GET");

         ApiResponse result = callApi.makeOutboundCall(parameters);
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
   public void testMakeHangupCall()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.FROM, number);
         parameters.put(GlobalConstant.TO, "+393927620081");
         parameters.put(GlobalConstant.ANSWER_URL, "https://we.getdat.es/xml/answer.xml");
         parameters.put(GlobalConstant.ANSWER_METHOD, "GET");
         parameters.put(GlobalConstant.HANGUP_URL, "https://we.getdat.es/xml/hangup.xml");
         parameters.put(GlobalConstant.HANGUP_METHOD, "GET");
         parameters.put(GlobalConstant.FALLBACK_URL, "https://we.getdat.es/xml/response.xml");
         parameters.put(GlobalConstant.FALLBACK_METHOD, "GET");
         parameters.put(GlobalConstant.RING_URL, "https://we.getdat.es/xml/ring.xml");
         parameters.put(GlobalConstant.RING_METHOD, "GET");
         parameters.put(GlobalConstant.RING_TIMEOUT, "10");

         ApiResponse result = callApi.makeOutboundCall(parameters);
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
   public void testGetAllCallDetails()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         ApiResponseList<Call> result = callApi.getAllCallDetails(parameters);
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
   public void testGetCallDetailRecord()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.CALL_UUID, "5daaf65c-28b4-11e4-b749-6f69576744f2");
         Call result = callApi.getCallDetailRecordOfCall(parameters);
         Assert.assertNotNull(result);
         System.out.println(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   /**
    * 301 ?? è lo stesso url di testGetAllCallDetails
    */
   @Test
   public void testGetAllLiveCalls()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         ApiResponseList<Call> result = callApi.getAllLiveCalls(parameters);
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
   public void testLiveCallDetails()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.CALL_UUID, "5daaf65c-28b4-11e4-b749-6f69576744f2");
         Call result = callApi.getDetailsOfLiveCall(parameters);
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
   public void testHangUpCall()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.CALL_UUID, "5daaf65c-28b4-11e4-b749-6f69576744f2");
         boolean result = callApi.hangupSpecificCall(parameters);
         Assert.assertTrue(result);
         System.out.println(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   @Test
   public void testTransferCall()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.CALL_UUID, "5daaf65c-28b4-11e4-b749-6f69576744f2");
         ApiResponse result = callApi.transferCall(parameters);
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
