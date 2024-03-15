package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

    /*
    * return 이란?
    * 메서드가 종료된 후 호출 위치로 돌아갈 때 전달해줄 값.
    * void 메소드의 경우는 return;이 생략 가능하다 (컴파일러가 자동으로 추가해준다.)
    * 현재 메서드를 강제 종료하고 호출한 곳으로 다시 돌아가라는 명령이다.
    * */

        System.out.println("main() 메서드 시작");
        
Application5 app5 = new Application5();
app5.testMethod();


        System.out.println("main() 메서드 종료");
    }

public void testMethod(){
    System.out.println("testMethod() 동작");
        return;
} //return;은 메서드 가장 마지막에 작성해야함.


}
