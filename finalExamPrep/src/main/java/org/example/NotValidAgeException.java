package org.example;

public class NotValidAgeException extends Exception{
    public NotValidAgeException()
    {
        super("Age cannot be less than 18");
    }
    public NotValidAgeException(String message)
    {
        super(message);
    }
}
