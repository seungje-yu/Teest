package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {
        System.out.println("화장실이 급해 듣지 못했습니다.");
        // 주의할점 : 실수를 정수로 나누면 데이터에 손실이 올 수 있으니 조심해야함
        // 1/2는 몫, 1%2 는 나머지

        System.out.println("===================실수와 실수의 연산======================");
        System.out.println(1.23+1.23);
        System.out.println(1.23-0.23);
        System.out.println(1.23*10.0);
        System.out.println(1.23/10.0);
        System.out.println(1.23%10.0); // 실수일 때 약간의 오차가 생긴다.


        System.out.println("===================정수와 실수의 연산======================");
        System.out.println(123+0.5);
        System.out.println(123-0.5);
        System.out.println(123*0.5); //정수와 실수를 연산하면 그 결과는 무조건 실수가 된다. >> 8과 16
        System.out.println(123/0.5); //자동으로 캐스팅 된다.
        System.out.println(123%0.5);


        System.out.println("===================문자와 문자의 연산======================");
        System.out.println('a' + 'b');
        System.out.println('a'-'b');
        System.out.println('a'*'b');
        System.out.println('a'/'b');
        System.out.println('a'%'b');


        System.out.println("===================문자와 정수의 연산======================");
        System.out.println('a'+1);
        System.out.println('a'-1);
        System.out.println('a'*2);
        System.out.println('a'/2);
        System.out.println('a'%2);


        System.out.println("===================문자와 정수의 연산======================");
        System.out.println('a'+1.0);
        System.out.println('a'-1.0);
        System.out.println('a'*2.0);
        System.out.println('a'/2.0);
        System.out.println('a'%2.0);
        /*문자는 내부적으로 숫자 취급을 한다.

         * */


        System.out.println("===================문자열과 문자열의 연산======================");
        System.out.println("hello" + "world"); //단순하게 이어붙이기
        //System.out.println("hello" - "world"); 빼기 불가능
        //System.out.println("hello" * "wolrd"); 곱하기 불가능
        //System.out.println("hello" / "wolrd"); 나누기 불가능
        //System.out.println("hello" % "wolrd"); 나머지 구하기 불가능


        System.out.println("===================문자열과 다른 형태의 값의 연산======================");
        System.out.println("hellowolrd" + 123); //문자열에 + 123이 아니라 아예 새로운 문자열123이 생긴 것이다.
        System.out.println("hellowolrd" + 123.456); //실수도 똑같다.
        System.out.println("hellowolrd" + 'a'); //문자도 똑같다.
        System.out.println("helloworld" + true); //불도 똑같다.


        System.out.println("===================문자열 형태의 숫자 값 '+' 연산======================");
        System.out.println("123" + "456"); //""안에 있으면 문자열로 취급되어 그냥 이어 붙이기


        // 논리값 연산
        //System.out.println(true + false); // 안됨. 에러 발생
        //System.out.println(true - false); // 안됨. 에러 발생
        //System.out.println(true * false); // 안됨. 에러 발생
        //System.out.println(true / false); // 안됨. 에러 발생
        //System.out.println(true % false); // 안됨. 에러 발생
        //System.out.println(true + 1); // 안됨. 에러 발생
        //System.out.println(true - 1); // 안됨. 에러 발생
        //System.out.println(true * 1); // 안됨. 에러 발생
        //System.out.println(true / 1); // 안됨. 에러 발생
        //System.out.println(true % 1); // 안됨. 에러 발생 >>>>> 오직 문자열에 + 만 가능 (문자열로 캐스팅됨)

        //문자는 내부적으로 숫자 취급(아스키)해서 문자열과는 다르다.
        //System.out.println(true + 'a');
        //System.out.println(true - 'a');
        //System.out.println(true * 'a');
        //System.out.println(true / 'a');
        //System.out.println(true % 'a');

        System.out.println("===================논리와 문자열의 연산======================");
        System.out.println(true + "a"); // >> 유일하게 가능하다.
//        System.out.println(true - "a");
//        System.out.println(true * "a");
//        System.out.println(true / "a");
//        System.out.println(true % "a");




    }
}