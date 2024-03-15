package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement() {
        /*
         * [if-else문 표현식]
         * if (조건식) {
         * 조건식이 true일 때 실행할 명령문;
         * } else {
         * 조건식이 false일 때 실행할 명령문;
         * }
         *
         * if문은 조건식의 결과값이 참(true)일 때 if {} 안의 명령문을 실행,
         * 조건식의 결과값이 거짓(false)일 때 else {} 안의 명령문을 실행한다.
         *
         * 조건을 만족하는지 여부에 따라 둘 중 하나는 무조건 실행해야하는 경우 많이 사용.
         */

        /*
         * 정수 한 개를 입력 받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다." 라고 출력하고,
         *  홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 작성해보자
         *  단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
         */

        // 정수 한개를 입력 받음 --> scanner, nextInt() 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력해~ : ");
        int num = sc.nextInt();

        // 그 수가 홀수이면 --> if문, 조건절 사용
        if (num % 2 != 0) { // num % 2 != 0 -> 홀수
            System.out.println("입력하신 숫자는 홀수에용~~"); // 홀수이면 출력
        }

        // 홀수가 아니면(거짓이면) "입력하신 숫자는 짝수입니다." 라고 출력 --> else 사용
        else {
            System.out.println("입력하신 숫자는 짝수에용~~.");
        }

        // "프로그램을 종료합니다." 라고 출력 --> System.out.println() 사용
        System.out.println("프로그램을 썃따내려~");
    }

    public void testNestedIfElseStatement() {
        /*
         *  숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다." 출력하고,
         *  음수이면 "입력하신 숫자는 음수 입니다." 출력
         *  단, 0이면 "0입니다" 라고 출력하세요
         *  조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
         */

        // 숫자 하나 입력 받음 --> scanner, nextInt() 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나를 입력해~ : ");
        int num = sc.nextInt();

        // else if를 안 쓰는 경우 :
        if (num >= 0) { // num >= 0 -> 0 또는 양수
            if (num != 0) { // num != 0 -> 양수
                System.out.println("입력하신 숫자는 양수입니다.");
            } else {
                System.out.println("0입니다.");
            }
        } else {
            System.out.println("입력하신 숫자는 음수입니다.");
        }


        // 또 다른 방식 :
        // if (num != 0) { // num != 0 -> 양수 또는 음수
        //     if (num > 0) {
        //         System.out.println("입력하신 숫자는 양수입니다.");
        //     } else {
        //         System.out.println("입력하신 숫자는 음수입니다.");
        //     }
        // } else {
        //     System.out.println("0입니다.");
        // }

    }


}
