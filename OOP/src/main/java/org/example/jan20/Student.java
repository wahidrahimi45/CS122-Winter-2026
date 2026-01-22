package org.example.jan20;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String email;
    private String major;
    private int yearLevel;
    private double gpa;
    private String[] enrolledCourses;// = new String[]{"Java","Python"};
    private boolean isActive;
    private int maxCourse = 4;
    private int courseCounter = 0;
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
        this.enrolledCourses= new String[maxCourse];
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(int month, int day, int year) {

        //  Validate year (reasonable range)
        if (year < 1900 || year > LocalDate.now().getYear()) {
            System.out.println("Invalid year");
            return;
        }

        //  Validate month (MM format)
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            return;
        }

        //  Validate day (basic range)
        if (day < 1 || day > 31) {
            System.out.println("Invalid day");
            return;
        }

        /*
         * Create LocalDate safely
         * This validates:
         * - Leap years
         * - Invalid dates (Feb 30, Apr 31, etc.)
         */
        LocalDate studentDob;
        try {
            studentDob = LocalDate.of(year, month, day);
        } catch (DateTimeException ex) {
            System.out.println("Invalid date. Use MM/dd/yyyy format.");
            return;
        }

        //  DOB cannot be in the future
        if (studentDob.isAfter(LocalDate.now())) {
            System.out.println("Date of birth cannot be in the future");
            return;
        }

        // Assign only if all validations pass
        this.dob = studentDob;
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
        if(yearLevel < 0 || yearLevel > 4)
        {
            System.out.println("Enter a value between 1 and 4");
            return;
        }
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

    // class exercise
    public void setEnrolledCourses(String[] enrolledCourses) {
        if(enrolledCourses == null)
        {
            System.out.println("Courses cannot be null");
            return;
        }
        if(enrolledCourses.length > maxCourse)
        {
            // prompt the user
        }
        // validate the course name
        for(String course : enrolledCourses)
        {
            boolean foundCourse = false;
            for(String c : CSDepartment.coursesOffered)
            {
                if(course.toLowerCase().equals(c.toLowerCase()))
                {
                    foundCourse = true;
                    break;
                }
            }
        }

        this.enrolledCourses = enrolledCourses;
    }

    public void enroll(String courseName) {

        //  Validate input
        if (courseName == null || courseName.isBlank()) {
            System.out.println("Course name cannot be empty");
            return;
        }

        // Check if course is offered
        boolean isOffered = false;
        for (String course : CSDepartment.coursesOffered) {
            if (course.equalsIgnoreCase(courseName)) {
                isOffered = true;
                break;
            }
        }

        if (!isOffered) {
            System.out.println("Invalid course name");
            return;
        }

        // Prevent duplicate enrollment
        for (int i = 0; i < courseCounter; i++) {
            if (enrolledCourses[i].equalsIgnoreCase(courseName)) {
                System.out.println("Already enrolled in " + courseName);
                return;
            }
        }

        // Check course limit
        if (courseCounter >= maxCourse) {
            System.out.println("You cannot enroll in more than " + maxCourse + " courses");
            return;
        }

        // Enroll the student
        enrolledCourses[courseCounter] = courseName;
        courseCounter++;

        System.out.println("Successfully enrolled in " + courseName);
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

    public String toString()
    {
        return "Student id: "+this.id +"\n"+
                "Student first name: "+ this.firstName+"\n"+
                "Student last name: "+ this.lastName + "\n"+
                "Student Major: "+ this.major+"\n"+
                "Courses enrolled: "+ Arrays.toString(this.enrolledCourses);
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", major='" + major + '\'' +
//                ", yearLevel=" + yearLevel +
//                ", gpa=" + gpa +
//                ", enrolledCourses=" + Arrays.toString(enrolledCourses) +
//                ", isActive=" + isActive +
//                '}';
//    }
}
