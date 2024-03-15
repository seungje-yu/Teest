package com.ohgiraffers.section05.logical;

public class Application2 {
    /**
     * Priority and usage of logical operators
     * Priority of logical and operator and or operator
     * - '&&': 11
     * - '||': 12
     * The priority of the logical and operator is higher than that of the logical or operator.
     * <p>
     * 1 <= num <= 100 : is not supported in Java
     * so you can use 1 <= num && num <= 100
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        int num1 = 55;
        System.out.println("check the number is between 1 and 100: " + (1 <= num1 && num1 <= 100)); // true

        // another case
        int num2 = 155;
        System.out.println("check the number is between 1 and 100: " + (1 <= num2 && num2 <= 100)); // false

        // Is the character uppercase?
        char ch1 = 'G';
        System.out.println("Is the character [" + ch1 + "] uppercase? " + ('A' <= ch1 && ch1 <= 'Z'));    // true
        // System.out.println("Is the character [" + ch1 + "] uppercase? " + Character.isUpperCase(ch1));

        // another case
        char ch2 = 'g';
        System.out.println("Is the character [" + ch2 + "] uppercase? " + ('A' <= ch2 && ch2 <= 'Z'));    // false
        // System.out.println("Is the character [" + ch2 + "] uppercase? " + Character.isUpperCase(ch2));

        // ignore case
        char ch3 = 'Y';
        System.out.println("Check the character is 'Y': " + ('y' == ch3 || 'Y' == ch3));    // true
        // System.out.println("Check the character is 'Y': " + ('y' == Character.toLowerCase(ch3)));    // true

        // is the alphabet?
        char ch5 = 'f';
        System.out.println("Is the character [" + ch5 + "] alphabet? " + ('a' <= ch5 && ch5 <= 'z' || 'A' <= ch5 && ch5 <= 'Z'));    // true
        // System.out.println("Is the character [" + ch5 + "] alphabet? " + Character.isAlphabetic(ch5));   // true

        // another case
        char ch6 = 'F';
        System.out.println("Is the character [" + ch6 + "] alphabet? " + ('a' <= ch6 && ch6 <= 'z' || 'A' <= ch6 && ch6 <= 'Z'));    // true
        // System.out.println("Is the character [" + ch6 + "] alphabet? " + Character.isAlphabetic(ch6));   // true
    }
}