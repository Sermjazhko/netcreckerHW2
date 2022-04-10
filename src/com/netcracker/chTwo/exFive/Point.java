package com.netcracker.chTwo.exFive;

public class Point {
    private double x = 0;
    private double y = 0;

    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y){
        return new Point(this.x+x,this.y+y);
    }
    public Point scale(double coeff){
        return new Point(coeff*this.x,coeff*this.y);
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ")";
    }
}
