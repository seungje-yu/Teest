package com.ohgiraffers.section03.branching;

/**
 * continue statement
 * <p>The continue statement is used inside a loop and skips the rest of the loop and moves on to the next iteration.
 * The continue statement is typically used with {@code if(condition) { continue; }}.
 * It is often used to handle exceptions for specific conditions within a loop.
 */
public class B_continue {
    /**
     * Print the multiplication table of 2 to 9.
     * However, if the unit number is even, the output is omitted.
     */
    public void testSimpleContinueStatement() {
        for(int dan = 2; dan <= 9; dan++) {
            for(int su = 1; su < 10; su++) {
                if(su % 2 == 0) continue;
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    /**
     * Force the loop to continue using a label
     *
     * Result preview
     * <pre>
     * 2 * 1 = 2
     * 2 * 3 = 6
     * 2 * 5 = 10
     * 2 * 7 = 14
     * 2 * 9 = 18
     * </pre>
     */
    public void testJumpContinue() {
    label:
         for(int dan = 2; dan < 10; dan++) {
             for(int su = 1; su < 10; su++) {
                 if(su % 2 == 0) continue label;
                 System.out.println(dan + " * " + su + " = " + (dan * su));
             }
             System.out.println();
         }
    }
}