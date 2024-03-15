package com.ohgiraffers.section05.typecasting;

public class Application3 {
    /**
     * [Using automatic type conversion and forced type conversion to perform operations between different data types]
     * Operations between different data types are automatically converted to the larger data type for operation
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inum = 10;
        long lnum = 100;    // automatically converted to long

        // int isum = inum + lnum; // error: incompatible types: possible lossy conversion from long to int
        int isum = (int) (inum + lnum); // forced type conversion to int
                                        // first adds int to long, then converts to int
        int isum2 = inum + (int) lnum;  // forced type conversion to int
                                        // first converts long to int, then adds to int
        System.out.println("isum = " + isum);   // 110
        System.out.println("isum2 = " + isum2); // 110

        long lsum = inum + lnum;    // *automatically converted to long

        // Warning: The result of an operation less than int is an int
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;

        int result1 = byteNum1 + byteNum2;  // automatically converted to int
        int result2 = byteNum1 + shortNum1; // automatically converted to int
        int result3 = shortNum1 + byteNum1; // automatically converted to int
        int result4 = shortNum1 + shortNum2; // automatically converted to int
        // ** int type is the default type for operations

        System.out.println("result1 = " + result1); // 3
        System.out.println("result2 = " + result2); // 4
        System.out.println("result3 = " + result3); // 4
        System.out.println("result4 = " + result4); // 7
    }
}