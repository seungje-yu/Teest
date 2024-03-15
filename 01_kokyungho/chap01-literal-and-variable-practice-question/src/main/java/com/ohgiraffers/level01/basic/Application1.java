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

        Application1 app1 = new Application1();

        System.out.println("더하기 결과 : " + app1.plusNumber(num1,num2));
        System.out.println("빼기 결과 : " + app1.minusNumber(num1,num2));
        System.out.println("곱하기 결과 : " + app1.multiNumber(num1,num2));
        System.out.println("나누기한 몫 : " + app1.divideNumber(num1,num2));
        System.out.println("나누기한 나머지 : " + app1.remainNumber(num1,num2));

    }

    public int plusNumber(int num1, int num2){
        return num1 + num2;
    }
    public int minusNumber(int num1, int num2){
        return num1 - num2;
    }
    public int multiNumber(int num1, int num2){
        return num1 * num2;
    }
    public int divideNumber(int num1, int num2){
        return num1 / num2;
    }

    public int remainNumber(int num1, int num2){
        return num1 % num2;
    }
}
