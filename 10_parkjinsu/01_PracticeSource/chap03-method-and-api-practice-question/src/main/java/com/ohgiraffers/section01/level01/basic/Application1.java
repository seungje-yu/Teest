package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {

        Calculator carlc = new Calculator();
        carlc.checkMethod();

        int num1 = 10, num2 = 20;

        String result1 = carlc.sumTwoNumber(num1, num2);
        System.out.println(result1);

        String result2 = carlc.multiTwoNumber(num1, num2);
        System.out.println(result2);

        int result3 = carlc.multiTwoNumber2(num1, num2);
        System.out.println((num1 + "과 " + num2 + "의 " + "곱은 " + (num1 * num2) + "입니다."));

        /* Calculater 클래스의 메소드를 호출해서 실행 */
    }
}
