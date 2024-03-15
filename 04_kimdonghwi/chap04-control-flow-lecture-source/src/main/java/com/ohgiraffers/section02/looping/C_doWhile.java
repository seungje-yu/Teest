package com.ohgiraffers.section02.looping;

import java.util.Scanner;

/**
 * Do-While statement
 * <blockquote><pre>{@code
 * initialization;
 * do {
 *    code(at the first time the condition is not checked);
 *    iteration;
 * } while(condition);
 * }</pre></blockquote>
 */
public class C_doWhile {
    /**
     *
     */
    public void testSimpleDoWhileStatement() {
        do {
            System.out.println("Executed for the first time");
        } while(false);
        System.out.println("Check the end of the loop");
    }

    /**
     * {@link #testDoWhileExample1() (Example1)}
     *
     * <p>Enter a string from the keyboard and print it repeatedly<br>
     * However, if "exit" is entered, the loop is terminated <br>
     * <br>
     * {@code .equals("string to compare")} : Since string comparison is not possible with {@code ==}, use the {@code equals()} method for string comparison
     */
    public void testDoWhileExample1() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.print("Enter a string: ");
            str = sc.nextLine();
            System.out.println("You entered: " + str);
        } while(!str.equals("exit"));

        System.out.println("The loop is terminated");
    }
}
