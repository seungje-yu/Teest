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
        System.out.print("정수하나를 입력하세요 : ");
        int num = sc.nextInt();

        int result = 0;

        // i 번째 줄 결과값 = (i-1)번째 줄 결과값 + 1으로만 이루어진 i자리 수 * 8 + 1
        for (int i = 1; i <= num; i++) {
            int tmp = 0;
            for (int j = 0; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                tmp = tmp * 10 + 1;
            }
            result = result + tmp * 8 + 1;
            System.out.println(" x 8 + " + i + " = " + result);
        }
    }
}
