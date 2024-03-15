package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        // 기본자료형 8가지 기본자료형(Primary type)
        // 정수를 취급하는 자료형 4가지
        byte bnum;  //1byte
        short snum; //2byte
        int inum;   //4byte
        long lnum;  //8byte

        // 실수를 취급하는 자료형 2가지
        float fnum;     //4byte
        double dnum;    //8byte

        // 문자를 취급하는 자료형
        char ch;        //2byte
        char ch2;       //2byte

        //논리값을 취급하는 자료형
        boolean itTrue; //1byte

        //참조형 (Reference type)
        String str;     // 4byte (주소값은 4byte정수형)

        // 값 대입 및 초기화
        bnum = 1;
        snum = 2;
        inum = 4;
        //lnum = 8;     // 아무 문제 없는 것 같지만 사실 뒤에 대문자 L을 붙여야한다.
        lnum = 8L;      // 소문자도 가능하지만 숫자 1과 혼선이 빚어질 수 있어 대문자로 하는것을 권장

        //fnum = 4.0;   // 실수 뒤에 'f'를 붙여야한다. 대문자도 가능하지만 소문자를 사용하는 것이 일반적
        fnum = 4.0f;

        dnum = 8.0;

        ch = 'a';       // 문자 형태의 값을 저장할 수 있다.
        ch2 = 97;       // 'a'는 97이라는 숫자이기때문에 숫자로 저장도 가능

        itTrue = true;
        itTrue = false; // true 혹은 false 중 한 가지의 값만 사용 가능하다.

        str = "안녕하세요";

        // 선언과 동시에 초기화
        int point = 100;
        int bonus = 10;

        System.out.println("===== 변수에 저장된 값 출력 =====");
        System.out.println("bnum = " + bnum);
        System.out.println("snum = " + snum);
        System.out.println("inum = " + inum);
        System.out.println("lnum = " + lnum);

        System.out.println("fnum = " + fnum);
        System.out.println("dnum = " + dnum);

        System.out.println("ch = " + ch);
        System.out.println("ch2 = " + ch2);

        System.out.println("itTrue = " + itTrue);

        System.out.println("str = " + str);

        System.out.println("포인트와 보너스의 합 : " + (point + bonus));

        /*
        대입연산자의 왼편에는 공간이라는 의미, 오른 편에는 값이라는 의미
         */

        point = point + 100;
        System.out.println("point = point + 100 ? " + point);
    }
}
