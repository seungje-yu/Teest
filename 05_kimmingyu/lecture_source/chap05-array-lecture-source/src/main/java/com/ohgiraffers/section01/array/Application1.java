package com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 배열이란?
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하는 용도)
        * 배열은 heap영역에 new 연산자를 이용하여 할당
        * */

        /*
        * 배열의 사용 이유
        * 만약 배열을 사용하지 앟는다면 변수를 여러 개 사용해야함
        * 1. 연속된 메모리 공간으로 관리불가(모든 변수의 이름을 사용자가 관리해야 함.
        * 2.반복문을 이용한 연속처리가 불가능
        * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        // int i =0; // 변수의 선언 및 초기화
        /* 배열의 선언 및 할당 */
        int[] arr = new int[5];

        /* 하나의 이름으로 관리되는 연속된 메모리 공간이고, 공간마다 찾아갈 수 있는 번호(인덱스)를 이용해 접근한다. */
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;

        // 값 대입
        for(int i = 0, value = 0; i < arr.length; i++) {
            arr [i] = value += 10;
        }
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum2 += arr [i];
        }
        System.out.println("sum2 = " + sum2);
    }
}
