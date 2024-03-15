package com.ohgiraffers.section01.level01.normal;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */

        RandomMaker random = new RandomMaker();

        String rockPaperScissorsResult = random.rockPaperScissors(); // rockPaperScissors 메소드 호출
        System.out.println(rockPaperScissorsResult);

        String tossCoinResult = random.tossCoin(); // tossCoin 메소드 호출
        System.out.println(tossCoinResult);


    }

}
