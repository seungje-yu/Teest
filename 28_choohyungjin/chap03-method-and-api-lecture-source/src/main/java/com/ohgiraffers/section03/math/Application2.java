package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 난수의 활용
        * Math.random() 메소드를 이용해 발생한 난수는 0.0 이상 1.0 미만의 실수를 반환한다.
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야 하는 경우들이 존재
         */
        /*
        * 원하는 범위의 난수를 구하는 공식
        * (int)(Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
         */

        // 1. 0 ~ 9까지의 난수 발생
        int random1 = (int)(Math.random() * 10); // 0 ~ 9, int가 있는 이유: Math.random()은 double형이기 때문에 int로 형변환 해줘야 한다.
        System.out.println("random1 = " + random1);

        // 2. 1~10까지의 난수 발생
        int random2 = (int)(Math.random() * 10) + 1; // 1 ~ 10, +1을 하는 이유: 0 ~ 9까지의 난수에 1을 더해준다.
        System.out.println("random2 = " + random2);

        // 3. 10~15까지의 난수 발생
        int random3 = (int)(Math.random() * 6) + 10; // 10 ~ 15, 10부터 15까지 6개의 난수를 발생시키기 위해 6을 곱해준다.
        System.out.println("random3 = " + random3);

        // 4. -128~ 127까지의 난수 발생
        int random4 = (int)(Math.random() * 256) - 128; // -128 ~ 127, 256을 곱해주고 128을 빼준다.
        System.out.println("random4 = " + random4);





    }
}
