package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*
            * nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전까지 읽어서 문자열로 반환한다. (공백 포함)  // 문자열을 받을때
            * next()    : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환한다. (공백문자 포함x)   // 문자열 반환
            *
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("인사말을 입력해주세요 : ");
        String greeting1 = sc.nextLine() ; // 안녕하세요 반갑습니다. , 공백 있을때 nextLine() 사용
        System.out.println("greeting1 = " + greeting1);

        System.out.print("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();        // 안녕하세요 반갑습니다.
        System.out.println("greeting2 = " + greeting2);

    }
}
