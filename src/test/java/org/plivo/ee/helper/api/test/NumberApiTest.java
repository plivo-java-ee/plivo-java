package org.plivo.ee.helper.api.test;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.api.NumberApi;

public class NumberApiTest extends AbstractTest
{
   NumberApi numberApi = new NumberApi(client);

   @Test
   public void test()
   {
      Assert.assertNotNull(numberApi);
   }

}
