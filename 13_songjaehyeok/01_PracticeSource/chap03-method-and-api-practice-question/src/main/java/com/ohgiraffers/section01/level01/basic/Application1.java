package com.ohgiraffers.section01.level01.basic;

import java.util.Calendar;


public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        int first = 10;
        int second = 20;

        Calculator calc = new Calculator();
        calc.checkMethod();


        
        System.out.println("10과 20의 합은 : " + calc.sumTwoNumber(first,second));


        
        System.out.println("10과 20의 곱은 : " + calc.multiTwoNumber(first,second));


        
        System.out.println("10과 20의 곱은 : " + calc.multiTwoNumber2(first,second));



        /* Calculater 클래스의 메소드를 호출해서 실행 */
    }
}
