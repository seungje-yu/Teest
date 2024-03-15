package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args){

        System.out.println("main() 메소드 시작함..");

        Application6 app6 = new Application6();
        String result = app6.testMethod();              // <<-- 리턴값을 받아 넣기! 타입 일치 필수
        System.out.println(result);

        System.out.println("main() 메소드 종료됨..");

    }

    public String testMethod(){
        /*
        public 뒤에 바로 return으로 가지고 갈 타입을 명시한다.
        아무 값도 리턴하지 않는 경우 void, 값을 반환하는 경우에는 반환값의 자료형을 작성해야 한다.
         */
        return "hello world";
    }
}
