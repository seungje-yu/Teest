package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 메소드 리턴값 테스트
         * 메소드는 항상 마지막에 return 명령어가 존재한다.
         * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
         * 복귀를 할때, 그냥 복귀를 할 수도 있지만, 값을 가지고 복귀할 수도 있다.
         * 이 때, 가지고 가는 값을 리턴값이라고 한다.
         * */

        System.out.println("main() 메소드 시작함...");

        Application6 app6 = new Application6();
        String result = app6.testMethod();
        System.out.println(result);

        System.out.println(app6.testMethod());

        System.out.println("main() 메소드 종료됨...");
    }

    public String testMethod() {

        System.out.println("check");
        /*
         * public 뒤에 바로 return으로 가지고 갈 타입을 명시한다.
         * 아무 값도 리턴하지 않는경우 void, 값을 반환하는 경우에는 반환값의 자료형을 작성해야 한다.
         * */

        return "helloWorld";    // 반환형과 type이 항상 같게 맞춰야한다.
//        return;               // 반환형이 void인 경우에만 사용. 반환할 값이 없다.
    }
}
