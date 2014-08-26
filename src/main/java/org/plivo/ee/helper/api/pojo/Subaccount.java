package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Subaccount
{
   public String account;
   public String auth_id;
   public String api_id;
   public String auth_token;
   public String created;
   public String enabled;
   public String modified;
   public String name;
   public String resource_uri;
   public String new_auth_token;

   public Subaccount()
   {
   }

   @Override
   public String toString()
   {
      return "Subaccount [" + (account != null ? "account=" + account + ", " : "")
               + (auth_id != null ? "auth_id=" + auth_id + ", " : "")
               + (api_id != null ? "api_id=" + api_id + ", " : "")
               + (auth_token != null ? "auth_token=" + auth_token + ", " : "")
               + (created != null ? "created=" + created + ", " : "")
               + (enabled != null ? "enabled=" + enabled + ", " : "")
               + (modified != null ? "modified=" + modified + ", " : "") + (name != null ? "name=" + name + ", " : "")
               + (resource_uri != null ? "resource_uri=" + resource_uri : "")
               + (new_auth_token != null ? "new_auth_token=" + new_auth_token : "") + "]";
   }

}
