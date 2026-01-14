package org.example.oopbasics;
/*   Notes
OOP is about creating programs that behave like the real world, using objects that contain data and actions.
OOP is built on four main principles:
    1.	Encapsulation: Protecting Data, Securing the date members and methods, data hiding
    2.	Abstraction : Hiding Complexity
    3.	Inheritance : Reusing Code
    4.	Polymorphism : One Name, Many Forms

    Class Vs Object
    OOP is based on two fundamental building blocks
 */

/*
    id,firstName,lastName,email,major,yearLevel, gpa,enrolledCourses,isActive;
 */
public class Student {
    /*
    Common names:
        Fields – very common in Java, C#, and general OOP
        Attributes – common in Python and UML
        Member variables
        Properties – often used when accessors are involved (C#, Swift)
        Instance variables – emphasize per-object storage
        Data members
        State variables
     */
    private long id;
    private String firstName; //fName, fn
    private String lastName;
    private String email;
    private String major;
    private int yearLevel;
    private double gpa;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(isValidName(firstName))
            this.firstName = firstName;
        else {
            System.out.println("Invalid first name");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(isValidName(lastName))
            this.lastName = lastName;
        else {
            System.out.println("Invalid name");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
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

    private String[] enrolledCourses;
    private boolean isActive;



    /*
       Common names
        Methods – most common across OOP languages
        Member functions
        Functions – common in Python or informal contexts
        Operations – common in UML and design discussions
     */

    // Getters and Setters
    public long getId()
    {
        return id;
    }
    public void setId(long studentId)
    {
        //Validate the id
        if(studentId <= 0 || studentId >5000)
        {
            System.out.println("Invalid Id");
            id = 10;
            return;
        }
        id = studentId;
    }

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
