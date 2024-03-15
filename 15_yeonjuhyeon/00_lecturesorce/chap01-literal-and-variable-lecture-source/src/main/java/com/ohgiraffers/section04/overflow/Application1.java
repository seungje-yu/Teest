package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args){

        // 오버플로우
        byte num1 = 127;        //byte의 최대 저장 범위
        System.out.println("num의 값 = " + num1);           // 127

        num1++;

        System.out.println("num1 overflow = " + num1);      // -128
                                //byte의 최소 저장 단위


        // 언더플로우
        byte num2 = -128;
        System.out.println("num2 = " + num2);       //byte의 최소 범위 = -128

        num2--;
        System.out.println("num2 underflow = " + num2); //byte의 최대 저장 범위 = 127

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + multi); // -79669248 오버플로우 발생

        /*해결방법*/
        //오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다.(X)
        long longMulti = firstNum*secondNum;        //이미 연산할때 오른쪽에서 int의 오버플로우 발생
        System.out.println("longMulti = " + longMulti);     // 위 오버플로우가 그대로 출력됨

        long result = (long)firstNum * secondNum;       //(long)으로 강제 형변환 시켜서 오버플로우를 방지
        System.out.println("result = " + result);       //result = 700000000000




    }

}
