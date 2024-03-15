package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 증감연산자
        * 피연산자의 앞 or 뒤에 사용이 가능하다
        * '++' : 1 증가
        * '--' : 1 감소
        * 앞에 있으면 전위, 뒤에 있으면 후위 증감연산자가 된다.
        * */

        int num = 20;
        System.out.println("num = " + num);

        num++;
        System.out.println("num = " + num);

        ++num;
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);


        /* 주의사항.
         *  증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다는 것이다.
         *  다른 연산자와 함께 사용할 때 증감 연산자의 의미
         *  '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
         *  'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
         *  '--var' : 피연산자의 값을 먼저 1 감소 시킨 후 다른 연산을 진행함
         *  'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
         * */


        int firstNum = 20;
        int result1 = firstNum++ * 3;
        System.out.println("firstNum = " + firstNum);
        System.out.println("result1 = " + result1); //이때는 60이지만 다시 호출하면 61이 된다.

        int secondNum = 20;
        int result2 = ++secondNum * 3;
        System.out.println("secondNum = " + secondNum);
        System.out.println("result2 = " + result2);

        //전위는 그 즉시 반영이 되고, 후위는 나중에 반영이 된다.

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum = " + addNum);









    }
}
