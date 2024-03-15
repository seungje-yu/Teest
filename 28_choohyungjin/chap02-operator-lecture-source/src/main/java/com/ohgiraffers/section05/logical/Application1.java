package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {
    /*
    * 논리 연산자
    * 논리값(true, false)을 연산하는 연산자
     *  논리 연산자의 종류
     *   1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결함 방향은 왼쪽에서 오른쪽이다. 두 개의 논리 식을 판단하여 참과 거짓을 판단한다.
     *    1-1. &&(논리 AND) 연산자 : 두 개의 논리식 모두 참 일 경우 참을 반환, 둘 중 한 개라도 거짓인 경우 거짓을 반환하는 연산자이다.
     *    1-2. ||(논리 OR) 연산자 : 두 개의 논리식 중 둘 중 하나라도 참 일 경우 참을 반환, 둘 다 모두 거짓일 경우 거짓을 반환한다.
     *   2. 논리 부정 연산자 : 피연산자가 하나인 단항연산자로, 피연산자의 결합 방향은 왼쪽에서 오른쪽이다.
     *    1-1. !(논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환한다.

     * 논리 연산자의 우선순위
     * 1. 논리 NOT 연산자(!) : 1순위
     * 2. 논리 AND 연산자(&&) : 2순위
     * 3. 논리 OR 연산자(||) : 3순위
     * 논리 연산자의 결합 방향
     * 1. 논리 NOT 연산자(!) : 오른쪽에서 왼쪽
     * 2. 논리 AND 연산자(&&) : 왼쪽에서 오른쪽
     * 3. 논리 OR 연산자(||) : 왼쪽에서 오른쪽
     * 논리 연산자의 피연산자
     * 1. 논리 AND 연산자(&&) : 두 개의 피연산자가 모두 참일 경우 참을 반환한다.
     * 2. 논리 OR 연산자(||) : 두 개의 피연산자 중 하나라도 참일 경우 참을 반환한다.
     * 3. 논리 NOT 연산자(!) : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환한다.
     */

        System.out.println("true와 true의 논리 and 연산 : " + (true && true)); // true
        System.out.println("true와 false의 논리 and 연산 : " + (true && false)); // false
        System.out.println("false와 true의 논리 and 연산 : " + (false && true)); // false
        System.out.println("false와 false의 논리 and 연산 : " + (false && false)); // false

        System.out.println("true와 true의 논리 or 연산 : " + (true || true)); // true
        System.out.println("true와 false의 논리 or 연산 : " + (true || false)); // true
        System.out.println("false와 true의 논리 or 연산 : " + (false || true)); // true
        System.out.println("false와 false의 논리 or 연산 : " + (false || false)); // false

        System.out.println("true의 논리 not 연산 : " + (!true)); // false
        System.out.println("false의 논리 not 연산 : " + (!false)); // true

        // 논리 연산자의 우선순위
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        // 논리 연산자의 우선순위는 논리 not 연산자(!) > 논리 and 연산자(&&) > 논리 or 연산자(||) 이다.
        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d)); // true
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d)); // false
        System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + (a > b && c < d)); // false
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b && c > d)); // false

        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d)); // true
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d)); // true
        System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 : " + (a > b || c < d)); // true
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b || c > d)); // false


    }
}
