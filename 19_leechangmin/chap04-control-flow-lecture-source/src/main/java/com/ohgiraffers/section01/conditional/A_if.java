package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement(){

        /*
        * [단일 if문] >> 조건을 하나 하나 모두 검사하며 넘어갈 때 사용
        * if(조건식){
        *  조건식이 true일 때 실행할 명령문;
        * }
        *
        * 조건식 : true or false가 나올 수 있는 연산식
        *
        * if문은 조건식이 true면 if 스코프의 코드를 실행하고 false면 넘어간다.
        * */


        /*
        * 정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력하고,
        * 짝수가 아니면 출력하지 않는 구문을 작성해보자
        * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
        * */

        // 정수 한 개를 입력 받아 >> scanner
        // 짝수이면 >> (int % 2) == 0;
        // 조건과 상관 없이 종료될 때 출력 >> sout"프로그램을 종료합니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();
        if ((num % 2) == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");


    }

    //Nested >> 중첩
    public void testNestedIfStatement(){

        /*
        * 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
        * 짝수이면 "입력하긴 숫자는 양수이면서 짝수입니다." 라고 출력하고,
        * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자
        * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
        * */

        // 정수 한 개를 입력받아 >> scanner
        // 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다. >> if
        //단, 조건과 상관 없이 종료될 때 "프로그램을 종료합니다." 출력

        Scanner sc2 = new Scanner(System.in);
        System.out.print("정수 한 개를 입력하세요 : ");
        int num2 = sc2.nextInt();
        if(num2 > 0){
            if ((num2 % 2) == 0){
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");

    }















}
