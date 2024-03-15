package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import java.sql.Date;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;  // static import
//import static com.ohgiraffers.section01.method.Calculator.*;          // static import all

public class Application2 {
    /**
     * When using a class that exists in a different package, you must use the full class name including the package.
     * However, it is somewhat cumbersome to include the package name every time you use a different class, so the import statement is a statement that allows you to use it without the package name.
     * The import statement is located between the package declaration and the class declaration
     * When you use the import statement, you can use only the class name without the package name.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50, 60);
        System.out.println("the smaller one is : " + min); // the smaller one is : 50

        int max1 = Calculator.maxNumberOf(50, 60);  // use the class name to call the static method
        System.out.println("max1 = " + max1);

        int max2 = maxNumberOf(50, 60);             // use the static import to call the static method
        System.out.println("max2 = " + max2);

        // Same class name, different package
        Date date = new Date(0);
        java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());
    }
}