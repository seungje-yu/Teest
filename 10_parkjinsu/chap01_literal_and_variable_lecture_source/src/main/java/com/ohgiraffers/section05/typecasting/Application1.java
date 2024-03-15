package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 데이터 형변환
         * 데이터 형변환이 필요한 이유
         * 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행 가능
         * 즉, 같은 데이터 타입끼리만 연산 수행.
         **/
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;

        long result1 = num1 + num2;

        float fnum = 4.0f;
        double dnum = fnum;

        double result2 = fnum + dnum;

        System.out.println(result1);
        System.out.println(result2);

//        long eight = 8888888888888888888; // 이것도 자동으로 형변환된 것 (int 범위 벗어나면 에러 발생)}

        long eight = 8;
        float four = eight;

        System.out.println("four = " + four);

        float result3 = eight + four;
        System.out.println("result3 = " + result3);

        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber = " + charNumber );

        char ch2 = 65;
        System.out.println(ch2);

        boolean isTrue = true;
//        byte b = isTrue; // boolean은 형변환 안됌

    }
}
