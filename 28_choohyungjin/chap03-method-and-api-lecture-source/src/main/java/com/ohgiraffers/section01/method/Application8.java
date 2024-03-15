package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {

        /*
        * static 메소드를 호출하는 방법
        * 클래스명.메소드명(매개변수);
         */
        System.out.println("10과 20을 더한 결과 : " + Application8.sumTwoNumbers(10, 20)); // 30

        // 동일한 클래스 내에 작성된 static 메소드를 호출할 때는 클래스명 생략 가능
        System.out.println("10과 20을 더한 결과 : " + sumTwoNumbers(10, 20)); // 30
        //
    }
    public static int sumTwoNumbers(int first, int second) {

        return first + second;
    }
}
