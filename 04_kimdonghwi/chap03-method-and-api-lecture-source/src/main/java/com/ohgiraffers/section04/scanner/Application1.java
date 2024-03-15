package com.ohgiraffers.section04.scanner;

import java.util.*;

public class Application1 {
    /**
     * Get user input using Scanner and print it out to the console
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new Scanner object
        // java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        Scanner sc = new Scanner(System.in);

        // When you want to get the class from a different package, you have to import it

        // Get user input using Scanner

        // 1. String
        // String input = sc.nextLine();
        // sc.nextLine() : returns the input as a String

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);

        // 2. Integer
        // int input = sc.nextInt();
        // sc.nextInt() : returns the input as an int

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        // In this case, If you enter a value not of type int, it will throw an InputMismatchException

        // 3. Long
        // long input = sc.nextLong();
        // sc.nextLong() : returns the input as a long
        // It is the same as causing an exception as the case of int
        System.out.print("Enter the money: ");
        long money = sc.nextLong();
        System.out.println("The money is " + money);

        // 4. Float
        // float input = sc.nextFloat();
        // sc.nextFloat() : returns the input as a float

        System.out.print("Enter your height: ");
        float height = sc.nextFloat();
        System.out.println("Your height is " + height + "cm");

        // 5. Double
        // double input = sc.nextDouble();
        // sc.nextDouble() : returns the input as a double

        System.out.print("Enter the real number what you want: ");
        double realNumber = sc.nextDouble();
        System.out.println("The real number you entered is " + realNumber);

        // 6. Boolean
        // boolean input = sc.nextBoolean();
        // sc.nextBoolean() : returns the input as a boolean

        System.out.print("true or false?: ");
        boolean isTrue = sc.nextBoolean(); // e.g: true
        System.out.println("The boolean statement you entered is " + isTrue);

        // 7. Character: Getting a single character directly is not supported by Scanner
        // use the method 'charAt(int index)' java.lang.String
        // index is int type and starts from 0 to length - 1, and returns the character at the specified index in the string
        // If you pass a value that is not in the range of the index, it will throw an IndexOutOfBoundsException
        // char input = sc.next().charAt(0);
        // sc.next().charAt(0) : returns the input as a char

        sc.nextLine(); // Consume the newline ch
        System.out.println("Enter a ch what you want: ");
        char ch = sc.next().charAt(0);
        System.out.println("The character you entered is " + ch);

        // Close the Scanner
        sc.close();
    }
}
