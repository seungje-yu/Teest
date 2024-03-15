package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {


        // 1. 0 ~ 9 까지의 난수 발생
        int random1 = (int) (Math.random() * 10);       // 갯수는 (범위+1)
        System.out.println("ranmdom1 = " + random1);

        // 2. 1 ~ 10 까지의 난수 발생
        int random2 = (int) (Math.random() * 10) + 1;    // (0을 방지하기 위해 1을 더함)   
        System.out.println("random2 = " + random2);

        // 3. 10 ~ 15 까지의 난수 발생
        int random3 = (int) (Math.random() * 6) + 10;     // (시작점을 지정해주는 더하기)
        System.out.println("random3 = " + random3);

        // 4. -128 ~ 127 까지의 난수 발생
        int random4 = (int) (Math.random() * 256) + (-128);
        System.out.println("random4 = " + random4);
    
    }
}
