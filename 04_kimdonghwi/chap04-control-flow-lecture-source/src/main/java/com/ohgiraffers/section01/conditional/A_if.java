package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    /**
     * **Single if statement**<br>
     * if(condition) { code(if condition is true) }
     * <p>
     * Condition is a boolean expression that evaluates to true or false
     * <p>
     * if the condition is true, the code block is executed <br>
     * if the condition is false, the code block is skipped
     */
    public void testSimpleIfStatement() {
        // Write a program that takes an integer from user and prints 'The number you entered is even.' if the number is even, and does not print it if it is odd.
        // Regardless of the condition, print 'The program is ending.' at the end of the program.
        Scanner sc = new Scanner(System.in);

        // Prompt user for input(Scanner, nextInt)
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is even
        if (num % 2 == 0) System.out.println("The number you entered is even.");

        System.out.println("The program is ending.");
    }

    /**
     *
     */
    public void testNestedIfStatement() {
        // Write a program that takes an integer from user and checks if the number is positive and even.
        // If it is, print 'The number you entered is positive and even.'.
        // Regardless of the condition, print 'The program is ending.' at the end of the program.

        Scanner sc = new Scanner(System.in);

        // Prompt user for input(Scanner, nextInt)
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is positive
        if (num > 0) {
            // Check if the number is even
            if (num % 2 == 0) System.out.println("The number you entered is positive and even.");
        }

        // Print the ending message
        System.out.println("The program is ending.");
    }
}
