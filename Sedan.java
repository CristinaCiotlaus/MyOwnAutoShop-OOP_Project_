package com.skillbrain.homework_oop;

/*
Create a subclass of Car class and name it as Sedan. The Sedan class has the following fields and methods.
Creati o sub clasa a clasei Care, numita Sedan. Clasa Sedan are urmatoarele campuri si metode:
	◦int length;
	◦double getSalePrice();//If length>20feet, 5%discount, Otherwise, 10%discount

 */
public class Sedan extends Car{

    private int length;

    public Sedan (int speed, double regularPrice, String color, int length) {

        super (speed,regularPrice,color);
        this.length = length;
    }

    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() - (0.05 * super.getSalePrice());
        }
        else {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
    }
}
