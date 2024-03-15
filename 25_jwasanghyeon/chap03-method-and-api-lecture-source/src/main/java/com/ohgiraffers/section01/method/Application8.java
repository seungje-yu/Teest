package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        // static << 저장공간 별도, 이미 메모리 공간에 자리를 잡고 있다.
        // 클래스명.메소드명();

        System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10, 20));

        System.out.println("10과 20의 합 : " + sumTwoNumbers(10, 20));
    }

    public static int sumTwoNumbers(int first, int second){

        return first + second;
    }
}
