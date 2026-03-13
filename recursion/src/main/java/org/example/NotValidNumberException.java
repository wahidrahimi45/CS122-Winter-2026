package org.example;

public class NotValidNumberException extends RuntimeException{
    public NotValidNumberException()
    {
        super();
    }
    public NotValidNumberException(String message)
    {
        super(message);
    }
}
