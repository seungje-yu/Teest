package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    /*
    * [while문 표현식]
    * 초기식;
    * while(조건식) {
    *   조건을 만족하는 경우 수행할 구문(반복할 구문);
    *   증감식;
    * }
    *
    * 연습할 부분
    * 1. 증감식이 없는 경우
    * 2. 조건식이 true인 경우
    * 3. 초기식, 조건식, 증감식이 없는 경우
    * 4. 초기식 조건식, 증감식 등을 변경하고 실행 값 예측해보기
    * 5. 역순으로 반복문 실행
    * */

    public void testSimpleWhileStatement() {
//        1부터 10까지 1씩 증가 (10번) i값을 출력하는 기본 반복문
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample1() {
        /* 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력하시오. */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /* 아래 두 개 메서드는 String 클래스에서 제공하는 메서드임
        * charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환
        * length() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환
        * index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가짐
        * 만약 존재하지 않는 인덱스에 접근하면 StringIndexOutOfBoundsException 발생
        * */

        System.out.println("========== for문 ==========");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " : " + str.charAt(i));
        }

        System.out.println();

        System.out.println("========== while문 ==========");
        int i = 0;
        while (i < str.length()) {
            System.out.println(i + " : " + str.charAt(i++));
        }
    }

    public void testWhileExample2() {
//        중첩 while문을 이용하여 구구단을 출력하시오

        int dan = 1;
        while (dan <= 9) {
            int su = 1;
            while (su <= 9) {
                System.out.println(dan + " X " + su + " : " + (dan * su));
                su++;
            }
            dan++;
            System.out.println();
        }
    }
}
