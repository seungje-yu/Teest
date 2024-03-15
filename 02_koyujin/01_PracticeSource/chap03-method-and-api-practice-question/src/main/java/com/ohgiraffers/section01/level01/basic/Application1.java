package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        Calculator calc = new Calculator();
        String result1 = calc.sumTwoNumber(a, b);
        String result2 = calc.multiTwoNumber(a, b);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println("10과 20의 곱은 "+ calc.multiTwoNumber2(a,b) + "입니다.");


    }
}
