package org.plivo.ee.helper.api.util;

public class ResponseException extends Exception
{
   private static final long serialVersionUID = 1L;

   int statusCode;
   String reasonPhrase;

   public ResponseException(String message, Throwable cause)
   {
      super(message, cause);
   }

   public ResponseException(String message)
   {
      super(message);
   }

   public ResponseException(Exception e)
   {
      super(e);
   }

   public ResponseException(int statusCode, String reasonPhrase, Throwable cause)
   {
      super(cause);
      this.statusCode = statusCode;
      this.reasonPhrase = reasonPhrase;
   }

   public ResponseException(int statusCode, String reasonPhrase)
   {
      super();
      this.statusCode = statusCode;
      this.reasonPhrase = reasonPhrase;
   }

}