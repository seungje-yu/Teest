package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        Application7 app7 = new Application7();

        int first = 20;
        int second = 10;

        int sum = app7.plusTwoNumbers(first, second);
        int difference = app7.minusTwoNumbers(first, second);
        int product = app7.multiplyTwoNumbers(first, second);
        int quotient = app7.divideTwoNumbers(first, second);

        System.out.println("Sum: " + sum);                  // 30
        System.out.println("Difference: " + difference);    // 10
        System.out.println("Product: " + product);          // 200
        System.out.println("Quotient: " + quotient);        // 2
    }

    /**
     * Add two numbers and return the result
     * @param first one of the numbers to add
     * @param second the other number to add
     * @return the sum of the two numbers
     */
    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }

    /**
     * Subtract two numbers and return the result
     * @param first the number to subtract from
     * @param second the number to subtract
     * @return the difference of the two numbers
     */
    public int minusTwoNumbers(int first, int second) {
        return first - second;
    }

    /**
     * Multiply two numbers and return the result
     * @param first one of the numbers to multiply
     * @param second the other number to multiply
     * @return the product of the two numbers
     */
    public int multiplyTwoNumbers(int first, int second) {
        return first * second;
    }

    /**
     * Divide two numbers and return the result
     * @param first the number to divide
     * @param second the number to divide by
     * @return the quotient of the two numbers
     */
    public int divideTwoNumbers(int first, int second) {
        return first / second;
    }
}
