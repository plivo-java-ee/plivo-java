package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.plivo.ee.helper.xml.type.Reason;

@XmlRootElement(name = "HangUp")
public class HangUp
{

   /**
    * Used to specify reason of hangup
    * 
    * Accepts: rejected, busy
    * 
    * Defaults to: none
    */
   @XmlAttribute
   public Reason reason;

   /**
    * Used to schedule a call hangup. Should be followed by an element such as Speak, otherwise the call will be hung up
    * immediately.
    * 
    * Accepts: integer > 0 (in seconds)
    * 
    * Defaults to: none
    */
   @XmlAttribute
   public Integer schedule;

}