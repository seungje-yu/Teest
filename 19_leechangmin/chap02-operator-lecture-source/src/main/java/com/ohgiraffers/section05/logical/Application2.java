package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {
        /*
        * 논리 연산자의 우선순위와 활용
        * 논리 and 연산자와 논리 or 연산자의 우선순위
        * && : 11순위
        * || : 12순위
        *
        * 논리 and 연산자 우선순위가 논리 or 연산자 우선순위보다 높다.
        * */


        // 1부터 100사이의 값인지 확인
        int num1 = 55;
        System.out.println("1부터 100사이인지 확인 : " + (1 <= num1 && 100 >= num1));

        int num2 = 155;
        System.out.println("1부터 100사이인지 확인 : " + (1 <= num2 && 100 >= num2));


        /*영어 대문자인지 확인*/
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (65 <= ch1 && 95 >= ch1));

        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (65 <= ch2 && 95 >= ch2));


        // 대소문자 상관없이 영문자 y인지 확인
        char ch3 = 'y';
        System.out.println("대소문자 상관없이 영문자 y인지 확인 : " + (89 == ch3 || 121 == ch3));

        char ch4 = 'Y';
        System.out.println("대소문자 상관없이 영문자 y인지 확인 : " + (89 == ch4 || 121 == ch4));


        //영문자인지 확인
        char ch5 = 'q';
        System.out.println("영문자인지 확인 : " + ( ('A' <= ch5 && 'Z' >= ch5) || ('a' <= ch5 && 'z' >= ch5) ));
        System.out.println("영문자인지 확인 : " + ( (65 <= ch5 && 90 >= ch5) || (97 <= ch5 && 122 >= ch5) ));

        char ch6 = 'F';
        System.out.println("영문자인지 확인 : " + ( ('A' <= ch6 && 'Z' >= ch6) || ('a' <= ch6 && 'z' >= ch6) ));
        System.out.println("영문자인지 확인 : " + ( (65 <= ch6 && 90 >= ch6) || (97 <= ch6 && 122 >= ch6) ));






    }
}
