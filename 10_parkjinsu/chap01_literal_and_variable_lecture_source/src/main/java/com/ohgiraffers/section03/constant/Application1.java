package com.ohgiraffers.section03.constant;

public class Application1 {

    public static void main (String[] args) {

        /*상수란?
        * 변수가 메모리에 변경될 값을 저장하기 위한 공간이라면, 상수는 이와 상반되는 개념.
        * 변하지 않는 값(고정)을 저장해두기 위한 메모리상의 공간이 상수.
        *
        * 사용 목적
        * 변경되지 않는 고정된 값을 저장할 목적.
        * 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
        *
        * 1. 상수 선언 (final 키워드 사용)
        * 값을 초기화. -> 이후에는 값 변경 불가
        * 필요한 위치에 상수 호출해서 사용
        * */

        final int AGE; //상수일 때는 대문자. (상수 선언)

        AGE = 20; //초기화
//        AGE = 30; //한번 초기화 한 이후 값을 재대입하는 것은 불가능.

        System.out.println("AGE의 값 : " + AGE);
        System.out.println("AGE의 2배 : " + (AGE * 2));

        int sum = AGE; // 대입 연산자의 오른편에는 기술 가능하다.
//        AGE = AGE + 10; // 왼쪽편에는 기술 불가능.



    }
}
