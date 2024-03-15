package com.ohgiraffers.section01.method;

public class Application3 {
    /**
     * Understanding method arguments and parameters
     * <p>
     * Method call using arguments and parameters
     * <p>
     * Types of variables in Java:
     * - Local variables : can use only within the method. This called 'scope of the local variables'.
     *  If there is a value that needs to be shared between methods, it can be passed as a parameter when called.
     *  The value passed at this time is called an argument, and the variable declared inside the parentheses of the method declaration to receive the argument is called a parameter.
     * <p>
     * - Method parameters
     * - Global variables(Field/Instance variables)
     * - Static variables(Class variables)
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // (int age) in declaration of 'testMethod(...)': parameter
        // 20 : argument
        new Application3().testMethod(20);
        // In Java, parameter in method like 'int age' is considered as a local variable.

        // new Application3().testMethod("20"); // Error
        // must be matched with the type of the parameter

        // new Application3().testMethod(20, 30); // Error
        // must be matched with the number and configuration(like type) of the parameter

        // new Application3().testMethod(); // Error
        // must be matched with the number and configuration(like type) of the parameter

        int age = 20;
        new Application3().testMethod(age); // Can pass a variable as an argument

        byte age2 = 20;
        new Application3().testMethod(age2); // automatic type conversion

        long age3 = 20;
        new Application3().testMethod((int)age3); // explicit type conversion
    }

    public void testMethod(int age) {
        System.out.println("Age: " + age);
    }
}
