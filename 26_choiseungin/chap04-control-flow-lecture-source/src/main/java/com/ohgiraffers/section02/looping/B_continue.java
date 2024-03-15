package com.ohgiraffers.section02.looping;

public class B_continue {

    public void testSimpleContinueStatement() {

        /*
         * continue문은 반복문 내에서 사용한다.
         * 해당 반복문의 반복회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
         * 일반적으로 if(조건식) {continue;} 처럼 사용된다.
         *
         * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 떄 자주 사용한다.
         */

        /* 구구단 2 ~ 9 단까지 출력
         * 단, 각 단의 수가 짝수인 경우 출력을 생략한다.
         * */

        for (int dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                if (su % 2 == 0) {
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void testJumpContinue() {

        label:
        for (int dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                if (su % 2 == 0) {
                    continue label;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }

    }
}
