package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 메도드란?
        * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합.
        * */
        System.out.println("main() 시작됨...");

        /*
        * 메소드 호출 방법
        * 클래스명 사용할일음 = new 클래스명(); // 객체생성
        * 사용할이름.메소드명();
        * */
        Application1 app1 = new Application1();
        app1.methodA();
        
        System.out.print("main() 종료됨....");
    }
        public void methodA() {

            System.out.println("methodA() 호출함...");

            methodB();

            System.out.println("methodA() 종료됨...");
        }

        public void methodB(){

            System.out.println("methodB() 호출함...");

        methodC();

            System.out.println("methodB() 종료됨...");


        }

        public void methodC(){

        System.out.print("methodC() 호출함...");
        System.out.print("methodC() 종료함...");
    }

}
