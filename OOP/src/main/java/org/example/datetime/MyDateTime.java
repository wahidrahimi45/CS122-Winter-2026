package org.example.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/*
    Common Format Patterns
        Pattern	    Meaning
        yyyy	    Year
        MM	        Month
        dd	        Day
        HH	        Hour (24h)
        mm	        Minute
        ss	        Second

        Common LocalDate Formats
        Pattern	            Output
        yyyy-MM-dd	        2026-01-15
        dd/MM/yyyy	        15/01/2026
        MM-dd-yyyy	        01-15-2026
        EEEE, MMM dd yyyy	Thursday, Jan 15 2026
        dd MMM yyyy	        15 Jan 2026

        Common LocalTime Formats
        Pattern	    Output
        HH:mm	    14:32
        hh:mm a	    02:32 PM
        HH:mm:ss	14:32:10
        hh:mm:ss a	02:32:10 PM

        Date Symbols
        Symbol	Meaning	Example
        y	    Year	2026
        M	    Month	01
        MMM	    Month name	Jan
        MMMM	Full month	January
        d	    Day	    15
        E	    Day name	Thu
        EEEE	Full day	Thursday

        Time Symbols
        Symbol	Meaning	Example
        H	Hour (0–23)	14
        h	Hour (1–12)	2
        m	Minute	32
        s	Second	10
        a	AM/PM	PM
        S	Milliseconds	123
   */
public class MyDateTime {
    public static void main(String[] args) {
//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        LocalDate today = LocalDate.now();
//
////        System.out.println(today);
////
////        String formattedDate = today.format(dateFormatter);
////        System.out.println(formattedDate);
//
//        // 01/15/2026
////        int year = today.getYear();
////        int month = today.getMonthValue();
////        Month month2 = today.getMonth();
////        int daysOftheMonth = today.getDayOfMonth();
////        DayOfWeek dayOfWeek = today.getDayOfWeek();
////        System.out.println(year);
////        System.out.println(month);
////        System.out.println(month2);
////        System.out.println(daysOftheMonth);
////        System.out.println(dayOfWeek);
//
//        LocalDate futureDate = today.plusYears(2).plusDays(20);
//        System.out.println(futureDate.format(dateFormatter));


//        // Woring with time
//        LocalTime now = LocalTime.now();
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
//        System.out.println(now.format(timeFormatter));
//
//        System.out.println(now.getHour());
//        System.out.println(now.getMinute());
//
//        System.out.println(now.plusHours(8).plusMinutes(15).format(timeFormatter));


//        // work with date and time at the same time
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
//        System.out.println(now.format(dateTimeFormatter));

        int year = 2010;
        int month = 10;
        int day = 12;

        LocalDate date = LocalDate.of(year, month,day);
        //System.out.println(date);

//        String dob =  "2010-10-12";
//        //System.out.println("Enter your date of birth: ");
//        LocalDate dobObject = LocalDate.parse(dob);
//
//        System.out.println(dobObject);
        System.out.print("Enter your dob (YYYY-MM-dd): ");
        Scanner scanner = new Scanner(System.in);
        String dob = scanner.nextLine();

        LocalDate userDob = LocalDate.parse(dob);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(userDob, currentDate);

        System.out.println(userDob);
        System.out.println(currentDate);

        System.out.println("You are "+ age.getYears()+" years "+age.getMonths()+" months and"
                + age.getDays()+" days");
    }
}
