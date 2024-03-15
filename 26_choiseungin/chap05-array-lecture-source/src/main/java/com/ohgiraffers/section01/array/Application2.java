package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 배열의 사용방법
         * 1. 배열의 선언
         * 2. 배열의 할당
         * 3. 배열의 인덱스 공간에 값 대입
         * */

        /*
         * 배열의 선언
         * 자료형[] 변수명;
         * 자료형 변수명[];
         * */

        /* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */
        int[] iarr;
        char carr[];

        /*
         * 선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
         * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
         * 발생한 주소를 레퍼런스변수(참조형 변수)에 저장하고 이것을 참조하기 때문에 참조자료형(reference type)이라고 한다.
         */

//        iarr = new int[];       // 크기를 지정해주지 않아서 에러 발생
        iarr = new int[5];
        carr = new char[10];

        /* heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역이다.
         * stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
         * */
        System.out.println("iarr = " + iarr);   // 16진수 주소값 출력
        System.out.println("carr = " + carr);

        /*
         * hashCode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
         * 동일 객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체로 취급하기 위한 용도로 overriding해서 사용한다.
         *
         * 동일객체 : 값도 같고, 주소값도 같은 경우
         * 동등객체 : 값은 같고, 주소값이 다른 경우
         * */

        System.out.println("iarr = " + iarr.hashCode());
        System.out.println("carr = " + carr.hashCode());

        System.out.println("iarr의 길이 : " + iarr.length);
        System.out.println("carr의 길이 : " + carr.length);

        Scanner sc = new Scanner(System.in);
        System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darr의 hashCode : " + darr.hashCode());
        System.out.println("darr의 길이 : " + darr.length);

        darr = new double[30];

        System.out.println("수정 후 darr의 hashCode : " + darr.hashCode());
        System.out.println("수정 후 darr의 길이 : " + darr.length);

        // 한 번 지정한 배열의 크기는 변경하지 못한다.

//        darr = null;
//        System.out.println("삭제 후 darr의 길이 : " + darr.length);
    }
}