package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 스케너의 next() 메소드들은 입력한 내용을 버퍼로부터 토큰 단위로 분리해서 읽어온다.
        * 그래서 크게 두 가지 사항을 주의해야한다.
        * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력받을때
        * 2. 정수 실수 논리값 입력 후 next()로 문자열 입력 받을때
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next(); // 1. nextline()으로 바꿔주면 된다.
        System.out.println("str1 : " + str1);
        //sc.nextLine();  //2. 버퍼공간에 빈공간을 민들어준다 입력해주는 방법

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt(); // 공백 떄문에 문자열이 남게되는 경우가 있어서 에러가 난다.
        System.out.println("num1 : " + num1);

        /*정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

        sc.nextLine(); //이런 방식으로 계행을 비워주면 된다.

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);


    }
}
