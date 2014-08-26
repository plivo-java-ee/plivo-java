package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "Play")
public class Play
{

   public Play()
   {

   }

   public Play(String value)
   {
      this.value = value;
   }

   /**
    * Play the audio file repeatedly. Value set to 0, plays indefinitely.
    * 
    * Accepts: integer >= 0
    * 
* Defaults to: 1
    */
   @XmlAttribute
   public Integer loop;

   @XmlValue
   public String value;
}
