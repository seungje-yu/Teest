package com.uijin.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /**
         * java.util.Random 클래스
         * java.util.Random 클래스의 nextInt() 메소드를 이용해 난수 발생
         * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환
         */

        /**
         * 원하는 범위의 난수를 구하는 공식
         * random.nextInt(구하려는 난수의 개수) + 구하려는 난수의 최소값
         */

        Random random = new Random();       // 객체 생성

        /* 1. 0부터 9까지의 난수 발생*/
        int randomNumber1 = random.nextInt(10);
        System.out.println("randomNumber1 = " + randomNumber1);

        /* 2. 0부터 10까지의 난수 발생*/
        int randomNumber2 = random.nextInt(10) + 1;
        System.out.println("randomNumber2 = " + randomNumber2);

        /* 3. 20부터 45까지의 난수 발생*/
        int randomNumber3 = random.nextInt(26) + 20;
        System.out.println("randomNumber3 = " + randomNumber3);

        /* 4. -128부터 127까지의 난수 발생*/
//        int randomNumber4 = random.nextInt(256) -128;
        int randomNumber4 = new Random().nextInt(256) - 128;        // 객체 한 번 생성해놓고 계속 재사용하지 않고 단발성으로 쓸 때 새로 객체 생성하면서 메소드 사용
        System.out.println("randomNumber4 = " + randomNumber4);



    }
}
