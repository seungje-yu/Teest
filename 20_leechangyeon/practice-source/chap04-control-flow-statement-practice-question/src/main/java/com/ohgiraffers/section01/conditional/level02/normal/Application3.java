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

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int month = sc.nextInt();

        if (!(1 <= month && month <= 12)) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
//            switch문 사용
            switch (month) {
                case 3, 4, 5 -> System.out.println("봄");
                case 6, 7, 8 -> System.out.println("여름");
                case 9, 10, 11 -> System.out.println("가을");
                default -> System.out.println("겨울");
            }

//            if문 사용
            /*if (month / 3 == 1) {
                System.out.println("봄");
            } else if (month / 3 == 2) {
                System.out.println("여름");
            } else if (month / 3 == 3) {
                System.out.println("가을");
            } else {
                System.out.println("겨울");
            }*/
        }
    }
}
