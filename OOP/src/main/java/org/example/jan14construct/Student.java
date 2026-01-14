package org.example.jan14construct;

import java.util.Arrays;

/*
    Class Note
    this key word : To resolve naming conflicts
    To call other constructors
    Avoiding redundant names

    A constructor is a special method in Java that is automatically called when an object is created.

    Key Characteristics
    Same name as the class
    No return type (not even void)
    Called automatically using new
    Used to initialize object data

 */
public class Student {
    private long id;
    private String firstName; //fName, fn
    private String lastName;
    private String email;
    private String major;
    private int yearLevel;
    private double gpa;
    private String[] enrolledCourses;
    private boolean isActive;

    public Student()
    {

    }




     //Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        // Validate the ID
        if(id <0 || id > 1000)
        {
            System.out.println("Invalid id, the Id should be between 1 -1000");
            this.id = 1000; // default id value
            return;
        }
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //Validate the name
        if(isValidName(firstName)) {
            this.firstName = firstName;
        }else {
            System.out.println("Invalid first name please enter a valid first name");
            this.firstName = "Unknown";// default value for first name
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //Validate the name
        if(isValidName(lastName)) {
            this.lastName = lastName;
        }else {
            System.out.println("Invalid last name please enter a valid last name");
            this.firstName = "Unknown";// default value for last name
        }
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // validate email
        if(!email.contains("@") && !email.contains("."))
        {
            System.out.println("Invalid email.");
            this.email = "default@example.com";
            return;
        }
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String[] enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void printStudentInfo()
    {
        System.out.println("Id: "+ this.id);
        System.out.println("First Name: "+ this.firstName);
        System.out.println("Last Name:" + this.lastName);
        System.out.println("Email:" + this.email);

        //TODO
        // print student's major, yearLevel and gpa

//        for(String course : enrolledCourses)
//        {
//            System.out.print(course);
//        }
//        System.out.println();
        System.out.println("Courses: "+ Arrays.toString(this.enrolledCourses));
        if(this.isActive)
        {
            System.out.println("Student is active");
        }
        else {
            System.out.println("Student is not active");
        }
        System.out.println("------------------------------------\n\n");
    }

    /*
        Private Helper Methods
     */
    // Validates first name or last name
    private boolean isValidName(String name) {

        // Check null or empty
        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        // Check minimum length
        if (name.length() < 2 || name.length()>25) {
            return false;
        }

        // Check only letters (A-Z, a-z)
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                return false;
            }
        }

        return true; // Name is valid
    }

}
