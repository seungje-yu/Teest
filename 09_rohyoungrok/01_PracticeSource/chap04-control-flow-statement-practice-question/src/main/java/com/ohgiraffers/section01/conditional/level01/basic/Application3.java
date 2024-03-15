package com.ohgiraffers.section01.conditional.level01.basic;

import com.ohgiraffers.section01.conditional.InputUtils;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
         *
         * 힌트 : charAt()
         * 예시)
         * 주민등록번호를 입력해주세요(- 포함) : 881122-1
         *
         * ---출력----
         * 남자 입니다
         * */
        String input = InputUtils.inputWith("주민등록번호를 입력하세요(- 포함)");

        char ch = input.charAt(7);
        if (ch == '1' || ch == '3') {
            System.out.println("남자입니다.");
        } else if (ch == '2' || ch == '4') {
            System.out.println("여자입니다.");
        }
    }
}
