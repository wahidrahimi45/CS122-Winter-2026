package org.example.abstractclass;

public class Main {
    public static void main(String[] args) {
        //Employee emp = new Employee();

        final double PI = 3.14;

        Child c1 = new Child();
        c1.printHello();
    }
}

class Parent{
    public final void printHello()
    {
        System.out.println("Hello from Parent class");
    }
}
class Child extends Parent{
    @Override
    public void printHello()
    {
        System.out.println("Hello from Child class");
    }
}