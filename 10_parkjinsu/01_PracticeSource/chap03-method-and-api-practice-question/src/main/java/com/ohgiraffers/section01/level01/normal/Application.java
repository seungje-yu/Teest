package com.ohgiraffers.section01.level01.normal;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        RandomMaker app1 = new RandomMaker();
        String result1 = app1.rockPaperScissors();
        System.out.println(result1);

        System.out.println("----------------------------");

        String result2 = app1.tossCoin();
        System.out.println(result2);


        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
    }

}
