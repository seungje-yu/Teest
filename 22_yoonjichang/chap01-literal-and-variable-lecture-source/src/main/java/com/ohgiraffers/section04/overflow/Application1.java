package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        byte num1 = 127;
        System.out.println("num1= " + num1);
        num1++;

        System.out.println("num1 overflow =" + num1);

        byte num2 = -128;
        System.out.println("num2 =" + num2);
        num2--;

        System.out.println("num2 underflow =" + num2);
        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;
        System.out.println("firstNum * secondNum=" + multi);

        long longMulti = firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);

        long result =(long) firstNum * secondNum; //강제형변환
        System.out.println("result = " + result);





    }
}
