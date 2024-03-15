package com.ohgiraffers.section02.looping;

import java.util.Scanner;

/**
 * While statement<br>
 * <blockquote><pre>{@code
 * initialization;
 * while(condition) {
 *     code
 *     iteration;
 * }
 * }</pre></blockquote>
 *
 * <p>Practice the following:<br>
 * 1. When there is no increment <br>
 * 2. When the condition is true <br>
 * 3. When there is no initialization, condition, or increment <br>
 * 4. Predict the execution value after changing the initialization, condition, and increment <br>
 * 5. Run the loop in reverse order
 */
public class B_while {
    public void testSimpleWhileStatement() {
        int i = 1;
        int sum = 0;
        while(i <= 10) {
            System.out.println(i);
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }

    /**
     * Try printing one character at a time using the index of the entered string
     *
     * <p>{@code .charAt()} method returns the character at the specified index in a string
     * <p>{@code .length()} method returns the length of a string
     * <p>Index starts at 0, and the last index is always {@code length - 1}
     */
    public void testWhileExample1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // using for statement
//        for(int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            System.out.println(i + " : " + ch);
//        }

        // using while statement
        int index = 0;
        while(index < str.length()) {
            char ch = str.charAt(index);
            System.out.println(index + " : " + ch);
            index++;
        }
    }

    /**
     * {@link #testWhileExample2 (Nested while statement)}
     * <p>Print the multiplication table using a nested while statement
     */
    public void testWhileExample2() {
        int dan = 2;
        while(dan < 10) {
            int su = 1;
            while(su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                su++;
            }
            dan++;
        }
    }
}