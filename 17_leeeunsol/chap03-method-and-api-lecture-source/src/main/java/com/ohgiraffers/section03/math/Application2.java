package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {
        /*
        * 난수의 활용
        * Math.random()을 이용해 발생한 난수는 0.0부터 1.0까지의 실수 범위의 난수값을 반환한다.
        * 필요에 따라 정수 형태의 값을우너하는 범위만큼 발생시켜야하는 경우들이 존재한다.
        *
        * 원하는 범위의 난수를 구하는공식
        * (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * 구하려는 난수의 최소값을 더하는이유 : 시작하는 숫자가 0이 아닌경우 0이 나온경우 최소값으로 변환하기위해
        * 구하려는 난수의 갯수 : 난수를 발생시키려는 구간의 최대-최소+1
        * */

        /* 1. 0~9까지의 난수발생*/
        int random1 = (int) (Math.random() * 10);
        System.out.println("random1 = " + random1);
        
        /* 2. 1~10까지의 난수 발생*/
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("random2 = " + random2);

        /* 3. 10~15가지의 난수발생*/
        int random3 = (int) (Math.random() * 5) + 10;
        System.out.println("random3 = " + random3);
        
        /* 4. -128 ~127 까지의 난수발생 */
        int random4 = (int) (Math.random() * 256) - 128;
//        int random4 = (int) (Math.random() * 256) + (-128); 위와 같이지만 다른 표현방법
        System.out.println("random4 = " + random4);
    }
}
