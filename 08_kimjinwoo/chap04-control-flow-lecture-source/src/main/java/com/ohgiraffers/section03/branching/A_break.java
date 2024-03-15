package com.ohgiraffers.section03.branching;

import java.util.Scanner;

public class A_break {

    public void testSimpleBreakStatement() {

        /*
         * break문은 반복문 내에서 사용한다.
         * 해당 반복문을 빠져 나올 때 사용하며(가장 가까운 반복문을 나간다.),
         * 반복문의 조건문 판단 결과와 상관없이 반복문을 빠져 나올 때 사용한다.
         * 일반적으로
         *  if(조건식) {
         *     break;
         *    }
         *  처럼 사용된다.
         * 단, switch문은 반복문이 아니지만 예외적으로 사용된다.
         */

        int sum = 0;
        int i = 1;
        while(true) {
            sum += i;

            if(i == 100) {
                break;
            }

            ++i;
        }
        System.out.println("1부터 100까지의 합은 " + sum + "입니다.");


    }

    public void testSimpleBreakStatement2() {

        /*
         *
         * 구구단 2 ~ 9단 까지 출력
         * 단, 각 단의 수가 5보다 큰 경우는 생략한다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        for(int i = 2; i <= n; ++i){

            for(int j = 1; j <= 9; ++j){
                if(j > 5) {
                    break;
                    //continue;
                }
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }

    public void tesstJumpBreak() {

        label :
        for(;;) {
            for(int i = 0; i < 10; ++i) {
                System.out.println(i);
                if(i == 3) {
                    break label;
                    //label은 for(;;) 이걸 만났을 때 멈춰라 라는 의미이다.
                }
            }
        }

    }

}
