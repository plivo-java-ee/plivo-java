package org.plivo.ee.helper.api;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.client.Client;

public class AbstractApi
{
   protected Client client;
   protected Map<String, String> parameters;

   public Map<String, String> getParameters()
   {
      if (parameters == null)
         this.parameters = new HashMap<String, String>();
      return parameters;
   }

   public void setParameters(Map<String, String> parameters)
   {
      this.parameters = parameters;
   }

   public AbstractApi put(String key, String value)
   {
      getParameters().put(key, value);
      return this;
   }

   public Map<String, String> get() throws Exception
   {
      if (getParameters().isEmpty())
         throw new Exception("parameters map is empty!");
      return parameters;
   }

}
