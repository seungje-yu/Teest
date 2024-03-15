package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

        /*
         * return 이란?
         * 모든 메소드는 내부에서는 return; 이 존재한다.
         * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
         *
         * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
         */
        System.out.println("main() 메소드 시작함...");

        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main() 메소드 종료됨...");
    }

    public void testMethod(){
        System.out.println("testMethod() 동작 확인");
        return;
//        System.out.println("test"); // 에러 발생, return은 메소드 가장 마지막에 작성해야한다.
    }

}
