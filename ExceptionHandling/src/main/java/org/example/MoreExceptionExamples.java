package org.example;

import javax.management.RuntimeErrorException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MoreExceptionExamples {
    public static void main(String[] args) {
//        String name = "alex";
//        int age = 3;
//
//        try {
//            String str = vote(name, age);
//            System.out.println(str);
//        }catch (IllegalArgumentException ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//        catch (RuntimeException ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//        catch (Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }

        try
        {
            readFromFile("text.txt");
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("This always gets executed");
        }




        System.out.println("Some other things");
    }
    public static String vote(String voterName, int age) throws IllegalArgumentException, RuntimeException
    {
        if(voterName == null || voterName.isBlank())
        {
            //throw new InvalideUserNameException("Invalid user name please enter a valid name");
            throw new IllegalArgumentException("Invalid user name please enter a valid name");
        }
        if(age < 0 || age < 18 || age > 120)
        {
            throw new RuntimeException("Invalid age age must be between 18 and 120");
        }
        voterName = voterName.toUpperCase();
        return voterName+ " is "+ age +" years old and can vote";
    }

    public static void readFromFile(String fileName) throws FileNotFoundException
    {
        File file = new File(fileName);

        Scanner scanner = new Scanner(file);
    }
}
