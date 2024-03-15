package com.ohgiraffers.level01.basic;

public class Application2 {

    public static void main(String[] args) {

        /* 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0
         * 둘레 : 97.8
         *  */

        // 추형진
        // 넓이 : 가로 * 세로
        // 둘레 : (가로 + 세로) * 2
        double width = 12.5; //-> 실수형 변수 선언
        double height = 36.4;
        double area = width * height; // -> 넓이 area 변수에 저장
        double perimeter = (width + height) * 2; // -> 둘레 perimeter 변수에 저장
        System.out.println(" -- 출력 예시 -- ");
        System.out.println("면적 : " + area); // 면적 : 455.0
        System.out.println("둘레 : " + perimeter); // 둘레 : 97.8

    }
}
