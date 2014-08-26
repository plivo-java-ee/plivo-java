package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Endpoint
{
   public String alias;
   public String application;
   public String endpoint_id;
   public String password;
   public String resource_uri;
   public String sip_uri;
   public String username;
   public String sip_contact;
   public String sip_expires;
   public String sip_registered;
   public String sip_user_agent;
   public String sub_account;

   public Endpoint()
   {
   }

   @Override
   public String toString()
   {
      return "Endpoint [" + (alias != null ? "alias=" + alias + ", " : "")
               + (application != null ? "application=" + application + ", " : "")
               + (endpoint_id != null ? "endpoint_id=" + endpoint_id + ", " : "")
               + (password != null ? "password=" + password + ", " : "")
               + (resource_uri != null ? "resource_uri=" + resource_uri + ", " : "")
               + (sip_uri != null ? "sip_uri=" + sip_uri + ", " : "")
               + (username != null ? "username=" + username + ", " : "")
               + (sip_contact != null ? "sip_contact=" + sip_contact + ", " : "")
               + (sip_expires != null ? "sip_expires=" + sip_expires + ", " : "")
               + (sip_registered != null ? "sip_registered=" + sip_registered + ", " : "")
               + (sip_user_agent != null ? "sip_user_agent=" + sip_user_agent + ", " : "")
               + (sub_account != null ? "sub_account=" + sub_account : "") + "]";
   }

}
