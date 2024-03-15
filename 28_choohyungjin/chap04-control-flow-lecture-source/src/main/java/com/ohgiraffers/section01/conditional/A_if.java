package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement() {

        /*
        * [if문 표현식]
        * if (조건식) {
        *  조건식이 true일 때 실행할 명령문;
        * }
        *
        * 조건식 : true 또는 false 값을 가지는 연산식
        * if문은 조건식의 결과값이 참(true)임 {} 안의 명령문을 실행
        * 조건식의 결과값이 거짓(false)이면 {} 안의 명령문을 실행하지 않고 넘어감
        */

        /*
        * 정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력하고,
	    * 짝수가 아니면 출력하지 않는 구문을 작성해보자
	    * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
        */

        // 정수 한 개를 입력 받음 --> scanner, nextInt() 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력해~ : ");
        int num = sc.nextInt();

        // 그 수가 짝수이면 --> if문, 조건식 사용
        // "입력하신 숫자는 짝수입니다." 라고 출력 --> System.out.println() 사용
        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        // "프로그램을 종료합니다." 라고 출력 --> System.out.println() 사용
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfStatement() {

        /*
        * [중첩 if문 표현식]
        * if (조건식1) {
        * if (조건식2) {
        * 조건식1과 조건식2가 모두 true일 때 실행할 명령문;
        * }
        * }
        *
        * 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
         * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
         * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자
         * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
         */

        // 정수 한 개를 입력 받음 --> scanner, nextInt() 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력해~ : ");
        int num = sc.nextInt();

        // 그 수가 양수인 경우에만 짝수인지 확인 --> if문 사용: num > 0,
        if (num > 0) {
            // 짝수이면 --> if문 사용: num % 2 == 0
            if (num % 2 == 0) {
                // "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력 --> System.out.println() 사용
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }

        }
        // 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않음
        // "프로그램을 종료합니다." 라고 출력 --> System.out.println() 사용
        System.out.println("프로그램을 종료합니다.");


    }
}
