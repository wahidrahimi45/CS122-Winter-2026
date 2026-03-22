package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int age = 2;
//        try {
//            ageValidator(age);
//        }catch (IllegalArgumentException ex)
//        {
//            System.out.println(ex.getMessage());
//        }catch (NotValidAgeException ex)
//        {
//            System.out.println(ex.getMessage());
//        }finally {
//            System.out.println("Done");
//        }
        File dataFile = new File("data.txt");
        Scanner fileReader = null;
        PrintWriter writer = null;
        try {
             fileReader= new Scanner(dataFile);
             //writer= new PrintWriter(dataFile);
            while (fileReader.hasNextLine())
            {
                System.out.println(fileReader.nextLine());
            }
        }catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }finally {
            if(fileReader != null)
                fileReader.close();
            if(writer != null)
                writer.close();
        }



    }
    public static void ageValidator(int age) throws NotValidAgeException, IllegalArgumentException
    {
        if(age < 0)
        {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if(age < 18)
        {
            throw new NotValidAgeException();
        }
    }
}