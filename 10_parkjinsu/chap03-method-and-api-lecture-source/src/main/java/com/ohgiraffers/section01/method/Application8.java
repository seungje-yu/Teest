package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /*
         * static method 호출하는 방법
         * 클래스명.메소드명();
         * */
        System.out.println("10과 20의 합은 ? " + Application8.sumTwoNumbers(10, 20));

        //동일한 클래스 내 작성된 static method는 클래스명 생략 가능.
        System.out.println("1o과 20의 합은 ? " + sumTwoNumbers(10, 20));

    }

    public static int sumTwoNumbers(int first, int second) {

        return first + second;
    }

}
