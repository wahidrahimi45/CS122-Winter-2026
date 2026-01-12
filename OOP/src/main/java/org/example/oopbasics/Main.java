package org.example.oopbasics;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Mark";
        s1.age = 30;
        s1.gender = 'M';
        s1.isMarried = true;

        System.out.println("Name: "+ s1.name);

//        String name = getName("alex");
//        System.out.println(name);
    }

//    public static String getName(String name)
//    {
//        return name.toUpperCase();
//    }
}

