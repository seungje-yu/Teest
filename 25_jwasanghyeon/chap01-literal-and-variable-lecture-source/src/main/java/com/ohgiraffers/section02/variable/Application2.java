package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 변수를 사용하는 방법
        * 1. 변수를 준비 (선언)
        * 2. 변수에 값을 대입 (값 대입 및 초기화)
        * 3. 변수를 사용한다
        * */

        // 기본 자료형 8가지 부터 시작
        // 정수를 취급하는 자료형

        byte bnum; // -> 선언하기
        short snum;
        int inum;
        long lnum;

        // 실수를 취급하는 자료형
        float fnum;
        double dnum;

        // 문자를 취급하는 자료형
        char ch;
        char ch2;

        // 논리값을 취급하는 자료형
        boolean isTrue;

        String str; // 4byte (주소값은 4byte 정수형)

        // 값 대입 및 초기화
        bnum = 1;
        snum = 2;
        inum = 4;
        // lnum = 8; // 아무 문제 없어보이지만 뒤에 대문자 L 붙여야함

        lnum = 8L; // 소문자로 사용하면 헷갈리니까 대문자로
        fnum = 4.0f; // 뒤에 f를 붙여야한다. 실수 형태의 값을 float에 넣을 수 없음..?
        dnum = 5.3;

        ch = 'a'; // 문자 형태의 값을 저장할 수 있다.
        ch2 = 97; // 'a' = 97

        isTrue = true;
        isTrue = false; // 둘중에 한가지 값만 가능하다.

        str = "안녕하세요"; // 내부적으로 주소값을 가지는 것

        // 선언과 동시에 초기화
        int point = 100;
        int bonus = 10;

        System.out.println("============= 변수에 저장된 값 출력 ===============");
        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum = " + snum);
        System.out.println("inum = " + inum);
        System.out.println("lnum = " + lnum);
        System.out.println("fnum = " + fnum);
        System.out.println("dnum = " + dnum);
        System.out.println("ch = " + ch);
        System.out.println("ch2 = " + ch2);
        System.out.println("isTrue = " + isTrue);
        System.out.println("str = " + str);

        System.out.println("포인트와 보너스의 합 : " + (point + bonus));

        /*대입 연산자의 왼편에는 공간이라는 의미, 오른 편에는 값이라는 의미
         */
        point = point + 100;
        System.out.println("point = point + 100 ? " + point);
    }
}
