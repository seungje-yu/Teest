package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {

            /*
            * return 이란?
            * 모든 메소드 내부에는 return;이 숨어있다.
            * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파이럴가 자동으로 추가한다.
            *
            * return은 메소드의 실행을 종료하고, 호출한 곳으로 다시 돌아가는 명령어이다.
            * 예) return 0; // 메소드의 실행을 종료하고, 호출한 곳으로 0을 반환한다.
            * 예2) return; // 메소드의 실행을 종료하고, 호출한 곳으로 반환값 없이 돌아간다.
            * 예3) return name; // 메소드의 실행을 종료하고, 호출한 곳으로 name을 반환한다.
            * 예4) return name + age; // 메소드의 실행을 종료하고, 호출한 곳으로 name과 age를 더한 값을 반환한다.
            */

        Application5 app5 = new Application5(); // 객체 생성
        app5.testMethod(); // testMethod 동작 확인

        System.out.println("main 메소드 종료됨.." );
    }
    public void testMethod() {
        System.out.println("testMethod 동작 확인");
        return;
//        System.out.println("testMethod 동작 확인2"); // 에러, return은 메소드 가장 마지막에 작성되어야 한다.
    }
}
