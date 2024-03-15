package com.ohgiraffers.section01.method;

public class Application6 {
    /**
     * Test the return value of methods
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        // 'return' means to exit the method and return to the caller
        // when return is called, It can be used to return a value from the method if the method has a return type
        System.out.println("started 'main()' - Entry Point..");

        Application6 app6 = new Application6();
        String result = app6.testMethod(); // store the return value of the method in a variable
        System.out.println("result = " + result);

        System.out.println("ended 'main()' - Exit Point..");
    }

    /**
     * public : Access modifier
     * String : Return type
     * if the return type is void, the return can be omitted. -> The compiler automatically adds it
     * @return "Hello, World!"
     */
    public String testMethod() {
        return "Hello, World!";
    }
}