package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 강제형변환
         * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
         * ex) (바꿀자료형) 값;
         */

        /*
         *  자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
         *  1. 강제 형변환 규칙
         *   1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
         *   1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
         *   1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
         *   1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
         */
        
        long lNum = 8;
          //int iNum = lNum; //데이터 손실 가능성을 컴파일러가 알려준다.(에러남)
        int iNum = (int) lNum; //변경하려는 자료형을 명시하여 강제 형변환을 해야한다.
        short sNum = (short) iNum;
        
        double dNum = 8.0;
          //float fNum = dNum; //데이터 손실 가능성을 컴파일러가 알려준다.(에러남)
        float fNum = (float) dNum;
        System.out.println("fNum = " + fNum);

        //실수 -> 정수 변경 시 강제 형변환이 필요하다.
        float fNum2 = 4.0f;
          //long lNum2 = fNum2; // 소수점 자리 이하 데이터 손실 가능성
        long lNum2 = (long) fNum2; // 강제 형변환의 의미는 '내가 데이터 손실을 감안할테니 형변환 해줘'라는 의미

        //문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        char ch = 'a';

        byte bNum2 = (byte) ch; //char 자료형보다 작은 크기이니 강제형변환을 해야 한다.
        short sNum2 = (short) ch; //같은 2byte인데 왜 강제 형변환을 해야 하냐면 부호비트(sign bit)로 인한 값의 범위가 다르기 때문이다.

        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2; // 음수도 강제 형변환 하면 대입할 수 있다.

        //논리형은 강제형변환 규칙에서도 제외된다.
        boolean isTrue = true;
//        byte b = (byte) isTrue;
//        short s = (byte) isTrue;
//        int i = (byte) isTrue;
//        long l = (byte) isTrue;
//        char c = (byte) isTrue;
//           float f = (byte) isTrue;
//        double d = (byte) isTrue;



    }
}
