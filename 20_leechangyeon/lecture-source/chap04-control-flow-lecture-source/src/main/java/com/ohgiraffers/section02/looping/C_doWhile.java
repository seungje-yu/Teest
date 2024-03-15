package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {
    public void testSimpleDoWhileStatement() {
        /*
         * [do-while문 표현식]
         * 초기식;
         * do {
         *   1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 구문(반복할 구문)
         *   증감식;
         * } while(조건식);
         * */

        do {
            System.out.println("최초 1회 실행됨");
        } while (false);
    }

    public void testDoWhileExample1() {
        /*
        * 키보드로 문자열을 입력받아 반복적으로 출력하시오.
        * 단, exit이 입력되면 반복문을 종료하시오.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        while (!str.equals("exit")) {
            System.out.println(str);
            System.out.print("문자열을 입력하세요 : ");
            str = sc.nextLine();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
