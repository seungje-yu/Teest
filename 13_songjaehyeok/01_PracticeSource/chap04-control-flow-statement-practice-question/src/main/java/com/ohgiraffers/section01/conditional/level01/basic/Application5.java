package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

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
        int population;
        int candy;

        Scanner sc = new Scanner(System.in);
        System.out.print("인원 수 : ");
        population = sc.nextInt();

        System.out.print("사탕 개수 : ");
        candy = sc.nextInt();

        int finalNum = candy / population;
        int finalNum2 = candy % population;

        if (population < candy && population > 0) {
            System.out.println("1인당 사탕 개수 : " + finalNum );
            System.out.println("남는 사탕 개수 : " + finalNum2 );
        }
        else {
            System.out.print("인원수가 나눠줄수있는 캔디보다 많습니다 ");
            int result = population - candy;
            System.out.println("최소 공유할 수 있는 캔디 보다 " + Math.abs(result) + "개 모자릅니다");

        }

    }
}
