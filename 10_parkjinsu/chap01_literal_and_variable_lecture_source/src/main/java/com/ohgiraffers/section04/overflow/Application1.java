package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {
        /*
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킨다
        * */

        byte num1 = 127; //byte의 최대 저장 범위
        System.out.println("num1 = " + num1);
        num1++;
        System.out.println("num1 overflow = " + num1); //byte의 최소 저장 범위 -> 현재 overflow 발생

        /*
        언더플로우
        오버플로우와 반대 개념, 최소 범위보다 작은 수를 발생시키는 경우
        */
        byte num2 = -128;
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 underflow = " + num2);  //underflow 발생

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + multi);

        /*해결방법
        * 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */
        long longMulti = firstNum * secondNum;

        System.out.println("longMulti = " + longMulti);

        long result = (long) firstNum * secondNum; //강제 형변환

        System.out.println(result);


    }
}
