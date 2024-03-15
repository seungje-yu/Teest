package com.ohgiraffers.section01.method;

public class Application2 {
    // 순서 : main -> methodA -> methodB -> methodC
    public static void main(String[] args) {
        System.out.println("main() 시작됨.."); // 메소드 호출 전 출력됨

        Application2 app2 = new Application2(); // 객체 생성
        app2.methodC(); // 메소드 호출
        app2.methodA();
        app2.methodB();

        System.out.println("main() 종료됨.."); // 메소드 호출 후 출력됨

    }
    public void methodA() {
        System.out.println("methodA() 호출함..");
        System.out.println("methodA() 종료함..");
    }
    public void methodB() {
        System.out.println("methodB() 호출함..");
        System.out.println("methodB() 종료함..");
    }
    public void methodC() {
        System.out.println("methodC() 호출함..");
        System.out.println("methodC() 종료함..");
    }
}
