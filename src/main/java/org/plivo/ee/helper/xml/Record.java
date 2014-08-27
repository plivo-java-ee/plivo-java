package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.plivo.ee.helper.xml.type.FileFormat;
import org.plivo.ee.helper.xml.type.Method;
import org.plivo.ee.helper.xml.type.TranscriptionType;

@XmlRootElement(name = "Record")
public class Record
{

   /**
    * Submit the result of the record to this URL. See the action Request Parameters table below for more information.
    * 
    * Accept: absolute URL (mandatory)
    * 
    * Defaults to: no default action for Record
    */
   @XmlAttribute(required = true)
   public String action;

   /**
    * Submit to action url using GET or POST
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: POST
    */
   @XmlAttribute
   public Method method;

   /**
    * The format of the recording.
    * 
    * Accepts. Valid formats: mp3,wav.
    * 
    * Defaults to: Defaults to mp3.
    */
   @XmlAttribute
   public FileFormat fileFormat;

   /**
    * If false, don't redirect to action url, only request the url and continue to next element.
    * 
    * Accepts: true, false
    * 
    * Defaults to: true
    */
   @XmlAttribute
   public Boolean redirect;

   /**
    * Seconds of silence before considering the recording complete (default 500). Only used when recordSession and
    * startOnDialAnswer are ‘false’.
    * 
    * Accepts: positive integer
    * 
    * Defaults to: 15
    */
   @XmlAttribute
   public Integer timeout;

   /**
    * Maximum number of seconds to record (default 60).
    * 
    * Accepts: integer greater than 1
    * 
    * Defaults to: 60 (1 min)
    */
   @XmlAttribute
   public Integer maxLength;

   /**
    * Play a beep before recording (true/false, default true). Only used when bothLegs is ‘false’.
    * 
    * Accepts: true, false
    * 
    * Defaults to: true
    */
   @XmlAttribute
   public Boolean playBeep;

   /**
    * Stop recording on this key. Only used when recordSession and startOnDialAnswer are false.
    * 
    * Accepts: any digit, #, *
    * 
    * Defaults to: 1234567890*#
    */
   @XmlAttribute
   public String finishOnKey;

   /**
    * Record current call session in background (true/false, default false). No beep will be played.
    * 
    * Accepts: true, false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   public Boolean recordSession;

   /**
    * Record call when called party answers in a Dial (true/false, default false). No beep will be played.
    * 
    * Accepts: true, false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   public Boolean startOnDialAnswer;

   /**
    * Type The type of transcription required.
    * 
    * Accepts: auto - Transcription is completely automated; turnaround time is about 5 minutes. hybrid - Transcription
    * is a combination of automated and human verification processes; turnaround time is about 10-15 minutes. Our
    * transcription service is primarily for the voicemail use case (limited to recorded files lasting for up to 2
    * minutes). Currently the service is available only in English and you will be charged for the usage. Please check
    * out the price details.
    * 
    * Defaults to: auto
    */
   @XmlAttribute
   public TranscriptionType transcriptionType;

   /**
    * The URL where the transcription while be sent from Plivo.
    * 
    * Accepts: absolute URL
    * 
    * Defaults to: none
    */
   @XmlAttribute
   public String transcriptionUrl;

   /**
    * The method used to invoke transcriptionUrl.
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: POST
    */
   @XmlAttribute
   public Method transcriptionMethod;

   /**
    * If set, this URL is fired in background when the recorded file is ready to be used. See the callbackUrl Request
    * Parameters table below for more information.
    * 
    * Accepts: absolute URL
    * 
    * Defaults to: None
    */
   @XmlAttribute
   public String callbackUrl;

   /**
    * Method used to notify the callbackUrl.
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: POST
    */
   @XmlAttribute
   public Method callbackMethod;
}