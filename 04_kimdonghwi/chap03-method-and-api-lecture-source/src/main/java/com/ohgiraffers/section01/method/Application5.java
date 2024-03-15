package com.ohgiraffers.section01.method;

public class Application5 {
    /**
     * [Return]
     * Every method has a return inside.
     * If the return type is void, the return can be omitted. -> The compiler automatically adds it.
     * return forces the method to end and return to the place where the method was called, returning a value if necessary.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("started 'main()' - Entry Point..");

        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("ended 'main()' - Exit Point..");
    }

    public void testMethod() {
        System.out.println("check 'testMethod` working..");
        return;
        // System.out.println("this line will not be executed"); // error: unreachable statement
    }
}
