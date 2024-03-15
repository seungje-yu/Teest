package com.uijin.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 자동 형변환과 강제형변환을 이용한 다른 자료형끼리의 연산
         * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다.
         */

        int inum = 10;
        long lnum = 100;

//        int isum = inum + lnum;     // 왼.오 자료형 안 맞음녀 연산 안됨. 큰걸 작은거에 못넣어서.
        int isum = (int) (inum + lnum);     // ()통해서 먼저 연산하고 int로 바꿔주기도 가능 ---> 강제 형변환 이용
        System.out.println("isum = " + isum);

        int isum2 = inum + (int) lnum;
        System.out.println("isum2 = " + isum2);


        long lsum = inum + lnum;
        System.out.println("lsum = " + lsum);// 자동 형변환을 이용한 것.


        // 주의사항 int 미만의 연산의 처리결과는 무조건 int형이다. int가 디폴트이기 때문 - byte, short만 가지고 연산할 때. (하위에 char도 있......
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1  = 3;
        short shortNum2  = 4;

        int result1 = byteNum1 + byteNum2;
        int result2 = byteNum1 + shortNum2;
        int result3 = shortNum1 + byteNum1;
        int result4 = shortNum1 + shortNum2;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);



    }
}
