package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {

        /*
        * 메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return  명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 복귀를 할 때 그냥 복귀를 할 수도 있지만(void에 해당), 값을 가지고 복귀할 수도 있다.(특정한 return 값을 가지고 있다)
        * 이때 가지고 가는 값을 리턴값이라고한다.
        * */
        System.out.println("main() 메소드 시작함...");

        Application6 app6 = new Application6();
        String result = app6.testMethod();
        System.out.println(result);

        System.out.println(app6.testMethod());

        System.out.println("main() 메소드 종료됨...");
    }

    public String testMethod() { //public: 접근제한자, String: 반환형, testMethod(): 메소드명
        // 반환형에 String이 들어가면 return값이 String이 되게 맞춰줘야한다.
        System.out.println("check");
        /*
         * public 뒤에 바로 return으로 가지고 갈 타입을 명시한다.
         * 아무 값도 리턴하지 않는 경우 void, 값을 반환하는 경우에는 반환값의
         * 자료형을 작성해야 한다.
         * */


        return "hello world"; // 반환에는 무조건 반환형에 맞는 값이 들어가야한다 ex) "" + 0 도 가능
    }
}
