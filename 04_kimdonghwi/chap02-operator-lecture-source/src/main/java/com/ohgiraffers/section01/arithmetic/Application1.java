package com.ohgiraffers.section01.arithmetic;

public class Application1 {
    /**
     * Arithmetic Operators
     * The arithmetic operator is the most basic and widely used operator, mainly related to arithmetic operations
     * It is classified as a binary operator that requires two values or variables to perform the operation, and the direction of the operands is from left to right
     * <p>
     * - '+' : Adds the right operand to the left operand
     * - '-' : Subtract the right operand from the left operand
     * - '*' : Multiply the right operand by the left operand
     * - '/' : Divide the left operand by the right operand
     * - '%' : Returns the remainder of dividing the left operand by the right operand
     * <p>
     * The priority of arithmetic operators
     * Similar to the concept of mathematics, multiplication and division operations are performed before addition and subtraction operations
     * If the priority is the same, the order of execution is determined by the direction of the operation
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2)); // 20 + 7 = 27
        System.out.println("num1 - num2 = " + (num1 - num2)); // 20 - 7 = 13
        System.out.println("num1 * num2 = " + (num1 * num2)); // 20 * 7 = 140
        System.out.println("num1 / num2 = " + (num1 / num2)); // 20 / 7 = 2
        System.out.println("num1 % num2 = " + (num1 % num2)); // 20 % 7 = 6
    }
}