package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */

        Calculator calc = new Calculator();
        calc.checkMethod(); // checkMethod 메소드 호출


        String sumResult = calc.sumTwoNumber(10, 20); // sumTwoNumber 메소드 호출
        System.out.println(sumResult);

        String multiResult = calc.multiTwoNumber(10, 20); // multiTwoNumber 메소드 호출
        System.out.println(multiResult);

        int multiResult2 = calc.multiTwoNumber2(10, 20); // multiTwoNumber2 메소드 호출
        System.out.println(multiResult2);




    }
}
