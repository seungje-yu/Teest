package com.ohgiraffers.section01.conditional.level02.normal;

import com.ohgiraffers.section01.conditional.InputUtils;

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

        int month = InputUtils.inputNumberWith("숫자를 입력하세요");

        String result = getMonth(month);
        System.out.println(result);
    }

    private static String getMonth(int month) {
        if (month >= 3 && month <= 5) {
            return "봄";
        }
        if (month >= 6 && month <= 8) {
            return "여름";
        }
        if (month >= 9 && month <= 11) {
            return "가을";
        }
        if (month == 12 || month == 1 || month == 2) {
            return "겨울";
        }
        return "잘못입력하셨습니다";
    }
}
