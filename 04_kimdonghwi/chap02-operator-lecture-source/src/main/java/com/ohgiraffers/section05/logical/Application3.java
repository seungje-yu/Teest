package com.ohgiraffers.section05.logical;

public class Application3 {
    /**
     * Characteristics of AND and OR operations
     * (logical expression && logical expression): If the result of the prefix is false, the latter logical expression is not calculated.
     * (logical expression || logical expression): If the result of the prefix is true, the latter logical expression is not calculated.
     * <p>
     * Both conditions must be satisfied to return true, but if false is returned in advance, the judgment of the latter condition is unnecessary, so false is returned.
     * Therefore, to reduce the number of operations, it is better to place the condition that returns false first in the case of the && operation.
     * Similarly, in the case of the || operation, it is better to place the condition that returns true first.
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        int num1 = 10;

        // Ternary operator
        // (logical expression) ? true : false
        int result1 = (false && ++num1 > 0) ? num1 : num1;

        System.out.println("result1: " + result1);    // 10
        // The result1 is 10 because the first condition is false, so the second condition is not calculated.
        // So the value of num1 printed is 10, not 11.

        int num2 = 10;
        int result2 = (true || ++num2 > 0) ? num2 : num2;
        System.out.println("result2 = " + result2);   // 10
        // The result2 is 10 because the first condition is true, so the second condition is not calculated.
        // So the value of num2 printed is 10, not 11.
    }
}
