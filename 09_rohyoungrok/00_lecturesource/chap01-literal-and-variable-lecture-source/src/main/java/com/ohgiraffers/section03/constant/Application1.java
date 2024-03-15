package com.ohgiraffers.section03.constant;

public class Application1 {


    public static void main(String[] args) {

        // 상수 선언
        final int AGE;

        // 초기화
        AGE = 20;
//        AGE = 30; // 초기화 이후 값을 재 대입하는 것은 불가능

        System.out.println("AGE = " + AGE);

        System.out.println("AGE의 2배 : " + (AGE * 2));

        int sum = AGE;  // 대입 연산자의 오른편에는 기술 가능하다.
//        AGE = AGE + 10; // 대입 연산자의 왼쪽편에는 기술 불가능
    }
}
