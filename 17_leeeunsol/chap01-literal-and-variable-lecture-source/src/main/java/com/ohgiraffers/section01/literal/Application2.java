package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        //정수와 정수의 연산
        System.out.println("============ 정수와 정수의 연산 ============");
        // 가독성을 좋게 하기위해서 숫자와 기호사이에는 띄어주는것이좋음
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10); // 곱하기
        System.out.println(123 / 10); //나누기를 한 몫의 값
        System.out.println(123 % 10); // 나누기를 한 나머지 값

        System.out.println("============ 실수와 실수의 연산 ============");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 5.0);// 약간의 오차가생긴다.

        // 정수와 실수의 연산의 결과는 항상 실수가 나온다
        System.out.println("============ 정수와 실수의 연산 ============");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        //문자의 연산(아스키코드 10진결과값으로 계산)
        System.out.println("============ 문자와 문자의 연산 ============");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("============ 문자와 정수의 연산 ============");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("============ 문자와 실수의 연산 ============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);
        /**
         * 결론은 문자는 내부적으로 숫자 취급을 한다.
         * 결국 지금가지 숫자끼리의 연산을 본것이고, 숫자(정수 혹은 실수) 형태의 값은 수학의 사칙연산과 mod연산(%)이 전부 가능하다.
         */

        //문자열의 연산
//        System.out.println("============ 문자열과 문자열의 연산 ============");
//        System.out.println("hello" + "world");
//        System.out.println("helloworld" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        //문자열로서 계산된다.
        System.out.println("============ 문자열과 다른 형태의 값 연산 ============");
        System.out.println("hellowold" + 123);
        System.out.println("hellowold" + 123.456);
        System.out.println("hellowold" + 'a');
        System.out.println("hellowold" + true);

        // 숫자로 된 문자열 형태의 값은 '+ '"' 연산의 결과가 문자열 함치기 결과가 된다.
        System.out.println("============ 문자열 형태의 숫자 값 '+' 연산 ============");
        System.out.println("123" + "456");

        //논리값 연산
//        System.out.println(true + false); //에러발생
//        System.out.println(true - false); //에러발생
//        System.out.println(true * false); //에러발생
//        System.out.println(true / false); //에러발생
//        System.out.println(true % false); //에러발생

        //논리연산과 정수
//        System.out.println(true + 1); //에러발생
//        System.out.println(true - 1); //에러발생
//        System.out.println(true * 1); //에러발생
//        System.out.println(true / 1); //에러발생
//        System.out.println(true % 1); //에러발생

        //논리연산과 실수
//        System.out.println(true + 1.0); //에러발생
//        System.out.println(true - 1.0); //에러발생
//        System.out.println(true * 1.0); //에러발생
//        System.out.println(true / 1.0); //에러발생
//        System.out.println(true % 1.0); //에러발생

        //논리연산과 문자
//        System.out.println(true + 'a'); //에러발생
//        System.out.println(true - 'a'); //에러발생
//        System.out.println(true * 'a'); //에러발생
//        System.out.println(true / 'a'); //에러발생
//        System.out.println(true % 'a'); //에러발생

        // 논리값과 문자열의 연산은 '+' 연산만 사용가능하다.
        //논리와 문자열의 연산
        System.out.println(true + "a"); //문자열로 합쳐짐
//        System.out.println(true - "a"); //에러발생
//        System.out.println(true * "a"); //에러발생
//        System.out.println(true / "a"); //에러발생
//        System.out.println(true % "a"); //에러발생
    }
}
