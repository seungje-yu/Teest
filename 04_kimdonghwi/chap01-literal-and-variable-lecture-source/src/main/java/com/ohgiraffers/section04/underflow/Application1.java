package com.ohgiraffers.section04.underflow;

public class Application1 {
    /**
     * If the value of the variable is less than the range of the data type, it causes an underflow
     * The value of the variable is reset to the maximum value of the data type
     * @param args The arguments of the program
     */
    public static void main(String[] args) {
        byte num1 = -128;
        System.out.println("num1 = " + num1);   // num1 = -128

        num1--;
        System.out.println("num1(underflowed) = " + num1);   // num1(underflowed) = 127



    }
}
