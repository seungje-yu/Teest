package com.ohgiraffers.section01.level01.normal;
import java.util.*;

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
        int game = (int) (Math.random() * 3 + 1);
        return game == 1 ? "가위" : game == 2 ? "바위" : "보";
    }

    public static String tossCoin(){
        int coin = (int) (Math.random() * 2 + 1);
        return coin == 1 ? "앞면" : "뒷면";
    }
}
