package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 논리연산자의 우선순위와 활용
        * 논리 and 연산자와 논리 or 연산자의 우선순위
        * && : 11순위 (and)
        * || : 12순위 (or)
        *
        * 논리 and 연산자 우선순위가 논리 or 연산자 우선순위보다 높다.(and가 먼저 연산된다)
         */

        /* 1부터 100사이의 값인지 확인 */
        // 1 <= 숫자 <= 100 (이렇게 사용은 불가능하다) --> 변수 >= 1 && 변수 <= 100 이렇게 사용
        int num1 = 55;
        System.out.println("1부터 100사이의 값인지 확인 : " + (num1 >= 1 && num1 <= 100)); // true
        // 1 <= 55 <= 100 --> true

        int num2 = 155;
        System.out.println("1부터 100사이의 값인지 확인 : " + (num2 >= 1 && num2 <= 100)); // false

        /* 영어 대문자인지 확인 */
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z')); // true

        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z')); // false

        /* 대소문자 상관없이 영문자 y인지 확인 */
        char ch3 = 'Y';
        char ch4 = 'y';
        System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y')); // true
        System.out.println("영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'Y')); // true

        /* 영문자인지 확인 */
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z'))); // true
        System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122))); // true
        // 영문자인지 확인 : (대문자인지 확인 || 소문자인지 확인) --> 둘 중 하나만 true여도 true.

        char ch6 = 'F';
        System.out.println("영문자인지 확인 : " + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >= 'a' && ch6 <= 'z'))); // true
        System.out.println("영문자인지 확인 : " + ((ch6 >= 65 && ch6 <= 90) || (ch6 >= 97 && ch6 <= 122))); // true, 아스키코드로도 확인 가능




    }
}
