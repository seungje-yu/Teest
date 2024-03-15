package com.ohgiraffers.section01.level01.normal;

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

    public static String rockPaperScissors(){
        int randNum = new Random().nextInt(3);
        String str = new String();

        if(randNum == 0){
//            System.out.println("가위");
            str = "가위";
        }
        else if (randNum == 1) {
//            System.out.println("바위");
            str = "바위";
        }
        else if (randNum == 2) {
//            System.out.println("보");
            str = "보";
        }
        else {
//            System.out.println("ERR !!");
            str = "ERR !!";
        }

        return str;
    }

    public static String tossCoin(){
        int randNum = (int)(Math.random() * 2);
        String str = new String();

        str = (randNum==0)?"앞면":"뒷면";

//        System.out.println((randNum==0)?"앞면":"뒷면");
        return str;
    }
}
