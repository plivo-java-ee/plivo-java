package org.plivo.ee.helper.api.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "outbound")
public class PriceOutboundInfo
{
   @XmlElement(name = "ip")
   public PriceInformation ip;
   @XmlElement(name = "local")
   public PriceInformation local;
   @XmlElement(name = "rates")
   public List<PriceInformation> rates;
   @XmlElement(name = "tollfree")
   public PriceInformation tollfree;

   @Override
   public String toString()
   {
      return "PriceOutboundInfo [" + (ip != null ? "ip=" + ip + ", " : "")
               + (local != null ? "local=" + local + ", " : "") + (rates != null ? "rates=" + rates : "") + "]";
   }

}
