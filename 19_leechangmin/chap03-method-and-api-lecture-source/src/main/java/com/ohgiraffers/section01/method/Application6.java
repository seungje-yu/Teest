package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {
        /*
        * 메서드 리턴값 테스트
        * 메서드는 항상 마지막에 return 명령어가 존대한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 복귀를 할 때 그냥 복귀를 할 수도 있지만(void), 값을 가지고 복귀할 수도 있다.
        * 이때 가지고 가는 값을 리턴값(반환값)이라고 한다.
        * */
        
        /*
        * public 등은 접근제한자
        * String 등은 반환형
        * testMethod 등은 메서드명
        * */

        /*
        * 메서드의 정의 >> 접근제한자 반환형 메서드명
        * */

        System.out.println("main() 메서드 시작");

        Application6 app6 = new Application6();
        String result1 = app6.testMethod();
        System.out.println(result1);

        System.out.println("main() 메서드 종료");
    }
    
    public String testMethod(){
        System.out.println("testMethod() 동작");
        return "testMethod의 반환값";
    }
}
