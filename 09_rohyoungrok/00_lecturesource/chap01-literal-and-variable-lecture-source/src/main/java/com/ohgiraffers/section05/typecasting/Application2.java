package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        long lnum = 8;
//        int inum = lnum;    //데이터 손실 가능성을 컴파일러가 알려준다 (에러)
        int inum = (int) lnum;  //변경하려는 자료형을 명시하여 강제 형변환을 해야한다.

        short snum = (short) inum;

        double dnum = 8.0;
//        float fnum = dnum;  //데이터 손실 가능성을 컴파일러가 알려준다 (에러)
        float fnum = (float) dnum;
        System.out.println("fnum = " + fnum);

        // 실수 -> 정수 변경 시 강제 형변환이 필요하다.
        float fnum2 = 4.0f;
//        long lnum2 = fnum2;   //소수점 자리 이하 데이터 손실 가능성
        long lnum2 = (long) fnum2;  //강제형변환의 의미는 '내가 데이터 손실을 감안할테니 형변환 해줘'라는 의미

        //문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        char ch = 'a';
        byte bnum2 = (byte) ch; //char 자료형보다 작은 크기이니 강제형변환을 해야 한다.
        short snum2 = (short) ch;   //같은 2byte인데 부호비트(sign bit)로 인한 값의 범위가 다르기 때문이다.

        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2; //음수도 강제형변환 하면 대입 가능

        //논리형은 강제형변환 규칙에서도 제외된다.
        boolean isTrue = true;
//        byte b = (byte) isTrue;
//        short s = (byte) isTrue;
//        int i = (byte) isTrue;
//        long l = (byte) isTrue;
//        char c = (byte) isTrue;
//        float f = (byte) isTrue;
//        double d = (byte) isTrue;
    }
}
