package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args){

        // 1부터 100사이의 값인지 확인
        // 1 <= 숫자 <= 100 라고 한줄로 작성이 불가능
        int num1 = 55;
        System.out.println("1부터 100사이 인지 확인 : " + (num1 >= 1 && num1 <= 100));
        int num2 = 155;
        System.out.println("1부터 100사이 인지 확인 : " + (num2 >= 1 && num2 <= 100));

        //영어 대문자 확인
        //아스키코드를 확인해 보면 65 ~ 95 까지는 영문 대문자의 값임
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));
        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));


        //대소문자 상관없이 영문자 y인지 확인
        char ch3 = 'Y';
        System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));

        //영문자인지만 확인하기
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));


    }
}
