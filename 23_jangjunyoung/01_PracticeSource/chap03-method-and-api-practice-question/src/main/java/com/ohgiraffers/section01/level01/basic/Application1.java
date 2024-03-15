package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {

        System.out.println("main() 메소드 시작됨....");

        /* Calculator 클래스의 메소드를 호출해서 실행 */

        Calculator cal = new Calculator(); // 객체 생성

        cal.checkMethod(); // checkMethod 메소드 호출

        int num1 = 10;
        int num2 = 20;

        System.out.println(cal.sumTwoNumber(num1, num2)); // sumTwoNumber 메소드 호출 (2개의 정수형 전달 인자 포함)

        System.out.println(cal.multiTwoNumber(num1, num2)); // multiWonNumber 메소드 호출 (2개의 정수형 전달 인자 포함)

        System.out.println(num1 + "과 " + num2 + "의 곱은 " + cal.multiTwoNumber2(num1, num2) + "입니다.");

        System.out.println("main() 메소드 종료됨....");
    }


    
}
