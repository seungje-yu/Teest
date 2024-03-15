package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {

        //의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum = " + inum);
        System.out.println("bnum = " + bnum);

        double height = 185.5;
        int floorHeight = (int) height;

        System.out.println("height = " + height);
        System.out.println("floorHeight = " + floorHeight); //소수점에 절삭을 이용할 수 있다.
    }
}
