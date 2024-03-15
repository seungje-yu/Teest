package com.ohgiraffers.section01.level01.normal;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {
        int i = 1;
        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
        RandomMaker rmaker = new RandomMaker();
        String result1 = rmaker.rockPaperScissors(i);
        System.out.println(result1);

        String result2 = rmaker.tossCoin(i);
        System.out.println(result2);
    }



}
