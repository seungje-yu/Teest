package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main (String[] args){

        /*
        * 변수 사용 방법
        * 1. 변수 선언한다
        * 2. 값을 대입 및 초기화
        * 3. 변수 사용
        * */

        /*
        * 자료형?
        * 다양한 값의 혀애별로 어느정도 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드
        * int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급
        * 자료형은 Primary type(기본자료형)과 Reference type(참조자료형)이 있다.
        * */

        //기본 자료형 8가지부터 시작
        byte bnum; //1byte
        short snum; //2byte
        int inum; //4byte
        long lnum; //8byte
        //-> 선언한다.
        float fnum; //4byte
        double dnum; //8byte

        char ch; //문자 취급 2byte
        boolean isTrue; //논리값 1byte

        String str; //4byte
        bnum = 1;
        snum = 2;
        inum = 4;
        // lnum = 8;
        lnum = 8L; //대소문자 상관 x
        fnum = 4.0f; //실수 뒤에 f 붙이기
        dnum = 8.0;
        ch = 'a';
        int ch2 = 97;

        isTrue = true;
        isTrue = false;

        str = "안녕하세요";
        //선언과 동시에 초기화
        int point = 100;
        int bonus = 10;

        System.out.println("bonus = " + bnum);
        System.out.println("snum = " + snum);
        System.out.println("inum = " + inum);
        System.out.println("lnum = " + lnum);
        System.out.println("fnum = " + fnum);
        System.out.println("dnum = " + dnum);
        System.out.println("ch = " + ch);
        System.out.println("ch2 = " + ch2);
        System.out.println("isTrue = " + isTrue);
        System.out.println("str = " + str);
        System.out.println("포인트와 보너스의 합은 ? " + (point + bonus));

        //대입연산자의 왼편에는 공간이라는 의미, 오른편은 값
        point = point + 100;
        System.out.println("point = point + 100 ? " + point);


    }
}
