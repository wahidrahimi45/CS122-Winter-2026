package org.example;

public class Main {
    public static void main(String[] args) {

        // Call the print method with different person details
        print(20, "John", 5.1f, "123 Main Street.", true, 'M');
        print(19, "James", 5.5f, "3333 Main Street.", false, 'F');
    }

    /**
     * This method prints a person's information.
     *
     * @param age        person's age
     * @param name       person's name
     * @param height     person's height
     * @param address    person's address
     * @param isMarried  marital status (true = married, false = not married)
     * @param gender     gender character ('M' or 'F')
     */
    public static void print(int age, String name, float height,
                             String address, boolean isMarried, char gender) {

        // Print basic information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Height: " + height);

        // Check marital status
        if (isMarried) {
            System.out.println("Married");
        } else {
            System.out.println("Not Married");
        }

        // Check gender (case-insensitive)
        if (gender == 'M' || gender == 'm') {
            System.out.println("Male");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Female");
        } else {
            System.out.println("Unknown Gender");
        }

        // Print an empty line for better output formatting
        System.out.println();
    }
}
