package com.ohgiraffers.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement() {
        /*
        * continue문은 반복문 내에서 사용
        * 해당 반복문의 반복회차를 중간에 멈추고 다시 증감식으로 넘어감
        * 일반적으로 if (조건식) { continue; }처럼 사용
        *
        * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용
        * */

        /*
        * 구구단 2 ~ 9단 출력
        * 단, 각 단의 수가 짝수인 경우 출력 생략
        * */

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j % 2 == 0) continue;
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public void testJumpContinue() {
        Outer:
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j % 2 == 0) continue Outer;
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
