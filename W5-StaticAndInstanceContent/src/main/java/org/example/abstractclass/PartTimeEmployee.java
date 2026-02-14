package org.example.abstractclass;

public class PartTimeEmployee extends Employee{

    public PartTimeEmployee()
    {
        super();
    }
    public PartTimeEmployee(String name, double salary, int employeeId)
    {
        super(name, salary, employeeId);
    }
    @Override
    public double getBonus() {
        return salary * 0.10;
    }
}
