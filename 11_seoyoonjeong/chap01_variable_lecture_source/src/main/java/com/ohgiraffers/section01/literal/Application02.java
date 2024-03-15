package com.ohgiraffers.section01.literal;

public class Application02 {


    public static void main(String[] args){

       //정수와 정수의 연산

        System.out.println("================정수와 정수의 연산==================");
        System.out.println(123+456);
        System.out.println(123-23);
        System.out.println(123*10); //곱하기
        System.out.println(123/10); //나누기를 한 몫의 값
        System.out.println(123%10); //나누기를 한 나머지 값

        System.out.println("================실수와 실수의 연산==================");
        System.out.println(1.23+1.23);
        System.out.println(1.23-0.23);
        System.out.println(1.23*10.0);
        System.out.println(1.23/10.0);
        System.out.println(1.23/5.0); //약간의 오차가 생긴다.
        //정수와 실수의 연산의 결과는 항상 실수가 나온다.

        System.out.println("================정수와 실수의 연산==================");
        System.out.println(123+0.5);
        System.out.println(123-0.5);
        System.out.println(123*0.5);
        System.out.println(123/0.5);
        System.out.println(123%0.5);

        //문자의 연산
        System.out.println("================문자와 문자의 연산==================");
        System.out.println('a'+'b');
        System.out.println('a'-'b');
        System.out.println('a'*'b');
        System.out.println('a'/'b');
        System.out.println('a'%'b');

        System.out.println("================문자와 정수의 연산==================");
        System.out.println('a'+1);
        System.out.println('a'-1);
        System.out.println('a'*2);
        System.out.println('a'/2);
        System.out.println('a'%2);

        System.out.println("================문자와 실수의 연산==================");
        System.out.println('a'+1.0);
        System.out.println('a'-1.0);
        System.out.println('a'*2.0);
        System.out.println('a'/2.0);
        System.out.println('a'%2.0); //alt키 마우스 한번에 바꾸기 가능

        /*결론은 문자는 내부적으로 숫자 취급을 한다.
        * 결국 지금까지 숫자끼리의 연산을 본것이고, 숫자(정수 혹은 실수) 형태의 값은 수학의 사칙연산의 mod 연산이 전부가능하다
        * */

        //문자열의 연산
        //문자열과 문자열의 '+'연산 결과는 문자열 합치기(이어 붙이기)가 된다.
        System.out.println("================문자열와 문자열의 연산==================");
        System.out.println("hello" +"world");
        //문자열은 더하기 이외에 아무것도 안됌


        //문자열과 다른 형태의 값 연산
        System.out.println("================문자열와 다른 형태의 값 연산==================");
        System.out.println("helloworld"+123); //새로운 결과물인 문자열로됌
        System.out.println("hellworld"+123.456); //새로운 결과물인 문자열 탄생
        System.out.println("helloworld"+'a'); //어 의외닷 문자열과 문자 만나면 문자열이됌
        System.out.println("helloworld"+true);

        //숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 된다.
        System.out.println("================문자열 형태의 숫자 값 '+' 연산==================");
        System.out.println("123"+"456"); //문자열로 재탄생

        //논리값 연산//
        // System.out.println(true +false); //에러 발생
//        System.out.println(true -false); 다 에러 발생
//        System.out.println(true +1);  에러발생
        //문자는 내부적으로 숫자 취급을 하기 때문에 결국 논리값과 숫자의 연산과 동일한 의미이다.
//        System.out.println(true+'a');


        //논리값과 문자열의 연산은 '+' 연산만 사용가능하다.
        System.out.println("================논리와 문자열의 연산==================");
//        System.out.println(true+'a');
        System.out.println(true+"a");









    }

}
