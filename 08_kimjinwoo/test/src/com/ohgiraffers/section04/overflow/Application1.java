package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        /* 오버플로우
         * 자료형 별 값의 최대 범위를 벗어나는 경우
         * 발샹한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킨다.
         */
        byte bNum1 = 127; // byte의 최대 저장 범위
        //byte bNum2 = 128;

        System.out.println("bNum1 : " + bNum1);
        bNum1++; //후위증감연산자
        System.out.println("bNum1 overflow = " + bNum1); //byte의 최소 저장 범위

        /*
         * 언더플로우
         * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
         */
        byte bNum2 = -128;
        System.out.println("bNum2 : " + bNum2); //byte의 최소 저장 범위
        bNum2--; //후위감소연산자

        System.out.println("bNum2 underflow = " + bNum2); //byte의 최대 저장 범위

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum; //예상하기로는 7천억
        System.out.println("firstNum + secondNum = " + multi); //-79669248

        /* 해결방법 */
        //오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다.
        long longMulti = firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);
        
        long result = (long)firstNum * secondNum;

        System.out.println("result = " + result);
        
    }
}
