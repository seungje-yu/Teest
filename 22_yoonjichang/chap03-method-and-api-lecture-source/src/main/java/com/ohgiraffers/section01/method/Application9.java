package com.ohgiraffers.section01.method;

import java.util.Calendar;

public class Application9 {
    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        /*non -static 메소드
        *
        * 클래스가 다르더라도 사용하는 방법은 동일하다.
        * 클래스명 사용할이름 = new 클래스명();
        * 사용할이름.메소드명();
        *
         */

        Calculator calc = new Calculator();
        int min = calc.minNumber0f(first, second);
        System.out.println("두 수 중 최소값은:" + min);

        int max = Calculator.maxNumber0f(first,second);
        System.out.println("두 수 중 최대값은: " + max);



        int max2 = calc.minNumber0f(first, second);
        System.out.println("두 수 중 더 큰 값은 :" + max2);
    }

}
