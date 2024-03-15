package com.ohgiraffers.section02.variable;

public class Application3 {
    /**
     * Naming rules for variables
     * <p>
     * There are rules to follow when naming variables
     * Naming rules for variables are very important in practice, so it is good to learn the rules and use them to create proper variable names
     * <p>
     * 1.   The name of the variable must start with a letter or an underscore(_)
     * 2.   The name of the variable can contain letters, numbers, and underscores(_)
     * 3.   The name of the variable is case-sensitive
     * 4.   The name of the variable cannot be a reserved word
     * 5.   The name of the variable should be meaningful
     * 6.   The name of the variable should be written in camelCase
     * 7.   The name of the variable should be written in English
     * 8.   The name of the variable should be written in a way that is easy to understand
     * 9.   The name of the variable should be written in a way that is easy to read
     * 10.  The name of the variable should be written in a way that is easy to maintain
     * 11.  The name of the variable should be written in a way that is easy to co-work with other developers
     * 12.  The name of the variable should be written in a way that is easy to search
     * 13.  The name of the variable should be written in a way that is easy to change
     * 14.  The name of the variable should be written in a way that is easy to use
     * 15.  The name of the variable should be written in a way that is easy to remember
     * 16.  The name of the variable should be written in a way that is easy to write
     * 17.  The name of the variable should be written in a way that is easy to pronounce
     * 18.  The name of the variable should be written in a way that is easy to understand the meaning of the value
     * 19.  The name of the variable should be written in a way that is easy to understand the purpose of the value
     * 20.  The name of the variable should be written in a way that is easy to understand the usage of the value
     * 21.  The name of the variable should be written in a way that is easy to understand the type of the value
     * 22.  The name of the variable should be written in a way that is easy to understand the scope of the value
     * 23.  The name of the variable should be written in a way that is easy to understand the lifetime of the value
     * @param args The arguments of the program
     */
    public static void main(String[] args) {
        int age = 20;       // declare and initialize at the same time
        // int age;         // error: duplicate variable declaration in the same scope

        // int true = 1;    // error: true is a reserved word
        // int for = 20;    // error: for is a reserved word

        int Age = 20;       // Age and age are different variables(case-sensitive)
        int True = 10;      // True and true are different variables(case-sensitive)
        // int 1age = 20;   // error: variable name cannot start with a number

        // Can use underscore(_) and dollar($) sign
        int _age = 20;      // _age: valid
        int age_ = 20;      // age_: valid
        int $harp = 20;     // $harp: valid

        int abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_ = 20; // valid

        // CamelCase: The first letter of the first word is lowercase and the first letter of the second and subsequent words is uppercase
        int maxAge = 20;
        int minAge = 10;

        String user_name;   // Not recommended
        String userName;

        // Bad examples
        String s;          // Not meaningful => (e.g.) String name, ...

        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        String goHome; // Not recommended | Use a noun as the name
        String home;   // Recommended
    }
}