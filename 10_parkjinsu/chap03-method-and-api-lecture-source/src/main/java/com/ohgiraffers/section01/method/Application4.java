package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '남');
        //순서 다르면 전달되면 호출되지 못한다.

        String name = "유관순";
        int age = 20;
        char gender = '여';
        app4.testMethod(name, age, gender);

    }

    /***
     * 이름, 나이, 성별을 출력하는 메소드
     * @param name 이름
     * @param age 나이
     * @param gender 성별
     */
    public void testMethod(String name, int age, final char gender) {

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다");
        //return; / 자동
    }
}
