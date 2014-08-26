package org.plivo.ee.helper.api.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.plivo.ee.helper.api.AccountApi;
import org.plivo.ee.helper.api.configuration.GlobalConstant;
import org.plivo.ee.helper.api.pojo.Account;
import org.plivo.ee.helper.api.pojo.ApiResponse;
import org.plivo.ee.helper.api.pojo.ApiResponseList;
import org.plivo.ee.helper.api.pojo.Subaccount;
import org.plivo.ee.helper.junit.Order;
import org.plivo.ee.helper.junit.OrderedRunner;

@RunWith(OrderedRunner.class)
public class AccountApiTest extends AbstractTest
{

   AccountApi accountApi = new AccountApi(client);
   static String sub_auth_id;

   @Test
   @Order(order = 1)
   public void testGetAccount()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         Account result = accountApi.getAccountDetails(parameters);
         Assert.assertNotNull(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   @Test
   @Order(order = 2)
   public void testModifyAccount()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.NAME, "flowertest");
         parameters.put(GlobalConstant.CITY, "san benedetto del tronto");
         parameters.put(GlobalConstant.ADDRESS, "via cornelio nepote 8");
         ApiResponse result = accountApi.modifyAccount(parameters);
         Assert.assertNotNull(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   @Test
   @Order(order = 3)
   public void testCreateSubaccount()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.NAME, "flower_sub" + System.currentTimeMillis());
         parameters.put(GlobalConstant.ENABLED, "True");
         ApiResponse result = accountApi.createSubaccount(parameters);
         Assert.assertNotNull(result);
         Assert.assertNotNull(result.auth_id);
         sub_auth_id = result.auth_id;
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   @Test
   @Order(order = 4)
   public void testGetDetailsSubaccount()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.SUBAUTH_ID, sub_auth_id);
         Subaccount result = accountApi.getDetailsSubaccount(parameters);
         Assert.assertNotNull(result);
      }
      catch (Exception e)
      {
         Assert.fail(e.getMessage());
      }
   }

   @Test
   @Order(order = 5)
   public void testModifySubaccount()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.NAME, "flower_sub_MOD_" + System.currentTimeMillis());
         parameters.put(GlobalConstant.ENABLED, "True");
         parameters.put(GlobalConstant.SUBAUTH_ID, sub_auth_id);
         ApiResponse result = accountApi.modifySubaccount(parameters);
         Assert.assertNotNull(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   @Test
   @Order(order = 6)
   public void testGetDetailsAllSubaccounts()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         ApiResponseList<Subaccount> result = accountApi
                  .getDetailsAllSubaccounts(parameters);
         Assert.assertNotNull(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

   @Test
   @Order(order = 7)
   public void testDeleteSubAccount()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.SUBAUTH_ID, sub_auth_id);
         boolean result = accountApi.deleteSubAccount(parameters);
         Assert.assertTrue(result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         Assert.fail(e.getMessage());
      }
   }

}
