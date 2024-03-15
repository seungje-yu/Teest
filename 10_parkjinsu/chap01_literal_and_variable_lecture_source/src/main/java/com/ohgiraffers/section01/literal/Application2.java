package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        // 정수와 정수의 연산

        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);


        System.out.println(123 / 10); // 몫의 값
        System.out.println(123 % 10); // 나머지 값


        //실수와 실수의 연산

        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 3.0);

        //정수와 실수의 연산의 결과는 항상 실수
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        //문자의 연산
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        //문자와 정수의 연산
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        //문자와 실수의 연산
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        /*
        * 결론은 문자는 내부적으로 숫자 취급을 한다.
        * 결국 지금까지 숫자끼리의 연산을 본것이고, 숫자 형태의 값은 수학의 사칙연산과 mod연산이 가능하다
        * */

        //문자열의 연산
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        //문자열과 다른 형태의 값 연산
        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("helloworld" + true);

//        문자열 형태의 숫자 값 + 연산
        System.out.println("123" + "456");

//        System.out.println(true + false);
        System.out.println("true, false는 문자열 이외의 연산 아예 안된다 보면 됌");
        System.out.println(true + "a");
        //논리값과 문자열의 연산은 '+' 연산만 가능.
    }
}
