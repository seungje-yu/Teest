package com.ohgiraffers.section5.typecasting;
//    Ctrl + Shift + 라인 드래그 후 선택한 라인만 주석됨
//    Shift + 엠터 : 그냥 라인 내려감
//    Alt _드래그 하면 세로로 라인 복사함
//    Ctrl + Shift + 방향키 현재 라인 및드래그한 것 이동
//    Alt + E 상태바 이동
//    Shift 2번 클릭 전체 검색
//    soutv 입력 + Tab 변수가 있을때 자동 완성
public class Application2 {
    public static void main(String[] args) {
        /*강제형변환
        * 바꾸려는 자료형으로 cast 연산자를 이용하여 형변환(casting)
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
//        int inum = lnum;     // 데이터 손실 가능성을 컴파일러가 알려준다
        int inum = (int) lnum; // 변경하려는 자료형을 명시하여 강제 형변환을 해야한다.

        short snum = (short) inum;

        double dnum = 8.0;
//        float fnum = dnum;   // 데이터 손실 가능성을 컴파일러가 알려준다
        float fnum = (float) dnum;
        System.out.println("fnum = " + fnum);

        //  실수 -> 정수 변경 시 강제 형변환이 필요.
        float fnum2 = 4.0f;
        //long lnum2 = fnum2; // 소수점 자리 이하 데이터 손실 가능성 에러
        long lnum2 = (long) fnum2; // 강제형변환의 의미는 '내가 데이터 손실을 감안할테니 형변환 해줘'라는 의미
        System.out.println("lnum2 = " + lnum2);

        // 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다
        char ch = 'a';
        byte bnum2 = (byte) ch; // char 자료형보다 작은 크기이니 강제형변환을 해야 한다.
        System.out.println("bnum2 = " + bnum2);
        short snum2 = (short) ch; // 같은 2byte인데 왜 강제 형변환을 해야하냐면 부호비트(sign bit)로 인한 값의 범위가 다르기 때문.

        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2; // 음수도 강제형변환 하면 대입할 수 있다.

        // 논리형은 강제형변환 규칙에서도 제외된다
//                boolean isTrue = (byte) true; // boolean은 형변환 or 강제형변환 안됨
        //        byte b = isTrue;
        //        short s = isTrue;
        //        int i = isTrue;
        //        long l = isTrue;
        //        char c = isTrue;
        //        float f = isTrue;
        //        double d = isTrue;.



    }
}
