package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main (String[] args) {


        System.out.print("a");
        System.out.print("a");
        System.out.println("b");
        System.out.println("c");

        System.out.println(123);
        System.out.println(1.23);
        System.out.println('c');
//        System.out.println('ab'); // >> error
//        System.out.println(''); >> error, 아무 문자도 안넣으면 오류가 남
        System.out.println('1'); // 값은 숫자지만 사실은 문자입니다.

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요"); // 문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따움표(double-quotation) 감싸 줘야한다.
        System.out.println("123"); // 정수이지만 쌍따움표로 감싸져있기 때문에 문자열로 봐야한다.
        System.out.println(""); // 아무 값도 없는 빈 쌍따움표도 문자열로 취급한다.
        System.out.println("a"); // 한 개의 문자도 ""로 감싸면 문자열이다. (문자 a와는 다르다.)
        
        //논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);

    }
}
