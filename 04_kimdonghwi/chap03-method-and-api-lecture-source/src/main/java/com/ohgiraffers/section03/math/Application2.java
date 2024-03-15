package com.ohgiraffers.section03.math;

public class Application2 {
    /**
     * [Utilizing random numbers]
     * You can create a random number between 0.0 and 1.0 using the Math.random() method.
     * There are cases where you need to generate the desired range of integer values.
     * <p>
     * [Formula for obtaining a random integer number in the desired range]
     * (int)(Math.random() * number of random numbers to be obtained) + minimum value of random number to be obtained
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Random number between 0 and 9
        int random1 = (int)(Math.random() * 10);
        System.out.println("random1 = " + random1); // one of the integer numbers from 0 to 9

        // Random number between 1 and 10
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("random2 = " + random2); // one of the integer numbers from 1 to 10

        // Random number between 10 and 15
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("random3 = " + random3); // one of the integer numbers from 10 to 15

        // Random number between -128 and 127
        int random4 = (int)(Math.random() * 256) - 128;
        System.out.println("random4 = " + random4); // one of the integer numbers from -128 to 127
    }
}
