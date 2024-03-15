package com.ohgiraffers.section03.branching;

public class B_continue {

    /*
     * continue문은 반복문 내에서 사용한다.
     * 해당 반복문의 반복회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
     * 일반적으로
     * if(조건식) {
     *    continue;
     *   }
     * 처럼 사용된다.
     *
     * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용된다.
     */

    /* 구구단 2 ~ 9단까지 출력
     * 단 각 단의 수가 짝수인 경우 출력을 생략한다.
     */

    public void testSimpleContinueStatement() {

        for (int i = 2; i <= 9; ++i) {
            for (int j = 1; j <= 9; ++j) {
                if(j % 2 == 0) {
                    continue;
                }
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }

    public void testJumpContinue() {

        label :
        for (int i = 2; i <= 9; ++i) {
            for (int j = 1; j <= 9; ++j) {
                if(j % 2 == 0) {
                    continue label; //if문을 만나서 label을 만나면 두 번째 for문을 벗어나고 첫 번째 for문으로 간다.
                }
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }

    }

}
