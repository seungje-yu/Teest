package com.ohgiraffers.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */

        int num1 = 20;
        int num2 = 30;

        //더하기
        int sum = num1 + num2;
        System.out.println("sum = " + sum);

        //빼기
        int minus = num1 - num2;
        System.out.println("minus = " + minus);

        //곱하기
        int multiplication = num1 * num2;
        System.out.println("multiplication = " + multiplication);
        
        //나누기
        double division = (double) num1 / num2;
        System.out.println("division = " + division);
        
        //나머지
        int mod = num1 % num2;
        System.out.println("mod = " + mod);
    }
}
