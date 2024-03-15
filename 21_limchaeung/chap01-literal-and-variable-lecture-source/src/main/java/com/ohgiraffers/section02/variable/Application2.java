package com.ohgiraffers.section02.variable;
//    자바 Ctrl + Shift + 라인 드래그 후 선택한 라인만 주석됨
//    자바 Shift + 엠터 : 그냥 라인 내려감
//    Alt _드래그 하면 세로로 라인 복사함
//    Ctrl + Shift + 방향키 현재 라인 및드래그한 것 이동
//    Alt + E 상태바 이동
//    Shift 2번 클릭 전체 검색
//    soutv 입력 + Tab 변수가 있을때 자동 완성
public class Application2 {
    public static void main(String[] args) {
        /*변수를 사용하는 방법
        * 1. 변수를 준비한다(선언)
        * 2. 변수에 값을 대입한다.(값 대입 및 초기화)
        * 3. 변수를 사용한다.
        * */

        /* 자료형이란?
        * 다양한 값의 형태별로 어느정도의 크기를 하나의 값으로 취급할 것인지 미리 Compliler와 약속한 키워드이다
        * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼을 읽어서 하나의 값을 취급하겠다는 약속이다.
        * 이러한 자료현은 기본현(Primary type)과 참조자료형(Reference type)으로 나뉜다.*/

        // 기본자료형(Primary Type) 8가지 부터 시작
        // 정수를 취급하는 자료형
        byte bnum;  // byte 타입
        short snum; // short 타입을 받음
        int inum;
        long lnum;

        // 실수를 취급하는 자료형 2가지
        float fnum;
        double dnum;

        // 문자를 취급하는 자료형
        char ch;
        char ch2;

        // 논리값를 취급하는 자료형
        boolean isTrue;

        //
        String str; // 4byte(주소값은 4byte 정수형)


        // 값 대입 및 초기화
        bnum = 1;

        snum = 2;
        inum = 4;
        lnum = 8; // 아무 문제 없는 것 같지만 사실 뒤에 대문자 L 을 붙여야 한다. 이유는 형변환

        lnum = 8L; // 소문자로 'L'을 써도 되지만 글꼴에 따라 숫자 1과 혼선을 방지하기 위함.

//      fnum = 4.0; // 소수점은 기본 double로 인식하여 서로 형이 안맞음.
        fnum = 4.0f; // f, F 둘다 가능하지만 기본은 f로 많이 사용함
        dnum = 8.0d;
        ch = 'a';    // 문자 형태의 값을 저장할 ㅅ ㅜ있다.
        ch2 = 97;    // 'a'는 97이라는 숫자이기 때문에 숫자로도 저장할 수 있다

        isTrue = true;
        isTrue = false; // true, false 하나만 가능.

        str = "안녕하세요";


        // 선언과 동시에 초기화
        int point = 100;
        int bouns = 10;

        System.out.println("========== 변수에 저장된 값 출력 ==========");
        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("dnum의 값 : " + dnum);
        System.out.println("ch의 값  : " + ch);
        System.out.println("ch2의 값 : " + ch2);
        System.out.println("isTrue의 값 : " + isTrue);
        System.out.println("str의 값 : " + str);

        System.out.println("포인트와 보너스의 합 : " + (point + bouns));

        /*대입연산자의 왼편에는 공간이라는 의미, 오늘편에는 값이라는 의미*/
        point = point + 100;
        System.out.println("point = point + 100? " + point);


    }
}