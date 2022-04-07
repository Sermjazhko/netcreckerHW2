package com.netcracker.chOne.exThirteen;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // ex 13

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
