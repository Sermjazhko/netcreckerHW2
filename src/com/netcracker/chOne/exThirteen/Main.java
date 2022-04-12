package com.netcracker.chOne.exThirteen;

import java.util.*;

public class Main {
    public static void main(String[] args){
        /*Write a program that prints a lottery combination, picking six distinct
        numbers between 1 and 49. To pick six distinct numbers, start with an
        array list filled with 1...49. Pick a random index and remove the element.
                Repeat six times. Print the result in sorted order.*/

        ArrayList<Integer> array = new ArrayList<>();
        int[] arrLot = new int[6];

        for (int i = 0; i < 49; i++)
            array.add(i,i+1);

        Random objGenerator = new Random();
        for (int iCount = 0; iCount< 6; iCount++){
            int randomNumber = objGenerator.nextInt(array.size());
            arrLot[iCount] = array.get(randomNumber);
            array.remove(randomNumber);
        }
        Arrays.sort(arrLot);
        System.out.println("Lottery combination: " + Arrays.toString(arrLot));
    }
}
