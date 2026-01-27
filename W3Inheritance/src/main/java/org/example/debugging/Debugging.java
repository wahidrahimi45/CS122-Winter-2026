package org.example.debugging;

public class Debugging {
    public static void main(String[] args) {
//        System.out.println("Hello class");
//        int x = 10;
//        System.out.println(x);
//
//        int result = addTwoNumbers(2,4);
//
//        System.out.println(result);

//        int[] numbers = {2,3,5,1};
//
//        int sum = sum(numbers);
//        System.out.println(sum);

//        int x = 10;
//        Car c = new Car();
//        System.out.println(c);
//        System.out.println(System.identityHashCode(c));

//        int num1 = 10;
//
//        int num2 = num1;
//
//        //num2 = num2 + 10;
//
//        incrementBy30(num1);
//        incrementBy30(num2);
//        System.out.println("Num1: "+ num1);
//        System.out.println("Num2: "+ num2);

        // Reference Type

        Computer c1 = new Computer();
        c1.name = "DELL";
        c1.ram = 8;

        Computer c2 = new Computer();
        c2.name = "APPLE";
        c2.ram = 16;

        System.out.println("C1: "+ c1);
        System.out.println("C2: "+ c2);

        changeComputer(c2);
        System.out.println("C1 After Function call: "+ c1);
        System.out.println("C2 After Function call: "+ c2);


    }
    public static void changeComputer(Computer c)
    {
        c.name = "TTTTTT";
        c.ram = 20;
    }
    public static void incrementBy30(int num)
    {
        num = num + 30;
    }
    public static int addTwoNumbers(int x, int y)
    {
        int result = x + y;
        result = result + 10;
        return result;
    }
    public static int sum(int[] numbers)
    {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
