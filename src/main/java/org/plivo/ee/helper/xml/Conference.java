package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import org.plivo.ee.helper.xml.type.FileFormat;
import org.plivo.ee.helper.xml.type.Method;
import org.plivo.ee.helper.xml.type.TranscriptionType;

@XmlRootElement(name = "Conference")
public class Conference
{

   public Conference()
   {
   }

   public Conference(String value)
   {
      this.value = value;
   }

   /**
    * To mute a member who joins a conference, set this attribute to 'true'; the member will be able to listen to the
    * people in the conference.
    * 
    * Accepts: true, false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   public Boolean muted;

   /**
    * Used to play a sound when a member enters the conference. A single beep is played with beep:1 value and a double
    * beep is played with a beep:2 value. If a URL is specified, the URL is fetched with an HTTP POST request; the
    * application at the URL must return an XML with Play, Speak and/or Wait elements only. All other elements are
    * ignored.
    * 
    * Accepts: "", "beep:1", "beep:2" or valid URL
    * 
    * Defualt: ""
    */
   @XmlAttribute
   public String enterSound;

   /**
    * Used to play a sound when a member exits the conference. Defaults to no beep. A single beep is played with beep:1
    * value and a double beep is played with a beep:2 value. If a URL is specified, the URL is fetched with an HTTP POST
    * request; the application at the URL must return an XML with Play, Speak and/or Wait elements only. All other
    * elements are ignored.
    * 
    * Accepts: "", "beep:1", "beep:2" or a valid URL
    * 
    * Defaults to: ""
    */
   @XmlAttribute
   public String exitSound;

   /**
    * When a member joins the conference with this attribute set to true, the conference is started (if not already in
    * progress). If a member joins a conference that has not yet started, with this attribute value set to false, the
    * member is muted and hears background music until another member joins the conference. This attribute is handy when
    * organizing moderated conferences.
    * 
    * Accepts: true, false
    * 
    * Defaults to: true
    */
   @XmlAttribute
   public Boolean startConferenceOnEnter;

   /**
    * If a member with this attribute set to true leaves the conference, the conference ends and all other members are
    * automatically removed from the conference. This attribute is handy when organizing moderated conferences.
    * 
    * Accepts: true, false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   public Boolean endConferenceOnExit;

   /**
    * When a member is alone in a conference and has this attribute set to false, the conference ends and the member is
    * dropped.
    * 
    * Accepts: true, false
    * 
    * Defaults to: true
    */
   @XmlAttribute
   public Boolean stayAlone;

   /**
    * Is a remote URL fetched with HTTP POST request. The URL must return an XML document with Play, Speak and/or Wait
    * elements only. All other elements are ignored. The sound instructed by the XML response is played to the member
    * while alone in the conference.
    * 
    * Accepts: absolute URL
    * 
    * Defaults to: No Music
    */
   @XmlAttribute
   public String waitSound;

   /**
    * Indicates the maximum number of members that are to be allowed within a named conference room. This value can be
    * any positive integer greater than 0. When maxMembers is reached, the conference is skipped. If the next element in
    * the XML response is the action_url this is also skipped and the call proceeds to the next element after the
    * <Conference> element.
    * 
    * Accepts: Any integer > 0 and <=1 00
    * 
    * Defaults to: 100
    */
   @XmlAttribute
   public Integer maxMembers;

   /**
    * None
    * 
    * Accepts: true or false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   public Boolean record;

   /**
    * The file format for recording.
    * 
    * Accepts: mp3 or wav
    * 
    * Defaults to: mp3
    */
   @XmlAttribute
   public FileFormat recordFileFormat; // = FileFormat.mp3;

   /**
    * Used to set the maximum duration of the conference in seconds. For example, a time limit of 600 seconds will
    * automatically end the conference after ten minutes. Defaults to 0, which indicates that no time limit is set.
    * 
    * Accepts: Any integer >= 0
    * 
    * Defaults to: 0
    */
   @XmlAttribute
   public Integer timeLimit;

   /**
    * If set to true, this attribute lets the member exit from the conference by pressing the ‘*‘ key on their phone,
    * without having to hang up. The Plivo API will continue on to the next element in the current XML document, after
    * exit.
    * 
    * Accepts: true, false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   public Boolean hangupOnStar;

   /**
    * Should be an absolute URL to which the API can send back parameters. See the action Request Parameters table below
    * for more information.
    * 
    * Accepts: absolute URL.
    * 
    * Defaults to: no default action for Conference
    */
   @XmlAttribute
   public String action;

   /**
    * Submit to action URL using GET or POST.
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: POST
    */
   @XmlAttribute
   public Method method;

   /**
    * If specified, information is sent back to this URL. See the callbackUrl Request Parameters table below for more
    * information.
    * 
    * Accepts: absolute URL
    * 
    * Defaults to: none
    */

   @XmlAttribute
   public String callbackUrl;

   /**
    * Method used to notify callbackUrl using GET or POST.
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: POST
    */
   @XmlAttribute
   public Method callbackMethod;

   /**
    * A list of digits that are sent to the callbackUrl when the digits pressed by the user match the digitsMatch
    * parameter.
    * 
    * Accepts: List of digits patterns separated by comma.
    * 
    * Defaults to: none
    */
   @XmlAttribute
   public String digitsMatch;

   /**
    * If this attribute is set to ‘true’, send notification to callbackUrl when member is the floor holder.
    * 
    * Accepts: true,false
    * 
    * Defaults to: false
    */
   @XmlAttribute
   public Boolean floorEvent;

   /**
    * If false, do not redirect to action URL, only request the URL and continue to next element.
    * 
    * Accepts: true,false
    * 
    * Defaults to: true
    */
   @XmlAttribute
   public Boolean redirect;

   /**
    * The type of transcription required.
    * 
    * Accepts: auto - Transcription is completely automated; turnaround time is about 5 minutes. hybrid - Transcription
    * is a combination of automated and human verification processes; turnaround time is about 10-15 minutes. Default:
    * auto
    */
   @XmlAttribute
   public TranscriptionType transcriptionType;

   /**
    * The URL where the transcription is available.
    * 
    * Accepts: absolute URL
    * 
    * Defaults to: none
    */
   @XmlAttribute
   public String transcriptionUrl;

   /**
    * The method used to invoke the transcriptionUrl.
    * 
    * Accepts: GET, POST
    * 
    * Defaults to: GET
    */
   @XmlAttribute
   public Method transcriptionMethod;

   /**
    * Transmit all digits except digitsMatch to all members of conference.
    * 
    * Accepts: true, false
    * 
    * Defaults to: true
    */
   @XmlAttribute
   public Boolean relayDTMF;

   @XmlValue
   public String value;
}
