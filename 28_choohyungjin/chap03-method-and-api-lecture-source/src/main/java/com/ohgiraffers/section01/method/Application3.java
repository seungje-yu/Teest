package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {

        /* 메소드 전달 인자와 매개변수에 대한 이해 */

        /*
        * 전달인자(argument) 와 매개변수(parameter)를 이용한 메소드 호출
        * 전달인자 : 메소드 호출 시 전달하는 값
        * 매개변수 : 메소드 정의 시 선언하는 변수
         */

        /* 변수의 종류
        * 1. 지역변수 : 메소드 내부에서 선언된 변수
        * 2. 매개변수 : 메소드 정의 시 선언된 변수
        * 3. 전역변수(필드) : 클래스 내부에서 선언된 변수
        * 4. 클래스(static) 변수 : 클래스 내부에서 static 키워드로 선언된 변수
         */

        /*
        * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 유효범위(scope)라고 한다.
        *
        * 다른 메소드간 서로 공유해야 하는 값이 존재할 경우 메소드 호출시 사용하는 괄호를 이용해서 값을 전달 할 수 있다
        * 이 때 전달하는 값을 전달인자(argument)라고 하고, 메소드 선언부 괄호 안에 전달 인자를 받기위해 선언하는 변수를 매개변수(parameter)라고 한다.
         */

        // testMethod 호출
        Application3 app3 = new Application3();
        app3.testMethod(40); // 20은 전달인자
//        app3.testMethod("30"); // 호출 불가능, 전달인자의 타입이 매개변수의 타입과 일치해야 한다
//        app3.testMethod(20, 30, 40); // 호출 불가능, 매개변수는 int형 1개이지만 인자는 3개이기 때문에 호출불가
//        app3.testMethod(); // 호출 불가능, 매개변수는 선언되어 있지만 인자로 값을 전달하지 않으면 호출 X

        int age = 20; // age는 지역변수
        app3.testMethod(age); // age는 전달인자

        byte byteage = 10;
        app3.testMethod(byteage); // 자동 형변환, byte -> int

        long longage = 80;
        app3.testMethod((int) longage); // 강제 형변환, long -> int

        app3.testMethod(age *3 ); // 연산 결과를 전달인자로 전달 가능


    }

    public void testMethod(int age) {
        // int age는 매개변수로 전달인자를 받기 위해 선언된 변수
        // 메소드 호출 시 전달된 값이 age에 저장된다
        System.out.println("나이는 " + age + "세 입니다."); // 출력 : 나이는 20세 입니다.
    }
}
