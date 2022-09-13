package com.skillbrain.homework_oop;

/*
Create a super class called Car. The Car class has the following fields and methods.
	◦int speed;
	◦double regularPrice;
	◦String color;
	◦double getSalePrice();

 */
public class Car {

    private int speed;
    private double regularPrice;
    private String color;

    public Car (int speed, double regularPrice, String color) {

        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public double getSalePrice() {
        return regularPrice;
    }

}
