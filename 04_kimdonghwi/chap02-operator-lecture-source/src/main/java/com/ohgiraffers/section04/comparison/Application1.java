package com.ohgiraffers.section04.comparison;

public class Application1 {
    /**
     * Comparison operators
     * <p>
     * Operators that determine the relative size between operands and return true or false.
     * Operators that return true or false are often used in the condition of the ternary operator or the condition clause of the conditional statement.
     * <p>
     * '==': Equal to
     * '!=': Not equal to
     * '>': Greater than
     * '<': Less than
     * '>=': Greater than or equal to
     * '<=': Less than or equal to
     * <p>
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        // Comparing integers
        System.out.println("Comparing integers");

        int inum1 = 10;
        int inum2 = 20;

        System.out.println("inum1 == inum2: " + (inum1 == inum2));  // false
        System.out.println("inum1 != inum2: " + (inum1 != inum2));  // true
        System.out.println("inum1 > inum2: " + (inum1 > inum2));    // false
        System.out.println("inum1 >= inum2: " + (inum1 >= inum2));  // false
        System.out.println("inum1 < inum2: " + (inum1 < inum2));    // true
        System.out.println("inum1 <= inum2: " + (inum1 <= inum2));  // true

        // Comparing doubles
        System.out.println("\nComparing doubles");

        double dnum1 = 10.;
        double dnum2 = 20.;

        System.out.println("dnum1 == dnum2: " + (dnum1 == dnum2));      // false
        System.out.println("dnum1 != dnum2: " + (dnum1 != dnum2));      // true
        System.out.println("dnum1 > dnum2: " + (dnum1 > dnum2));        // false
        System.out.println("dnum1 >= dnum2: " + (dnum1 >= dnum2));      // false
        System.out.println("dnum1 < dnum2: " + (dnum1 < dnum2));        // true
        System.out.println("dnum1 <= dnum2: " + (dnum1 <= dnum2));      // true

        // Comparing characters
        System.out.println("\nComparing characters");

        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("ch1 == ch2: " + (ch1 == ch2));      // false
        System.out.println("ch1 != ch2: " + (ch1 != ch2));      // true
        System.out.println("ch1 > ch2: " + (ch1 > ch2));        // true
        System.out.println("ch1 >= ch2: " + (ch1 >= ch2));      // true
        System.out.println("ch1 < ch2: " + (ch1 < ch2));        // false
        System.out.println("ch1 <= ch2: " + (ch1 <= ch2));      // false

        // Comparing boolean
        System.out.println("\nComparing boolean");

        boolean bool1 = true;
        boolean bool2 = false;

        // Comparing boolean values with comparison operators is not allowed
        // Only allowed to use '==' and '!='
        System.out.println("bool1 == bool2: " + (bool1 == bool2));      // false
        System.out.println("bool1 != bool2: " + (bool1 != bool2));      // true
        // System.out.println("bool1 > bool2: " + (bool1 > bool2));     // Error
        // System.out.println("bool1 >= bool2: " + (bool1 >= bool2));   // Error
        // System.out.println("bool1 < bool2: " + (bool1 < bool2));     // Error
        // System.out.println("bool1 <= bool2: " + (bool1 <= bool2));   // Error

        // Comparing strings
        System.out.println("\nComparing strings");

        String str1 = "java";
        String str2 = "java";

        // Comparing strings with comparison operators is not allowed
        // Only allowed to use '==' and '!=' like boolean
        System.out.println("str1 == str2: " + (str1 == str2));      // true
        System.out.println("str1 != str2: " + (str1 != str2));      // false
        // System.out.println("str1 > str2: " + (str1 > str2));     // Error
        // System.out.println("str1 >= str2: " + (str1 >= str2));   // Error
        // System.out.println("str1 < str2: " + (str1 < str2));     // Error
        // System.out.println("str1 <= str2: " + (str1 <= str2));   // Error

        // Comparing integers and put the result in a boolean variable
        int x = 10;
        int y = 11;

        boolean result = x <= y;    // true
        System.out.println("result = " + result);
    }
}
