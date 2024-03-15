package com.ohgiraffers.section05;

public class Application3 {
    public static void main(String[] args) {

        int inum = 10;
        long lnum = 100;

        int isum =(int) (inum +lnum);
        System.out.println("isum = " + isum);
        
        int isum2 = inum + (int) lnum;
        System.out.println("isum2 = " + isum2);

        long lsum = inum + lnum;
        System.out.println("lsum = " + lsum);

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
