package com.ohgiraffers.section01.literal;

public class Application3 {
//    자바 Ctrl + Shift + 라인 드래그 후 선택한 라인만 주석됨
//    자바 Shift + 엠터 : 그냥 라인 내려감
//    Alt _드래그 하면 세로로 라인 복사함
//    Ctrl + Shift + 방향키 현재 라인 및드래그한 것 이동
//    Alt + E 상태바 이동
//    Shift 2번 클릭 전체 검색
    public static void main(String[] args) {
        System.out.println("========== 두개의 문자열 합치기 ==========");
        System.out.println(9 + 9);      // 18
        System.out.println("9" + 9);    // 99
        System.out.println(9 + "99");   // 99
        System.out.println("99" + "99");// 99

        System.out.println("========== 세개의 문자열 합치기 ==========");
        System.out.println(9 + 9 + "9");    // 189
        System.out.println(9 + "9" + 9 );   // 999
        System.out.println("9" + 9 + "9");  // 999
        System.out.println("9" + 9 + 9);    // 999 모든 숫자를 문자열로 만들고 싶으면 첫 자리를 문자열"" 로 시작함
        System.out.println(" " + 9 + 9);    // 99

//      괄호부터 계산
        System.out.println( "9" + (9 + 9) ); //

//        10과 20의 사칙연산 결과를 출력
        System.out.println("========== 10과 20의 사칙 연산 결과 ==========");
        System.out.println("10과 20의 합 : " + (10 + 20) );
        System.out.println("10과 20의 차 : " + (10 - 20) );
        System.out.println("10과 20의 곱 : " + (10 * 20) );
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20) );
        System.out.println("10과 20의 나머지 : " + (10 % 20) );

    }
}
