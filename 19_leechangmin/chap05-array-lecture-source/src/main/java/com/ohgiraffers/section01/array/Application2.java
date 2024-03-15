package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {


        /*
        * 배열의 사용 방법
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입
        * */

        /*
        * 배열의 선언
        * 자료형[] 변수명; 으로 선언
        * */

        /* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */
        int[] iarr;
        char[] carr;

        /*
        * 선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        * 발생한 주소를 레퍼런스변수(참조형변수)에 저장하고 이것을 참조하여 사용하기 때문ㅇ 참조자료형이라고 한다.
        * (reference type)
        * */

        iarr = new int[]{1, 2, 3, 4};
        carr = new char[10];

        /* heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역이다.
        *  stack에 저장된 주소를 heap에 할당된 배열을 찾아갈 수 있다.
        * */

        /* 배열명을 sout하면 16진수의 주소값이 출력된다.
        * hashCode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
        * 동일객체인지 비교할 때 사용할 목적으로 쓰여지며,
        * 동등객체를 동일객체로 취급하기 위한 용도로 overriding 해서 사용한다.
        *
        * 동일객체 : 값도 같고, 주소값도 같은 경우 >> == 비교로도 같다.
        * 동등객체 : 값은 같지만, 주소값은 다른 경우 .equals로 비교해야하는 느낌.
        * */
        System.out.println("iarr의 hashCode = " + iarr.hashCode());
        System.out.println("carr의 hashCode = " + carr.hashCode());

        System.out.println("iarr의 길이 : " + iarr.length);
        System.out.println("carr의 길이 : " + carr.length);
        //String에서 length는 메서드이지만,
        //배열 array에서 length는 필드이다.

        Scanner sc = new Scanner(System.in);
        System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];
        System.out.println("darr의 hashCode = " + darr.hashCode());
        System.out.println("darr의 length = " + darr.length);
        darr = new double[20];
        System.out.println("========메모리 확장중=========");
        System.out.println("수정후 darr의 hashCode = " + darr.hashCode());
        System.out.println("수정후 darr의 length = " + darr.length);
        System.out.println("수정후 darr의 hashCode = " + darr.hashCode());
        System.out.println("수정후 darr의 hashCode = " + darr.hashCode());
        System.out.println("수정후 darr의 hashCode = " + darr.hashCode());

        /* 배열의 사이즈는 증가? 증축이 불가능 하기 때문에 큰 사이즈를 만든 후 기존의 값을 복사해야 한다.
        * >> 동일객체가 아니라 동등객체가 되는 것임. 주소값이 달라진다.
        * */

        darr = null; // >>참조하고 있던 주소값을 null값으로 바꿔버림 >> 힙과 스택의 연결이 끊긴다.
        // nullPointException >> 모르는데 어떻게 가요 느낌.
//        System.out.println("수정후 darr의 hashCode = " + darr.length);



    }




}
