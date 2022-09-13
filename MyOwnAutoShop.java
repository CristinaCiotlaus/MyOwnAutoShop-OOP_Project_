package com.skillbrain.homework_oop;

/*
Create MyOwnAutoShop class which contains the main() method. Perform the following within the main()
method.
◦Create an instance of Sedan class and initialize all the fields with appropriate values. Use super(...)
method in the constructor for initializing the fields of the superclass.
◦Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...)
method in the constructor for initializing the fields of the super class.
◦Create an instance of Car class and initialize all the fields with appropriate values.
Display the sale prices of all instance
 */

public class MyOwnAutoShop {

    public static void main(String[] args) {

        Sedan mySedan = new Sedan(160, 20000, "Red", 10);
        Ford myFord1 = new Ford (156,4452.0,"Black",2005, 10);
        Ford myFord2 = new Ford (155,5000.0,"Pink",1998, 5);
        Car myCar = new Car (555, 56856.0, "Red");

        System.out.println("MySedan Price: " + mySedan.getSalePrice());
        System.out.println("MyFord1 Price: " + myFord1.getSalePrice());
        System.out.printf("MyFord2 Price: " +  myFord2.getSalePrice());
        System.out.printf("MyCar Price: " + myCar.getSalePrice());
    }
}
