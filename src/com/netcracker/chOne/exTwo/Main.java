package com.netcracker.chOne.exTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Write a program that reads an integer angle (which may be positive or
        negative) and normalizes it to a value between 0 and 359 degrees. Try
        it first with the % operator, then with floorMod.*/

        int a = 360;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter angle:");
        int number = in.nextInt();
        int angle = number % a;
        if (angle < 0)
            angle = angle + a;
        System.out.println("Result with operator %%: " + angle);
        System.out.println("Result with operator floorMod:" + Math.floorMod(number, a));
        in.close();
    }

}
