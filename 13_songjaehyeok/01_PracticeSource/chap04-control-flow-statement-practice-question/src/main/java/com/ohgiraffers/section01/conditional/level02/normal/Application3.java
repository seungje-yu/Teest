package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 임의의 숫자를 입력받아 해당 계절을 출력해주세요
         * 단, 1~12사이의 숫자가 아닌 값이 들어는것은 "잘못입력하셨습니다"를 출력
         * 계절 구분
         * 봄 : 3월,4월,5월
         * 여름: 6월,7월,8월
         * 가을: 9월,10월,11월
         * 겨울: 12월,1월,2일
         *
         * -----  출력 -----
         * 숫자를 입력하세요 : 1
         * 겨울
         * */

        int month;
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");
        month = sc.nextInt();

        if(1 <= month && month <= 12){
            switch (month){
                case(1),(2),(12):
                    System.out.println("겨울");
                    break;

                case(3),(4),(5):
                    System.out.println("봄");
                    break;

                case (6),(7),(8):
                    System.out.println("여름");
                    break;

                case (9),(10),(11):
                    System.out.println("가을");
                    break;

            }
        }
        else {
            System.out.println("잘못입력하셨습니다");
        }

//        if (month == 3 || month == 4 || month == 5) {
//            System.out.println("봄");
//        } else if (month == 6 || month == 7 || month == 8) {
//            System.out.println("여름");
//        } else if (month == 9 || month == 10 || month == 11) {
//            System.out.println("가을");
//        } else if (month == 12 || month == 1 || month == 2) {
//            System.out.println("겨울");
//        } else {
//            System.out.println("잘못입력하셨습니다");
//        }

    }
}
