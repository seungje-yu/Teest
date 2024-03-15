package com.ohgiraffers.section01.level01.normal;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */

    public static String rockPaperScissors() {

        int random = (int) (Math.random() * 3) + 1;

        String result = (random == 1)? "가위" : (random == 2)? "바위" : "보";

        System.out.println(random);

        return result;

    }

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */

    public static String tossCoin() {

        Random random = new Random();

        int coin = random.nextInt(2) + 1;

        String result = (coin == 1)? "앞면" : "뒷면";

        System.out.println(coin);

        return result;

    }

}
