package org.example.emp;

import org.example.Walkable;

public class Student extends Person implements Walkable {

    public static String collegeName;
    private String name;
    private int age;

    public static void showInfo()
    {
        System.out.println(collegeName);
//        System.out.println(name);
//        System.out.println(age);
    }

    public Student()
    {
        super();
    }

    public String getName()
    {
       super.getCall();

        return "ALex";
    }

    public void getSutdentInf(){

    }

    @Override
    public void walk() {

    }
}

