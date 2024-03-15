package com.ohgiraffers.section01.array;

public class Application1 {
    /**
     * What is an array?
     * <p>An array is a collection of items stored at contiguous memory locations.
     * The idea is to store multiple items of the same type together.
     *
     * The reason of using arrays:
     * <p>1. You can't manage them in continuous memory space, so you have to manage each variable name differently.
     * 2. When using a loop to process variables, you have to process each variable name one by one.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = ");

        // declare an array and assign values
        int[] arr = new int[5];

        // Continuous memory space managed as one variable name
        // Use Index which is a number to manage each variable name in the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Use a loop to process variables
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10;
        }

        for(int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
        }
    }
}
