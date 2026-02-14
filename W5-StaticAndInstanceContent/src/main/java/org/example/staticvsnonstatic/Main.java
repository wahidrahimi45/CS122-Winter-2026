package org.example.staticvsnonstatic;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Bob";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Alex";
        s2.age = 21;

//        System.out.println("S1: "+ s1.name+" "+ s1.age);
//        System.out.println("S2: "+ s2.name+" "+ s2.age);
//
//        System.out.println("S1: SchooNmae "+ Student.schoolName+" "+ Student.studentCount);
//        System.out.println("S2: SchooNmae "+ Student.schoolName+" "+ Student.studentCount);

        s1.printStudentInfo();
        System.out.println("-------------------");
        s2.printStudentInfo();


    }

}
