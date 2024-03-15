package com.ohgiraffers.operatorPractice;

import java.util.Random;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 임의의 정수 한개를 선언하고 해당 숫자가 13세 이하이면 어린이, 13세초과 ~ 19세 이하이면
         * 청소년, 19세 초과이면 성인이라고 출력되도록 작성하세요
         *
         * 19
         *
         * ------ 출력 결과 --------
         * 청소년
         * */

        Random random = new Random();
        int ran1 = random.nextInt(100) + 1;
        System.out.println("나이 : " + ran1 + " 세");
        System.out.println(ran1 <=13 ? "어린이" : 13 < ran1 && ran1 <= 19 ? "청소년" : "성인");

    }
}
