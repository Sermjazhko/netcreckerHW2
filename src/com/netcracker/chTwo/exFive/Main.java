package com.netcracker.chTwo.exFive;


public class Main {
    public static void main(String[] args){
        Point point = new Point(3, 4).translate(1,3).scale(0.5);
        Point point1 = new Point().translate(2,3).scale(2);
        System.out.println(point + "; " + point1);
    }
}
