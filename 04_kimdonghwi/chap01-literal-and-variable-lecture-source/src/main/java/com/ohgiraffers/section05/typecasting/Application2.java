package com.ohgiraffers.section05.typecasting;

public class Application2 {

    /**
     * Forced type conversion rule
     * Convert to the desired data type using the cast operator
     * (data type) variable or value
     * might be overflowed or underflowed => loss of data
     * <p>
     * Forced type conversion rule
     * 1. Forced type conversion is required when converting from a large data type to a small data type
     * 2. Forced type conversion is required when converting a real number to an integer
     * 3. Forced type conversion is required when storing a character in a variable of less than int size
     * 4. Boolean is excluded from the forced type conversion rule
     *
     * @param args The arguments of the program
     */
    public static void main(String[] args) {
        long lnum = 8;
        int inum = (int) lnum;       // forced type conversion(long -> int)
        short snum = (short) inum;   // forced type conversion(int -> short)

        double dnum = 8.;
        float fnum = (float) dnum;   // forced type conversion(double -> float)
        System.out.println("fnum = " + fnum);  // fnum = 8.0

        // double -> integer : need to cast
        float fnum2 = 4.f;
        long lnum2 = (long) fnum2;  // forced type conversion(float -> long)
        // possibility of loss of data below the decimal point

        char ch = 'a';
        byte bnum2 = (byte) ch;     // forced type conversion(char -> int)
        short snum2 = (short) ch;   // forced type conversion(char -> short)
                                    // Why do you need to force type conversion when they are the same 2 bytes?
                                    // Because the range of values is different due to the sign bit

        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1; // forced type conversion(int -> char)
        char ch3 = (char) num2; // forced type conversion(int -> char)
                                // Can assign a negative number to a char type variable by forced type conversion

        // boolean is excluded from the forced type conversion rule
        boolean isTrue = true;
        // byte b = (byte) isTrue;      // error: incompatible types: boolean cannot be converted to byte
        // short s = (short) isTrue;    // error: incompatible types: boolean cannot be converted to short
        // int i = (int) isTrue;        // error: incompatible types: boolean cannot be converted to int
        // long l = (long) isTrue;      // error: incompatible types: boolean cannot be converted to long
        // char ch4 = (char) isTrue;    // error: incompatible types: boolean cannot be converted to char
        // float f = (float) isTrue;    // error: incompatible types: boolean cannot be converted to float
        // double d = (double) isTrue;  // error: incompatible types: boolean cannot be converted to double
    }
}