package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {

        /*메소드 전달 인자와 매개변수에 대한 이해
        *
        * 전달 인자(argument)와 매개변수(parameter)를 이용한 메서드 호출
        *
        * 변수의 종류
        * 1. 지역변수 2. 매개변수 3. 전역변수(필드) 4. 클래스(Static)변수
        *
        *
        *지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
        *
        * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달
        * 이 때 전달하는 값을 전달인지(argument)라고 부르고, 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는
        * 변수를 매개변수(parameter)라고 한다.
        * */

        Application3 app3 = new Application3();
        app3.testMethod(40); //전달인자 argument
//        app3.testMethod("40");
//        app3.testMethod(20, 30, 40); //매개변수는 int형 1개이지만 인자는 3개이기 때문에 호출할 수 없다.

        int age = 20;
        app3.testMethod(age);

        byte byteAge = 10;
        app3.testMethod(byteAge);

        long longAge = 80;
        app3.testMethod((int) longAge); //강제 형변환
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다."); //int age -> 매개변수 parameter
    }
}
