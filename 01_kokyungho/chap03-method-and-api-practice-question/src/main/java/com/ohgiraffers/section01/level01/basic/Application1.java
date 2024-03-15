package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        int num1 = 10;
        int num2 = 20;

        Calculator calc = new Calculator();

        calc.checkMethod();
        System.out.println(calc.sumTwoNumber(num1, num2));
        System.out.println(calc.multiTowNumber(num1, num2));
        System.out.println("10과 20의 곱은 " + calc.multiRowNumber2(num1,num2) + "입니다");
    }
}
