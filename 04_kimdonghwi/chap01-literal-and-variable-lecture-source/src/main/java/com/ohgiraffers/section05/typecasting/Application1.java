package com.ohgiraffers.section05.typecasting;

public class Application1 {
    /**
     * Data type conversion
     * <p>
     * Why need to convert data types?
     * - In Java, operations between different types can be performed only when the operands are of the same type
     * - In other words, operations can only be performed between the same data types
     * <p>
     * <p>[Types of type conversion and rules]</p>
     * 1. Automatic type conversion (implicit): Automatically performed by the compiler
     * - Automatically cast from a small data type to a large data type
     * - Integers are automatically converted to real numbers
     * - Characters are automatically converted to int
     * - Boolean is excluded from the type conversion rule
     * 2. Forced type conversion (explicit): Forced casting using the type conversion operator (cast)
     * - Explicit type conversion is required when automatic type conversion is not supported
     * @param args The arguments of the program
     */
    public static void main(String[] args) {
        // Automatic type conversion
        byte bnum = 1;
        short snum = bnum;  // automatic type conversion
        int inum = snum;    // automatic type conversion
        long lnum = inum;   // automatic type conversion

        int num1 = 10;
        long num2 = 20;

        int result1 = num1 + (int)num2; // forced type conversion(long -> int) | might be overflowed
        long result2 = num1 + num2;     // automatic type conversion(int -> long)
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        float fnum = 4.f;
        double dnum = fnum;  // automatic type conversion

        float result3 = fnum + (float)dnum; // forced type conversion(double -> float)
        double result4 = fnum + dnum;       // automatic type conversion(float -> double)
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

        // long overflowed = 888888888888;  // The long type conversion is performed normally
                                            // However, the passed literal (constant) is recognized as an int, causing an overflow, and a compile error occurs

        float eight = 8;
        float four = eight;     // automatic type conversion(int -> float)
        System.out.println("four = " + four);

        float result5 = eight + four;  // automatic type conversion(int -> float)
        System.out.println("result5 = " + result5);

        char ch1 = 'a';
        int chNum = ch1;  // automatic type conversion
        System.out.println("chNum = " + chNum);

        char ch2 = 65;  // Use the ASCII code to store a single
        System.out.println("ch2 = " + ch2); // ch2 = A

        // Any data type cannot store a boolean by type conversion.
        boolean isTrue = true;
        // byte b = isTrue;     // error: incompatible types: boolean cannot be converted to byte
        // short s = isTrue;    // error: incompatible types: boolean cannot be converted to short
        // int i = isTrue;      // error: incompatible types: boolean cannot be converted to int
        // long l = isTrue;     // error: incompatible types: boolean cannot be converted to long
        // float, double, char, String, etc. also cannot store a boolean by type conversion
    }
}
