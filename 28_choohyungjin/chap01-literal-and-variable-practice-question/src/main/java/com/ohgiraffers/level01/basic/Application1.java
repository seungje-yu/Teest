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

        // 추형진
        int num1 = 20; // -> 정수 변수 선언
        int num2 = 30;

        System.out.println("더하기 값 : " + (num1 + num2)); // 더하기 값 : 50
        System.out.println("빼기 값 : " + (num1 - num2)); // 빼기 값 : -10
        System.out.println("곱하기 값 : " + (num1 * num2)); // 곱하기 값 : 600
        System.out.println("나누기한 몫 : " + (num1 / num2)); // 나누기한 몫 : 0
        System.out.println("나누기한 나머지 : " + (num1 % num2)); // 나누기한 나머지 : 20

    }
}
