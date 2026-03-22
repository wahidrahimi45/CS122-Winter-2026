package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class RecursionExercise {
    public static void main(String[] args) {
//        String str = "Java Programming Language";
//
//        System.out.println(getFirstTwoLetters(str));
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(10);
//        numbers.remove(0);
//        if(numbers.contains(10))
//        {
//
//        }
//        System.out.println(numbers.get(0));
//
//        numbers.add(12);
//        numbers.add(13);
//        numbers.add(15);
//        System.out.println(numbers.get(0));
//
//        TreeMap<String, Integer> idToString = new TreeMap<>();
//
//        idToString.put("Alex", 1001);
//
//        //System.out.println(idToString.get(0));
//
//        System.out.println(idToString.get("Alex"));

//        for (int i = 0; i < idToString.size(); i++) {
//
//        }

//        TreeMap<String,String> dic = new TreeMap<>();
//
//        dic.put("Abundant","existing in large amounts");
//        dic.put("Abundant2","existing in large amounts");
//        dic.put("Abundant3","existing in large amounts");
//
//        System.out.println(dic.get("Abundant"));
//
//        dic.get();
//        dic.values();
//        dic.keySet();

//        for (int i = 0; i <10 ; i = i+2) {
//            System.out.print(i +" ");
//        }

//        String str  = "Programming";
//
//        for (int i = 0; i <str.length(); i = i+2) {
//            System.out.print(str.charAt(i)+" ");
//        }

        ArrayList<Boolean> booleans = new ArrayList<>();
        ArrayList<Computer> computers = new ArrayList<>();

        computers.add(new Computer());


    }

    public static ArrayList<String> getFirstTwoLetters(String str)
    {
        ArrayList<String> result = new ArrayList<>();
        String[] words = str.split(" ");

        for (String word : words)
        {
            String firstTwoLetters = word.substring(word.length()-1);
            result.add(firstTwoLetters);
        }
        return result;
    }
}
class Computer{

}

