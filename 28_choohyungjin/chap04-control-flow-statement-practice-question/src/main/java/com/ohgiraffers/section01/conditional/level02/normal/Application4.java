package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         * */

        System.out.println("=========1~10 정수에 따라 홀수인지 짝수인지 출력=========");
        //임의의 숫자를 입력받아
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요! : ");
        int num = sc.nextInt();

        //1~10 사이의 정수가 아닌 경우
        if (num < 1 || num > 10) { // 1보다 작거나 10보다 큰 경우, 즉 1~10 사이의 정수가 아닌 경우
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }
        //홀수인 경우
        else if (num % 2 != 0) { // 2로 나누었을 때 나머지가 0이 아닌 경우
            System.out.println("홀수다.");
        }
        //짝수인 경우
        else {
            System.out.println("짝수다.");
        }
    }
}
