package com.ohgiraffers.section02.package_and_import;


public class Application1 {
    /**
     * [Package]
     * A package is a unit that groups related classes, interfaces, etc. together.
     * Within the same package, you cannot create classes with the same name, but you can create classes with the same name if the packages are different.
     * This is because the class name originally contains the package name. e.g) com.ohgiraffers.section01.method.Calculator (this is the class name.)
     * The reason why we haven't used the package name with the class name so far is because we used it within the same package.
     * Therefore, when using a class that exists
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Non-static method
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        // the package path is too complicated, so we can use the import statement to simplify it.
        // like 'import com.ohgiraffers.section01.method.Calculator;'`
        int min = calc.minNumberOf(30, 20);
        System.out.println("the smaller one is : " + min);

        // Static method
        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(30, 20);
        // just like the instance method, you can use the import statement to simplify the static method.
        System.out.println("the greater one is : " + max);
    }
}