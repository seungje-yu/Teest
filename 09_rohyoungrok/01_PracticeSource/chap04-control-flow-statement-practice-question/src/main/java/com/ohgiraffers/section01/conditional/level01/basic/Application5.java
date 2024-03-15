package com.ohgiraffers.section01.conditional.level01.basic;

import com.ohgiraffers.section01.conditional.InputUtils;

public class Application5 {

    public static void main(String[] args) {

        /*
        * 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
        * 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
        *
        * 인원 수 : 29
        * 사탕 개수 : 100
        *
        * 1인당 사탕 개수 : 3
        * 남는 사탕 개수 : 13
        * */
        int population = InputUtils.inputNumberWith("인원 수");
        int candyCount = InputUtils.inputNumberWith("사탕 개수");

        System.out.println();
        int candy = candyCount / population;
        System.out.println("1인당 사탕 개수: " + candy);

        int leftCandy = candyCount % population;
        System.out.println("남는 사탕 개수: " + leftCandy);
    }
}
