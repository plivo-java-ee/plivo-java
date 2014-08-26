package org.plivo.ee.helper.api.test;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.api.EndpointApi;

public class EndpointApiTest extends AbstractTest
{
   EndpointApi endpointApi = new EndpointApi(client);

   @Test
   public void test()
   {
      Assert.assertNotNull(endpointApi);
   }

}
