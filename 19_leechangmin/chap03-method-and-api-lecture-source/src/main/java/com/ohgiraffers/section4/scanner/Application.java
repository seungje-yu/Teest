package com.ohgiraffers.section4.scanner;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*
        * 콘솔 화면에 값을 입력 받아 출력
        * */

        // Scanner 객체 생성

//        java.util.Scanner s = new java.util.Scanner(java.lang.System.in);
        //java.lang은 스킵 가능
        Scanner s = new Scanner(System.in);

        /*
        * 자료형별 값 입력받기
        * */

//        //문자열
//        System.out.print("문자열을 입력하세요 : ");
//        String a = s.nextLine(); //입력 값 문자열 반환
//        System.out.println("입력 문자열 : " + a);
//
//
//        //정수
//        System.out.print("정수을 입력하세요 : ");
//        int b = s.nextInt(); //(int radix)는 진법을 의미한다. 10 10 >> 10의 10진법
//        System.out.println("입력 정수 : " + b);
//        
//        /*자료형이 다르거나, 범위를 초과하면 InputMismatchException 발생*/
//
//
//        //롱 정수
//        System.out.print("롱 정수를 입력하세요 : ");
//        long c = s.nextLong();
//        System.out.println("입력 롱 정수 : " + c);
//
//
//        //실수
//        System.out.print("실수를 입력하세요 : ");
//        double d = s.nextDouble();
////   or float d = s.nextFloat();
//        System.out.println("입력 실수 : " + d);
//
//
//        //논리형
//        System.out.print("논리형을 입력하세요 : ");
//        boolean e = s.nextBoolean();
//        System.out.println("입력 논리형 : " + e);


        //문자형
        System.out.print("문자를 입력하세요 : ");
        char f = s.next().charAt(0);
        System.out.println("입력 문자 : " + f);
        // 문자형은 .charAt(index값)으로 index번째 값을 추출해 문자형으로 반환한다.
        // index 범위를 벗어나면 IndexOutOfBoundsException 발생한다.





    }
}
