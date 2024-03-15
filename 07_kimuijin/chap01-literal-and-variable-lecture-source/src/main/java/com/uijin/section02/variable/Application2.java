package com.uijin.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 변수를 사용하는 방법
         * 1. 변수를 준비한다. (선언)
         * 2. 변수에 값을 대입한다. (값 대입 및 초기화)
         * 3. 변수를 사용한다.
         */


        /*
         * 자료형이란?
         * 다양한 값의 형태별로 어느정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
         * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼을 읽어서 하나의 값으로 취급하겠다는 약속이다.
         *      이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다.
         */

        // 기본자료형 8가지 부터 시작
        // 정수를 취급하는 자료형
        byte bnum;  // 값 없음 -> 선언한다.
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

        // 이상 8가지를 기본자료형(Primary type)

        String str;  //4byte String은 보통 주소값 (주소값은 4byte 정수형)

        // 1. 값 대입 및 초기화
        bnum = 1; // 값이 없었는데 1이라는 값으로 초기화한 것
        snum = 2;
        inum = 4;
//        lnum = 8;  // 아무 문제 없는 것 같지만 사실 뒤에 대문자 L을 붙여야 한다. 이유는 뒤에 형변환에서..

        lnum = 8L;  // 소문자로 'l'을 써도 되지만 글꼴에 따라 숫자 1과 혼선이 빚어질 수 있어서 대문자로 하는 것이 권장이다.

//        fnum = 4.0;
        fnum = 4.0f;  // 실수 뒤에 'f'를 붙여야 한다. 'F'도 가능하지만 소문자를 사용하는 것이 일반적이다.
        dnum = 8.0;

        ch = 'a';  // 문자 형태의 값을 저장할 수 있다.
        ch2 = 97;        // 'a'는 97이라는 숫자이기 때문에 숫자로도 저장할 수 있다.

        isTrue = true;
        isTrue = false;     // 두개 돌리면 결과는 false. true 혹은 false 중 한 가지의 값만 사용 가능하다.

        str = "안녕하세요";      // String은 주소값으로 쓰임


        // 2. 선언과 동시에 초기화
        int point = 100;
        int bonus = 10;

        System.out.println("==============변수에 저장된 값 출력==============");
        System.out.println("bonus의 값 : " + bnum);
        System.out.println("snum : " + snum);
        System.out.println("inum : " + inum);
        System.out.println("lnum : " + lnum);
        System.out.println("fnum : " + fnum);
        System.out.println("dnum : " + dnum);
        System.out.println("ch : " + ch);
        System.out.println("ch2 : " + ch2);     // 출력하면 a
        System.out.println("isTrue : " + isTrue);
        System.out.println("str : " + str);


        System.out.println("포인트와 보너스의 합 : " + (point + bonus));     //110

        /*
         * 대입연산자의 왼편에는 공간이라는 의미, 오른 편에는 값이라는 의미
         */
        point = point + 100;        // 위의 110과 상관 없음. 대입연산자가 있어야 값을 대입할 수 있음
        System.out.println("point = point + 100 ?" + point);        //200


    }
}
