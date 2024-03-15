package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 강제형변환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        * 예) (바꿀자료형) 값;
        * */

//        자동 형변환은 보통 작은것을 큰것에 넣으니까 데이터에 손실이 있기는 힘들다.
//        강제 형변환은 큰것을 작은것에 넣을 때 데이터 손실이 발생할 수 있다.

        /*
         *  자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
         *  1. 강제 형변환 규칙
         *   1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
         *   1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
         *   1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
         *   1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
         * */

        long lnum = 8;
        int inum = (int) lnum; //데이터 손실 가능성을 컴파일러가 알려준다.(Compiler Error)
        //변경하려는 자료형을 명시하여 강제 형변환을 해야한다.

        short snum = (short) inum;
        double dnum = 8.0;
        float fnum = (float) dnum;

        //실수 -> 정수 변경 시 강제 형변환이 필요하다.
        float fnum2 = 4.0f;
        long lnum2 = (long) fnum2; // 소수점의 데이터 손실 가능성 때문

        // 1-3
        char ch = 'a';
        byte bnum2 = (byte) ch;
        short snum2 = (short) ch; // 같은 크기지만 부호비트(sign bit)로 인한 값의 범위가 다르기 때문이다.

        int num1 = 97;
        int num2 = -97;

        char ch1 = (char) num1;
        char ch2 = (char) num2; //원래 char는 음수 값을 가질 수 없지만, 명시적 형변환 시에는 음수를 갖는게 가능 하다.

        // 논리형은 강제형변환 규칙에서도 제외된다. 천회천 넘사벽 느낌으로 되는게 없다고 보면 된다.







    }
}
