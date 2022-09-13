package com.skillbrain.homework_oop;

import java.util.Scanner;

/*
Write a test application named DateTest that demonstrates classDate’s capabilities.
 */
public class DateTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Date myDate = new Date(9, 11, 1986);

        System.out.println("Introduceti luna");
        int myMonth = input.nextInt();
        myDate.setMonthDate(myMonth);

        System.out.println("Introduceti ziua");
        int myDay = input.nextInt();
        myDate.setDayDate(myDay);

        System.out.println("Introduceti anul");
        int myYear = input.nextInt();
        myDate.setYearDate(myYear);

        myDate.displayDate();
    }
}
