package org.plivo.ee.helper.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(OrderedRunner.class)
public class OrderTest
{
   @BeforeClass
   public static void beforeClass()
   {
      System.out.println("@BeforeClass");
   }

   @AfterClass
   public static void afterClass()
   {
      System.out.println("@AfterClass");
   }

   @Before
   public void before()
   {
      System.out.println("@Before");
   }

   @After
   public void after()
   {
      System.out.println("@After");
   }

   @Test
   @Order(order = 1)
   public void uno()
   {
      System.out.println("uno");
   }

   @Test
   @Order(order = 2)
   public void due()
   {
      System.out.println("due");
   }

   @Test
   @Order(order = 3)
   public void tre()
   {
      System.out.println("tre");
   }
}
