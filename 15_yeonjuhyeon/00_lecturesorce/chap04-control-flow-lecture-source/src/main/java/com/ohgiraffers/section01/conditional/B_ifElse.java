package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement(){

        /*
         * 정수 한 개를 입력 받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다." 라고 출력하고,
         * 홀수가 아니면 "입력하신 숫자는 짝수입니다" 라고 출력하는 프로그램을 작성해보자
         * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다," 라고 출력되도록 한다.
         */

        // 정수 한 개르 입력 받아 --> scanner, nextInt()

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한 개를 입력하세요 : ");
        int number = sc.nextInt();

        // 그 수가 홀수라면--> 조건절
        // 조건절이 참이면 --> "홀수입니다" 출력
        // 홀수가 아니라면, 조건절이 거짓이라면 --> else --> "짝수입니다"
        // 조건과 상관없이 프로그램 종료구문

        if (number % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수 입니다.");
        } else {
            System.out.println("입력하신 숫자는 짝수 입니다.");
        }
        System.out.println("프로그램을 종료합니다.");

    }

    public void testNestedIfElseStatement(){

        /*
         * 숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다" 출력하고,
         * 음수이면 "입력하신 숫자는 음수입니다." 출력
         * 단, 0이면 0이라고 출력하세요.
         * 조건과 상관없이 프로그램이 종료 될 때 "프로그램을 종료합니다."라고 출력한다.
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나를 입려하세요 : ");
        int num  = sc.nextInt();

        //1방법
        if (num >= 0){
            if (num != 0 ){
                System.out.println("양수입니다");
            } else {
                System.out.println("0 입니다");
            }
        } else{
            System.out.println("음수입니다.");
        }

        System.out.println("------------2--------------");
        //2방법
        if(num != 0){
            if(num > 0){
                System.out.println("양수입니다");
            } else {
                System.out.println("음수입니다");
            }
        } else {
            System.out.println("0 입니다");
        }

        System.out.println("------------me--------------");
        // 내가 처음 작성한 문법
        if (num > 0){
            System.out.println("입력하신 숫자는 양수입니다");
        } else {
            if (num < 0){
                System.out.println("입력하신 숫자는 음수입니다.");
            }
            System.out.println("입력하신 숫자는 0 입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

}
