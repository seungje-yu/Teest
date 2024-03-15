package com.ohgiraffers.section04.overflow;

public class Application1 {
    /**
     * If the value of the variable exceeds the range of the data type, it causes an overflow
     * The value of the variable is reset to the minimum value of the data type
     * => discard the carry and invert the sign bit
     *
     * @param args
     */
    public static void main(String[] args) {
        // byte num1 = 128;     // 128: 10000000
        // 128: 01111111 + 1 => 10000000
        // 10000000: -128
        // byte num1 = 127 + 1;

        byte num1 = 127;    // max value of byte data type
        System.out.println("num1 = " + num1);               // num1 = 127

        num1++;            // num1: 127 + 1 => 128(overflowed)
        System.out.println("num1(overflowed) = " + num1);   // num1(overflowed) = -128

        int firstNum = 1000000;
        int secondNum = 700000;

        int multiply = firstNum * secondNum;    // expected: 700000000
        // actual: -79669248
        System.out.println("multiply = " + multiply);   // multiply = -79669248
        // underflowed

        // Solution: Use a larger data type
        // Predict overflow and receive the result in a larger data type for processing
        // long longMulti = firstNum * secondNum;       // error: incompatible types - possible lossy conversion from long to int
        long longMulti = (long) firstNum * secondNum;   // need to cast(force casting) => cast firstNum to long and then multiply by secondNum
        System.out.println("longMulti = " + longMulti); // longMulti = 700000000
    }
}
