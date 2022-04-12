package com.netcracker.chTwo.exNine;

public class Main {
    public static void main(String[] args){

        /*Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a given number of
        miles, to add a given number of gallons to the gas tank, and to get the
        current distance from the origin and fuel level. Specify the fuel efficiency
        (in miles/gallons) in the constructor. Should this be an immutable class?*/

        Car car = new Car(3.0, 80.0);
        car.addGallons(60);
        car.drive(250);
        System.out.println( car.getX());
        car.addGallons(81);
        car.drive(50);
        System.out.println( car.getX());
    }

}
