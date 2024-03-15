package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {

        System.out.println("=================== 두 개의 문자열 합치기 ===================");
        System.out.println(9 + 9);      // 18
        System.out.println("9" + 9);    // 99
        System.out.println(9 + "9");    // 99
        System.out.println("9" + "9");  // 99

        System.out.println("=================== 세 개의 문자열 합치기 ===================");
        // '+'의 연산 방향은 왼쪽에서 오른쪽으로 이동
        System.out.println(9 + 9 + "9");    // 189
        System.out.println(9 + "9" + 9);    // 999
        System.out.println("9" + 9 + 9);    // 999
        System.out.println("" + 9 + 9);    // 값을 문자열로 출력하고 싶으면 가장 앞에 빈 문자열을 추가한다.

        // 상식 선에서 알고 있는 대로 괄호 기호를 이용해 숫자 연산을 묶어주게 되면 괄호 안에 있는 연산을 우선 수행한다.
        System.out.println("9" + (9 + 9));

        // 10과 20의 사칙연산 결과를 출력
        System.out.println("=================== 10과 20의 사칙연산 출력 ===================");
        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));
    }
}
