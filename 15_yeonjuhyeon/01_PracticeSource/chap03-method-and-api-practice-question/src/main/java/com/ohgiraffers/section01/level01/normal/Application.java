package com.ohgiraffers.section01.level01.normal;

import java.util.Random;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

       String result = RandomMaker.rockPaperScissors(3);
        System.out.println(result);

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
        String result2 = RandomMaker.tossCoin(2);
        System.out.println(result2);
    }

}
