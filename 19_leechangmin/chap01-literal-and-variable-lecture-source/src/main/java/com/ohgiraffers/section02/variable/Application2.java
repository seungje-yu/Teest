package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 변수를 사용하는 방법
        * 1. 변수를 준비한다(선언)
        * 2. 변수에 값을 대입한다.(값 대입 == 초기화)
        * 3. 변수를 사용한다.
        * */

        /*
        * 자료형이란?
        * 다양한 값의 형태별로 어느정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
        * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼을 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *   이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다.
        * */

        //기본 자료형 8가지 부터 시작

        //    정수 취급 자료형
        byte bnum; // -128 ~ 127
        short snum;
        int inum;
        long lnum;
        //>> 선언만 하고 초기화는 x

        //    실수 취급 자료형
        float fnum;
        double dnum;

        //    문자 취급 자료형
        char ch;
        char ch2;

        //    논리값 취급 자료형
        boolean isTrue;
        // 8개의 기본자료형 (Primary Type)

        String str; // 4byte (주소값은 4byte 정수형) >> Reference Type

        //변수에 값 대입 및 초기화
        bnum= 1;
        snum = 2;
        inum = 4;
        lnum = 8; // 아무 문제 없는 것 같지만 사실 뒤에 L을 붙여야 한다.
        // 소문자 l도 가능은 하지만 가독성을 위해 대문자를 붙이는 것이 관례

        fnum = 4.0f; //f를 안붙힌 실수형태의 값을 사용하는 것은 불가능 하다.
        // 대문자 F도 가능은 하지만 f를 붙이는 것이 관례
        dnum = 8.0;

        ch = '2'; // 문자 형태의 값을 저장할 수 있다.
        ch2 = 97;// 아스키 번호 내의 숫자도 가능하다.

        isTrue = true;
        isTrue = false; // false는 0이다. >> 0을 제외한 모든 음수 양수는 true로 취급된다.

        str = "안녕하세요";

        // 선언과 동시에 초기화
        int point = 100;
        int bonus = 10;

        System.out.println("==============변수에 저장된 값 출력 ================");
        System.out.println("bnum = " + bnum);
        System.out.println("snum = " + snum);
        System.out.println("inum = " + inum);
        System.out.println("inum = " + inum);
        System.out.println("lnum = " + lnum);
        System.out.println("fnum = " + fnum);
        System.out.println("dnum = " + dnum);
        System.out.println("ch = " + ch);
        System.out.println("ch2 = " + ch2);
        System.out.println("isTrue = " + isTrue);
        System.out.println("str = " + str);

        System.out.println("포인트와 보너스의 합 : " + (point + bonus));

        /*
        * 대입연산자의 좌변은 공간이라는 의미, 우변에는 값이라는 의미
        * */

        point += 100;
        System.out.println("point = point + 100? " + point);

    }
}
