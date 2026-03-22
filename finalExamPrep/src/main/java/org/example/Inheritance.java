package org.example;

public class Inheritance {
}

// Superclass
class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
// Interface 1
interface Workable {
    void work();  // abstract method
}
// Interface 2
interface Payable {
    double calculateSalary();  // abstract method
}

//class PartTimeEMployee extends Employee implements Workable, Payable{
//
//}
// Subclass
class Developer extends Employee implements Workable, Payable {

    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id); // call superclass constructor
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement Workable
    @Override
    public void work() {
        System.out.println(name + " is writing code.");
    }

    // Implement Payable
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displaySalary() {
        System.out.println("Salary: $" + calculateSalary());
    }
}