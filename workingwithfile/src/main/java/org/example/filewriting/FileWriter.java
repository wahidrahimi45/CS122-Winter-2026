package org.example.filewriting;

import java.io.*;

public class FileWriter {
    public static void main(String[] args) throws FileNotFoundException {

        String dirName = "output";
        String newFile = "myutputfile.txt";
        String fileName = "output/output.txt";
        // Create a folder
        createDirectory(dirName);
        createFile(fileName);

        //OutputStream outputStream = new FileOutputStream();
        FileOutputStream outputStream = new FileOutputStream(fileName,true);

        PrintWriter writer = new PrintWriter(outputStream);
        writer.println("Hello");
        writer.println("Welcome to");
        writer.println("Java");
        writer.println(33);
        writer.println('A');
        writer.println("End of the file");
        writer.println(4.5);
        writer.println("---------------------------");



        writer.close();



    }
    public static void createDirectory(String dirName)
    {
        File newDir = new File(dirName);
        if(newDir.exists())
        {
            System.out.println("the directory +"+dirName+" already exist");
        }
        else {
            if(newDir.mkdir())
            {
                System.out.println("Directory successfully created");
            }
            else {
                System.out.println("Failed to create the directory");
            }
        }
    }

    public static void createFile(String fileName)
    {
        File newFile = new File(fileName);
        if(newFile.exists())
        {
            System.out.println("the file +"+fileName+" already exist");
        }
        else {
            try {
                if(newFile.createNewFile())
                {
                    System.out.println("File successfully created");
                }
                else {
                    System.out.println("Failed to create the file");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
