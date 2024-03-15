package com.ohgiraffers.section03.increment;

public class Application1 {
    /**
     * The increment/decrement operator
     * It can be used before/after the operand
     * '++': 1 increment
     * '--': 1 decrement
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        int num = 20;
        System.out.println("num = " + num); // 20

        num++;
        System.out.println("num = " + num); // 21

        ++num;
        System.out.println("num = " + num); // 22

        num--;
        System.out.println("num = " + num); // 21

        --num;
        System.out.println("num = " + num); // 20

        // Warning
        // Be careful as the result may vary depending on the order of the increment/decrement operator
        // '++var': Increment the value of var by 1 and then use the value
        // 'var++': Use the value of var and then increment the value by 1
        // '--var': Decrement the value of var by 1 and then use the value
        // 'var--': Use the value of var and then decrement the value by 1

        int firstNum = 20;
        int result1 = firstNum++ * 3;                   // 20 * 3 = 60
                                                        // firstNum is used and then incremented by 1

        System.out.println("result1 = " + result1);     // 60
        System.out.println("firstNum = " + firstNum);   // 21

        int secondNum = 20;
        int result2 = ++secondNum * 3;                  // 21 * 3 = 63
                                                        // secondNum is incremented by 1 and then used
        System.out.println("result2 = " + result2);     // 63
        System.out.println("secondNum = " + secondNum); // 21

        // ====
        int num1 = 10;
        int addNum = num1++;
        System.out.println(addNum); // 10
                                    // num1 is used and then incremented by 1
    }
}