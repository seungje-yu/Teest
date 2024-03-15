package com.ohgiraffers.section01.literal;

import java.sql.SQLOutput;

public class Application3 {

    public static void main(String[] args) {
        System.out.println("====================세 개의 문자열 합치기===================");
        System.out.println("9" + "9" + "9");
        System.out.println('9' + '9' + '9');

        /* 상식 선에서 알고 있는 대로 괄호
         */
        System.out.println("9" + (9 + 9));

        //10과 20의 사칙연산 결과를 출력
        System.out.println("===============10과 20의 사칙연산 결과===============");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("===============10과 20의 사칙연산 결과===============");
        System.out.println("10과 20의 합 : " + 10 + 20);
        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));
    }
}
