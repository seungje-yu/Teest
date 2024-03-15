package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {

        /* Calculater 클래스의 메소드를 호출해서 실행 */

        Calculator calc = new Calculator();

        System.out.println("============ 메소드 호출 확인 ============");
        calc.checkMethod();
        System.out.println();

        System.out.println("============ sumTwoNumber 출력 ============");
        System.out.println(calc.sumTwoNumber(10, 20));
        System.out.println();

        System.out.println("============ multiTwoNumber 출력 ============");
        System.out.println(calc.multiTwoNumber(10, 20));
        System.out.println();

        System.out.println("============ multiTwoNumber2 출력 ============");
        System.out.println(calc.multiTwoNumber2(10, 20));
    }
}
