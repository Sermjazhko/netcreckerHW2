package com.netcracker.chThree.exFourFive;

import java.util.Arrays;

public class IntSequence {

    private static int count;
    private int[] sequance;

    public IntSequence() {
    }

    public IntSequence(int... sequance) {
        this.sequance = sequance;
    }

    public static IntSequence of(int... num){
        return new IntSequence(num);
    }

    public static void constant(int c){
        if(count>1000)
            System.out.println();
        else {
            count++;
            System.out.print(c);
            constant(c);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i=0; i<sequance.length; i++)
            str+= sequance[i] + " ";
        return  str;
    }
}
