package com.ohgiraffers.section5.typecasting;

import java.nio.file.LinkOption;

public class Application1 {
    public static void main(String[] args) {

    /*  형변환의 종류와 규칙
     *   1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
     *    1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
     *    1-2. 정수는 실수로 자동 형변환 된다.
     *    1-3. 문자형은 int형으로 자동 형변환 된다.
     *    1-4. 논리형은 형변환 규칙에서 제외된다.
     *   2. 강제형변환 (명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
     *    2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
     */

        byte bnum =1;
        short sunum = bnum;
        int inum = sunum;
        long lnum = inum;

        int  num1 = 10;
        long num2 = 20;

//        int result = num1 + num2; / num2가 long 타입이여서 int 로 받아서 에러
        long result = num1 + num2;
        System.out.println("result = " + result);
        float fnum = 4.0f;
        double dnum = fnum;
        
        double result2 = fnum + dnum;

        System.out.println("result2 = " + result2);

//        long eight = 8888888888; // 이것도 자동으로 형변환 된것 (int 범위 벗어나면 에러 발생)
    long eight = 8;
    float four = eight;

        System.out.println("four = " + four);
    
        float result3 = eight + four;
        System.out.println("result3 = " + result3);
        
        char ch1 = 'a';
//        char ch1 = "a"; // 문자열은 숫자로 인식 안함
        int charNumber = ch1;

        System.out.println("charNumber = " + charNumber);

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);

        // 어느자료형이든 boolean을 형병환해서 담을 수 없다.
        boolean isTrue = true;
//        byte b = isTrue; // byte, short, int, long, char, float, double 등 boolean 값은 못받음



    }
}
