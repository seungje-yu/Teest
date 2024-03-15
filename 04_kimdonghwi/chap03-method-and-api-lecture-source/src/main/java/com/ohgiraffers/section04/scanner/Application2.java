package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    /**
     * understanding the methods 'nextLine()' and 'next()'
     * - nextLine() : returns the input as a String until the user presses the Enter key(Contains the blank space)
     * - next() : returns the input as a String until the user presses the Enter key(Does not contain the blank space)
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. nextLine()
        System.out.print("Enter a greeting: ");
        String greeting1 = sc.nextLine();   // e.g. If using the nextLine() method, it prints the whole sentence
        System.out.println("greeting1 = " + greeting1);  // greeting1 = Hello, Nice to meet you

        // 2. next()
        System.out.print("Enter a greeting: ");
        String greeting2 = sc.next();   // e.g. If using the next() method, it prints only the first word before the blank space
        System.out.println("greeting2 = " + greeting2); // greeting2 = Hello,
        System.out.println("greeting3 = " + sc.next()); // greeting3 = Nice
    }
}