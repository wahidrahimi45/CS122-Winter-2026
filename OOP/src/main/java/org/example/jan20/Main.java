package org.example.jan20;

public class Main {
    public static void main(String[] args) {
        // Student 1
        String[] wahidCourses = new String[] {"CS101", "MATH201", "ENG102"};

        String[] coursesOffered = {"Java", "Python", "Data Structures", "Databases", "Algorithms"};

        Student student1 = new Student(104, "Wahid","Rahimi", "wahid@gmail.com",
                "CS",2,3.5,wahidCourses,true);

//        student1.setId(101);
//        student1.setFirstName("Emma");
//        student1.setLastName("Ved");
//        student1.setEmail("emma.ved@gmail.com");
//        student1.setMajor("Computer Science");
//        student1.setYearLevel(2);
//        student1.setGpa(3.6);
//        student1.setEnrolledCourses(new String[] {"CS101", "MATH201", "ENG102"});
//        student1.setActive(true);


        // Student 2
        Student student2 = new Student(); // default constructor

//        student2.setId(202);
//        student2.setFirstName("Sara");
//        student2.setLastName("John");
//        student2.setEmail("sara.j@college.edu");
//        student2.setMajor("Business Administration");
//        student2.setYearLevel(1);
//        student2.setGpa(3.9);
//        student2.setEnrolledCourses(new String[] {"BUS101", "ECON110"});
//        student2.setActive(false);

//        student1.printStudentInfo();
//        student2.printStudentInfo();


//        int x = 10;
//        System.out.println(x);


        int x = 10;
        System.out.println(x);
        System.out.println(student1);




    }
    public static boolean searchCourse(String courName)
    {
        String[] coursesOffered = {"Java", "Python", "Data Structures", "Databases", "Algorithms","JS", "HTML","CSS"};
        for(String course : coursesOffered)
        {
            if(courName.equals(course))
            {
                return true;
            }
        }
        return false;

    }

}
