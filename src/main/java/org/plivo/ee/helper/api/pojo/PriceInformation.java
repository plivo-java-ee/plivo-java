package org.plivo.ee.helper.api.pojo;

import java.util.List;

public class PriceInformation
{
   public String rate;
   public String group_name;
   public List<String> prefix;

   @Override
   public String toString()
   {
      return "PriceInformation [" + (rate != null ? "rate=" + rate + ", " : "")
               + (group_name != null ? "group_name=" + group_name + ", " : "")
               + (prefix != null ? "prefix=" + prefix : "") + "]";
   }

}
