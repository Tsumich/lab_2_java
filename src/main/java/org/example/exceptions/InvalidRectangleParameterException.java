package org.example.exceptions;

public class InvalidRectangleParameterException extends Exception{
    String message;

    public InvalidRectangleParameterException(String msg) {
        this.message = msg;
    }

    @Override
    public String toString(){
        return message;
    }
}
