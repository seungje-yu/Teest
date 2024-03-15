package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 변수를 사용하는 방법
        * 1. 변수를 준비한다.(선언)
        * 2. 변수에 값을 대입한다.(값 대입 및 초기화)
        * 3. 변수를 사용한다.
        * */

        /*
        * 자료형이란?
        * 다양한 값의 형태별로 어느정도의 크기를 하나의 값으로 취급할 것인지 미리 COmpiler 와
        * 약속한 키워드이다.
        * 예) 앞에서 사용한 int자료형은 정수를 4byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다..
        * 이러한 자료형은 기본자료형(primary type)과 참조자료형(Reference type) 으로 나누어진다.
        *
        * */

        //기본자료형 8가지부터 시작
        //정수를 취급하는 자료형 4가지
        byte bnum;
        short snum;
        int inum;
        long lnum;

        //실수를 취급하는 자료형 2가지
        float fnum;
        double dnum;

        //문자를 취급하는 자료형
        char ch;
        char ch2;

        //논리값을 취급하는 자료형
        boolean isTrue;

        // 이상 8가지를 기본자료형(primary type) 이다.

        String str;  //4byte (주소값은 4byte 정수형)

        // 값 대입 및 초기화
        bnum = 1;

        snum = 2;
        inum = 4;
        //lnum = 8; //아무 문제 없는 것 같지만 사실 뒤에 대문자 L(or l)을 붙여야 한다.
        lnum = 8L; //소문자로 'l' 을 써도 되지만 글꼴 따라 숫자 1과 혼선이 빚어질 수 있어 대문자로 작성
        dnum = 8;
                //fnum = 4.0; //실수형태의 값을 funm 에 사용하는 것은 불가능하다.
        fnum =4.0f; //실수 뒤에 'f' 를 붙여야 한다. 'F'도 가능, 소문자가 일반적

        ch = 'a'; //문자형태의 값을 저장할 수 있다.
        ch2 = 97; //'a'는 97이라는 숫자이기때문에 숫자로도 저장할 수 있다.

        isTrue = true;
        isTrue = false; //true 혹은 false 중 한 가지 값만 사용 가능하다.

        str = "안녕하세요";

        //선언과 동시에 초기화
        int point = 100;
        int bonus = 10;

        System.out.println("==========변수에 저장된 값 출력==========");
        System.out.println("bnum 의 값 : " + bnum);
        System.out.println("snum 의 값 : " + snum);
        System.out.println("inum 의 값 : " + inum);
        System.out.println("lnum 의 값 : " + lnum);
        System.out.println("fnum 의 값 : " + fnum);
        System.out.println("dnum 의 값 : " + dnum);
        System.out.println("ch 의 값 : " + ch);
        System.out.println("ch2 의 값 : " + ch2);
        System.out.println("isTrue의 값:" + isTrue);
        System.out.println("str의 값:" + str);


        System.out.println("포인트와 보너스의 합:" + (point + bonus));

        /*
        대입 연산자의 왼편에는 공간이라는 의미, 오른편에는 값이라는 의미
         */

        point = point + 100;
        System.out.println("point = point + 100 ? " + point);







    }
}
