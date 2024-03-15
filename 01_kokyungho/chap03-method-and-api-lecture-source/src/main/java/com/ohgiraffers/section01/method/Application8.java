package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /**
         * static 메소드를 호출하는 방법
         *
         */
        int first = 10;
        int second = 20;

        // 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능하다.
        System.out.println("두 수를 더한 값 : " + Application8.sumTwoNumbers(first,second));
        System.out.println("두 수를 더한 값 : " + sumTwoNumbers(first,second));


    }

    public static int sumTwoNumbers(int first, int second){
        return first + second;
    }
}
