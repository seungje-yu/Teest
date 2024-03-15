package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        // 정수와 정수의 연산
        System.out.println("=============== 정수와 정수의 연산 ===============");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);   //곱하기
        System.out.println(123 / 10);   //나누기의 몫
        System.out.println(123 % 10);   //나누기의 나머지

        // 정수와 실수의 연산의 결과는 항상 실수가 나온다.
        System.out.println("=============== 정수와 실수의 연산 ===============");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);


        System.out.println("=============== 문자와 문자의 연산 ===============");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');


        System.out.println("=============== 문자와 정수의 연산 ===============");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2); //아스키 코드 기준 a = 97

        System.out.println("=============== 문자와 실수의 연산 ===============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // 문자열과 문자열의 '+'연산 결과는 문자열 합치기(이어 붙이기)가 된다.
        System.out.println("=============== 문자열과 문자열의 연산 ===============");
        System.out.println("hello" + "world");      // "hello world"
//        System.out.println("hello" - "world");    //  연산 불가능
//        System.out.println("hello" * "world");    //  연산 불가능
//        System.out.println("hello" / "world");    //  연산 불가능
//        System.out.println("hello" % "world");    //  연산 불가능

        System.out.println("=============== 문자열과 다른 형태의 값 연산 ===============");
        System.out.println("helloworld" + 123); // 이어붙이기.. 후 모두 문자열로 변환됨
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
    }
}
