package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {


        // 8가지 기본 자료형
        byte bnum;
        short snum;
        int inum;
        long lnum;

        float fnum;
        double dnum;

        char ch;
        char ch2;

        boolean isTrue;     // 논리값을 취급하는 자료형


        String str;     // 4byte ( 주소값은 4byte정수형)

        // 값 대입 및 초기화
        bnum = 1;
        snum = 2;
        inum = 4;
        //lnum = 8;   // 아무 문제 없는 것 같지만 사실 뒤에 대문제 L을 붙여야한다.
                    // 이유는 뒤에 형변환에서
        lnum = 8L; // 소문자로 'l'을 써도 되지만 글꼴에 따라
                    // 숫자 1과 혼선이 빚어질 수 있어서 대문자로 하는걸 권장

        //fnum = 4.0    // 실수형태의 값을 fnum에 사용은 불가능
        fnum = 4.0f;    // 실수 뒤에 'f'를 붙여야 한다.

        ch = 'a';   // 문자 형태의 값을 저장할 수 있다.
        ch = 97;    // 'a'는 97이라는 숫자이기때문에 숫자로도 저장할 수 있다.

       isTrue = true;
       isTrue = false;

        str = "안녕하세요";

        // 선언과 동시에 초기화

        int point = 100;
        int bonus = 10;

        System.out.println("===== 변수에 저장된 값 출력 =====");

        System.out.println("str의 값 :" + lnum);
        System.out.println("str의 값 :" + str);







    }
}
