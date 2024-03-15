package com.uijin.section01.method;

public class Application4 {

    public static void main(String[] args) {

        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '남');        // 매개변수 순서대로 넣어야 작동함

        String name = "유관순";
        int age = 20;
        char gender = '여';

        app4.testMethod(name,age,gender);

    }


    /***
     * 이름과 나이, 성별을 출력하는 메소드
     * @param name  이름
     * @param age   나이
     * @param gender    성별
     */     //---> 메소드에 대한 주석
    public void testMethod(String name, int age, final char gender){        // 변수, 변수, 상수 --> 상수 대문자로 써야 하지만 매개변수로 쓸 때는 어차피 하나이기때문에 소문자로 써도 상관 없음

//        gender = '여'      // 불가. gender는 상수이기 때문
        System.out.println("당신의 이름은 : " + name + "이고, 나이는" + age + " 세 이며, 성별은 " + gender + "입니다.");

    }


}
