package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args){

    Application3 app3 = new Application3();
    app3.testMethod(40);

    int age = 20;
    app3.testMethod(age);

    byte byteAge = 10;
    app3.testMethod(byteAge); //자동형변환


        long longAge = 80;
        app3.testMethod((int) longAge); //강제형변환

    app3.testMethod(age*3);

    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
