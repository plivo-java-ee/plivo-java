package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import org.plivo.ee.helper.xml.type.Language;
import org.plivo.ee.helper.xml.type.Voice;

@XmlRootElement(name = "Speak")
public class Speak
{

   public Speak()
   {
   }

   public Speak(String value)
   {
      this.value = value;
   }

   public Speak(String value, Language language)
   {
      this.value = value;
      this.language = language;
   }

   public Speak(String value, Voice voice, Language language)
   {
      this.value = value;
      this.voice = voice;
      this.language = language;
   }

   /**
    * The tone to be used for reading out the text.
    * 
    * Accepts: WOMAN, MAN
    * 
    * Defaults to: WOMAN
    */
   @XmlAttribute
   public Voice voice;

   /**
    * Language used to read out the text.
    * 
    * Accepts: See Supported voices and languages below.
    * 
    * Defaults to: en-US
    */
   @XmlAttribute
   public Language language;

   /**
    * Specifies number of times to speak out the text. If value set to 0, speaks indefinitely
    * 
    * Accepts: integer >= 0 (0 indicates a continuous loop)
    * 
    * Defaults to: 1
    */
   @XmlAttribute
   public Integer loop;

   @XmlValue
   public String value;

}
