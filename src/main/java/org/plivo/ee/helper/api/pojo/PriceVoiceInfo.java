package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PriceVoiceInfo
{
   @XmlElement(name = "inbound")
   public PriceInboundInfo inbound;
   @XmlElement(name = "outbound")
   public PriceOutboundInfo outbound;
   @XmlElement(name = "tollfree")
   public PriceInformation tollfree;

   public PriceVoiceInfo()
   {
   }

   @Override
   public String toString()
   {
      return "PriceVoiceInfo [" + (inbound != null ? "inbound=" + inbound + ", " : "")
               + (outbound != null ? "outbound=" + outbound + ", " : "")
               + (tollfree != null ? "tollfree=" + tollfree : "") + "]";
   }

}
