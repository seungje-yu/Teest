package com.ohgiraffers.section01.level01.normal;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */

        System.out.println("========== 난수를 사용한 가위바위보 출력 ==========");
        System.out.println(RandomMaker.rockPaperScissors());
        System.out.println();

        System.out.println("========== 난수를 사용한 동전 앞뒤 출력 ==========");
        System.out.println(RandomMaker.tossCoin());
    }

}
