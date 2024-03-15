package com.ohgiraffers.section01.method;

import java.sql.SQLOutput;

public class Application01 {
    public static void main(String[] args) {

        /*메소드란?
        * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * /

         */
        System.out.println("main() 시작됨....");


        /*
        * 메소드 호출 방법
        * 클래스명 사용할 이름 =new 클래스명(); // 객체 생성
        * 사용할 이름.메소드명();
        * */
        Application01 app1 =new Application01();
        app1.methodA();

        System.out.println("main()  종료됨....");

    }

    public void methodA(){

        System.out.println("methodA() 호출함...");
         methodB();
        System.out.println("methodA() 종료됨");

    }

    public void methodB(){

        System.out.println("methodB() 호출함...");
        methodC();
        System.out.println("methodB종료");
    }
    public void methodC(){

        System.out.println("methodC 호출..");
        System.out.println("methodC() 종료");
    }

}
