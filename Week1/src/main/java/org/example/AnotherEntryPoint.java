package org.example;

import java.util.Scanner;

public class AnotherEntryPoint {
    public static void main(String[] args) {
        int option = 1;
        Scanner scanner = new Scanner(System.in);
        String name ="";
        int age = 0;

        while (option == 1)
        {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            System.out.print("Enter age: ");
            age = scanner.nextInt();
        }
    }

}
