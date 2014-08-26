package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "inbound")
public class PriceInboundInfo
{
   @XmlElement(name = "ip")
   public PriceInformation ip;
   @XmlElement(name = "local")
   public PriceInformation local;
   @XmlElement(name = "tollfree")
   public PriceInformation tollfree;

   @Override
   public String toString()
   {
      return "PriceInboundInfo [" + (ip != null ? "ip=" + ip + ", " : "")
               + (local != null ? "local=" + local + ", " : "") + (tollfree != null ? "tollfree=" + tollfree : "")
               + "]";
   }

}
