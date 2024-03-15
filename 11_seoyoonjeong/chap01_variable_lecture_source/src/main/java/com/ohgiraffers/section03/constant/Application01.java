package com.ohgiraffers.section03.constant;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 상수란?
        * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념이다. 변하지 않는 값을 저장해두기 위한 메모리상의 공간을 상수라고한다.
        *
        * 상수의 사용목적
        * 변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
        * 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다
        * 예) 수학공식에 사용되는 수치 등
        *
        * 사용 방법
        * 1.상수를 선언한다.(변수 선언과 유사하지만 final키워드를 사용한다.)
        * 2.값을 초기화 한다. (초기화 이후에는 값 변경 불가능하다)
        * 3.필요한 위치에 상수를 호출해서 사용한다.
        * */

        //상수 선언
        final int AGE; //상수 일때는 대문자로 표현

        //초기화
        AGE=20;
        //AGE=30; 한번 초기화 한 이후 값을 재 대입하는 것은 불가능하다.

        System.out.println("AGE = " + AGE);
        System.out.println("AGE의 2배 :" + (AGE*2));

        int sum = AGE;  // 대입 연산자의 오른편에는 기술 가능하다.
     //   AGE=AGE+10; //대입연산자의 왼쪽편에는 기술 불가능








    }
}
