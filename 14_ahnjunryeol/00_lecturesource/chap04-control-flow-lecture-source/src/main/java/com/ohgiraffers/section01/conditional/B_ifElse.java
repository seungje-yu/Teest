package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement() {
        /*
         *  [if-else문 표현식]
         *  if (조건식) {
         *       조건식이 true일 때 실행할 명령문;
         * }
         *  else {
         *       조건식이 fasle일 때 실행할 명령문;
         *  }
         *
         * if문은 조건식의 결과값이 참(true)이면 if {}안에 있는 코드를 실행하고,
         * 조건식의 결과값이 거짓 (false)이면 else {}안의 코드 실행
         *
         * 조건을 만족하는지 여부에 따라 둘 중 하나는 무조건 실행해야 하는경우 사용
         */

        /*
         *  정수 한 개를 입력 받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다." 라고 출력하고,
         *  홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 작성해보자
         *  단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
         * */

        //정수 한개를 압력 박아 scanner, nextInt()
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요");
        int num = sc.nextInt();

        if(num % 2 != 0){
            //그 수가 홀수이면 --> 조건절
            //조건절이 참이면 "입력하신 숫자는 홀수입니다." 라고 출력
            System.out.println("입력하신 숫자는 홀수입니다 ");
        }

        else {
            //조건절이 거짓이면 "입력하신 숫자는 짝수입니다."라고 출력
            System.out.println("입력하신 숫자는 짝수입니다");
        }
        System.out.println("프로그램을 종료합니다.");

        //단, 조건과 상관없이 프로그램이 종료될 때 '프로그램을 종료합니다."라고 출력

    }

    public void testNestedIfElseStatment(){
        /*
         *  숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다." 출력하고,
         *  음수이면 "입력하신 숫자는 음수 입니다." 출력
         *  단, 0이면 "0입니다" 라고 출력하세요
         *  조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
        * */

        // 숫자를 하나 입력 scanner, nextInt()
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if(num >= 0) {
            if(num !=0){
                System.out.println("입력하신 숫자는 양수입니다.");
            }
            else {
                System.out.println("0입니다");
            }
        }
        else {
            System.out.println("입력하신 숫자는 음수입니다.");
        }

//        System.out.println("-------------------------------");
//        if(num != 0){
//            if(num > 0){
//                System.out.println("입략하신 숫자는 양수입니다.");
//            }
//            else {
//                System.out.println("입력하신 숫자는 음수입니다.");
//            }
//        }
//        else {
//            System.out.println("0 입니다");
//        }


        //양수이면  --> 조건문
        //조건문이 true일 경우 "입력하신 숫자는 양수입니다." 출력

        //조건문이 false일 경우 "입력하신 숫자는 음수입니다." 출력

        //단, 0이면 --> 조건문
        //"0입니다" 라고 출력

        //조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력
        System.out.println("프로그램을 종료합니다");

    }



}
