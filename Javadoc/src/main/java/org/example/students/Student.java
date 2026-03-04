package org.example.students;

/**
 * The Student class represents a student in the university system.
 * <p>It stores some information about a student</p>
 * <ul>
 *     <li>ID</li>
 *     <li>Student full name</li>
 *     <li>Student GPA</li>
 * </ul>
 *
 * @author Wahid
 * @author CS122 winter Students
 * @version 2.1.2
 * @since Jan 2026
 */
public class Student {
    /**
     * ID represents a unique id for the Student
     */
    int id;
    /**
     * Show the full name of the student
     */
    String name;
    /**
     * Show the Student GPA
     */
    double gpa;

    /**
     * No arg constructor
     * This allows the user to create a student object with default values
     */
    public Student()
    {
        this.id = 0;
        this.name = "Unknown";
        this.gpa = 0.0;
    }

    /**
     *
     * @param id the unique id of the student
     * @param name string: full nmae of the student
     * @param gpa double: GPA of the student (0-4)
     */
    public Student(int id, String name, double gpa)
    {
        this.id= id;
        this.name = name;
        this.gpa = gpa;
    }

    /**
     * Get the student ID
     * @return returs the unique id of the student
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Prints the detailed information of a student.
     */
    public void printStudentInfo()
    {
        System.out.println("Student name: "+ this.getName());
        System.out.println("Student ID: "+ this.getId());
        System.out.println("Student GPA: "+ this.getGpa());
    }
}
