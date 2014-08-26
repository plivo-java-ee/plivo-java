package org.plivo.ee.helper.api.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PriceMessageInfo
{
   public PriceInformation inbound;
   public PriceInformation outbound;
   public List<PriceInformation> outbound_networks_list;

   public PriceMessageInfo()
   {
   }

   @Override
   public String toString()
   {
      return "PriceMessageInfo [" + (inbound != null ? "inbound=" + inbound + ", " : "")
               + (outbound != null ? "outbound=" + outbound + ", " : "")
               + (outbound_networks_list != null ? "outbound_networks_list=" + outbound_networks_list : "") + "]";
   }

}
