package org.example.abstractclass;

public class FullTimeEmployee extends Employee{
    @Override
    public double getBonus()
    {
        return salary * 0.20;
    }
}
