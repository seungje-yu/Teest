package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application03 {
    public static void main(String[] args) {
        /*
        * java.util.Random클래스
        * java.util.random 클래스의 nexInt() 메소드를 이용해 난수 발생
        * nextInt(int bound): 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환*/

        /*
        * 원한는 범위의 난수를 구하는 공식
        * random.nextInt(구하려는 난수의 갯수) +구하려는 난수의 최솟값
        * */
        Random random=new Random(); //객체 생성

        //0부터 9까지의 난수 발생
        int randomNumber1=random.nextInt(10);
        System.out.println("randomNumber1 = " + randomNumber1);

        // 1부터 10까지의 난수 발생
        int randomNumber2=random.nextInt(10)+1;
        System.out.println("randomNumber2 = " + randomNumber2);


        //20부터 45까지의 난수 발생시키기
        int randomNumber3=random.nextInt(26)+20;
        System.out.println("randomNumber3 = " + randomNumber3);


        //-128 부터 127까지

        int randomNumber4 = random.nextInt(256)-128;
        System.out.println("randomNumber4 = " + randomNumber4);
    }
}
