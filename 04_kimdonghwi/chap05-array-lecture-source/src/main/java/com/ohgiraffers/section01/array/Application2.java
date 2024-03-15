package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {
    /**
     *
     * @param args the input arguments that are passed to the main method
     */
    public static void main(String[] args) {
        // Declare a space to store the address of the array to be created through declaration.
        int[] iarr;
        char carr[];

        // Can assign an array to a reference variable declared
        // The new operator creates an array in the heap area and returns the address of the array.
        // Store the address value generated through instance creation in a reference variable. -> It is called a reference data type.

        // iarr = new int[];    // Error: Array dimension missing
        iarr = new int[5];      // Create an array of 5 integers
        carr = new char[10];    // Create an array of 10 characters

        // Assign values to the array
        System.out.println("iarr = " + iarr);
        System.out.println("carr = " + carr);

        // Because the heap memory is managed by the address value, the address value is output.
        // The address value stored in the stack is used to find the array allocated in the heap and output the value.

        // hashCode() method returns the address value of the object has been created as a decimal number.
        // The hashCode() method is used to compare whether the objects are the same, and is overridden for the purpose of treating equivalent objects as the same object.
        System.out.println("iarr.hashCode() = " + iarr.hashCode());
        System.out.println("carr.hashCode() = " + carr.hashCode());

        // Same object: An object with the same value and address
        // Equivalent object: An object with the same value but a different address
        System.out.println("Length of iarr = " + iarr.length);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array to create: ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("hash code of darr = " + darr.hashCode());
        System.out.println("Length of darr = " + darr.length);

        darr = new double[30];

        System.out.println("hash code of darr after re-creation = " + darr.hashCode());
        System.out.println("Length of darr after re-creation = " + darr.length);

        // Arrays cannot be resized after creation.
        darr = null;
        // System.out.println("Length of darr after null = " + darr.length); // Error: NullPointerException
    }
}
