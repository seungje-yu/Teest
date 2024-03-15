package com.ohgiraffers.section01.level01.basic;

public class Calculator {

    // 반환값 : x
    // 메소드명 : checkMethod
    // 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드

    // 반환값 : String
    // 메소드명 : sumTwoNumber
    // 두개의 전달인자를 받아 두수의 합을 반환
    // 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
    // 출력하는 기능

    // 반환값 : String
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능



    // 반환값 : int
    // 메소드명 : multiTwoNumber2
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능
    int a=10;
    int b=20;

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public String multiTwoNumber(int a, int b){

        System.out.println(a+"과"+b+"의 곱은 "+a * b+"입니다.");
        return null; //근데 string이 반환이면 어떤식으로 코딩해야하는 거지?
    }

    public  String sumTwoNumber(int a, int b){
        System.out.println(a+"과"+b+"의 곱은 "+a+b+"입니다.");
        return null;
    }

    public int multiTwoNumber2(int a, int b){
        System.out.println(a+"과"+b+"의 곱은 "+a*b+"입니다.");
        return a*b;
    }

}
