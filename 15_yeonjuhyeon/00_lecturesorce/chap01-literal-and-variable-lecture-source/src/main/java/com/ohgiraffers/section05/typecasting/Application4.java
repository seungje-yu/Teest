package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String [] args){

        int inum = 290;
        int bnum =(byte) inum;

        System.out.println("inum = " + inum);
        System.out.println("bnum = " + bnum);       // bnum = 34


        double height = 185.5;
        int floorHeight = (int) height;
        System.out.println("height = " + height);   // height = 185 -> 소수점 절삭(floor라는 용어를 주로 사용)




    }
}
