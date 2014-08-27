package org.plivo.ee.helper.api.util;

public enum ApiResponseCode
{
   _200(200, "Request has been executed"),
   _201(201, "Resource created"),
   _202(202, "Resource changed"),
   _204(204, "Resource deleted"),
   _400(400, "A parameter is missing or is invalid"),
   _401(401, "Authentication failed"),
   _404(404, "Resource cannot be found"),
   _405(405, "HTTP method not allowed"),
   _500(500, "Server error");

   private int code;
   private String message;

   ApiResponseCode(int code, String message)
   {
      this.code = code;
      this.message = message;
   }

   public int getCode()
   {
      return code;
   }

   public String getMessage()
   {
      return message;
   }
}
