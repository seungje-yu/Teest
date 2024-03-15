package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        // How to call a static method
        // ClassName.methodName();
        // if the method is in the same class, you can call it without the class name
        // e.g. sumTwoNumbers(20, 10);
        System.out.println("sum of 20 and 10: " + sumTwoNumbers(10, 20)); // 30
    }

    /**
     * Add two numbers and return the result(Static)
     * @param first one of the numbers to add
     * @param second the other number to add
     * @return the sum of the two numbers
     */
    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}
