package com.netcracker.chTwo.exNine;

public class Main {
    public static void main(String[] args){
        Car car = new Car(3.0, 80.0);
        car.addGallons(60);
        car.drive(250);
        System.out.println( car.getX());
        car.addGallons(81);
        car.drive(50);
        System.out.println( car.getX());
    }

}
