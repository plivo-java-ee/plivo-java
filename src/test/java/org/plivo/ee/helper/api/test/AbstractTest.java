package org.plivo.ee.helper.api.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.plivo.ee.helper.api.util.Authenticator;

public class AbstractTest
{

   static String auth_id;
   static String auth_token;
   static String number;
   static Client client;

   @BeforeClass
   public static void beforeClass()
   {
      System.out.println("@BeforeClass");
      Properties prop = new Properties();
      InputStream input = null;
      try
      {
         input = new FileInputStream("src/test/resources/account.properties");
         prop.load(input);

         auth_id = prop.getProperty("auth_id");
         auth_token = prop.getProperty("auth_token");
         number = prop.getProperty("number");
         client = ClientBuilder.newClient().register(new Authenticator(auth_id, auth_token));
      }
      catch (IOException ex)
      {
         ex.printStackTrace();
      }
      finally
      {
         if (input != null)
         {
            try
            {
               input.close();
            }
            catch (IOException e)
            {
               e.printStackTrace();
            }
         }
      }
   }

   @AfterClass
   public static void afterClass()
   {
      System.out.println("@AfterClass");
   }

}
