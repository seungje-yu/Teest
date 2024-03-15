package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {

    /*
    * java.util.Random 클래스
    * java.util.Random 클래스의 nextInt() 메소드를 사용하여 난수를 생성할 수 있다.
    * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 변환
    *
    *
     */

        /*
        * 원하는 범위의 난수를 구하는 공식
        * random.nextInt(최대값 - 최소값 + 1) + 최소값
        * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         */

        Random random = new Random(); // Random 객체 생성

        //1. 0 ~ 9까지의 난수 발생
        int randomnumber1 = random.nextInt(10); // 0 ~ 9까지의 난수 발생
        System.out.println("randomnumber1 : " + randomnumber1);

        //2. 1 ~ 10까지의 난수 발생
        int randomnumber2 = random.nextInt(10) + 1; // 0 ~ 9까지의 난수 발생 후 1을 더함
        System.out.println("randomnumber2 : " + randomnumber2);

        //3. 20 ~ 45까지의 난수 발생
        int randomnumber3 = random.nextInt(26) + 20; // 0 ~ 25까지의 난수 발생 후 20을 더함
        System.out.println("randomnumber3 : " + randomnumber3);

        //4. -128 ~ 127까지의 난수 발생
//        int randomnumber4 = random.nextInt(256) - 128; // 0 ~ 255까지의 난수 발생 후 128을 뺌
        int randomnumber4 = new Random().nextInt(256) - 128; // 한줄로 표현
        System.out.println("randomnumber4 : " + randomnumber4);
    }
}
