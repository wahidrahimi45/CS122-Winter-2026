package org.example.filewriting;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class BookExample {
    public static void main(String[] args) {


        //Read from the book and write to a new file
        ArrayList<String> eBookList = new ArrayList<>();
        int lineCounter = 0;
        try {
            Scanner bookReader = new Scanner(new File("books/book.txt"));
            PrintWriter bookWriter = new PrintWriter("books/mybook.txt");

            while (bookReader.hasNext())
            {
                lineCounter++;
                String line = bookReader.nextLine();
                //line = line.toUpperCase();
                if(line.contains("eBook"))
                {
                    eBookList.add(lineCounter+": "+ line);
                }
                System.out.println(lineCounter+": "+ line);
                line = line.replaceAll("eBook","*****[PRINTABLE BOOK]*******");
                bookWriter.println(line);
            }
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("eBook happend: "+ eBookList.size()+" many times");
        for(String line : eBookList)
        {
            System.out.println(line);
        }

    }
}
