package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNine() {
        for(int dan = 2; dan <= 9; dan++) {
//            for(int su = 1; su < 10; su++) {
//                System.out.println(dan + " * " + su + " = " + (dan * su));
//            }
            printGugudanOf(dan);
            System.out.println();
        }
    }

    /**
     * Print the multiplication table of the given number
     * @param dan the number to print the multiplication table of
     */
    public void printGugudanOf(int dan) {
        for(int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    /**
     * Write a program that takes an integer from the keyboard and prints five *s in a row as many times as the integer.
     */
    public void printStarsInputRowTimes() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows to print: ");
        int input = sc.nextInt();

        for(int i = 0; i < input; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printStarts(int times) {
        for(int i = 0; i < times; i++) {
            System.out.print("*");
        }
    }

    /**
     * Write a program that takes an integer from the keyboard and prints *s in a row as many times as the integer.
     * <p>
     * [Example]
     * Enter the number of rows to print: 5
     * <p>
     * * <br>
     * ** <br>
     * *** <br>
     * **** <br>
     * *****
     */
    public void printTriangleStars() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows to print: ");
        int row = sc.nextInt();

        for(int i = 0; i < row; i++) {
//            printStarts(i + 1);
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
