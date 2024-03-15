package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {

        System.out.println("================= 2개의 문자열 합치기 =================");
        System.out.println(9 + 9); // 18
        System.out.println("9" + 9); // 문자열 99
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        System.out.println("================= 3개의 문자열 합치기 =================");
        System.out.println(9 + 9 + "9"); // 189, 연산 방향은 왼쪽에서 오른쪽이다.
        System.out.println(9 + "9" + 9); // 999
        System.out.println("" + 9 + 9); // 99, 먼저 해야하면 괄호를 붙여야한다.
        System.out.println("9" + (9 + 9));

        System.out.println("================= 10과 20의 사칙연산 결과 =================");
        System.out.println("10과 20의 합 : " + 10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

    }
}
