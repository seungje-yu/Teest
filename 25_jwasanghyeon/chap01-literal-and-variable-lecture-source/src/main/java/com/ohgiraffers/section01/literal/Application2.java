package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main (String[] args) {


        // 정수와 정수의 연산
        System.out.println("=================정수와 정수의 연산===================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10); // 곱
        System.out.println(123 / 10); // 나눗셈, 몫
        System.out.println(123 % 10); // 나머지

        System.out.println("문자와 문자의 연산");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("문자와 정수의 연산");
        System.out.println('a' + 1);
        System.out.println('a' - 1);

        System.out.println("123" + "456"); // 문자열로 인식해서
        //System.out.println(true + false); // 논리는 에러 발생
        System.out.println(true + "a"); // 논리값은 문자열과의 + 만 된다.

    }
}
