package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "Number")
public class Number
{

   public Number()
   {

   }

   public Number(String value)
   {
      this.value = value;
   }

   /**
    * The sendDigits attribute tells the API to play DTMF tones when the call is answered. This is useful when dialing a
    * phone number and an extension. The API will dial the number, and when the automated system picks up, the DTMF
    * tones are sent to connect to the extension.
    * 
    * Accepts: any digits
    * 
    * Defaults: none
    */
   @XmlAttribute
   private String sendDigits;

   /**
    * If sendOnPreanswer attribute is true, sendDigits is executed when the called party is in early media instead of
    * answer state.
    * 
    * Accepts: true or false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   private Boolean sendOnPreanswer;

   @XmlValue
   public String value;

}
