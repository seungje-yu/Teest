package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        /*상수란?
        * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념.
        * 변하지 않는 값(항상 고정된 값을) 저장해두기 위한 메모리상의 공간을 상수라고 한다.
        *
        * 상수의 사용 목적
        * 변경되지 않는 고정된 값을 저장할 목적으로 사용.
        * 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록한다.
        * 예) 수학공식에 사용되는 수치 등
        *
        * 사용방법
        * 1. 상수를 선언한다.(변수 선언과 유사하지만 final 키워를 사용)
        * 2. 값을 초기화한다.(초기화 이후에는 값 변경 불가능)
        * 3. 필요한 위치에 상수를 호출해서 사용한다.
        * */


        // 상수 선언
        final int AGE;

        // 초기화
        AGE = 20;
//        AGE = 30; // 이미 constant(상수) 20을 가지고 있어서 에러

        System.out.println("AGE의 값 : " + AGE);
        System.out.println("AGE의 값 : " + (AGE * 2)); // AGE 값이 바뀐 계산으로 사용가능

        int sum = AGE; // 대입 연산자의 오른편에는 기술 가능.

//        AGE = AGE + 10; // 대입 연산자의 왼쪽편에는 기술 불가능.














    }
}
