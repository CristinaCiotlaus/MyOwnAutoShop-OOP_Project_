package com.skillbrain.homework_oop;

/*
Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
Creati o sub clasa a clasei Car, numita Truck (Camion). Clasa Truck are urmatoarele campuri si metode:
	◦int weight;
	◦double getSalePrice(); //If weight>2000, 10%discount Otherwise no discount.

 */
public class Truck extends Car {

    private int weight;

    public Truck (int Speed, double regularPrice, String color, int weight) {
        super(Speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {

        if (weight > 2000){
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
        else {
            return super.getSalePrice();
        }
    }
}
