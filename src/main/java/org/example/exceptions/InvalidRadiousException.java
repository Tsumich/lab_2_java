package org.example.exceptions;

public class InvalidRadiousException extends Exception{
    String message;

    public InvalidRadiousException(String msg) {
        this.message = msg;
    }
    @Override
    public String toString(){
        return message;
    }
}
