package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args ){

        /*
        * 메서드 리턴값 테스트
        * 메서드는 항상 마지막에 return 명령아가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 복귀를 할 때 그냥 복귀를 할수도 있지만, 값을 가지고 복귀할 수도 있다.
        * 이때 가지고 가는 값을 리턴값이라고 한다.
         */
        System.out.println("main() 메소드 시작함...");
        Application6 app6 = new Application6();
        String result = app6.testmethod();
        System.out.println(result);

        System.out.println(app6.testmethod());


        System.out.println("main() 메소드 종료됨...");

    }

    public String testmethod() {
        //위치는 불변 (접근제한자,반환형,메소드명)
        System.out.println("check");
        /*
        * public 뒤에 바로 return으로 가지고 갈 타입을 명시한다
        * 아무값도 리턴하지 않는ㄴ 경우 void, 값을 반환하는 경우에는 반환값에
         */
        return "hello world";

    }
}
