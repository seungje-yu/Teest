package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application12 {

    public void test12() {

        /*
            정수 입력 : 4
            ****
            ***
            **
            *
            정수 하나를 입력받아서 위와 같은 모양의 삼각형을 출력하세요
       */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n - i + 1; ++j) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
