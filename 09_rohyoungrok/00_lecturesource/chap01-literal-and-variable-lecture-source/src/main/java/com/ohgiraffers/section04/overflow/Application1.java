package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        byte num1 = 127;    //byte의 최대 저장 범위

        System.out.println("num1 = " + num1);
        num1++; // 후위증감연산자

        System.out.println("num1 overflow = " + num1);  //byte의 최소 저장 범위

        byte num2 = - 128;
        System.out.println("num2 = " + num2);   //byte의 최소 저장 범위

        num2--; // 후위감소연산자
        System.out.println("num2 underflow = " + num2); //byte의 최대 저장 범위

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;   // 예상하기로는 7천억

        System.out.println("firstNum * secondNum = " + multi);

        /* 해결방법 */
        //오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다.
        long longMulti = firstNum * secondNum;

        System.out.println("longMulti = " + longMulti);

        long result = (long) firstNum * secondNum;  //강제형변환

        System.out.println("result = " + result);
    }
}
