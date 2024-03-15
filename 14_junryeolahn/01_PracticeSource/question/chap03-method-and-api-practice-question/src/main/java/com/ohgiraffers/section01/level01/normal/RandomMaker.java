package com.ohgiraffers.section01.level01.normal;
import java.util.Random;
public class RandomMaker {

    public static String rockPaperScissors(int randomShake) {
    Random random = new Random();

    int randomShake1 = random.nextInt(3);
        String result = ((randomShake1== 0) ? "바위" : (randomShake1 == 1) ? "보" : "가위" );
        System.out.println(result);
        return result;
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

    public static String tossCoin(int coinThrow) {
        Random random = new Random();

        int coinThrow1 = random.nextInt(2);
        String result = ((coinThrow1 == 0) ? "앞면" : "뒷면");
        System.out.println(result);
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

}
