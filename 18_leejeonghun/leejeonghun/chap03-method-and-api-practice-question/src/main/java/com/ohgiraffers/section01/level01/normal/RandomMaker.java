package com.ohgiraffers.section01.level01.normal;

public class RandomMaker {

    public static String rockPaperScissors() {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            return "가위";
        } else if (random == 1) {
            return "바위";
        } else {
            return "보";
        }
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
    public static String tossCoin() {
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            return "앞면";
        }
         else {
            return "뒷면";
        }
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

}
