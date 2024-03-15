package com.ohgiraffers.section05.typecasting;

public class Application04 {
    public static void main(String[] args) {
        /*
        * 형 변환 사용 시 주의 할 점
        * 데이터 손실에 유의해서 사용해야한다.
        * */


        //의도하지 않은 데이터손실
        int inum=290;
        byte bnum=(byte) inum;
        System.out.println("bnum = " + bnum);
        System.out.println("inum = " + inum);


        double height=185.5;
        int floorHeight=(int)height;
        System.out.println("height = " + height);
        System.out.println("floorHeight = " + floorHeight); //소수점에 절삭에 이용할  수 있다.

    }
}
