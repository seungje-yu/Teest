package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {        // main push

        System.out.println("main() 시작함...");

        Application2 app2 = new Application2();     // 객체 생성
        app2.methodA();                             // methodA push -> 출력 완료되면 pop
        app2.methodB();                             // methodB push -> 출력 완료되면 pop
        app2.methodC();                             // methodC push -> 출력 완료되면 pop

        System.out.println("main() 종료됨...");
    }                                               // main pop

    public void methodA() {
        System.out.println("methodA() 호출됨...");
        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");
    }

    public void methodC() {
        System.out.println("methodC() 호출됨...");
        System.out.println("methodC() 종료됨...");
    }
}
