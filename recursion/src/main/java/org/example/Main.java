package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //blastOff();
        String[] strings = {"bag", "tag", "rag", "sag"};
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }
        //printString(strings);
//        int result = fact(-3);
//        System.out.println(result);

        System.out.println(sum(-10));
    }

    public static int sum(int n)
    {
        if(n < 0)
        {
            throw new NotValidNumberException("Please eneter a positive number");
        }
        //base case
        if(n == 0)
        {
            return 0;
        }
        // process

        // recursive case
        return n + sum(n-1);
    }
    public static int fact(int n)
    {
        if(n <0)
        {
            throw new IllegalArgumentException("Cannot accept negative values");
        }

        if(n ==0)
            return 1;
        return n * fact(n-1);
    }

//    public static void fact(int n)
//    {
//        int result = 1;
//        fact(n,result);
//    }
//    public static void fact(int n, int result)
//    {
//        if(n <= 0)
//        {
//            System.out.println(result);
//            return;
//        }
//        result = n * result;
//        fact(n-1, result);
//    }
    public static void printString(String[] strings)
    {
        printString(strings, 0);
    }
    private static void printString(String[] strings, int index)
    {
        //base case
        if(index == strings.length)
        {
            return;
        }
        //process
        System.out.println(strings[index]);
        //recursive case
        printString(strings, index+1);
    }
    public static void blastOff()
    {
        blastOffHelper(10);
    }
    private static void blastOffHelper(int n)
    {
        // base case
        if(n == 0)
        {
            System.out.println("Done");
            return;
        }
        // process
        System.out.print(n+" ");
        // recursive case
        blastOffHelper(n-1);
    }
}
