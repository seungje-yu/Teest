package com.ohgiraffers.section03.math;

import java.util.Random;


public class Application3 {

    public static void main(String[] args) {

        /*
            * java.util.Random 클래스
            * java.util.Random 클래스의 nextInt() 메소드를 이용해 난수 발생
            * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜 정수형태로 반환
         */

        /*
            * 원하는 범위의 난수를 구하는 공식
            * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         */

        Random random = new Random();

        /* 0부터 9까지의 난수 발생 */
        int randomNumber1 = random.nextInt (10);
        System.out.println("randomNuber1 = " + randomNumber1);

        /* 1부터 10까지의 난수 발생*/
        int Number2 = random.nextInt(10) +1;
        System.out.println("Number2 = " + Number2);

        /* 20부터 45까지의 난수 발생*/
        int Number3 = random.nextInt(26) +20;
        System.out.println("Number3 = " + Number3);

    }
}
