package com.ohgiraffers.section02.variable;

public class Application1 {
    /**
     * Purpose of using variables
     * 1. Set a value to a variable => It makes easier to read and understand the code and good to co-work with other developers.
     * 2. The purpose of reusing the value that has been stored once => It makes easier to change the value and maintain the code.
     * 3. Can store and use values that change over time => A space to store changing values
     * @param args The arguments of the program
     */
    public static void main(String[] args) {
        // Give meaning to the value
        System.out.println("Salary including bonus : " + (10000000 + 200000) + " KRW");
        // ** It is difficult to know the meaning of the value 10000000 and 200000. **

        // Define a variable and give meaning to the value
        int salary = 10000000;  // salary: name of the variable, 10000000: value of the variable
        int bonus = 200000;     // bonus: name of the variable, 200000: value of the variable
        System.out.println("Salary including bonus : " + (salary + bonus) + " KRW");

        // Reuse the value that has been stored once
        // Example Scenario: Write logic to give 100 points to 10 customers
        System.out.println("Give 100 points to customer 1");
        System.out.println("Give 100 points to customer 2");
        System.out.println("Give 100 points to customer 3");
        System.out.println("Give 100 points to customer 4");
        System.out.println("Give 100 points to customer 5");
        System.out.println("Give 100 points to customer 6");
        System.out.println("Give 100 points to customer 7");
        System.out.println("Give 100 points to customer 8");
        System.out.println("Give 100 points to customer 9");
        System.out.println("Give 100 points to customer 10");

        int point = 100;
        System.out.println();   // Print a blank line
        System.out.println("Give [" + point + "] point(s) to customer 1");
        System.out.println("Give [" + point + "] point(s) to customer 2");
        System.out.println("Give [" + point + "] point(s) to customer 3");
        System.out.println("Give [" + point + "] point(s) to customer 4");
        System.out.println("Give [" + point + "] point(s) to customer 5");
        System.out.println("Give [" + point + "] point(s) to customer 6");
        System.out.println("Give [" + point + "] point(s) to customer 7");
        System.out.println("Give [" + point + "] point(s) to customer 8");
        System.out.println("Give [" + point + "] point(s) to customer 9");
        System.out.println("Give [" + point + "] point(s) to customer 10");

        // Change the value stored in the variable
        // ** Variables are more reasonable to see as a space to store changing values rather than a space to store one value **
        int sum = 0;

        // Modify the value stored in the variable
        // Store the value on the right in the variable on the left.
        sum = sum + 10; // sum: 10 | overwrite the value of sum with 10
        // sum = 30;    // sum: 30 | overwrite the value of sum with 30
        System.out.println("sum = " + sum); // sum: 10 | `soutv` is a shortcut to print the value of the variable

        sum = sum + 10; // sum: 40 | overwrite the value of sum with 20
        System.out.println("sum = " + sum); // sum: 20
    }
}