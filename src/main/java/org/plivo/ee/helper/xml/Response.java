package org.plivo.ee.helper.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Response")
public class Response
{

   public Response()
   {
   }

   public Response(Conference conference)
   {
      this.conference = conference;
   }

   public Response(GetDigits getDigits)
   {
      this.getDigits = getDigits;
   }

   public Response(HangUp hangUp)
   {
      this.hangUp = hangUp;
   }

   public Response(Message message)
   {
      this.message = message;
   }

   public Response(Play play)
   {
      this.play = play;
   }

   public Response(PreAnswer preAnswer)
   {
      this.preAnswer = preAnswer;
   }

   public Response(Redirect redirect)
   {
      this.redirect = redirect;
   }

   public Response(Speak speak)
   {
      this.speak = speak;
   }

   public Response(Wait wait)
   {
      this.wait = wait;
   }

   public Response(List<Dial> dials)
   {
      this.dials = dials;
   }

   public Response(Dial dial)
   {
      dial(dial);
   }

   @XmlElement(name = "Dial")
   public List<Dial> dials;

   @XmlElement(name = "Conference")
   public Conference conference;

   @XmlElement(name = "GetDigits")
   public GetDigits getDigits;

   @XmlElement(name = "HangUp")
   public HangUp hangUp;

   @XmlElement(name = "Message")
   public Message message;

   @XmlElement(name = "Play")
   public Play play;

   @XmlElement(name = "PreAnswer")
   public PreAnswer preAnswer;

   @XmlElement(name = "Record")
   public Record record;

   @XmlElement(name = "Redirect")
   public Redirect redirect;

   @XmlElement(name = "Speak")
   public Speak speak;

   @XmlElement(name = "Wait")
   public Wait wait;

   @XmlElement(name = "DTMF")
   public Dtmf dtmf;

   public Response conference()
   {
      this.conference = new Conference();
      return this;
   }

   public Conference newConference()
   {
      return conference().conference;
   }

   public Response getDigits()
   {
      this.getDigits = new GetDigits();
      return this;
   }

   public GetDigits newGetDigits()
   {
      return getDigits().getDigits;
   }

   public Response hangUp()
   {
      this.hangUp = new HangUp();
      return this;
   }

   public HangUp newHangUp()
   {
      return hangUp().hangUp;
   }

   public Response message()
   {
      this.message = new Message();
      return this;
   }

   public Message newMessage()
   {
      return message().message;
   }

   public Response play()
   {
      this.play = new Play();
      return this;
   }

   public Response play(String value)
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

   public Response preAnswer()
   {
      this.preAnswer = new PreAnswer();
      return this;
   }

   public PreAnswer newPreAnswer()
   {
      return preAnswer().preAnswer;
   }

   public Response record()
   {
      this.record = new Record();
      return this;
   }

   public Record newRecord()
   {
      return record().record;
   }

   public Response dial(Dial dial)
   {
      if (dials == null)
      {
         dials = new ArrayList<>();
      }
      dials.add(dial);
      return this;
   }

   public List<Dial> addDial(Dial dial)
   {
      return dial(dial).dials;
   }

   public Dial newDial()
   {
      Dial dial = new Dial();
      dial(dial);
      return dial;
   }

   public Response redirect()
   {
      this.redirect = new Redirect();
      return this;
   }

   public Redirect newRedirect()
   {
      return redirect().redirect;
   }

   public Response speak()
   {
      this.speak = new Speak();
      return this;
   }

   public Response speak(String value)
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

   public Response _wait()
   {
      this.wait = new Wait();
      return this;
   }

   public Wait newWait()
   {
      this.wait = new Wait();
      return this.wait;
   }

   public Response dtmf()
   {
      this.dtmf = new Dtmf();
      return this;
   }

   public Dtmf newDtmf()
   {
      return dtmf().dtmf;
   }

   public Response dtmf(String value)
   {
      this.dtmf = new Dtmf(value);
      return this;
   }

   public Dtmf newDtmf(String value)
   {
      return dtmf(value).dtmf;
   }

}
