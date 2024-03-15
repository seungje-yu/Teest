package com.ohgiraffers.section03.math;

import com.ohgiraffers.section01.method.Application2;

public class Application1 {
    /**
     * [What is API?]
     * API(Application Programming Interface) is an interface that allows an operating system or programming language to provide functions that can be controlled for use in applications.
     * It refers to modules (classes or interfaces) provided by the JDK that can be used after installation, which are somewhat cumbersome to implement directly.
     * In other words, think of it as using the functionality of the source code written by others.
     * Since it is not possible to memorize all the code, a separate API document is provided.
     * <p>
     * using Math class :
     * -> Math class is a class that provides various mathematical functions and constants.
     * -> import java.lang.Math;
     * -> When only the function is provided without managing the state of the object, it is often used to efficiently use memory.
     * <p>
     * **Package that can be used without import**
     * -> java.lang
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("absolute value of -5 : " + Math.abs(-5));
        System.out.println("minimum value of 10 and 20 : " + Math.min(10, 20));
        System.out.println("maximum value of 20 and 30 : " + Math.max(20, 30));

        System.out.println("Pi : " + Math.PI);

        // Random double value between 0.0 and 1.0
        // Returns a random number between 0.0 and 1.0
        System.out.println("Random number : " + Math.random());
    }
}
