package exam;


public class Desktop implements Computer {


    @Override
    public void openExam()
    {
        System.out.println("Opened Exam using Desktop");
    }
    @Override
    public void startExam()
    {
        System.out.println("Started Exam using Desktop");
    }
    @Override
    public void SubmitExam()
    {
        System.out.println("Exam submitted using Desktop");
    }
}
