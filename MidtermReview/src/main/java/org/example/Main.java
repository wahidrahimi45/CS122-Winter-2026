package org.example;


import org.example.emp.Person;
import org.example.emp.Plant;
import org.example.emp.Student;
import org.example.package2.ClassB;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person student = new Student();


    }
    public static void Show(Person student)
    {

    }
}

interface Speckable{

}

enum Departments
{
    SDEV,
    ENGL,
    CMST,
    MATH,
    PHIL
}


class Vegetable implements Speckable
{
    private String type;
    public Vegetable(String vegType)
    {
        type = vegType;
    }
    public void showParentInfor()
    {

    }

}
//
//class Onion extends Vegetable
//{
//    private int layers;
//    public Onion(int myLayers)
//    {
//        super("onion");
//        layers = myLayers;
//    }
//    public void showOnionInfo()
//    {
//
//    }
//}



