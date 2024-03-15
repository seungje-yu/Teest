package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {
        // Concatenation of strings
        System.out.println(9 + 9);      // 18 : add operation | just operation between integers :(
        System.out.println("9" + "9");  // 99 : add operation => concatenation of strings
        System.out.println(9 + "9");    // 99 : add operation => concatenation of strings
        System.out.println("9" + 9);    // 99 : add operation => concatenation of strings

        // Concatenation of 3 strings
        // ** The order of operations is from left to right. **
        System.out.println(9 + 9 + "9");    // 189 : add operation => concatenation of strings
        System.out.println(9 + "9" + 9);    // 999 : add operation => concatenation of strings
        System.out.println("" + 9 + 9);     // 99 : add operation => concatenation of strings

        // ** ( ) Parentheses can be used to change the order of operations. **
        System.out.println("9" + (9 + 9));  // 918 : add operation => concatenation of strings

        // arithmetic operations of 10 and 20 : These are integer operations
        System.out.println(10 + 20);    // 30 : add operation
        System.out.println(10 - 20);    // -10 : subtract operation
        System.out.println(10 * 20);    // 200 : multiply operation
        System.out.println(10 / 20);    // 0 : divide operation
        System.out.println(10 % 20);    // 10 : remainder operation

        // Format of the output
        System.out.println("Add operation of 10 and 20 : " + (10 + 20));        // Add operation of 10 and 20 : 30
        System.out.println("Subtract operation of 10 and 20 : " + (10 - 20));   // Subtract operation of 10 and 20 : -10
        System.out.println("Multiply operation of 10 and 20 : " + (10 * 20));   // Multiply operation of 10 and 20 : 200
        System.out.println("Divide operation of 10 and 20 : " + (10 / 20));     // Divide operation of 10 and 20 : 0
        System.out.println("Remainder operation of 10 and 20 : " + (10 % 20));  // Remainder operation of 10 and 20 : 10
    }
}
