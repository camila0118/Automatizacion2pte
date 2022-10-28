package com.co.exceptions;

public class CaptureError extends Error {

    public CaptureError(String message, Throwable throwable)
    {
        super(message,throwable);
    }



}
