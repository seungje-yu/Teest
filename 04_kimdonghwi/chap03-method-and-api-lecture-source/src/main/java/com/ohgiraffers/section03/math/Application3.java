package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    /**
     * [java.util.Random class]
     * Generating random numbers using the nextInt() method of the java.util.Random class
     * nextInt(int bound) : Generates a random number up to the integer range passed as a parameter and converts it to an integer
     * <p>
     * [Formula for obtaining a random integer number in the desired range]
     * `random.nextInt(number of random numbers to be obtained) + minimum value of random number to be obtained`
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random(); // Create a Random object(java.util.Random)

        // Random number between 0 and 9
        int randomNumber1 = random.nextInt(10);
        System.out.println("randomNumber1 = " + randomNumber1); // one of the integer numbers from 0 to 9

        // Random number between 1 and 10
        int randomNumber2 = random.nextInt(10) + 1;
        System.out.println("randomNumber2 = " + randomNumber2); // one of the integer numbers from 1 to 10

        // Random number between 20 and 45
        int randomNumber3 = random.nextInt(26) + 20;
        System.out.println("randomNumber3 = " + randomNumber3); // one of the integer numbers from 20 to 45

        // Random number between -128 and 127
        int randomNumber4 = random.nextInt(256) - 128;
        System.out.println("randomNumber4 = " + randomNumber4); // one of the integer numbers from -128 to 127
    }
}
