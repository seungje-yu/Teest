package com.ohgiraffers.section06.tenary;

public class Application1 {
    /**
     * Ternary operator
     * The ternary operator is the only operator in Java that has three operands.
     * (conditional expression) ? true : false
     * <p>
     * The conditional expression must be an expression that is evaluated to true or false.
     * (Comparison and logical operators are mainly used)
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        // Ternary operator standalone
        int num1 = 10;
        int num2 = -10;

        String result1 = (num1 > 0) ? "positive" : "negative(not positive)";
        String result2 = (num2 > 0) ? "positive" : "negative(not positive)";

        System.out.println("is num1 positive? : " + result1);
        System.out.println("is num2 positive? : " + result2);

        // Ternary operator can be nested
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0) ? "positive" : (num3 == 0) ? "zero" : "negative";
        String result4 = (num4 > 0) ? "positive" : (num4 == 0) ? "zero" : "negative";
        String result5 = (num5 > 0) ? "positive" : (num5 == 0) ? "zero" : "negative";

        System.out.println("result3(num3) = " + result3);
        System.out.println("result4(num4) = " + result4);
        System.out.println("result5(num5) = " + result5);
    }
}