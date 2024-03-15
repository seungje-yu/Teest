package com.ohgiraffers.section05.typecasting;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 자동 형변환과 강제형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다.
        * */

        int inum = 10;
        long lnum = 100;

        int isum = (int) (inum + lnum);
        int inum2 = inum + (int) lnum; //연산의 순서에 따라 달라질 수 있다. >> 여러 상황에 따라 다르다.

        long lsum = inum + lnum; //얘는 작은걸 큰거에 담으려 해서 자동형변환이 가능하다.


        // int 미만의 연산의 처리결과는 int형이다. >>> int형이 default 값이기 때문이다.
        byte byteNum = 1;
        byte byteNum2 = 2;
        short shortNum = 3;
        short shortNum2 = 4;
        //short result1 = byteNum + byteNum2; // 1234모두 byte나 short가 아닌 int형으로 인식되기 때문이다. >> default 값

        int result1 = byteNum + byteNum2;
        int result2 = byteNum2 + shortNum;
        int result3 = shortNum + byteNum2;
        int result4 = shortNum + shortNum2;

        piramide();

    }

    static void piramide(){
        Scanner scn = new Scanner(System.in);
        int cnt = scn.nextInt();
        for (int i = 0; i < cnt; i++){
            for (int j = 0; j < i; j++){
                System.out.print("#");
            }
            System.out.println("");
            for (int k = 0; k > (i * 2) - 1; k++ ){}
            System.out.print("*");
        }

    }
}
