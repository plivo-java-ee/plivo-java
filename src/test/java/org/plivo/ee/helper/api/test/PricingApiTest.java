package org.plivo.ee.helper.api.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.api.PricingApi;
import org.plivo.ee.helper.api.configuration.GlobalConstant;
import org.plivo.ee.helper.api.pojo.Price;

public class PricingApiTest extends AbstractTest
{

   PricingApi pricingApi = new PricingApi(client);

   @Test
   public void testGetPricingForCountry()
   {
      try
      {
         Map<String, String> parameters = new HashMap<>();
         parameters.put(GlobalConstant.AUTH_ID, auth_id);
         parameters.put(GlobalConstant.COUNTRY_ISO, "FR");
         PricingApi pricingApi = new PricingApi(client);
         Price result = pricingApi.getPricingForCountry(parameters);
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
