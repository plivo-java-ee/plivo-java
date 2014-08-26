package org.plivo.ee.helper.api.test;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.api.ConferenceApi;

public class ConferenceApiTest extends AbstractTest
{
   ConferenceApi conferenceApi = new ConferenceApi(client);

   @Test
   public void test()
   {
      Assert.assertNotNull(conferenceApi);
   }

}
