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

    public void checkMethod() {
        System.out.println("메소드 호출 확인...");
    }

    public String sumTwoNumber(int num1, int num2) {
        return (num1 + "과 " + num2 + "의 " + "합은 " + (num1 + num2) + "입니다.");
    }

    public String multiTwoNumber(int num1, int num2) {
        return (num1 + "과 " + num2 + "의 " + "곱은 " + (num1 * num2) + "입니다.");
    }

    public int multiTwoNumber2(int num1, int num2) {
        return (num1 * num2);
//        System.out.println("(num1 + "과 " + num2 + "의 " + "곱은 " + (num1 * num2) + "입니다.")");
    }

}
