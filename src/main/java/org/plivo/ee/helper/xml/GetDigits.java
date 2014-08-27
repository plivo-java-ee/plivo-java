package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.plivo.ee.helper.xml.type.Method;

@XmlRootElement(name = "GetDigits")
public class GetDigits
{

   /**
    * The URL to which the digits are sent. See the action Request Parameters table below for more information
    * 
    * Accepts: absolute URL
    * 
    * Defaults to: none
    */
   @XmlAttribute
   public String action = null;

   /**
    * Submit to action URL using GET or POST.
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: POST
    */
   @XmlAttribute
   public Method method = null;

   /**
    * Time in seconds to wait to receive the first digit. If the user fails to provide an input within the timeout
    * period, the next element in the response is processed.
    * 
    * Accepts: positive integer
    * 
    * Defaults to: 5 seconds
    */
   @XmlAttribute
   public Integer timeout;

   /**
    * Time in seconds allowed between consecutive digit inputs. If input is not provided within the digitTimeout period,
    * digits entered until then will be processed.
    * 
    * Accepts: positive integer
    * 
    * Defaults to: 2 seconds
    */
   @XmlAttribute
   public Integer digitTimeout;

   /**
    * This can be any number or a special character, such as, an asterisk (*) or a pound (#) that is used to complete
    * the task of capturing digits. If finishOnKey is set to None, the default option is disabled and timeout will occur
    * based on digitTimeout or numDigits parameters. If these parameters are not specified, timeout will occur according
    * to the default value of the digitTimeout parameter.
    * 
    * Accepts: any digit, #, *
    * 
    * Defaults to: #
    */
   @XmlAttribute
   public Character finishOnKey;

   /**
    * Maximum number of digits to be processed in the current operation. Only the number of numDigits is captured and
    * any additional digits entered are ignored.
    * 
    * Accepts: integer >= 1
    * 
    * Defaults to: 99
    */
   @XmlAttribute
   public Integer numDigits;

   /**
    * Indicates the number of retries the user is allowed to input the digits, if digits are not received within the
    * time specified by timeout.
    * 
    * Accepts: integer >= 1
    * 
    * Defaults to: 1
    */
   @XmlAttribute
   public Integer retries;

   /**
    * Redirect to action URL if true. If false,only request the URL and continue to next element.
    * 
    * Accepts: true,false
    * 
    * Defaults to: true
    */
   @XmlAttribute
   public Boolean redirect;

   /**
    * Plays a beep when each digit entered.
    * 
    * Accepts: true,false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   public Boolean playBeep;

   /**
    * Set of digits which the user is allowed enter.
    * 
    * Accepts: any digit, #, *
    * 
    * Defaults to: 1234567890*#
    */
   @XmlAttribute
   public String validDigits;

   /**
    * URL of the sound file to be played when the user enters an invalid digit.
    * 
    * Accept: Any remote sound file URL (mp3 or wav)
    * 
    * Defaults to: none
    */
   @XmlAttribute
   public String invalidDigitsSound;

   /**
    * If true, Plivo will log digits entered by the caller and you can view the same in debug logs. If false, logging
    * will disabled while processing <GetDigits> Element.
    * 
    * Accepts: true, false
    * 
    * Defaults to: true
    */
   @XmlAttribute
   public Boolean log;

   @XmlElement(name = "Speak")
   public Speak speak;

   @XmlElement(name = "Play")
   public Play play;

   public GetDigits play()
   {
      this.play = new Play();
      return this;
   }

   public GetDigits play(String value)
   {
      return play(value);
   }

   public Play newPlay()
   {
      return play().play;
   }

   public Play newPlay(String value)
   {
      return play(value).play;
   }

   public GetDigits speak()
   {
      this.speak = new Speak();
      return this;
   }

   public GetDigits speak(String value)
   {
      this.speak = new Speak(value);
      return this;
   }

   public Speak newSpeak()
   {
      return speak().speak;
   }

   public Speak newSpeak(String value)
   {
      return speak(value).speak;
   }

}