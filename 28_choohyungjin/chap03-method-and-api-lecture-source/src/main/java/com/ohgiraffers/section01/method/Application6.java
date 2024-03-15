package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {

        /*
        * 메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return 명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미.
        * 복귀를 할 때 그냥 복귀할 수도 있고, 값을 가지고 복귀할 수도 있다.
        * 이때 값을 가지고 복귀하는 것을 '리턴값'이라고 한다.
        *
         */
        System.out.println("main 메소드 시작됨..");

        Application6 app6 = new Application6(); // 객체 생성
        app6.testMethod(); // testMethod 동작 확인
        String result = app6.testMethod(); // testMethod 동작 확인
        System.out.println(result); // hello?

        System.out.println(app6.testMethod()); //

        System.out.println("main 메소드 종료됨.." );
    }

    public String testMethod() {
        System.out.println("testMethod 동작 확인");
        //public : 접근제한자, String : 반환형(리턴타입), testMethod : 메소드명

        /*
        * public 뒤에 바로 return으로 가지고 갈 타입을 명시한다.
        * 아무 값도 리턴하지 않는 경우 void, 값을 반환하는 경우에는 반환값의 자료형(타입)을 명시한다.
         */

        return "hello?"; // 리턴값이 있는 메소드
    } // 에러, 메소드의 리턴값이 없는데, 리턴값을 반환하도록 작성되어 있음.
}
