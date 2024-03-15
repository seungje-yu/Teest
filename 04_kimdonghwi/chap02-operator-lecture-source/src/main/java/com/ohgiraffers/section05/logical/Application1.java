package com.ohgiraffers.section05.logical;

public class Application1 {
    /**
     * Logical operators
     * Operators that handle logical values
     * <p>
     * [Types of logical operators]
     * 1. Logical connective operator: A binary operator with two operands, and the combination direction is from left to right. It determines the logical value by judging two logical expressions.
     * - '&&': Logical conjunction (AND), returns true only when both logical expressions are true.
     * - '||': Logical disjunction (OR), returns true if either of the two logical expressions is true.
     * 2. '!' Logical negation operator: A unary operator with one operand, and it reverses the logical value of the operand.
     * <p>
     * [Order of precedence]
     * 1. '!'
     * 2. '&&'
     * 3. '||'
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        // Logical operation with true and false
        System.out.println("Logical operation with true and false");

        System.out.println("&& operator");
        System.out.println("true && true: " + (true && true));      // true
        System.out.println("true && false: " + (true && false));    // false
        System.out.println("false && true: " + (false && true));    // false
        System.out.println("false && false: " + (false && false));  // false

        System.out.println("\n|| operator");
        System.out.println("true || true: " + (true || true));      // true
        System.out.println("true || false: " + (true || false));    // true
        System.out.println("false || true: " + (false || true));    // true
        System.out.println("false || false: " + (false || false));  // false

        System.out.println("\n! operator");
        System.out.println("!true: " + (!true));    // false
        System.out.println("!false: " + (!false));  // true

        System.out.println("\nAnother example");

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a is less than b and c is less than d: " + (a < b && c < d));       // true
        System.out.println("a is less than b and c is greater than d: " + (a < b && c > d));    // false
        System.out.println("a is greater than b and c is less than d: " + (a > b && c < d));    // false
        System.out.println("a is greater than b and c is greater than d: " + (a > b && c > d)); // false

        System.out.println("\na is less than b or c is less than d: " + (a < b || c < d));        // true
        System.out.println("a is less than b or c is greater than d: " + (a < b || c > d));     // true
        System.out.println("a is greater than b or c is less than d: " + (a > b || c < d));     // true
        System.out.println("a is greater than b or c is greater than d: " + (a > b || c > d));  // false
    }
}
