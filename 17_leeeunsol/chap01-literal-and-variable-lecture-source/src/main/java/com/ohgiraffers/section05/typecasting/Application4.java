package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 형변환 사용 시 주의할 점
        * 데이터 손실에 유의해서 사용해야한다.
        * */

        //의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;

        //2진법으로변환후 뒤에서부터 가능한 자리까지 짤리므로 차이가 많이남
        //이 경우가없도록주의
        System.out.println("inum = " + inum);
        System.out.println("bnum = " + bnum);

        //의도
        double height = 185.5;
        int floorHeight = (int) height; // 변수명에 floor가 붙으면 절삭의 의미를 같는다.
        System.out.println("height = " + height);
        System.out.println("floorHeight = " + floorHeight); //소수점에 절삭에 이용할 수 있다.
    }
}
