package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 메소드란?
        * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

        System.out.println("main() 시작됨 .....");

        /*
        * 메소드 호출 방법
        * 클래스명 사용할이름 = new 클래스명(); << 객체생성
        * 사용할이름.메소드명(); >> .은 참조연산자 (주소값으로 감)
        * */

        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main() 종료됨 .....");
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
