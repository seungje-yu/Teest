package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        // 정수와 정수의 연산

        System.out.println("=================== 정수와 정수의 연산 ===================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("=================== 실수와 실수의 연산 ===================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 5.0);     // 약간의 오차가 생긴다.

        System.out.println("=================== 정수와 실수의 연산 ===================");
        // 정수와 실수의 연산의 결과는 항상 실수가 나온다.
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        System.out.println("=================== 문자와 문자의 연산 ===================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("=================== 문자와 정수의 연산 ===================");
        System.out.println('a' + 2);
        System.out.println('a' - 2);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);
        /*
         * 결론은 문자는 내부적으로 숫자 취급을 한다.
         * 결국 지금까지 숫자끼리의 연산을 본 것이로, 숫자(정수 혹은 실수) 형태의 값은 수학의 사칙연산과 mod연산이 전부 가능하다.
         * */

        System.out.println("=================== 문자열과 문자열의 연산 ===================");
        System.out.println("hello" + "world");      // 문자열과 문자열의 '+' 연산 결과는 문자열 합치기(이어 붙이기)가 된다.
        // 문자열과 문자열의 연산은 '+'을 이용한 이어 붙이기만 가능하다.
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        System.out.println("=================== 문자열과 다른 형태의 값 연산 ===================");
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);

        // 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 된다.
        System.out.println("=================== 문자열 형태의 숫자 값 '+' 연산 ===================");
        System.out.println("123" + "456");

        // 논리값의 연산
//        System.out.println(true + false);     // 에러 발생
//        System.out.println(true - false);     // 에러 발생
//        System.out.println(true + 1);     // 에러 발생

        // 논리값과 문자열의 연산은 '+' 연산만 가능하다.
        System.out.println("=================== 논리와 문자열의 연산 ===================");
        System.out.println(true + "a");
    }
}
