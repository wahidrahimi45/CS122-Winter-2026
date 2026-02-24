package exam;

import javax.crypto.Cipher;

public class Main {
    public static void main(String[] args) {
        Computer desktop1 = new Desktop();
        Computer laptop1 = new Laptop();
        Computer iPad1 = new IPad();

        Computer[] computers = {laptop1,desktop1,iPad1};

        Student student1 = new Student(laptop1);
        Student student2 = new Student(iPad1);
        Student student3 = new Student(desktop1);



        student1.takeExam();
        System.out.println();
        student2.takeExam();
        System.out.println();
        student3.takeExam();
    }

}
