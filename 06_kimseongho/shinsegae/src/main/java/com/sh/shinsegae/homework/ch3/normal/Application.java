package com.sh.shinsegae.homework.ch3.normal;


import static com.sh.shinsegae.homework.ch3.normal.RandomMaker.rockPaperScissors;
import static com.sh.shinsegae.homework.ch3.normal.RandomMaker.tossCoin;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        // RamdomMaker 클래스의 메소드를 호출해서 실행
        /**
         *  static 메소드
         * 클래스명.메소드명();
         */
        System.out.println(rockPaperScissors());
        System.out.println(tossCoin());

    }
}
