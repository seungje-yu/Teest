package com.ohgiraffers.section03.math;

public class Application1 {
    public static void main(String[] args) {


        /* 절대값 */
        System.out.println("-7의 절대값 : "            + (java.lang.Math.abs(-7)));
        System.out.println("10과 20중 더 작은 것은 : " + Math.min(10,20));
        System.out.println("20과 30중 더 큰 것은 : "   + Math.max(20,30));

        /* 상수 불러오기 */
        System.out.println("원주율 : "     + Math.PI);


        /* 0.0부터 1.0 전까지의 실수형태의 난수를 발생
         * 호출할때마다 다른값을 가진다.
         */
        System.out.println("난수 발생 : "  + Math.random());
    }
}
