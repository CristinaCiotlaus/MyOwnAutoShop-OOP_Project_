package com.skillbrain.homework_oop;

/*
Create a class called Date that includes three pieces of information as instance variables—a month (typeint),
a day (typeint) and a year (typeint). Your class should have a constructor that initializes the three
instance variables and assumes that the values provided are correct. Provide a set and a get method for each
instance variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes(/).

 */
public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int myMonth, int myDay, int myYear) {

        month = myMonth;
        day = myDay;
        year = myYear;
    }
    public void setMonthDate(int myMonth) {
        month = myMonth;
    }
    public int getMonthDate() {
        return month;
    }
    public void setDayDate(int myDay) {
        day = myDay;
    }
    public int getDayDate() {
        return month;
    }
    public void setYearDate(int myYear) {
        year = myYear;
    }
    public int getYearDate() {
        return year;
    }
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);

    }
}
