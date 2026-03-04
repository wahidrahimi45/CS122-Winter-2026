package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            // put the code that we want monitor, risky code
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt(); // thow new InputMismatchException()
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: "+ result);

        }catch (ArithmeticException ex)
        {
            // Exception handler
            System.out.println("Error happened: "+ ex.getMessage());
        }catch (InputMismatchException ex)
        {
            System.out.println("Please enter a number not a string: "+ ex.getMessage());
        }



        System.out.println("Some other important process");

        System.out.println();
    }
}