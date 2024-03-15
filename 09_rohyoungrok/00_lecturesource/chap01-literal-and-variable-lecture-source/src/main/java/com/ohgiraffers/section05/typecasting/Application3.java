package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        int inum = 10;
        long lnum = 100;

//        int isum = inum + lnum;
        int isum = (int) (inum + lnum); //먼저 계산 후 int타입으로 강제형변환
        System.out.println("isum = " + isum);

        int isum2 = inum + (int)lnum;   //lnum을 int타입으로 강제형변환
        System.out.println("isum2 = " + isum2);

        long lsum = inum + lnum;    //자동형변환

        // 주의사항 int미만의 연산의 처리결과는 int형이다.
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;

        int result1 = byteNum1 + byteNum2;
        int result2 = byteNum1 + shortNum1;
        int result3 = shortNum1 + byteNum1;
        int result4 = shortNum1 + shortNum2;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }
}
