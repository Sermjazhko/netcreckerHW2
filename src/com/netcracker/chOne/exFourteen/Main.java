package com.netcracker.chOne.exFourteen;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Write a program that reads a two-dimensional array of integers and determines whether it is a magic square (that is, whether the sum of all
                rows, all columns, and the diagonals is the same). Accept lines of input
        that you break up into individual integers, and stop when the user enters
        a blank line. For example, with the input
        16 3 2 13
        5 10 11 8
        9 6 7 12
        4 15 14 1
        (Blank line)
        your program should respond affirmatively.*/


                Scanner in2 = new Scanner(System.in);
        System.out.println("Enter matrix:");
        List<String> input = new ArrayList();
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        String str = new String();
        int j = 0;
        boolean flag = false; // Проверка на матрицу
        boolean flagMatrix = true; // Проверка на квадратную матрицу
        boolean flagMagic = true; // Проверка на магический квадрат
        boolean flagSemiagic = false; // Проверка на полумагический
        while (true) {
            str = in2.nextLine();
            if (str.equals("")) break;
            List<Integer> num = new ArrayList();
            //чтение и заполнение матрицы
            for (int i = 0; i < str.length(); i++) {
                String numberStr = "";
                while (i < str.length() && str.charAt(i) != ' ') {
                    numberStr += str.charAt(i);
                    flag = true;
                    i++;
                }
                if (flag) {
                    num.add(Integer.parseInt(numberStr));
                    flag = false;
                }
            }
            if (matrix.size() == 0)
                j = num.size();
            else if (j != num.size()) {
                flagMatrix = false;
            }
            matrix.add(num);
        }
        in2.close();
        // Проверка на магический квадрат
        int magicConstant = sumArr(matrix.get(0));

        if (!flagMatrix || matrix.size() != j) {
            System.out.println("Not a matrix or not a square matrix");
        }
        else {
            for (int l = 1; l < matrix.size(); l++)
                if (magicConstant != sumArr(matrix.get(l))) {
                    flagMagic = false;
                    break;
                }
            if (flagMagic) {
                int sumDiag = 0;
                int sumSecDiag = 0;
                for (int k = 0; k < j; k++) {
                    int sum = 0;
                    for (int i = 0; i < j; i++)
                        sum += matrix.get(i).get(k);
                    if (magicConstant != sum) {
                        flagMagic = false;
                        break;
                    }
                    sumDiag += matrix.get(k).get(k);
                    sumSecDiag += matrix.get(k).get(j - k - 1);
                }
                flagSemiagic = flagMagic;
                if (magicConstant != sumDiag || magicConstant != sumSecDiag) flagMagic = false;

            }
            System.out.println("Magic square: " + flagMagic);
            System.out.println("Semimagic square: " + flagSemiagic);
        }
    }

    public static int sumArr(List<Integer> m) {
        int sum = 0;
        for (int num : m)
            sum += num;
        return sum;
    }
}
