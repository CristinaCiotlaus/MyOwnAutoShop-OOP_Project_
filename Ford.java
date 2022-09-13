package com.skillbrain.homework_oop;

/*
Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
Creati o sub clasa a clasei Care, numita Ford. Clasa Ford are urmatoarele campuri si metode:
	◦int year;
	◦int manufacturerDiscount;
	◦double getSalePrice();//From the sale price computed from Car class,subtract them anufacturer Discount.

 */

public class Ford extends Car {

    private int year;
    private int manufacturerDiscount;

    public Ford (int speed,double regularPrice,String color, int year, int manufacturerDiscount) {

        super (speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return (super.getSalePrice() - manufacturerDiscount);
    }

}
