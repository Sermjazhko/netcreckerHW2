package com.netcracker.chOne.exEight;

import java.util.*;

public class Main {
    public static void main(String[] args){
        // ex 8

        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1 = in1.nextLine();
        int p = 1;
        System.out.println("Substrings:");
        for (int i = 0; i<str1.length(); i++)
        {
            if (str1.charAt(i) != ' ') {
                p = 0;
                System.out.print(str1.charAt(i));
            }
            else
                p += 1;
            if (p == 1)
                System.out.println();
        }
        in1.close();
    }
}
