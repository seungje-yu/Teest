package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        /*
        변수를 사용하는 방법
        1. 변수를 준비(선언)
        2. 변수에 값 대입(값 대입 및 초기화)
        3. 변수를 사용한다.
         */

        /*
        [자료형]
        다양한 값의 형태별로 어느정도 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드
        ex| int 자료형은 정수를 4byte만큼 읽어서 하나의값을 취급함. 이러한 자료형은 기본자료형과 참조자료형으로 나뉨
         */

        // 기본자료형 8가지 부터 시작
        // 정수를 취급하는 자료형 4가지
        byte bnum;
        short snum;
        int inum;
        long lnum;

        // 실수를 취급하는 자료형 2가지
        float fnum;
        double dnum;

        // 문자를 취급하는 자료형
        char ch;
        char ch2;

        // 논리값을 취급하는 자료형
        boolean isTrue;

        // 기본자료형 8가지(Primary type)

        String str;     // 4byte (주소값은 4byte 정수형)

        // 값 대입 및 초기화
        bnum = 1;
        snum = 2;
        inum = 4;
        //lnum = 8;   // 아무 문제 없는 것 같지만 사실 뒤에 대문자 L을 붙여야한다. ===> 이유는 뒤에 형변환에서..
        lnum = 8L;  //소문자로 'l'을 써도 되지만 글꼴에 따라 숫자 1과 혼선할 수 있어서 대문자를 권장

        //fnum = 4.0; ===> 실수형태의 값을 fnum에 사용 불가능함
        fnum = 4.0f; // 실수 뒤에 'f'를 붙여야함 (대부분 소문자로 표기함)
        dnum = 8.0;
        ch = 'a';   // 문자 형태의 값 저장
        ch2 = 97;    // 'a'는 97이라는 숫자이기 때문에 숫자로도 저장

        isTrue = true;
        isTrue = false; // true 혹은 false 중 하나의 값만 사용 가능

        str = "안녕하세요";

        // 선언과 동시에 초기화
        int point = 100;
        int bonus = 10;

        System.out.println("============= 변수에 저장된 값 출력 ================");
        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("lnum의 값 : " + lnum);
        System.out.println("fnum의 값 : " + fnum);
        System.out.println("dnum의 값 : " + dnum);
        System.out.println("ch의 값 : " + ch);
        System.out.println("ch2의 값 : " + ch2);
        System.out.println("isTure의 값 : " + isTrue);
        System.out.println("str의 값 : " + str);

        System.out.println("포인트와 보너스의 합 : " + (point + bonus));

        /*
        대입연산자의 왼쪽에는 공간이라는 으미, 오른ㅉ고은 값이라는 의미
         */
        point = point + 100;
        System.out.println("point = point + 100 ? " + point);
    }
}
