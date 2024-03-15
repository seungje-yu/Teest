package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {

        /* Calculater 클래스의 메소드를 호출해서 실행 */
        com.ohgiraffers.section01.level01.basic.Calculator carc = new com.ohgiraffers.section01.level01.basic.Calculator();

        carc.checkMethod();
        carc.sumTwoNumber(10, 20);
        carc.multiTwoNumber(10, 20);
        carc.multiTwoNumber2(10, 20);

    }
}
