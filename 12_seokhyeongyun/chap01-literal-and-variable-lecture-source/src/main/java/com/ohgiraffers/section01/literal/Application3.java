package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        System.out.println("======= 두 개의 문자열 합치기 ======");
        System.out.println(9 + 9);      // 18
        System.out.println("9" + 9);    // 99
        System.out.println(9 + "9");    // 99
        System.out.println("9" + "9");  // 99


        System.out.println("======= 세 개의 문자열 합치기 ======");
        System.out.println(9 + 9 + "9");    // 189  '+' 연산 방향은 왼쪽에서 오른쪽이다.
        System.out.println(9 + "9" + 9);    // 999
        System.out.println("9" + 9 + 9);    // 999
        System.out.println("" + 9 + 9 );    // 99

        // 괄호 기호를 이용해 숫자 연산을 묶어주게 되면 우선 수행한다.
        System.out.println("9" + (9 + 9));

        System.out.println("====== 10 과 20의 사칙연산 =====");
        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 : " + (10 / 20));
        System.out.println("10과 20의 나머지 : " + (10 % 20));


    }
}
