package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */

        int first = 10;
        int second = 20;

        //객체 생성
        Calculator calcu = new Calculator();
        calcu.checkMethod();
        String result1 = calcu.sumTwoNumber(first,second);
        System.out.println(result1);
        String result2 = calcu.multiTwoNumber(first,second);
        System.out.println(result2);
        int result3 = calcu.multiTwoNumber2(first,second);
        String resultStr = first + "과 " + second + "의 곱은 "  + result3 + "입니다.";
        System.out.println(resultStr);
    }
}
