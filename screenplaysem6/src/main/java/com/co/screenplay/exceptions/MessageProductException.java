package com.co.screenplay.exceptions;

public class MessageProductException extends Error{


    public MessageProductException(String message, Throwable throwable)
    {
        super(message,throwable);
    }

}
