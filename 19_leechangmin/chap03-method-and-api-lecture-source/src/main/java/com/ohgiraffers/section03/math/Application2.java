package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application2 {

    public static void main(String[] args) {
        /*
        * 난수의 활용
        * Math.random()을 이용해 발생한 난수는 0.0부터 1.0미만의 실수 범위의 난수값을 반환한다.
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야 하는 경우들이 존재한다.
        * */

//        (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        int rand = (int) (Math.random() * 10) + 1;
        System.out.println(rand);

        /*
        * 10 ~ 15까지의 난수 발생
        * */
        int rand2 = (int) (Math.random() * 6) +10;
        System.out.println(rand2);

        /*
        * -128 ~ 127까지의 난수
        * */
        int rand3 = (int) (Math.random() * 256) - 128;
//      int rand3 = (int) (Math.random() * 256) + ( -128 );
        System.out.println(rand3);

        /*
        * java.util.Random 클래스
        * java.util.Random 클래스의 nextInt() 메서드를 이용
        * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜 정수 형태로 반환
        * */

        /*
        * 원하는 범위의 난수를 구하는 공식
        * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */
        Random rnd = new Random();

        /*
        * 0~9의 난수
        * */

        int rnum1 = rnd.nextInt(10);
        System.out.println("rnum1 = " + rnum1);

        int rnum2 = rnd.nextInt(1000) + 1;
        System.out.println("rnum2 = " + rnum2);

        //20 ~ 45까지의 난수
        int rnum3 = rnd.nextInt(26) + 20;
        System.out.println("rnum3 = " + rnum3);

        //-128 ~ 127까지의 난수
        int rnum4 = rnd.nextInt(256) - 128;
        System.out.println("rnum4 = " + rnum4);
//  rnd를 재사용한건데 재사용 안할꺼면 이렇게 하면 된다.
        int rnum5 = new Random().nextInt(256) - 128;
        System.out.println("rnum5 = " + rnum5);

    }
}
