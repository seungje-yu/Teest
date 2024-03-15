package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {

        /*
        강제 형변환
        바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        에) (바꿀 자료형) 값;
         */

        /*
         *  자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
         *  1. 강제 형변환 규칙
         *   1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
         *   1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
         *   1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
         *   1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
         * */

        long lnum = 8;
//        int inum = lnum; //데이터 손실 가능성을 컴파일러가 알려준다.(에러가 난다.)
        int inum = (int)lnum; //변경하려는 자료형을 명시하여 강제 형변환을 해야한다.

        short snum = (short) inum;

        double dnum = 8.0;
//        float fnum = dnum; //데이터 손실 가능성을 컴파일러가 알려준다.(에러가 난다.)
        float fnum = (float) dnum;

        System.out.println("fnum =" + fnum);

        //실수 -> 정수 변경 시 강제 형변환이 필요하다.
        float fnum2 = 4.0f;
//        long lnum2 = fnum2; //소수점 자리 이하 데이터 손실 가능성
        long lnum2 = (long) fnum2; //강제형변환의 의미는 '내가 데이터 손실을 감안할테니 형변환해줘' 라는 의미

        //문자열을 int 미만 크기의 변수에 저장할 때, 강제 형변환이 필요하다.
        char ch = 'a';
        byte bnum2 = (byte) ch; //char 자료형보다 작은 크기이니 강제형변환을 해줘야한다.
        short snum2 = (short) ch; //같은 2byte 인데 왜 강제 형변환을 해야하냐면 부호비트(sign bit) 로 인한 값의 범위가 다르기 때문이다.


        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2; //음수도 강제형변환을 시키면 대입할 수 있다.

        //논리형은 강제 형변환 규칙에도 제외가 된다.
        boolean isTrue = true;
//        byte b = isTrue;
//        short s = isTrue;
//        int i = isTrue;
//        long l = isTrue;
//        char c = isTrue;
//           float f = isTrue;
//        double d = isTrue;




    }
}
