package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 자동 형변환과 강제형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다.
        * */
        int inum = 10;
        long lnum = 100;

//        int isum = inum + lnum;
        int isum =(int) (inum + lnum);
        System.out.println("isum = " + isum); // 강제형변환

        int isum2 = inum + (int) lnum;
        System.out.println("isum2 = " + isum2);  // 강제형변환

        long lsum = inum + lnum;  // 자동형변환
        System.out.println("lsum = " + lsum);

        // 주의사항 int미만의 연산의 처리결과 int형이다.
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
