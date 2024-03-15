package com.ohgiraffers.section01.arithmetic;

public class Application1 {

    public static void main(String[] args) {


//        *  산술연산자의 종류
//		 *  '+' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더함
//                *  '-' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺌
//                *  '*' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱함
//                *  '/' : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눔
//                *  '%' : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 나머지를 반환
//                * */


        /*
        * 산술 연산자의 우선순위
        * 곱하기 나누기가 먼저.
        * 우선 순위가 같은 경우 연산의 결합 방향에 의해 실행 순서가 결정된다.*/


        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
    }
}
