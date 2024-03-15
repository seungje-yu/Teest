package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 증감연산자
         * 피연산자의 앞 or 뒤에 사용이 가능하다.
         * '++' : 1 증가의 의미
         * '--' : 1 감소의 의미
         * */

        System.out.println("========== 증감연산자 ==========");

        int num = 20;
        System.out.println("num = " + num);     // 20

        num++;
        System.out.println("num = " + num);     // 21

        ++num;
        System.out.println("num = " + num);     // 22

        num--;
        System.out.println("num = " + num);     // 21

        --num;
        System.out.println("num = " + num);     // 20

        /*
         * 증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다는 것이다.
         * 다른 연산자와 함께 사용할 때 증감 연산자의 의미
         * '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
         * 'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
         * '--var' : 피연산자의 값을 먼저 1 감소 시킨 후 다른 연산을 진행함
         * 'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
         * */

        System.out.println();
        System.out.println("========== 전후위연산자 ==========");

        // 후위연산
        int firstNum = 20;
        int result = firstNum++ * 3;                    // 20(21) * 3

        System.out.println("firstNum = " + firstNum);   // 21
        System.out.println("result = " + result);       // 60

        int num1 = 10;
        int addNum = num1++;                            // 10(11)
        System.out.println("addNum = " + addNum);       // 10

        // 전위연산
        int secondNum = 20;
        int result2 = ++secondNum * 3;                  // 21(21) * 3
        System.out.println("secondNum = " + secondNum); // 21
        System.out.println("result2 = " + result2);     // 63
    }
}
