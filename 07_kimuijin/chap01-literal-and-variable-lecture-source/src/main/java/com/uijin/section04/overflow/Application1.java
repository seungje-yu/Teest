package com.uijin.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 오버플로우
         * 자료형 별 값의 최대 범위를 벗어나는 경우
         * 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킨다.
         */

        byte num1 = 127;        // byte의 최대 저장 범위
//        byte num1 = 127 + 1;      // 이렇게 하면 에러남 128로 인식해서.

        System.out.println("num1 = " + num1);
        num1++;     // 이렇게 나중에 증감연산자로 추가해줘야 함 . 후위증감연산자


        System.out.println("num1 overflow = " + num1);      // byte의 최소 저장 범위



        /*
         * 언더플로우
         * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
         */

        byte num2 = -128;

        System.out.println("num2 = " + num2);       // byte의 최소 저장 범위

        num2--;     // 후위감소연산자

        System.out.println("num2 underflow = " + num2);     // byte의 최대 저장 범위


        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;

        System.out.println("firstNum * secondNum = " + multi);      // -79669248


        /* 해결 방법 */
        // 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다.
        long longMulti = firstNum * secondNum;      // int 값이 적용되기 때문에 자료형 크게 한다고 해서 해결 안 됨

        System.out.println("longMulti = " + longMulti);
        
        long result = (long) firstNum * secondNum;       // 강제 형변환. 둘 중 하나만 해주면 됨. 작은 자료형은 큰 자료형을 따라감. 위의 변수 자료형을 바꾸면 뒤에 쓰이는 변수들도 영향을 받으니 하나만 강제 형변환 하면 됨

        System.out.println("result = " + result);


        
        
        
        
        
    }
}
