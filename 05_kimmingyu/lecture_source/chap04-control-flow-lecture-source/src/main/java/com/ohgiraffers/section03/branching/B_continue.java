package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement() {
        /*
        * continue문은 반복문 내에서 사용
        * 해당 반복문의 반복회차를 중간에 멈추고 다시 증감식으로 넘어가게 함
        * 일반적으로 if(조건식) { continue; }처럼 사용
        *
        * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용
        * */

        /* 구구단 2 ~ 9단까지 출력
        *  단 각 단의 수가 짝수인 경우 출력을 생략
        * */
        for(int dan = 2; dan  < 10; dan++) {

            for (int su =1; su < 10; su++) {

                if(su % 2 == 0) {
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

            System.out.println();
        }
    }

    public void testJumpContinue() {

        label :
        for(int dan = 2; dan  < 10; dan++) {

            for (int su =1; su < 10; su++) {

                if(su % 2 == 0) {
                    continue label;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

            System.out.println();
        }
    }
}
