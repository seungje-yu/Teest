package com.ohgiraffers.level01.basic;

public class Application2 {

    public static void main(String[] args) {

        /* 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0 // (가로 x 세로)
         * 둘레 : 97.8 // (가로 + 세로) x 2
         *  */

        double length = 12.5;
        double height = 36.4;

        System.out.println("면적 : " + (length * height));
        System.out.println("둘레 : " + ((length + height) * 2));


    }
}
