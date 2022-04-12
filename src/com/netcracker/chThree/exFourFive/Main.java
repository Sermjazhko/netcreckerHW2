package com.netcracker.chThree.exFourFive;

public class Main {
    public static void main(String[] args) {
        /*4. Implement a static of method of the IntSequence class that yields a sequence
                with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
        sequence with six values. Extra credit if you return an instance of an
        anonymous inner class.
        5. Add a static method with the name constant of the IntSequence class that
        yields an infinite constant sequence. For example, IntSequence.constant(1)
        yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
        lambda expression.*/
        IntSequence.constant(1);
        System.out.println(IntSequence.of(1,2,3,4,5,6));
    }
}
