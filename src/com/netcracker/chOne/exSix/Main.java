package com.netcracker.chOne.exSix;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        // ex 6

        BigInteger value = new BigInteger("1000");
        System.out.println("Factorial 1000: " + factorial(value));
    }

    public static BigInteger factorial(BigInteger num){
        if (num.compareTo(BigInteger.ZERO) == -1)
            throw new ArithmeticException("Value less than zero");
        if(num.compareTo(BigInteger.TWO) == -1)
            return BigInteger.ONE;
        return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }

}
