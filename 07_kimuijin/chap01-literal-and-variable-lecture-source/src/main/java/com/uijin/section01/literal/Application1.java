package com.uijin.section01.literal;

public class Application1 {

    public static void main(String[] args){

//        //System.out.print("a");
//        //System.out.print("a");
//        System.out.println("b");
//        System.out.println("c");
//        System.out.println("d");
////        System.out.print("hello");

        //정수 출력
        System.out.println(123);

        //실수 출력
        System.out.println(1.23);

        //문자 형태의 값 출력
        System.out.println('a');  // 문자형태의 값은 홑따옴표(single-quotation)으로 감싸주어야 한다.
//        System.out.println('ab'); // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//        System.out.println(''); // 아무 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('1'); // 숫자 값이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.

        //문자열 형태의 값 출력
        System.out.println("안녕하세요"); // 문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표(double-quotation)으로 감싸주어야 한다.
        System.out.println("123"); // 정수이지만 쌍따옴표로 감싸져있기 때문에 문자열로 봐야 한다. '문자열 123'
        System.out.println(""); // 아무 값도 없는 빈 쌍따옴표도 문자열로 취급한다.


        // 논리형태의 값 출력
        System.out.println(true);
        System.out.println(false); // true 혹은 false 값을 논리형이라고 한다.

    }
}