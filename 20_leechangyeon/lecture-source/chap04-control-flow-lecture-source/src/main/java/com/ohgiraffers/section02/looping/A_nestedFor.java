package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNine() {
        for (int dan = 2; dan <= 9; dan++) {
            printGugudanOf(dan);
            System.out.println();
        }
    }

    public static void printGugudanOf(int dan) {
        for (int su = 1; su <= 9; su++) {
            System.out.println(dan + " x " + su + " = " + (dan * su));
        }
    }

    public void printStartInputRowTimes() {
        /* 키보드로 정수를 하나 입력받아 해당 정수만큼 한 행에 '*'를 5개씩 출력하시오. */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("*".repeat(5));
        }
    }

    public void printStart(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.print("*");
        }
    }

    public void printTriangleStars() {
        /* 키보드로 정수를 하나 입력받아 해당 정수만큼 한 행에 '*'를 행의 번호만큼 출력
         *        *
         *        **
         *        ***
         *        ****
         *        *****
        * */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("정수를 입력하세요 : ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
