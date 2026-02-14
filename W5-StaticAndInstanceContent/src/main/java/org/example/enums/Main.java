package org.example.enums;

import org.example.enums.Day;
import org.example.enums.OrderStatus;
import org.example.enums.Priority;

public class Main {
    public static void main(String[] args) {
//        String day = "  sldjf    lskjf ";
//        System.out.println(day);
//
//        final int MAX = 100;
//
//        String day1 = "Manday";

//        Priority low = Priority.LOW;
//
//        System.out.println(low);
//        System.out.println(low.getValue());
//
//        Priority high = Priority.HIGH;
//
//        System.out.println(high);
//        System.out.println(high.getValue());
//
//        for(Priority p : Priority.values())
//        {
//            System.out.println(p +" has a value of: "+ p.getValue());
//        }

        Priority p = Priority.HIGH;
        System.out.println(p.getValue());
        p.setValue(20);
        System.out.println(p.getValue());
    }
}




