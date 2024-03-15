package com.ohgiraffers.section01.level01.normal;

import java.util.Random;

public class RandomMaker {

    public static void main(String[] args) {

        RandomMaker.rockPaperScissors();        // static 메소드 호출

        System.out.println(rockPaperScissors());

        RandomMaker.tossCoin();

        System.out.println(tossCoin());
    }

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

    public static String rockPaperScissors(){

        int random = (int) (Math.random() * 3);

        String result = random == 0 ? "주먹" : random == 1 ? "보" : "가위";

        return result + "";

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

    public static String tossCoin(){

        int random1 = (int) (Math.random() * 2);

        String result1 = random1 == 0 ? "앞면" : "뒷면";

        return result1 + "";

    }

}
