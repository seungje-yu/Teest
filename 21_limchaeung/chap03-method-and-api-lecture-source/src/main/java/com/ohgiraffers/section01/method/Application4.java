package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
    Application4 app4 = new Application4();
    app4.testMethod("유관순", 20, '여');

    String name = "유관순";
    int age = 20;
    char gender = '여';
    app4.testMethod(name, age, gender);

    }

    /***      /*** + Enter( 슬러시별별별+엠터 )
     *
     * @param name
     * @param age
     * @param gender
     */
    public void testMethod(String name, int age, final char gender){

        System.out.println("당신의 이름은 " + name + "세이며, 성별은 " + gender + "입니다.");
    }

}
