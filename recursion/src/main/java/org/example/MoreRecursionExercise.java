package org.example;

public class MoreRecursionExercise {
    public static void main(String[] args) {
//        int result = power(2,5);
//        System.out.println("Result: "+ result);
        //System.out.println(mul(3,4));
//        System.out.println(fib(0));
//        System.out.println(fib(1));
//        System.out.println(fib(2));
//        System.out.println(fib(3));
//        System.out.println(fib(5));
//        System.out.println(fib(7));
//        System.out.println(bunnyEars(4));

        System.out.println(isValidNestedP("((((()))))"));
        System.out.println(isValidNestedRec("((((()))))"));
    }
    public static boolean isValidNestedRec(String str)
    {
        if(str.length() == 0)
        {
            return true;
        }
        if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
        {
            String newString = str.substring(1, str.length()-1);
            return isValidNestedRec(newString);
        }
        return false;
    }

    public static boolean isValidNestedP(String str)
    {

        int l = 0;
        int r = str.length()-1;
        while (l <= r)
        {
            if(str.charAt(l) == '(' && str.charAt(r) == ')')
            {
                l++;
                r--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static int bunnyEars(int numBunnies)
    {
        //do something
        if(numBunnies == 0)
        {
            return 0;
        }
        if(numBunnies % 2 == 0)
            return 3 + bunnyEars(numBunnies-1);
        return 2 + bunnyEars(numBunnies -1);
    }

    public static int fib(int n)
    {
        if(n <=1)
        {
            return n;
        }
//        if(n == 0)
//        {
//            return 0;
//        }
//        if(n == 1)
//        {
//            return 1;
//        }
        return fib(n-1)+ fib(n-2);
    }


    public static int mul(int m, int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return m + mul(m, n-1);
    }
    public static int power(int base, int e)
    {
        // base case
        if(e == 0)
        {
            return 1;
        }
        // recursive case
        return base * power(base, e-1);
    }
}
