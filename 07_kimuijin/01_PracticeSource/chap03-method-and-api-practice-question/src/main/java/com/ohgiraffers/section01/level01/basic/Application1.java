package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        Calculator app1 = new Calculator();

        String sum = app1.sumTwoNumber(10, 20);
        System.out.println("10과 20의 합은 " + sum );

        String mul = app1.multiTwoNumber(10, 20);
        System.out.println("10과 20의 곱은 " + mul);

    }
}
