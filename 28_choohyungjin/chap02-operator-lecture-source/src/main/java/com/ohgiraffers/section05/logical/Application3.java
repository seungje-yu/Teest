package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /*
        * AND연산과 OR연산의 특징
        * 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안함
        * 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안함
        *  */

        /* 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안함
        *
        * 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오게되면
        * 뒤의 조건식을 확인할 필요 없이 false를 반환한다.
        * 따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나오는 조건식을 먼저 배치하는 것이 좋다.
        * */
        int num1 = 10;

        int result1 = (false && ++num1 >0 )? num1 : num1; // 앞의 결과가 false 이므로 뒤의 조건식을 실행하지 않음
        System.out.println("&& 실행 확인 : " + result1); // 10, num1은 증가하지 않음

        /*
         * 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안함
         *
         * 조건식 둘 중 하나라도 true 를 반환하면 true를 반환하지만 앞에서 미리 true가 나오게되면
         * 뒤의 조건식을 확인할 필요 없이 true를 반환한다.
         * 따라서 연산 횟수를 줄이기 위해서는 || 연산의 경우 앞에 true가 나오는 조건식을 먼저 배치하는 것이 좋다.
         */
        int num2 = 10;
        int result2 = (true || ++num2 >0 )? num2 : num2; // 앞의 결과가 true 이므로 뒤의 조건식을 실행하지 않음
        System.out.println("|| 실행 확인 : " + result2); // 10, num2는 증가하지 않음




    }
}
