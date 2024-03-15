package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    /**
     * The next() methods of the scanner read the input from the buffer in token units.
     * A token is a part of a string that is separated by spaces, tabs, and enters.
     * Therefore, you should be careful about the following two cases.
     * <p>
     * 1. After entering a string with next(), enter an integer, real number, or boolean value.
     * <p>
     * 2. Conversely, after entering an integer, real number, or boolean value, enter a string with next().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Common case
        System.out.print("Enter a string: ");
        String str1 = sc.next();
        System.out.println("str1 = " + str1);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);

        // Solution 1: Change nextline();
        // sc.next() -> sc.nextLine();

        // Solution 2: Use nextLine() to clear the buffer
        String str = sc.next();
        sc.nextInt();

        // after entering an integer, real number, or boolean value, enter a string with next()
        System.out.print("Enter a number again: ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

        sc.nextLine(); // Clear the buffer(flush the buffer)

        System.out.println("Enter a string containing a space: ");
        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);
    }
}
