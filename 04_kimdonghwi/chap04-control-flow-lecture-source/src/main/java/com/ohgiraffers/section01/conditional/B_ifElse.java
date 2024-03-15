package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

/**
 * **If-else statement**<br>
 * if(condition) {
 *     code(if condition is true)
 * } else {
 *     code(if condition is false)
 * }
 */
public class B_ifElse {
    /**
     * Write a program that takes an integer from user and prints 'The number you entered is odd.' <br>
     * Ff the number is odd, and 'The number you entered is even.' if it is even. <br>
     * Regardless of the condition, print 'The program is ending.' at the end of the program.
     */
    public void testSimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input(Scanner, nextInt)
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is even
        if (num % 2 == 0) System.out.println("The number you entered is even.");
        else System.out.println("The number you entered is odd.");

        // reversed condition
        // if (num % 2 != 0) System.out.println("The number you entered is odd.");
        // else System.out.println("The number you entered is even.");

        System.out.println("The program is ending.");
    }

    /**
     * Write a program that takes a number and prints 'The number you entered is positive.' if the number is positive. <br>
     * If the number is negative, print 'The number you entered is negative.'. <br>
     * If the number is 0, print 'The number you entered is 0.'. <br>
     * Regardless of the condition, print 'The program is ending.' at the end of the program.
     */
    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input(Scanner, nextInt)
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is positive
        if(num >= 0) {
            if(num != 0) System.out.println("The number you entered is positive.");
            else System.out.println("The number you entered is 0.");
        } else System.out.println("The number you entered is negative.");

        // another case
        if(num != 0) {
//            if(num > 0) System.out.println("The number you entered is positive.");
//            else System.out.println("The number you entered is negative.");
//        } else System.out.println("The number you entered is 0.");

            // refactored..
//        if (num > 0) System.out.println("The number you entered is positive.");
//        else if (num < 0) System.out.println("The number you entered is negative.");
//        else System.out.println("The number you entered is 0.");
        }
        System.out.println("The program is ending.");
    }
}