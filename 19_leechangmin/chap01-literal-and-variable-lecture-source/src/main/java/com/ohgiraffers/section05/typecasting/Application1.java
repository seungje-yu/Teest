package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 데이터 형변환
        * 데이터 형변환이 필요한 이유
        * - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * - 즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.
        * */

        /*
        * 형변환의 종류와 규칙
        *  1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        *   1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다. ex) long에 int를 넣어도 long이 가능하다.
        *   1-2. 정수는 실수로 자동 형변환 된다. ex) 정수는 실수로 담을 수 있다.
        *   1-3 믄자형은 int형으로 자동 형변환 된다, >> ASCII 코드
        *   1-4 논리형은 형변환 규칙에서 제외된다.
        *  2. 강제 형변환 (명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
        *   2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
        * */


        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;

        long result = (long) num1 + num2;
        int result2 = num1 + (int) num2;
        System.out.println("result2 = " + result2);
        System.out.println("result = " + result);
//                 자동으로 큰 쪽 자료형은 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.

        float fnum = 4.0f;
        double dnum = fnum;

        double result3 = fnum + dnum;
        System.out.println("result3 = " + result3);

        long eight = 8888888888888888888L; // >>long 형 변수로 선언을 해도 int의 최대값을 벗어나면 L을 붙여줘야 한다. 대충 19자리
        //기본적으로 정수는 int로 인식을 하기 때문이다.
        //이것도 자동으로 int 형변환이 된 것이기 때문이다.

        float four = eight;
        System.out.println("four = " + four);

        float result4 = eight + four;
        System.out.println("result4 = " + result4);

        // 문자 character는 정수형으로 자동 형변환
        char ch1 = 'a';
        int charNumber = ch1;
        System.out.println("charNumber = " + charNumber);

        char ch2 = 65; //이것도 자동 형변환이 되었기 때문이다.
        System.out.println("ch2 = " + ch2);

        boolean isTrue = true;
//        byte b = isTrue; boolean형은 어떤 자료형에도 담길 수 없다.
//        short s = isTrue;
//        int i = isTrue;
//        long l = isTrue;
//        char c = isTrue;
//        float f = isTrue;
//        double d = isTrue;
//        String str = isTrue;



    }
}
