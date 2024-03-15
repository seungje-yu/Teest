package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        int num = 20;
        System.out.println("num = " + num);

        num++;
        System.out.println("num = " + num);

        ++num;
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);

        int firstNum = 20;
        int result1 = firstNum++ * 3;   // 20(21) * 3
        System.out.println("firstNum = " + firstNum);   //21
        System.out.println("result1 = " + result1);     //60

        int secondNum = 20;
        int result2 = ++secondNum * 3;  // 21(21) * 3
        System.out.println("secondNum = " + secondNum); //21
        System.out.println("result1 = " + result1);     //63

        int num1 = 10;
        int addNum = num1++;

        System.out.println("addNum = " + addNum);
        System.out.println("num1 = " + num1);
    }
}
