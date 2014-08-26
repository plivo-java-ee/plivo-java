package org.plivo.ee.helper.api.test;

import org.junit.Assert;
import org.junit.Test;
import org.plivo.ee.helper.api.RecordingApi;

public class RecordingApiTest extends AbstractTest
{
   RecordingApi recordingApi = new RecordingApi(client);

   @Test
   public void test()
   {
      Assert.assertNotNull(recordingApi);
   }

}
