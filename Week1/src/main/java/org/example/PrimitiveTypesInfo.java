package org.example;

import java.util.Scanner;

public class PrimitiveTypesInfo {
    public static int number;
    public static double aDouble;
    public static char aChar;
    public static long aLong;

    public static byte aByte;
    public static short aShort;

    /*
        Java has eight primitive data types,
        which are the basic building blocks for data manipulation and store simple,
        single values directly in memory
        int,double, boolean, char,long,float,byte,short

        Primitives Default values??
        Wrapper Classes: convert primitive data types into objects. Collection framework,
        works only with objects and cannot store primitive types directly
     */
    public static void main(String[] args) {

        char myChar = 'A';
        System.out.println(myChar);
        System.out.println((int)myChar);
        int asciiValue = 97;
        System.out.println((char) asciiValue);

        char otherChar = 'ث';
        System.out.println(otherChar);
        System.out.println((int)otherChar);

        // byte
        System.out.println("byte:");
        System.out.println("Size (bits): " + Byte.SIZE);
        System.out.println("Size (bytes): " + Byte.BYTES);
        System.out.println("Minimum value: " + Byte.MIN_VALUE);
        System.out.println("Maximum value: " + Byte.MAX_VALUE);
        System.out.println("--------------------------------");

        // short
        System.out.println("short:");
        System.out.println("Size (bits): " + Short.SIZE);
        System.out.println("Size (bytes): " + Short.BYTES);
        System.out.println("Minimum value: " + Short.MIN_VALUE);
        System.out.println("Maximum value: " + Short.MAX_VALUE);
        System.out.println("--------------------------------");

        // int
        System.out.println("int:");
        System.out.println("Default value: "+ number);
        System.out.println("Size (bits): " + Integer.SIZE);
        System.out.println("Size (bytes): " + Integer.BYTES);
        System.out.println("Minimum value: " + Integer.MIN_VALUE);
        System.out.println("Maximum value: " + Integer.MAX_VALUE);
        System.out.println("--------------------------------");

        // long
        System.out.println("long:");
        System.out.println("Size (bits): " + Long.SIZE);
        System.out.println("Size (bytes): " + Long.BYTES);
        System.out.println("Minimum value: " + Long.MIN_VALUE);
        System.out.println("Maximum value: " + Long.MAX_VALUE);
        System.out.println("--------------------------------");

        // float
        // Why does float.MIN_VALUE look strange?
        // digits of precision?
        System.out.println("float:");
        System.out.println("Size (bits): " + Float.SIZE);
        System.out.println("Size (bytes): " + Float.BYTES);
        System.out.println("Minimum value: " + Float.MIN_VALUE);
        System.out.println("Maximum value: " + Float.MAX_VALUE);
        System.out.println("--------------------------------");

        // double
        // digits of precision?
        System.out.println("double:");
        System.out.println("Size (bits): " + Double.SIZE);
        System.out.println("Size (bytes): " + Double.BYTES);
        System.out.println("Minimum value: " + Double.MIN_VALUE);
        System.out.println("Maximum value: " + Double.MAX_VALUE);
        System.out.println("--------------------------------");

        // char 'A' or 'a'
        /*
            char is unsigned
            Range: 0 to 65535
            Represents Unicode characters
            Why does char have no negative values?
         */
        System.out.println("char:");
        System.out.println("Size (bits): " + Character.SIZE);
        System.out.println("Size (bytes): " + Character.BYTES);
        System.out.println("Minimum value (as int): " + (int) Character.MIN_VALUE);
        System.out.println("Maximum value (as int): " + (int) Character.MAX_VALUE);
        System.out.println("--------------------------------");

        // boolean
        System.out.println("boolean:");
        System.out.println("Size: (typically 1 byte)");
        System.out.println("Possible values: true or false");

    }

    //TODO:
    /*
    Complete the following function and move the code from the main() method inside the method
    * */
    public static void printInfo(String type)
    {
        // What if the user enters "int", "INT", "inT", or "double", "DOUBLE", etc.?
        // What if the user enters a value other than the 8 primitive data types?
        // Should we use multiple if statements, an if–else-if chain,
        // or can you think of a better approach than using if statements?

    }
}
