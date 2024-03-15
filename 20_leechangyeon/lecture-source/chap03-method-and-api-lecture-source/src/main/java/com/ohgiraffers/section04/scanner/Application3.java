package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 스캐너의 next() 메서드들은 입력된 내용을 버퍼로부터 토큰 단위로 쪼개서 읽음
        * 주의 사항
        * 1. next()로 문자열 입력받은 뒤 정수, 실수, 논리값을 입력받는 경우
        * 2. 정수, 실수, 논리값 입력받은 뒤 next()로 문자열 입력받는 경우
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.nextLine();
        /*String str1 = sc.next();
        sc.nextLine();*/
        System.out.println("str1 : " + str1);

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1 : " + num1);

        /* 정수, 실수, 논리값 입력받은 뒤 next()로 문자열 입력받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 : " + num2);

        sc.nextLine();

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 : " + str2);
    }
}
