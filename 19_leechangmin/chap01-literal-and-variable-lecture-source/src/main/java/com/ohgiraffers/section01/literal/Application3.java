package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        System.out.println("==================== 두 개의 문자열 합치기 ========================");
        System.out.println(9+9);
        System.out.println("9"+"9");
        System.out.println(9 + "9");
        System.out.println("9" + 9);


        System.out.println("==================== 세 개의 문자열 합치기 ========================");
        System.out.println(9 + 9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9); // >> 우선순위가 같다면 왼쪽에서 오른쪽으로 순서대로 진행한다.
        //문자열의 순서에 따라 결과값을 고정할 수 있다.
        System.out.println("9" + (9 + 9)); //괄호를 이용하면 그 바리에이션이 많아진다.


        // 10과 20의 사칙연산 결과 출력
        System.out.println("==================== 10과 20의 사칙연산 결과 ========================");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("==================== 10과 20의 사칙연산 결과 ========================");
        System.out.println("10과 20의 합: " + (10 + 20)); //이런 식으로 클래스, 메소드, 결과값에 대한 구분자를 넣으면 찾기 쉬워진다.
        System.out.println("10과 20의 차: " + (10 - 20)); //코드창과 콘솔창에 ctrl + f 하면 찾기다 엑셀이랑 같음
        System.out.println("10과 20의 곱: " + (10 * 20));
        System.out.println("10과 20의 몫: " + (10 / 20));
        System.out.println("10과 20의 나머지: " + (10 % 20));


    }
}