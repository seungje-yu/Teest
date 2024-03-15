package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIFStatement() {

        Scanner sc=new Scanner(System.in);
        System.out.print("숫자 한개 를 입력하시오 :");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수여~");
        }
        System.out.println("프로그램 종료여~");


    }

    public void testNestedIFStatement(){
//
//            *  정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
//                    *  짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
//		 *  둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자
//                    *  단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.

        Scanner sc=new Scanner(System.in);
        System.out.print("정수 한개 입력");
        int num = sc.nextInt();

        if(num>0){
            if(num%2==0){
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");

            }
            System.out.println("프로그램 종료합니다.");
        }


    }


}

