package org.example.jan14constructor;

/*
    Method overloading in Java is a feature that allows a class to have multiple methods with the same
    name but different parameter lists. This allows methods to perform similar operations with different
    types or numbers of inputs, which enhances code readability and flexibility.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        //print("wahid");
        //print(16);
        print("wahid", 30);
    }
    public static void print(String name)
    {
        name = name.toUpperCase();
        System.out.println("Your name is :"+"(" +name+")");
    }
    public static void print(int age)
    {
        String eligibility;
        if(age > 18)
        {
            eligibility = " You can vote";
        }
        else {
            eligibility = "you cannot vote";
        }
        System.out.println("Your age is : "+ age + " "+ eligibility);
    }
    public static void print(String name, int age)
    {
//        name = name.toUpperCase();
//        System.out.println("Your name is :"+"(" +name+")");
//        String eligibility;
//        if(age > 18)
//        {
//            eligibility = " You can vote";
//        }
//        else {
//            eligibility = "you cannot vote";
//        }
//        System.out.println("Your age is : "+ age + " "+ eligibility);
        print(name);
        print(age);
    }

    /*
    Class Exercise: create a method add()
    // Method 1: adds two integers
    // Method 2: adds three integers (different number of parameters)
    // Method 3: adds two doubles (different data types)
     */

}

