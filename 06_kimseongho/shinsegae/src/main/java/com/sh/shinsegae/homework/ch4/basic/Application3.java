package com.sh.shinsegae.homework.ch4.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /**
         * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
         *
         * 힌트 : charAt()
         * 예시)
         * 주민등록번호를 입력해주세요(- 포함) : 881122-1
         *
         * ---출력----
         * 남자 입니다
         */

        Scanner sc = new Scanner(System.in);

        char gender = sc.nextLine().split("-")[1].charAt(0);

        System.out.println(gender == '1' ? "남자입니다." : "여자입니다");

    }
}
