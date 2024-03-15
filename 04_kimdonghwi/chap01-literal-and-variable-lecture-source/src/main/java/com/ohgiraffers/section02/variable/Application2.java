package com.ohgiraffers.section02.variable;

public class Application2 {
    /**
     * How to use variables
     * 1. Prepare a space to store the value => Define a variable
     * 2. Store the value in the variable => Assign a value to a variable(or initialize a variable)
     * 3. Use the value stored in the variable => Use the value of the variable
     * <p>
     * Q. What is `Data Type`?
     * 1. A keyword that the compiler has agreed in advance to treat a certain size of value as one value according to the shape of various values
     * e.g.
     * The int data type used earlier is a promise to treat 4 bytes as one value
     * These data types are divided into primitive data types and reference data types
     */
    public static void main(String[] args) {
        // == Primitive data types ==
        // Integer
        byte bnum;      // 1 byte
        short snum;     // 2 bytes
        int inum;       // 4 bytes
        long lnum;      // 8 bytes

        // Double
        float fnum;     // 4 bytes
        double dnum;    // 8 bytes

        // Character
        char ch;        // 2 bytes

        // Boolean
        boolean isTrue; // 1 byte

        // == Reference data types ==
        // Reference data types are used to store the address of the object
        String str;    // 4 bytes

        // ... etc

        // Initialize the variable
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;      // The value of the long data type must be followed by 'L' or 'l'
                        // because just 8 is treated as an int data type by default
                        // 8(x) => 8L(o) or 8l(o)
                        // 8L: 8 bytes | 8: 4 bytes
                        // recommended to use 'L' because 'l' is similar to '1'

        fnum = 4.0f;    // The value of the float data type must be followed by 'F' or 'f'
                        // because just 4.0 is treated as a double data type by default
                        // 4.0(x) => 4.0F(o) or 4.0f(o)
                        // 4.0F: 4 bytes | 4.0: 8 bytes
                        // commonly use 'f'
        dnum = 8.0;

        ch = 'a'; // Use single quotes to store a single character
        ch = 97;  // Use the ASCII code to store a single character

        isTrue = true;  // true or false
        isTrue = false;

        str = "Hello!"; // Use double quotes to store a string

        // Declare and initialize the variable at the same time
        int point = 100;
        int bonus = 10;

        System.out.println("bnum = " + bnum);       // bnum = 1
        System.out.println("snum = " + snum);       // snum = 2
        System.out.println("inum = " + inum);       // inum = 4
        System.out.println("lnum = " + lnum);       // lnum = 8
        System.out.println("fnum = " + fnum);       // fnum = 4.0
        System.out.println("dnum = " + dnum);       // dnum = 8.0
        System.out.println("ch = " + ch);           // ch = a(97) => ASCII code cast to character
        System.out.println("isTrue = " + isTrue);   // isTrue = true
        System.out.println("str = " + str);         // str = Hello!

        System.out.println("Sum of point and bonus : " + (point + bonus) + " KRW"); // Sum of point and bonus : 110

        // Change the value stored in the variable
        point = point + 100;    // point: 200 | overwrite the value of point with 200
        System.out.println("point = " + point); // point = 200
    }
}
