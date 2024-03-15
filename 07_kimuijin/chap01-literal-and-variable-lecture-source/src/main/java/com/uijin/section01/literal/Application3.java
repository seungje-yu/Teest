package com.uijin.section01.literal;

public class Application3 {

    public static void main(String[] args){

        System.out.println("======================두 개의 문자열 합치기==========================");
        System.out.println(9 + 9);  // 18
        System.out.println("9" + 9);  // 문자열 99
        System.out.println(9 + "9");  // 문자열 99
        System.out.println("9" + "9");  // 문자열 99

        System.out.println("======================세 개의 문자열 합치기==========================");
        // '+' 연산 방향은 왼쪽에서 오른쪽이다. (순서가 있다)
        System.out.println(9 + 9 + "9");  // 문자열 189
        System.out.println(9 + "9" + 9);  // 문자열 999
        System.out.println("9" + 9 + 9);  // 문자열 999
        System.out.println("" + 9 + 9);  // 문자열 99  // 쌍따옴표는 빈칸 가능해서 ""붙이면 문자열 생성됨

        // 상식 선에서 알고 있는 대로 괄호 기호를 이용해 숫자 연산을 묶어주게 되면 괄호 안에 있는 연산을 우선 수행한다.
        System.out.println("9" + (9 + 9));  // 문자열 918  // 먼저 해야되는 건 괄호 붙이기


        // 10과 20의 사칙연산 결과를 출력
        System.out.println("======================10과 20의 사칙연산 결과=========================");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("======================10과 20의 사칙연산 결과=========================");
        System.out.println("10과 20의 합 : " + 10 + 20);  // 문자열이 맨 앞이기 때문에 결과도 문자열
        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 곱 : " + (10 - 20));
        System.out.println("10과 20의 나머지 한 몫 : " + (10 * 20));
        System.out.println("10과 20의 나머지 한 나머지 : " + (10 / 20));






    }
}
