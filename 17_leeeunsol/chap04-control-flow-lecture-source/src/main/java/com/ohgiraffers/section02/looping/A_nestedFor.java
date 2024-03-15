package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNice(){

        for(int dan=2;dan<10;dan++){
            printGugudanOf(dan);
//            for(int su = 1; su<10;su++){
//                System.out.println(dan + " * " + su + " = " + (dan + su) );
//            }
            System.out.println();
        }
    }

    public void printGugudanOf(int dan){
        for(int su = 1; su<10;su++){
            System.out.println(dan + " * " + su + " = " + (dan + su) );
        }
    }

    public void printStartInputRowTimes(){
        /*
        * 키보드로 정수를 하나 입력받아 해당 정수 만큼 한 행에 "*" 5개씩 출력하세요
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요. : ");
        int row = sc.nextInt();

        for (int i = row ; i<=row; i++){
            for (int j=0 ; j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleStars(){
        /*
        * 키보드로 정수를 하나 입력받아 해당 정수 만큼 한 행에 "*"를 행의 번호 개씩 출력
         *        *
         *        **
         *        ***
         *        ****
         *        *****
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int row  = sc.nextInt();
        for(int i = 1 ; i<=row ;i++){
            for(int j = 1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
