package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /*메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return 명령어가 존재
        * return은 자신을 호출한 구문으로 복귀하는 것 의미
        * 복귀를 할 때 그냥 복귀를 할 수도 있지만, 값을 가지고
        * 복귀할 수도 있다.
        * 이때 가지고 가는 값을 리턴값이라고 함*/
        System.out.println("main() 메소드 시작함...");
        Application6 app6 = new Application6();
        String result = app6.testMethod(); //"hello world" 잘 받았지만 호출해주는 것을 출력해주는 것이 없어서
        //실행했을 때 나오지 않음
        System.out.println(app6.testMethod()); //호출받은 hello world를 출력해주기
        System.out.println(result); //같은 경우

        System.out.println("main() 메소드 종료됨...");

    }
    public String testMethod(){
        System.out.println("check");
        /*public 뒤에 바로 return으로 가지고 갈 타입 명시
        * 아무 값도 리턴하지 않는 경우 void, 값을 반환하는 경우에는
        * 반환값의 자료형을 작성해야 한다*/
        return "hello world"; //testMethod()의 타입을
        // String을 사용했기에 "hello world"를 작성해준거임
    }
}
