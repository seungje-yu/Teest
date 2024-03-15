package com.ohgiraffers.section01.level01.normal;

import com.ohgiraffers.section01.level01.basic.Calculator;

import java.util.Random;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {
        RandomMaker random = new RandomMaker();
        int num1 = 1;
        int num2 = 2;

        String result1 = RandomMaker.rockPaperScissors(num1);
        String result2 = RandomMaker.tossCoin(num2);
        System.out.println(result1);
        System.out.println(result2);


        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
    }

}
