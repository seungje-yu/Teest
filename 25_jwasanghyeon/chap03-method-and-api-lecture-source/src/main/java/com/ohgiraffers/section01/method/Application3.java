package com.ohgiraffers.section01.method;

public class Application3 {
    
    public static void main(String[] args)  {
        /*                      전달인자를 여러개 받겠다라는 의미

        method 전달 인자와 매개변수에 대한 이해

        변수의 종류
        1. 지역변수
        2. 매개변수
        3. 전역변수(필드)
        4. 클래스(static) 변수
         */

        Application3 app3 = new Application3(); // 객체 생성
        app3.testMethod(40);    // age : 40 >> 전달인자
        //app3.testMethod("28"); << 자료형이 다르다
        //app3.testMethod(20,30,40); << 매개변수의 개수가 다르다.
        //app3.testMethod(); << 매개변수 선언되어있을 때, 비워놓기는 불가능

        int age = 20;
        app3.testMethod(age); // << 자료형만 맞으면 변수를 전달인자로 사용가능하다.

        byte byteAge = 10;
        app3.testMethod(byteAge);   // << 자동형변환

        long longAge = 80;
        //app3.testMethod(longAge); 타입이 달라서 안된다. long이 더 큰 자료형
        app3.testMethod((int)longAge);  // 강제 형변환 사용하면 사용가능하다.

        app3.testMethod(age * 3);   // 연산을 넣어도 된다.
    }

    public void testMethod(int age){ // int age >> 매개변수
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
