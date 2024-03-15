package com.ohgiraffers.section02.looping;

import java.sql.SQLOutput;
import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine() {

        for (int dan = 2; dan < 10; dan++) {

//            for (int su = 1; su < 10; su++) {
//                System.out.println(dan + " * " + su + " = " + (dan * su));
//            }

            printGugudan(dan);

            System.out.println();
        }
    }

    public void printGugudan(int dan) {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStartInputRowTimes() {

        /* 키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 "*"를 5개씩 출력하세요 */

        Scanner sc = new Scanner(System.in);

        System.out.println("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printStart(int times) {

        for (int j = 1; j <= times; j++) {
            System.out.print("*");
        }
    }

    public void printTriangleStars() {

        /* 키보드로 정수를 하나 입력받아 해당 정수만큼 한 행에 "*"를 행의 번호개씩 출력
         * 정수를 입력하세요 :
         *        *
         *        **
         *        ***
         *        ****
         *        *****
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}