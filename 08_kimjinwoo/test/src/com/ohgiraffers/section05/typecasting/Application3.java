package com.ohgiraffers.section05.typecasting;

public class Application3 {
    public static void main(String[] args) {

        /*
         * 자동 형변환과 강제형변환을 이용한 다른 자료형끼리의 연산
         * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다.
         */
        int iNum = 10;
        long lNum = 100;
        
        //int iSum = iNum + lNum;
        int iSum = (int) (iNum + lNum); //강제 형변환
        System.out.println("iSum = " + iSum); 
        
        int iSum2 = iNum + (int) lNum; //강제 형변환
        System.out.println("iSum2 = " + iSum2); 
        
        long lSum = iNum + lNum; //자동 형변환
        System.out.println("lSum = " + lSum); 
        
        //주의사항! int미만의 연산의 처리결과 int형이다.
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

        //short result = byteNum1 + byteNum2;  //result 타입은 꼭 int로 해야 한다.
        
    }
}
