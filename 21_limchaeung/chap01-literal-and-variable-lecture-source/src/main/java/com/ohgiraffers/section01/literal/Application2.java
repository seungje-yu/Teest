package com.ohgiraffers.section01.literal;

public class Application2 {
//    자바 Ctrl + Shift + 라인 드래그 후 선택한 라인만 주석됨
//    자바 Shift + 엠터 : 그냥 라인 내려감
//    Alt _드래그 하면 세로로 라인 복사함
//    Ctrl + Shift + 방향키 현재 라인 및드래그한 것 이동
    public static void main(String[] args) {
        // 정수와 정수의 연산

        System.out.println("========== 정수와 정수의 연산 =========");
        System.out.println(123 + 456);
        System.out.println(123 - 23);

        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("========== 실수와 실수의 연산 =========");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 10.0); // 약간의 오차가 생긴다

        System.out.println("========== 정수와 실수의 연산 =========");
        //        작은 자료형은 큰 자료형을 따라간다
        //        정수랑 실수를 계산하면 실수가 나옴
        System.out.print(123 + 0.5);
        System.out.print(123 - 0.5);
        System.out.print(123 * 0.5);
        System.out.print(123 / 0.5);
        System.out.print(123 % 0.5);

        //문자의 연산
        System.out.println("========== 문자와 문자의 연산 =========");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("========== 문자와 정수의 연산 =========");
        System.out.println('a' - 1);
        System.out.println('a' + 1); // a는 유니 코드로 97 숫자를 말하고 문자보다 정수가 더 큰 자료형으로 따라간다.
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);
//결론은 문자는 내부적으로 숫자 취급
//결국 지금까지 숫자끼리의 연산을 본것이고, 숫자(정수 혹은 실수) 형태의 값은 수학의 사칙연산과 mod연산이 전부 가능

//문자열의 연산
//문자열과 문자열은 이어붙이기가 됨
        System.out.println("========== 문자열와 문자열의 연산 =========");
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" % "world");

// 문자열과 다른 형태의 값 연산
        System.out.println("========== 문자열와 다른 형태의값 연산 =========");
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + 'a'+ 1);
        System.out.println( 'a'+ 1 + "helloworld");
        System.out.println( 'a'+ "helloworld" + 1);
        System.out.println( "helloworld" + true);

// 쌍따옴표안에 숫자는 모두 문자로 인식
        System.out.println("========== 문자열 형태의 숫자 값 '+' 연산 =========");
        System.out.println("123" + "456"); //문자열로 계산함(숫자 아님)

// 논리값 연산
//        System.out.println(true + false); // 에러발생 error: bad operand types for binary operator '+'
//        System.out.println(true - false); // 에러발생
//        System.out.println(true * false); // 에러발생
//        System.out.println(true / false); // 에러발생
//        System.out.println(true % false); // 에러발생
//        System.out.println(true + 1); // 에러발생

//        System.out.println(true + 1.0); // 에러발생 error: bad operand types for binary operator '+'
//        System.out.println(true - 1.0); // 에러발생
//        System.out.println(true * 1.0); // 에러발생
//        System.out.println(true % 1.0); // 에러발생
//        System.out.println(true / 1.0); // 에러발생

        System.out.println("========== 논리와 문자열의 연산 =========");
        System.out.println(true + "a"); // + 문자열 붙이기만 됨
//        System.out.println(true * "a");
//        System.out.println(true / "a");
//        System.out.println(true % "a");








    }
    
}
