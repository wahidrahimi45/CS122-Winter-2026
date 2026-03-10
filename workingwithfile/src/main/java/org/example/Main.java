package org.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


//        if(directory.isDirectory())
//        {
//            String[] files = directory.list();
//
//            for (String str : files)
//            {
//                System.out.println(str);
//            }
//            System.out.println(files.length);
//
//        }

//        File directory = new File("c:\\Windows");
//        File[] myFiles = directory.listFiles();
//        int fileCount = 0;
//        int dirCount = 0;
//
//        for (File f : myFiles)
//        {
//            if(f.isDirectory())
//            {
//                System.out.println("Directory: "+ f.getName());
//                dirCount++;
//            } else if (f.isFile()) {
//                System.out.println("File: "+ f.getName());
//                fileCount++;
//            }
//        }
//        System.out.println("Total size: "+ myFiles.length);
//        System.out.println("Total files: "+ fileCount);
//        System.out.println("Total dir: "+ dirCount);



        File testFile = new File("test.txt");

        if(!testFile.exists())
        {
            try {
                if(testFile.createNewFile())
                {
                    System.out.println("File successfully crated");
                }
                else {
                    System.out.println("Could not create the file");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if(testFile.exists())
        {
            System.out.println("File exist");
        }else {
            System.out.println("File does not exist");
        }

        if(testFile.exists())
        {
            testFile.delete();
        }
    }

}