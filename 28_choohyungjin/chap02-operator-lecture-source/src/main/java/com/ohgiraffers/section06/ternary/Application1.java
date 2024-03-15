package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 삼항 연산자
        * 자바에서 유일하게 피연산자 항목이 3개인 연산자.
        * 항목이 3개: (조건식)? 참일때 사용할 값1 : 거짓일때 사용할 값2
        *
        * 조건식은 반드시 결과가 true 또는 false인 boolean 타입이어야 한다.
        * (비교/논리연산자가 주로 사용된다.)
         */

        // 삼항연산자 단독 사용
        int num1 = 10;
        int num2 = -10;

        String result1 = (num1 > 0)? "양수다" : "양수가 아니다"; // 조건식이 true이므로 "양수다"가 대입된다.
        String result2 = (num2 > 0)? "양수다" : "양수가 아니다"; // 조건식이 false이므로 "양수가 아니다"가 대입된다.

        System.out.println(result1); // 양수다
        System.out.println(result2); // 양수가 아니다

        // 삼항연산자 중첩 사용
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0)? "양수다" : (num3 == 0)? "0이다" : "음수다"; // 조건식이 true이므로 "양수다"가 대입된다.
        String result4 = (num4 > 0)? "양수다" : (num4 == 0)? "0이다" : "음수다"; // 조건식이 false이므로 (num4 == 0)? "0이다" : "음수다"가 대입된다.
        String result5 = (num5 > 0)? "양수다" : (num5 == 0)? "0이다" : "음수다"; // 조건식이 false이므로 "음수다"가 대입된다.
        // ?를 붙히는 이유 : 삼항연산자는 조건식이 true일때와 false일때 각각의 결과값을 반환해야 하기 때문에

        System.out.println("num3은 : " + result3); // 양수다
        System.out.println("num4은 : " + result4); // 0이다
        System.out.println("num5은 : " + result5); // 음수다
    }
}
