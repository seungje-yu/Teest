package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        /*
         * 변수를 사용하는 방법
         * 1. 변수를 준비한다(선언)
         * 2. 변수에 값을 대입한다.(값 대입 및 초기화);
         * 3. 변수를 사용한다.
         *  */

        /*
        * 자료형이란?
        * 다양한 값의 형태별로 어느정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드다
        * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼을 읽어서 하나의 값으로 취
        * 급하겠다는 약속이다.
        * 이러한 자료형은 기본자료형(primary type)과 참조자료형(Reference type)으로 나누어진다.
        * */

        // 기본자료형 8가지 부터 시작
        // 정수를 취급하는 자료형 4가지
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

        //이상 8가지를 기본자료형 primary type

        String str; //4byte(주소값은 4byte정수형)

        //값 대입 및 초기화
        bnum=1;
        snum = 2;
        inum = 3;
//        lnum = 8;//아무 문제없는 것 같지만 사실 뒤에 대문자 L을 붙여야한다. 이유는 뒤에 형변환에서 알아볼에정

        lnum = 8L; //소문자로 'l'을 서도 되지만 글꼴에 따라 숫자 1과 혼선이 빚어질 수 있어서 대문자로 작성하는것을 권장
//        fnum=4.0; // 실수형태의 값을 fnum에 사용하는것은 불간능하다.
        fnum = 4.0f; //실수 뒤에 f를 붙여야한다. F도 가능하지만 소문자를 사용하는것이 일반적이다.

        ch = 'a'; // 문자 형태의 값을 저장할 수 있다.
        ch2 = 97; //'a'는 97이라는 숫자이기 때문에 숫자로도 저장할수있다.

        isTrue=true;
        isTrue = false; // true혹은 false중 한 가지의 값만 사용가능하다.

        str = "안녕하세요";

        //선언과 동시에 초기화
        int point = 100;
        int bonus = 10;

        System.out.println("===변수에 저장된 값 출력 ===");
        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("lnum의 값 : " + lnum);

        /*
        * 대입연산자의 왼편에는 공간이라는 의미, 오른편에는 값이라는 의미
        * */
        point= point+100;
        System.out.println("point = point + 100 ? " +point);

    }
}
