package org.plivo.ee.helper.api.util;

public class XmlUtils
{

   public static String escape(String t)
   {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < t.length(); i++)
      {
         char c = t.charAt(i);
         switch (c)
         {
         case '<':
            sb.append("&lt;");
            break;
         case '>':
            sb.append("&gt;");
            break;
         case '\"':
            sb.append("&quot;");
            break;
         case '&':
            sb.append("&amp;");
            break;
         case '\'':
            sb.append("&apos;");
            break;
         default:
            if (c > 0x7e)
            {
               sb.append("&#" + ((int) c) + ";");
            }
            else
               sb.append(c);
         }
      }
      return sb.toString();
   }

   public static void main(String[] args)
   {
      String toXml = "è tutto più bello > ! si arriverà, perché, verrò...";
      System.out.println(escape(toXml));
   }
}
