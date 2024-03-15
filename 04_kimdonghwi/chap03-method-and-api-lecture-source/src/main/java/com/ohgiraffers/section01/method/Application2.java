package com.ohgiraffers.section01.method;

public class Application2 {
    /**
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("started 'main()' - Entry Point..");

        Application2 app2 = new Application2(); // create an instance of the class
        app2.methodA();
        app2.methodB();
        app2.methodC();

        // switch order
        // app2.methodC();
        // app2.methodB();
        // app2.methodA();

        System.out.println("ended 'main()' - Exit Point..");
    }

    public void methodA() {
        System.out.println("started 'methodA()' - Custom Method..");
        System.out.println("ended 'methodA()' - Custom Method..");
        // ret
    }

    public void methodB() {
        System.out.println("started 'methodB()' - Custom Method..");
        System.out.println("ended 'methodB()' - Custom Method..");
        // ret
    }

    public void methodC() {
        System.out.println("started 'methodC()' - Custom Method..");
        System.out.println("ended 'methodC()' - Custom Method..");
        // ret
    }
}
