package com.ohgiraffers.section02.assignment;

public class Application1 {
    /**
     * Assignment operator and arithmetic compound assignment operator
     * '='  : Assigns the right operand to the left operand
     * '+=' : Assigns the result of adding the right operand to the left operand to the left operand
     * '-=' : Assigns the result of subtracting the right operand from the left operand to the left operand
     * '*=' : Assigns the result of multiplying the right operand by the left operand to the left operand
     * '/=' : Assigns the result of dividing the left operand by the right operand to the left operand
     * '%=' : Assigns the remainder of dividing the left operand by the right operand to the left operand
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        int num = 12;
        System.out.println("num = " + num); // 12

        // num = num + 3
        num += 3;
        System.out.println("num = " + num); // 15

        // num = num + 3
        num += 3;
        System.out.println("num = " + num); // 18

        // num = num - 5
        num -= 5;
        System.out.println("num = " + num); // 13

        // num = num * 2
        num *= 2;
        System.out.println("num = " + num); // 26

        num /= 2;
        System.out.println("num = " + num); // 13


    }
}