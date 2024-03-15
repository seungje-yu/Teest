package com.ohgiraffers.section01.method;

public class Application1 {
    /**
     * Method
     * A method is a collection of statements that perform a specific task.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("started 'main()' - Entry Point..");

        // How to call a method
        // new ClassName().methodName(); - create an instance of the class and call the method
        // '.': dot operator is called 'reference operator'
        new Application1().methodA();

        // Application1 app1 = new Application1();
        // app1.methodA();

        System.out.println("ended 'main()' - Exit Point..");
    }

    /**
     * Recommend debug the code using 'Step Over' and 'Step Into' in the IDE.
     * Debug: Ctrl + F9
     * Step Over: F8
     * Step Into: F7
     * Step Out: Shift + F8
     * <p>
     * Must set a breakpoint at the first line of the method.
     */

    public void methodA() {
        System.out.println("started 'methodA()' - Custom Method..");
        methodB();
        System.out.println("ended 'methodA()' - Custom Method..");
    }

    public void methodB() {
        System.out.println("started 'methodB()' - Custom Method..");
        methodC();
        System.out.println("ended 'methodB()' - Custom Method..");
    }

    public void methodC() {
        System.out.println("started 'methodC()' - Custom Method..");
        // TODO. Implement Something..
        System.out.println("ended 'methodC()' - Custom Method..");
    }
}