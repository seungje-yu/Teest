package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args){

    System.out.println("main() 시작함..");

    Application5 app5 = new Application5();
    app5.testMethod();

    System.out.println("main() 종료됨..");

    }

    public void testMethod(){
        System.out.println("testMethod() 동작 확인");
        return;
    }


}
