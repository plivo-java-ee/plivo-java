package org.plivo.ee.helper.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PreAnswer")
public class PreAnswer
{

   @XmlElement(name = "Speak")
   public Speak speak;

   @XmlElement(name = "Play")
   public Play play;

   @XmlElement(name = "Wait")
   public Wait wait;

   public PreAnswer play()
   {
      this.play = new Play();
      return this;
   }

   public PreAnswer play(String value)
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

   public PreAnswer speak()
   {
      this.speak = new Speak();
      return this;
   }

   public PreAnswer speak(String value)
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

   public PreAnswer _wait()
   {
      this.wait = new Wait();
      return this;
   }

   public Wait newWait()
   {
      this.wait = new Wait();
      return this.wait;
   }
}
