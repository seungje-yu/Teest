package com.ohgiraffers.operatorPractice;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 문자형 변수 하나를 선언하고 변수에 값이 M으로 초기화하면 남자입니다.
         * F이면 여성입니다를 출력하도록 작성하세요 (삼항연산자사용)
         *
         * M
         *
         * ---- 출력 결과 ---
         * 남자입니다.
         * */

        Random rnd = new Random();
        int randNum = rnd.nextInt(1000) + 1;

        char gen;
        if ((randNum % 2) == 0) { //짝수남자 홀수여자
            gen = 'M';
        }
        else {
            gen = 'F';
        }

        String gender = (gen == 'M') ? "남자입니다." : "여자입니다.";

        System.out.println(gender);

    }
}
