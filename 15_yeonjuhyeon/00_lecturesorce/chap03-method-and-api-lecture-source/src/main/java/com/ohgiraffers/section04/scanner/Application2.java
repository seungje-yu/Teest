package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args){

        /*
         * nextLine()   : 공백을 포함한 한 줄을 입력을 위한 개행문자 전까지 읽어서 문자열로 반환한다. (공백문자포함)
         * next()       : 공백 문자나 개행문자 전까지를 읽어서 문자열로 반환한다. (공백 문자 비포함)
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println("greeting2 = " + greeting2);
        System.out.println(sc.next());
        
        
//
//        System.out.print("인사말을 입력해주세요 : ");
//        String greeting1 = sc.nextLine();
//        System.out.println("greeting1= " + greeting1);



    }
}
