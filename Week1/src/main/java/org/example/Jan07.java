package org.example;

import java.util.Scanner;

public class Jan07 {
    public static void main(String[] args) {
        /*
        Arithmetic:+,-,*,/,%,++, --
        Comparison:==,!=,>,<,>= <=
        Logical:&&,||,!
        Assignment:=,+=,-=, etc.

         */
//        int a = 13;
//        int b = 4;
//
//        int rem = a % b;
//        System.out.println(rem);
//        int num = 4;
//
//        if(num % 2 == 0)
//        {
//            System.out.println("even");
//        }else {
//            System.out.println("Odd");
//        }
//
//
//        // == and =
//
////        int x = 11;
////        if(x != 10)
////        {
////            System.out.println("Hello");
////        }
//
////        if(false || true)
////        {
////            System.out.println("true");
////        }
//
//        int x = 4;
//
//        //x += 3;
//        //x = x + 3;
//
////        x -= 2;
////        x = x -2;
//
//        x++; // x = x+1;
//        x--; // x = x -1;
//
//        System.out.println(x);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        scanner.nextLine();
//        colorCodeAnalyzer(num);
//        System.out.println("You entered : "+ num);

        // Loops
        // for, while, do while
        int start = 10;
        int end = 20;
        //for(int i = start; i <= end; i++)
//        {
////            if(i == 15)
////            {
////                continue;
////            }
//            if(i %2 == 0)
//                System.out.println(i);
//        }
            while (start <= end)
            {

                if(start == 16)
                {
                    System.out.println(start);
                    break;
                }
                start++;
            }

        int[] numbers = {10, 20, 30};
        for (int n : numbers)
        {System.out.println(n);}

    }
    public static void colorCodeAnalyzer(int num)
    {

    }
}
