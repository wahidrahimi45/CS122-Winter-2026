package org.example.filewriting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MoreFIlePractice {
    public static void main(String[] args) {
        File myFolder = new File("newFolder");
        if(!myFolder.exists())
        {
            myFolder.mkdir();
        }
//        File myFile = new File(myFolder.getAbsolutePath()+"/data.txt");
//        PrintWriter writer = null;
//        try {
//            writer = new PrintWriter(new FileOutputStream(myFile,true));
//            writer.println("This is a line");
//            writer.println("This is another line");
//            writer.println(3);
//            writer.println(3.6);
//        }catch (Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }finally {
//            if(writer != null)
//                writer.close();
//        }
        Student s1 = new Student("ALex",1001);

        try(PrintWriter writer = new PrintWriter(new FileOutputStream(new File(myFolder.getAbsolutePath()+"/data.txt"),true)))
        {
            writer.println("Inside the try with block");
            writer.println(s1);
            System.out.println();
        }catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }

        readFromFile("newFolder/data.txt");
//
//        try (String name = new String()){
//
//        }
    }

    public static void readFromFile(String filePath)
    {
        try (Scanner scanner = new Scanner(new File(filePath))){
            while (scanner.hasNext())
            {
                String line = scanner.nextLine();
                line.split(" ");
                System.out.println(line);
            }
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString()
    {
        return "Student Name: "+ this.name+"\n"+"Student ID: "+ this.id;
    }
}