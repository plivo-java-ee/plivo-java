package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Wait")
public class Wait
{

   /**
    * Time to wait in seconds
    * 
    * Accepts: integer greater than 0
    * 
    * Defaults to: 1
    */
   @XmlAttribute
   public Integer length;

   /**
    * When silence is set to true, if no voice or sound is detected for minSilence milliseconds, end the wait and
    * continue to the next element in the XML immediately (effectively cutting the wait for length seconds short). When
    * silence is set to false, wait for the full period of length seconds, regardless of the presence of sound/voice or
    * the value of minSilence.
    * 
    * Accepts: true or false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   public Boolean silence;

   /**
    * Only used when silence is set to true. The minimum length in milliseconds of silence that needs to be present to
    * qualify as silence. Note that the duration of length needs to be greater than the duration of minSilence for this
    * to work as expected.
    * 
    * Accepts: integer > 0 200
    * 
    * Defaults to: 2000
    */
   @XmlAttribute
   public Integer minSilence;

}
