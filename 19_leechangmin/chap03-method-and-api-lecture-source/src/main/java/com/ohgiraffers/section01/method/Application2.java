package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {

        /*

         * */

        System.out.println("main() 시작 .....");

        Application2 app2 = new Application2(); //객체 생성
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 종료 .....");
    }

    public void methodA(){
        System.out.println("methodA() 호출");
        System.out.println("methodA() 연산-B호출");
        methodB();
        System.out.println("methodA() 종료");

    }

    public void methodB(){
        System.out.println("methodB() 호출");
        System.out.println("methodB() 연산-C호출");
        methodC();
        System.out.println("methodB() 종료");
    }

    public void methodC(){
        System.out.println("methodC() 호출");
        System.out.println("methodC() 연산");
        System.out.println("methodC() 종료");
    }









}
