package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    public static void main(String[] args) {
        /* Calculator 클래스의 메소드를 호출해서 실행 */

        Calculator cal = new Calculator();

        cal.checkMethod();
        cal.sumTwoNumber(10,20);
        cal.multiTwoNumber(10,20);
        cal.multiTwoNumber2(10,20);
    }
}
