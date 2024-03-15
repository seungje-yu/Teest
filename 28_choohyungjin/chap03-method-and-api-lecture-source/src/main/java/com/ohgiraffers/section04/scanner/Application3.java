package com.ohgiraffers.section04.scanner;

import java.util.Scanner;
public class Application3 {
    public static void main(String[] args) {

        /*
        * 스캐너의 next() 메소드들은 입력한 내용을 버펄부터 토큰단위로 분리해서 읽어온다.
        * 그래서 크게 두가지 사항을 주의해야한다.
        * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력받을 때
        * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요h : ");
        String str1 = sc.next();
        System.out.println("str1: " + str1); //
        sc.nextLine();
        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1: " + num1);

        /* 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때 */
        System.out.print("숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2: " + num2);

        sc.nextLine(); // 버퍼 비우기

        System.out.print("공백이 잇는 문자열을 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2: " + str2);
    }

}

