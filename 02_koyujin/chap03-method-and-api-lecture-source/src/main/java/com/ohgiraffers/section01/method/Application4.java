package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '남');
        //파라메터 순서에 맞게 작성해주어야 호출이 됨
        String name = "유관순";
        int age = 20;
        char gender = '여';

        app4.testMethod(name, age, gender);
    }

    /***
     *
     * @param name
     * @param age
     * @param gender
     */
    public void testMethod(String name, int age, final char gender){
        //세 개의 매개변수(일반변수 2개, 상수 1개(final char gender))
//        gender = '여' -> 위에서 불러올 때 이미 상수로 변환되어지기 때문에 바꾸어 질 수 없음
        System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"세 이며, 성별은 " + gender + "입니다.");

    }
}
