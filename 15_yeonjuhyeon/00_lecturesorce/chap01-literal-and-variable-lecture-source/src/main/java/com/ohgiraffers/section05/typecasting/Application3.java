package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args){

        int inum = 10;
        long lnum = 100;

//        int isum = inum + lnum;
        int isum = (int) (inum + inum); // 강제형변환
        // 또는
        int isum1 = inum = (int) lnum; //같은 방식이지만 값이 달라질 수 있음

        long lsum = inum + lnum; //자동형변환


        // int 미만의 연산 처리는 int
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;

//        short result1 = byteNum1 + byteNum2;  //error
        int result2 = byteNum1 + byteNum2;
        int result3 = byteNum1 + shortNum1;     // int형 결과만 가능


    }

}
