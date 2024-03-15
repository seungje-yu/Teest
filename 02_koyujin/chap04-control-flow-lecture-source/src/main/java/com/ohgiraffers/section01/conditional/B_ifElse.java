package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement(){
        /*[if-else문 표현식]
         * if(조건식){
         *   조건식이 true일 때 실행할 명령문;
         * } else{
         *      조건식이 false일 때 실행할 명령문;
         * }
         *
         * if문은 조건식의 결과값이 참(true)이면 if {}안에 있는 코드 실행하고, 조건식의 결과값이 거짓(false)이면 else{}안에 있는 코드 실행
         *
         * 조건을 만족하는지 여부에 따라 둘 중 하나는 무조건 실행해야 하는 경우 많이 사용됨
         * */

        /*  정수 한 개를 입력 받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다." 라고 출력하고,
         *  홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 작성해보자
         *  단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.*/

        //정수 한 개를 입력 받아 -> scanner, nextInt()
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요: ");
        int num = sc.nextInt();
        //그 수가 홀수 이면  -> 조건절
        if(num % 2 != 0){
            // 조건절이 참이면 "입력하신 숫자는 홀수입니다." 라고 출력
            System.out.println("입력하신 숫자는 홀수입니다.");
        } else {
            //조건절이 거짓이면 "입력하신 숫자는 짝수입니다." 라고 출력
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        //단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfElseStatement(){
        /*  숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다." 출력하고,
         *  음수이면 "입력하신 숫자는 음수 입니다." 출력
         *  단, 0이면 "0입니다" 라고 출력하세요
         *  조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.*/

        //숫자를 하나 입력 -> scanner, nextInt()
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요: ");
        int num = sc.nextInt();

        //방법1 -> 조건문 기준을 어떻게 잡냐
        if(num >= 0){
            if(num != 0){
                System.out.println("입력하신 숫자는 양수입니다.");
            } else{
                System.out.println("0입니다");
            }
        } else{
            System.out.println("입력하신 숫자는 음수 입니다.");
        }
        System.out.println("-----------------");
        //방법2
        if(num != 0){
            if(num > 0){
                System.out.println("입력하신 숫자는 양수입니다.");
            } else{
                System.out.println("입력하신 숫자는 음수 입니다.");
            }
        } else{
            System.out.println("0입니다.");
        }
        //양수이면 -> 조건문
        //조건문이 true일 경우 "입력하신 숫자는 양수입니다." 출력
        //조건문이 false일 경우 "입력하신 숫자는 음수 입니다." 출력
        //단, 0이면 ->조건문
        // "0입니다" 라고 출력
        //조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력
        System.out.println("프로그램을 종료합니다.");
    }

}
