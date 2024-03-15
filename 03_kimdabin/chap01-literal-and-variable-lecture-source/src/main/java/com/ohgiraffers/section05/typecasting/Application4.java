package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {
        /*
        * 형변환 사용 시 주의할 점
        * 데이터 손실에 유의해서 사용해야 한다.
        * */

        // 의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum =" + inum);  //290
        System.out.println("bnum =" + bnum);  //34

        double height = 185.5;
        int floorHeight = (int) height;
        System.out.println("floorHeight = " + floorHeight); //소수점 절삭



    }
}
