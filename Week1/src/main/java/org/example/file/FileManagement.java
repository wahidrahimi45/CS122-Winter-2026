package org.example.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
    Employee Data Analysis Tasks:

Count total number of employees

Print all employee names

Count active vs inactive employees

Find employees older than 40

List employees in the IT department



Calculate average salary

Find highest & lowest salary

Calculate average age per department

Count employees per department

Find all contract employees



Find department with highest average salary

Find most experienced employee

Calculate salary expense for active employees only

Filter employees working in Seattle

Compare Full-Time vs Part-Time salary averages

what if the some lines have extra or missing employee information. (format missing)
 */

/*
    ########################## Class Notes #################################

    -> The File class represents a file or directory path in the file system.
    The File class does NOT read or write data.
    It only represents and manages file paths and file information.

    Common File Constructor
    File file1 = new File("data.txt");                 // Relative path
    File file2 = new File("C:/data/employees.txt");   // Absolute path
    File file3 = new File("C:/data", "employees.txt");// Directory + filename



    -> What is the Scanner Class?
    The Scanner class is used to read input data from:
    	Keyboard (System.in)
    	Files
    	Strings
    It reads data token by token.

    close the file
    scanner.close();



    A stream is a flow of data from one place to another.
    Think of it like water flowing through a pipe:
    	The source puts data into the stream
    	The destination takes data out of the stream
    	Data flows one direction
    In Java:
    	Data flows from input → program
    	Or from program → output

     Why Java calls it a stream
    Because:
    	Data does not arrive all at once
    	It arrives piece by piece (byte by byte or character by character)

        1- InputStream
        2- OutputStream
 */
public class FileManagement {
    public static void main(String[] args) throws FileNotFoundException {
        String name = "Jhon";
        int age = 20;



//        int option = 1;
//        Scanner scanner = new Scanner(System.in);
//        String name ="";
//        int age = 0;
//
//        while (option == 1)
//        {
//            System.out.print("Enter name: ");
//            name = scanner.nextLine();
//            System.out.print("Enter age: ");
//            age = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Enter 2 to exit");
//            option = scanner.nextInt();
//            scanner.nextLine();
//
//        }



        int empCounter = 0;
        int activeEmpCounter = 0;
        int inactiveEmpCounter = 0;

        File file = new File("employee.txt");
        Scanner fileScanner = new Scanner(file);

        if(file.exists())
        {
//            for(int i = 0; i < 4; i++)
//            {
//                fileScanner.nextLine();
//            }
//            String empData = fileScanner.nextLine();
//            System.out.println(empData);
            while (fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();

                if(line.startsWith("#") || line.trim().isEmpty())
                {
                    continue;
                }
                String[] date = line.split(",");
                //System.out.println(Arrays.toString(date));
                //System.out.println(date.length);
                //System.out.println(line);
                System.out.println("Name: "+ date[1]);
                if(date[8].equals("true"))
                {
                    activeEmpCounter++;
                } else if (date[8].equals("false")) {
                    inactiveEmpCounter++;
                }
                empCounter++;

            }
            System.out.println("Employee Count : "+ empCounter);
            System.out.println("Acitve Employee Count : "+ activeEmpCounter);
            System.out.println("Inactive Employee Count : "+ inactiveEmpCounter);
        }

        String empsal = "70000";
        double dSal = Double.parseDouble(empsal);
        System.out.println(dSal);
        fileScanner.close();

    }
}
