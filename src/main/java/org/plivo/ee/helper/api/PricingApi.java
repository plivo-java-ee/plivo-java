package org.plivo.ee.helper.api;

import java.util.Map;

import javax.ws.rs.client.Client;

import org.plivo.ee.helper.api.configuration.PricingRequest;
import org.plivo.ee.helper.api.pojo.Price;
import org.plivo.ee.helper.api.util.RequestUtils;

public class PricingApi extends AbstractApi
{

   public PricingApi(Client client)
   {
      this.client = client;
   }

   public Client getClient()
   {
      return client;
   }

   public void setClient(Client client)
   {
      this.client = client;
   }

   /*
    * Get Pricing for a Country
    * 
    * 
    * This API lets you get pricing details for a specific country.
    * 
    * GET https://api.plivo.com/v1/Account/{auth_id}/Pricing/
    */
   public Price getPricingForCountry(Map<String, String> parameters) throws Exception
   {
      return RequestUtils.submit(client,
               PricingRequest.GET.getTemplate(),
               parameters, Price.class);
   }

}