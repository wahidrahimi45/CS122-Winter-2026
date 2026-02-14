package org.example.staticvsnonstatic;

public class Student {

    //Members

    //1- non-static variables, instance variable
    String name;
    int age;


    //2- Static variable / class variable
    static String schoolName = "GRC";
    static int studentCount = 0;


    // Constructor
    public Student()
    {
        //System.out.println("Student object is created");
        studentCount++;
    }

    // Methods

    // 1- instance method, or non-static methods
    public void printStudentInfo()
    {
        System.out.println("Name: "+ this.name+ " age: "+ this.age);
        System.out.println("School Nmae:"+ schoolName+ " Count: "+ studentCount);
    }
    // 2- static methods
    public static void getSchoolNameAndCount()
    {
        //System.out.println("Name: "+ this.name+ " age: "+ this.age);
        System.out.println("School Name:"+ schoolName+ " Count: "+ studentCount);

    }

    // block
}
