package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        int first = 100;
        int second = 50;

        // non-static method(instance method) can be called only by creating an object of the class
        // The way to use is the same even if the class is different.
        Calculator calc = new Calculator();   // create an object of the class
        int min = calc.minNumberOf(first, second);  // Ctrl + Alt + v : Extract variable which is the result of the method
        System.out.println("Min: " + min);
        // calc.maxNumberOf(first, second);         // it is possible, but it is not recommended to call a static method with an object
                                                    // it might be confusing to other developers, and conflicts with the purpose of static method
                                                    // When a static method is loaded into memory, it is shared by multiple objects. When accessing it through an instance, it can cause unexpected behavior in the shared value with the value of the instance
                                                    // As the system becomes more complex, tracking the state of the object becomes more difficult, so it can be difficult to maintain. Therefore, it is better to access the static method through the class name

        // static method can be called without creating an object of the class
        // When calling a static method in another class, call it with the CLASS_NAME.METHOD_NAME
        int max = Calculator.maxNumberOf(first, second);
        // int max = maxNumberOf(first, second);    // error: cannot find symbol
        System.out.println("Max: " + max);
    }
}
