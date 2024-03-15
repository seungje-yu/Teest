package com.ohgiraffers.section01.level01.normal;

import java.util.Random; // Random 클래스 import

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

    public static String rockPaperScissors() { // 가위바위보 메소드 생성
        int random = new Random().nextInt(3) + 1; // 1~3까지의 난수 생성, 3을 곱하고 1을 더해줘서 1,2,3을 만든다.
        String result = (random == 1) ? "가위" : (random == 2) ? "바위" : "보";
        // 삼항연산자를 사용하여 난수 1,2,3에 따라 가위,바위,보 출력.
        // 삼항연산자의 '?'는 '?'앞에 조건이 참이면 뒤에 조건을 실행하고 거짓이면 :뒤에 조건을 실행한다.
        // 삼항연산자 - chap02.section06.ternary 참고
        return result; // 결과값 result 반환

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

    public static String tossCoin() { // 동전도박 메소드 생성
        int random = (int) (Math.random() * 2) + 1; // 1~2까지의 난수 생성, 2를 곱하고 1을 더해서 1,2를 만든다.
        String result = (random == 1) ? "앞면" : "뒷면"; // 난수 랜덤으로 1이냐 2냐 따라 앞면,뒷면 출력
        return result;

    }

}
