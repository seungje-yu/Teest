package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킨다.
        * */

        byte bnum = 127;
        System.out.println("bnum = " + bnum);

        bnum++;
        System.out.println("bnum overflow = " + bnum);
        // overflow 발생 시 최소치부터 남은 수 많큼 올라간다.



        /*
        * 언더 플로우
        * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키려는 경우 발생한다.
        */

        byte bum2 = -128;
        bum2--;
        System.out.println("bum2 = " + bum2);
        //underflow 발생 시 최대값으로 가서 남은 수 많큼 뺀다.

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = (firstNum * secondNum);

        System.out.println("first * second = " + multi);

        /*해결방법*/
        // 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다.
        long longMulti = (long) firstNum * secondNum; //강제형변환 해준다.
        System.out.println("longMulti = " + longMulti);


    }



}
