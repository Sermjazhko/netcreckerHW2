package com.netcracker.chTwo.exNine;

public class Car {
    private final double fuelEfficiency; //(miles/gallons)
    private final double tankVolume; // gallons
    private double x; //miles
    private double fuelLevel; // gallons

    public Car(double fuelEfficiency, double tankVolume) {
        this.fuelEfficiency = fuelEfficiency;
        this.tankVolume = tankVolume;
    }

    public Car(double fuelEfficiency, double tankVolume, double fuelLevel) {
        this.fuelEfficiency = fuelEfficiency;
        this.tankVolume = tankVolume;
        this.fuelLevel = fuelLevel;
    }

    public Car(double fuelEfficiency, double tankVolume, double x, double fuelLevel) {
        this.fuelEfficiency = fuelEfficiency;
        this.tankVolume = tankVolume;
        this.x = x;
        this.fuelLevel = fuelLevel;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double getX() {
        return x;
    }

    private double driveCheck(double miles) {
        if (fuelLevel >= miles/fuelEfficiency) {
            fuelLevel-= miles/fuelEfficiency;
            x += miles;
            return -1.0;
        }
        double distance = fuelLevel * fuelEfficiency;
        fuelLevel = 0.0;
        x += distance;
        return distance;

    }

    private int addGallonsCheck (double gallons) {
        if (fuelLevel+gallons<=tankVolume) {
            fuelLevel+=gallons;
            return 0;
        }
        fuelLevel = tankVolume;
        return 1;

    }
    public void drive (double miles) {
        double distance = driveCheck(miles);
        if (Double.compare(distance, -1.0)==0) System.out.println("Successfully arrived.");
        else System.out.println("Run out of gas in the tank. You drove "+distance+" miles.");
    }

    public void addGallons (double gallons) {
        int result = addGallonsCheck(gallons);
        if (result == 0) System.out.println("Added to the tank "+gallons+" gallons.");
        else System.out.println("Too many gallons, tank full.");
    }
}
