package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "DTMF")
public class Dtmf
{

   public Dtmf()
   {
   }

   public Dtmf(String value)
   {
      this.value = value;
   }

   /**
    * Proceed to next element after the first digit is sent.
    * 
    * Accepts: true,false
    * 
* Defaults to: true
    */
   @XmlAttribute
   public Boolean async;

   @XmlValue
   public String value;
}