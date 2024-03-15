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

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        // i 번 반복
        for (int i = 1; i <= num; i++) {
            String str = "";

            // 공백 차감 반복
            for (int j = i; j < num; j++){
                str += " ";
            }

            // 숫자 추가
            int num2 = 0;

            for (int j = 1; j <= i; j++){
                num2 += j *(int)(Math.pow(10,i - j));
//                System.out.println("num2 = " + num2);
            }

            // 문자열 완성
            str += num2 + " x 8 + " + i + " = " + (num2 * 8 + i);

            // 완성된 문자열 출력
            System.out.println("str = " + str);

        }
    }

}
