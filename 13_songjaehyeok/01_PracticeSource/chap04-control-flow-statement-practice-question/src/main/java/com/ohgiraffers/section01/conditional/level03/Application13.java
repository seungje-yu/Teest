package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application13 {

    public static void main(String[] args) {

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
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        int front = 0;
        int back = 0;
        for(int i = 0 ; i < num ; i++){
            // 왼쪽 수 붙이기
            String s = "";
            for(int j = 1; j<= i+1; j++){
                s+=j;
            }

            // 빈칸찍기
            for(int m = (num-1); m >= i; m--) { // 3
//                System.out.print("_");
                System.out.print(" ");
            }


            System.out.print(s);
            System.out.print(" * 8");
            System.out.print(" + " + (i+1) + " = ");


            for(int k = 9; k >= (10-i)-1; k--) {
                System.out.print(k);
            }
            System.out.println(" ");
            /*
            * 1 -> 9
            * 2 -> 98
            * 9에서 시작해서 (10-값)
            * */
        }



    }

}
