package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '개');
//        app4.testMethod(20, "김철수", '남'); // 값의 갯수는 맞지만 순서가 다르기 때문에 호출 불가능

        String name = "추형진";
        int age = 30;
        char gender = '남';

        app4.testMethod(name, age, gender);
    }

    /***
     * 이름과 나이, 성별을 출력하는 메소드
     * @param name 이름
     * @param age 나이
     * @param gender 성별
     */
    public void testMethod(String name, int age, final char gender) {
        // String name, int age, final char gender는 매개변수로 전달인자를 받기 위해 선언된 변수
        // 메소드 호출 시 전달된 값이 각각의 변수에 저장된다
        // void는 리턴타입이 없다는 것을 의미한다
        System.out.println("이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
    }


}
