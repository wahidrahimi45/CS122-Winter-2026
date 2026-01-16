package org.example.jan14construct;

import java.util.Arrays;

/*
    Class Note
    this key word: To resolve naming conflicts
    To call other constructors
    Avoiding redundant names

    A constructor is a special method in Java that is automatically called when an object is created.

    Key Characteristics
    Same name as the class
    No return type (not even void)
    Called automatically using new
    Used to initialize object data

    Types of Constructors in Java
     Default Constructor: Provided by Java only if no constructor is written.
     No-Argument Constructor: User-defined constructor with no parameters.
     Parameterized Constructor: Accepts parameters to initialize values.
     Constructor Overloading: Multiple constructors with different parameter lists.

 */
public class Student {
    private long id;// = 101;
    public String firstName;// = "wahid"; //fName, fn
    private String lastName;
    private String email;
    private String major;
    private int yearLevel;
    private double gpa;
    private String[] enrolledCourses;// = new String[]{"Java","Python"};
    private boolean isActive;// = true;

//    // No arg constructor
//    public Student()
//    {
//        System.out.println("No arg constructor is called ");
//        this.id = 101;
//        this.enrolledCourses = new String[]{"Java","Python"};
//    }
//    // Full constructor
//    public Student(int id, String firstName, String lastName, String email, String major,
//                   int yearLevel, double gpa, String[] enrolledCourses, boolean isActive)
//    {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.major = major;
//        this.yearLevel = yearLevel;
//        this.gpa = gpa;
//        this.enrolledCourses = enrolledCourses;
//        this.isActive = isActive;
//    }
//
//    public Student(String firstName, String lastName, int yearLevel, boolean isActive) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.yearLevel = yearLevel;
//        this.isActive = isActive;
//    }
//
//    // Constructor Overloading, partial
//    public Student(int id, String firstName, String lastName)
//    {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//
//    }

    // =========================
    // 1 Full Constructor
    // =========================
    // Used when all data is available
    public Student(long id, String firstName, String lastName,
                   String email, String major, int yearLevel,
                   double gpa, String[] enrolledCourses, boolean isActive) {

        // Using setters for validation
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setMajor(major);
        setYearLevel(yearLevel);
        setGpa(gpa);
        setEnrolledCourses(enrolledCourses);
        setActive(isActive);
    }

    // =========================
    // 2 Default Constructor / Constructor chaining.
    // =========================
    // Called when no arguments are passed
    public Student() {
        // calling the full constructor with (this) keyword and passing the default values to the full constructor
        //  chaining, default values
        this(10, "Unknown", "Unknown", "notset@email.com",
                "Undeclared", 1, 0.0, new String[0], true);
    }

    // =========================
    // 23 Partial Constructor
    // =========================
    // Used when only basic info is known / Constructor chaining.
    public Student(long id, String firstName, String lastName) {
        // calling the full constructor, passing the 3 values coming as parameter and rest the default values
        this(id, firstName, lastName, "notset@email.com",
                "Undeclared", 1, 0.0, new String[0], true);
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
        System.out.println("Major: "+ this.major);
        System.out.println("Year Level: "+ this.yearLevel);
        System.out.println("GPA: "+ this.gpa);
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

    //toString method
    /*
        The toString() method in Java is used to get a string representation of an object.
        It is defined in the java.lang.Object class, which means every class in Java inherits this method
     */

//    public String toString()
//    {
//        return "Student id: "+this.id +"\n"+
//                "Student first name: "+ this.firstName+"\n"+
//                "Student last name: "+ this.lastName + "\n"+
//                "Student Major: "+ this.major+"\n"+
//                "Courses enrolled: "+ Arrays.toString(this.enrolledCourses);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", major='" + major + '\'' +
                ", yearLevel=" + yearLevel +
                ", gpa=" + gpa +
                ", enrolledCourses=" + Arrays.toString(enrolledCourses) +
                ", isActive=" + isActive +
                '}';
    }
}
