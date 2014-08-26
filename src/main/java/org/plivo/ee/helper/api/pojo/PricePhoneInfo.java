package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlElement;

public class PricePhoneInfo
{
   @XmlElement(name = "local")
   public PriceInformation local;
   @XmlElement(name = "tollfree")
   public PriceInformation tollfree;
   @XmlElement(name = "outbound_networks_list")
   public PriceInformation outbound_networks_list;

   public PricePhoneInfo()
   {
   }

   @Override
   public String toString()
   {
      return "PricePhoneInfo [" + (local != null ? "local=" + local + ", " : "")
               + (tollfree != null ? "tollfree=" + tollfree + ", " : "")
               + (outbound_networks_list != null ? "outbound_networks_list=" + outbound_networks_list : "") + "]";
   }

}
