package com.ohgiraffers.section03.constant;

public class Application1 {
    /**
     * What is a constant?
     * If a variable represents a space to store a value that changes in memory, a constant can be said to be the opposite concept
     * A constant is a space in memory to store a value that never changes
     * <p>
     * [Purpose of using constants]
     * 1. Used to store fixed values that do not change
     * 2. If you assign a value after initialization, it causes a compile error to prevent the value from being modified
     * (e.g.)numerical values used in mathematical formulas
     * <p>
     * [How to use constants]
     * 1. Declare a constant
     * 2. Initialize the constant
     * 3. Use the constant
     * @param args The arguments of the program
     */
    public static void main(String[] args) {
        // Declare a constant
        final int AGE;  // final: a keyword to declare a constant
                        // Casing: UPPERCASE

        // Initialize the constant
        AGE = 20;   // The value of the constant must be assigned after initialization
                    // It causes a compile error to prevent the value from being modified

        // AGE = 10; // error: cannot assign a value to final variable AGE

        // Use the constant
        System.out.println("AGE = " + AGE);         // AGE: 20
        System.out.println("AGE = " + (AGE * 20));  // AGE: 400

        // Can use the constant right-side of the assignment operator(=)
        int sum = AGE;  // sum: 20
        System.out.println("sum = " + sum);
    }
}
