package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {

        System.out.println("main() 메소드 시작함...");
        /* void 이란? 공허함 하지만 void 자리에 자료형(int, double,char, String 등등)이 들어갈 수 있다
        *  return 이란?
        *  모든 메소드 내부에는 return;이 존재한다.
        * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
        * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
        *
        *
        *
        * */


        System.out.println("main() 메소드 정료됨...");



    }

    public void testMethod(){
        System.out.println("testMethod() 동작 확인");
        return;
//        System.out.println("test"); // return은 메소드 가장 마지막에 작성해야 한다.
    }
}
