package exam;

public class Student {
    Computer computer; // has a relationship

    public Student(Computer computer)
    {
        this.computer = computer;
    }

    public void takeExam()
    {
        computer.openExam();
        computer.startExam();
        computer.SubmitExam();
    }
}
