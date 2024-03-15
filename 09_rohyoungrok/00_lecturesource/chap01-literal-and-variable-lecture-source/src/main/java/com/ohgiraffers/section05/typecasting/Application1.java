package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;

//        int result = num1 + num2; //자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
        long result1 = num1 + num2;

        System.out.println("result1 = " + result1);

        float fnum = 4.0f;
        double dnum = fnum;

        double result2 = fnum + dnum;

        System.out.println("result2 = " + result2);

//        long eight = 8888888888888888888;   // *숫자 값이 디폴트 값인 int의 범위를 벗어났기 때문에 에러가 뜬다. L을 붙여야함*
        long eight = 8;
        float four = eight;

        System.out.println("four = " + four);

        float result3 = eight + four;
        System.out.println("result3 = " + result3);

        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber = " + charNumber);

        char ch2 = 65;
        System.out.println(ch2);

        // 어느자료형이든 boolean을 형변환해서 담을 수 없다.
        boolean isTrue = true;
//        byte b = isTrue;
//        short s = isTrue;
//        int i = isTrue;
//         = isTrue;
//         = isTrue;
//         = isTrue;
//         = isTrue;
//         = isTrue;
    }
}
