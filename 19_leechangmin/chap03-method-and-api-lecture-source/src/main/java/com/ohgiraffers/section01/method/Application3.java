package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {
        /* 메소드 전달 인자와 매개변수에 대한 이해*/
        
        /*
        * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        * */

        /*
        * 변수의 종류
        * 1. 지역변수
        * 2. 매개변수
        * 3. 전역변수(필드)
        * 4. 클래스(static) 변수
        * */


        /* 1.
        * 지역변수는 선언한 메소드로 블럭 내부에서만 사용이 가능하다. >> 지역변수의 스코프
        *
        * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        * 이 때 전달하는 값을 전달인자(argument)라고 부르고,
        * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다
        * */

        Application3 app3 = new Application3();
        app3.testMethod(29); //29는 전달인자 argument
        //app3.testMethod(28, 30); 매개변수는 int 1개지만 인자는 3개를 입력해서 호출할 수 없다.
        //app3.testMethod(); 호출을 위해서 무조건 매개변수와 같은 타입(cast되면 됨) + 같은 수의 인자가 넘어가야 한다.
        //app3.testMethod(age * 3); 연산의 결과가 자료형에 맞으면 가능하다.


        


    }

    public void testMethod(int age){ //int age는 매개변수 parameter
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }



}
