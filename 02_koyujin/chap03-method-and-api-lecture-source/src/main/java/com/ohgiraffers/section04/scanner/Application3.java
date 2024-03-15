package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*스캐너의 next() 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        * 그래서 크게 두 가지 사항을 주의해야 한다.
        * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력받을 때
        * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때*/
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해주세요: "); //안녕하세요 반갑습니다
        String str1 = sc.next();
        System.out.println("str1 = " + str1); //에러 발생(InputMisMatchException) -> '반갑습니다'가 보관되어 있는 데 nextInt()에 들어가게 되면서 타입이 맞지 않게 되어서 발생
        sc.nextLine();

        System.out.print("숫자를 입력해주세요: ");
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);

        /*정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때*/
        System.out.print("다시 숫자를 입력해주세요");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

        //sc.nextLine();

        System.out.print("공백이 있는 문자열을 하난 입력해주세요: "); //20\n(엔터)
        String str2 = sc.next();
        System.out.println("str2 = " + str2);
    }
}
