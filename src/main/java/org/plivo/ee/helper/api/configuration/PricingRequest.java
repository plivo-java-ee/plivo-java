package org.plivo.ee.helper.api.configuration;

import javax.ws.rs.HttpMethod;

import org.plivo.ee.helper.api.util.DefaultRequestTemplate;

public enum PricingRequest
{
   // GET https://api.plivo.com/v1/Account/{auth_id}/Pricing/
   GET(new DefaultRequestTemplate(HttpMethod.GET,
            GlobalConstant.PLIVO_API, "/v1/Account/{auth_id}/Pricing/")
            .pathParams(GlobalConstant.AUTH_ID).queryParams(GlobalConstant.COUNTRY_ISO)), ;

   private DefaultRequestTemplate template;

   PricingRequest(DefaultRequestTemplate template)
   {
      this.template = template;
   }

   public DefaultRequestTemplate getTemplate()
   {
      return template;
   }

}
