package com.ohgiraffers.section03.branching;

/**
 * The {@code break;} statement is typically used inside a loop. <br>
 * It is used to exit the loop, regardless of the condition of the loop. <br>
 * It is typically used with {@code if(condition) { break; }}. <br>
 * The {@code switch} statement is not a loop, but it can be used.
 */
public class A_break {
    public void testSimpleBreakStatement1() {
        int sum = 0;
        int i = 1;
        while(true) {
            if(i > 100) break;

            sum += i;
            i++;
        }

        System.out.println("sum of 1 to 100: " + sum);
    }

    /**
     * Write a program that prints the multiplication table of 2 to 9.
     * However, if the unit number is greater than 5, the output is omitted.
     */
    public void testSimpleBreakStatement2() {
        // refactored
        for(int dan = 2; dan <= 9; dan++) {
            for(int su = 1; su < 10; su++) {
                if(su > 5) break;
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    /**
     * Force the loop to exit using a label
     */
    public void testJumpBreak() {
    label:
        for(;;) {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
                if(i == 3) break label;
            }
        }
    }
}
