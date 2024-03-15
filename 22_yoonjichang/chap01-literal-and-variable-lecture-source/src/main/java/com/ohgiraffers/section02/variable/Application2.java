package com.ohgiraffers.section02.variable;

import java.sql.SQLOutput;

public class Application2 {
    public static void main(String[] args) {

        byte bnum; //1byte
        short snum; //2byte
        int inum; //4byte
        long lnum; //8byte

        float fnum;
        double dnum;

        char ch;
        char ch2;

        boolean isTrue;

        String str; //4byte 주소값

        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;
        fnum = 4.0f;
        dnum = 8.0;

        ch = 'a';
        ch2 = 97;

        isTrue = true;
        isTrue = false;

        str = "안녕하세요";

        //선언과 동시에 초기화
        int point = 100;
        int bonus = 10;

        System.out.println("bnum의 값 :" + bnum);
        System.out.println("snum의 값 :" + snum);
        System.out.println("inum의 값 :" + inum);
        System.out.println("lnum의 값 :" + lnum);
        System.out.println("fnum의 값 :" + fnum);
        System.out.println("dnum의 값 :" + dnum);
        System.out.println("ch의 값 :" + ch);
        System.out.println("ch2의 값 :" + ch2);
        System.out.println("isTrue의 값 :" + isTrue);
        System.out.println("str의 값 :" + str);

        System.out.println("포인트와 보너스의 합 :" +(point+ bonus));

        point = point + 100;
        System.out.println("point = point + 100?" + point);
















    }
}
