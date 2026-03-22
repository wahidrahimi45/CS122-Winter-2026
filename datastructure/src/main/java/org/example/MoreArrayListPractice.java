package org.example;

import java.util.ArrayList;

public class MoreArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("PHP");
        words.add("HTML");

        ArrayList<Integer> result = getLen(words);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)+" ");
        }


    }

    public static ArrayList<Integer> getLen(ArrayList<String> words)
    {
        ArrayList<Integer> result = new ArrayList<>();
        //process

        for(String str : words)
        {
            int len = str.length();
            result.add(len);
        }
        return result;
    }
}
