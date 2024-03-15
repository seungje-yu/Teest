package com.ohgiraffers.section01.level01.normal;

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

    public static String rockPaperScissors () {
        int a = (int) (Math.random() * 3);
        String random1 = (a == 0) ? "바위" : (a == 1) ? "가위" : "보";
        return random1;

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
        int b = (int) (Math.random() * 2);
        String random2 = (b == 0) ? "앞면" : "뒷면";
        return random2;
    }

}
