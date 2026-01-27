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

        int x = 10;
        Car c = new Car();
        System.out.println(c);
        System.out.println(System.identityHashCode(c));
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
