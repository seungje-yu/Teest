package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 나이를 입력 받아 입력받은 수가 13세 이하이면 "어린이"출력, 13세 초과 ~ 19세 이하이면 "청소년" 출력, 19세 초과 "성인"을 출력하세요.
        * 
        * 나이를 입력하세요 : 12
        * 
        * ---- 출력 ----
        * 어린이
        * 
        * 나이를 입력하세요 : 29
        * 성인
        * */

//        나이를 입력 받는다 --> Scanner sc.nextInt()
//        입력받은 수가 13세 이하이면 "어린이"출력  --> 조건문 사용 출력
//        13세 초과 ~ 19세 이하이면 "청소년" 출력  --> 조건문 사용 출력
//        19세 초과 "성인"을 출력하세요 --> else 나머지로 걸어놓고 출력

        /* Fix : 0이하 숫자를 넣어도 어린이가 출력되어서 age <= 0이라는 조건이 참이라면
         * 제대로 된 값을 넣어주세요 라는 오류메세지를 출력하면서 프로그램을 종료한다.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        if(age <= 0){
            System.out.println("제대로 된 값을 넣어주세요");
        } else if(age <= 13)  {
            System.out.println("어린이");
        } else if(age <= 19) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }


    }
}
