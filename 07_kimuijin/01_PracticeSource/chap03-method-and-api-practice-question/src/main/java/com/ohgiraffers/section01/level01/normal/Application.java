package com.ohgiraffers.section01.level01.normal;

import static com.ohgiraffers.section01.level01.normal.RandomMaker.tossCoin;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */

        RandomMaker app = new RandomMaker();

        tossCoin();

        System.out.println(app.tossCoin());
    }

}
