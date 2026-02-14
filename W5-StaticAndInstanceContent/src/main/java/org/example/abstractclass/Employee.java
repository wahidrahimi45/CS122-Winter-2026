package org.example.abstractclass;

public abstract class Employee {
    protected String name;
    protected double salary;

    protected int employeeId;

    public Employee()
    {

    }

    public Employee(String name, double salary, int employeeId)
    {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }


    public abstract double getBonus();
}
