package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {

    /*
    * 메소드란?
    * 메소드(Method)는 특정 작업을 수행하기 위한 명령문의 집합이다.
    *
     */
        System.out.println("main() 시작됨..");

        /*
        * 메소드 호출 방법
        * 클래스명 사용한이름 = new 클래스명(); // 객체 생성
        * 사용할 이름.메소드명(); // 메소드 호출, .은 참조연산자
         */
        Application1 app1 = new Application1(); // 객체 생성
        app1.methodA(); // 메소드 호출

        System.out.println("main() 종료.."); // 메소드 호출 후 출력됨
    }

    public void methodA() { // 메소드 정의

        System.out.println("methodA() 호출함.."); // 메소드 호출 시 출력됨

        methodB(); // 메소드 호출

        System.out.println("methodA() 종료함.."); // 메소드 호출 후 출력됨
    }

    public void methodB() { // 메소드 정의

        System.out.println("methodB() 호출함.."); // 메소드 호출 시 출력됨

        methodC(); // 메소드 호출

        System.out.println("methodB() 종료함.."); // 메소드 호출 후 출력됨
    }

    public void methodC() { // 메소드 정의

        System.out.println("methodC() 호출함.."); // 메소드 호출 시 출력됨
        System.out.println("methodC() 종료함.."); // 메소드 호출 후 출력됨

    }
}
