package com.ohgiraffers.operatorPractice;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 임의의 정수 한개를 선언하고 해당 숫자가 13세 이하이면 어린이, 13세초과 ~ 19세 이하이면
         * 청소년, 19세 초과이면 성인이라고 출력되도록 작성하세요
         *
         * 19
         *
         * ------ 출력 결과 --------
         * 청소년
         * */
//        String result1 = (age1 <= 13)? "어린이" : "청소년";
        String result2 = (age2 < 0)? "양수다" : "양수가 아니다";


        int age = 12;
      String result = ( age <= 13)? "어린이" : (age < 13 && age >= 19)? "청소년": "성인";
     System.out.println(age + "은(는) " + age + "입니다.");

  /*      *//*삼항연산자 중첩 사용*//*
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0)? "양수다" : (num3 == 0)? "0이다": "음수이다";
        String result4 = (num4 > 0)? "양수다" : (num4 == 0)? "0이다": "음수이다";
        String result5 = (num5 > 0)? "양수다" : (num5 == 0)? "0이다": "음수이다";

        System.out.println("num3 = " + result3);
        System.out.println("num4 = " + result4);*/


    }
}
