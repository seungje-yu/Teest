package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application13 {

    public void test13() {

        /*
        * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
        *
        *
        * 정수하나를 입력하세요 : 5
        *         1 x 8 + 1 = 9
        *        12 x 8 + 2 = 98
        *       123 x 8 + 3 = 987
        *      1234 x 8 + 4 = 9876
        *     12345 x 8 + 5 = 98765
        *
        *
        *             1 x 8 + 1 = 9
        *            12 x 8 + 2 = 98
        *           123 x 8 + 3 = 987
        *          1234 x 8 + 4 = 9876
        *         12345 x 8 + 5 = 98765
        *        123456 x 8 + 6 = 987654
        *       1234567 x 8 + 7 = 9876543
        *      12345678 x 8 + 8 = 98765432
        *     123456789 x 8 + 9 = 987654321
        * 정수하나를 입력하세요 : 9
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n - i; ++j){
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2-1; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========================================");

        for(int i = 1; i <= n; ++i){
            for(int a = 1; a <= n - i; ++a) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; ++j){
                System.out.print(j);
            }
            System.out.print(" x " + " 8 " + " + ");
            System.out.print(i + " = ");
            for(int k = 1; k <= i; ++k){
                System.out.print(10 - k);
            }
            System.out.println();
        }

        }
    }

