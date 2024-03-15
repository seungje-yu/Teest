package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    /*
    * [while문 표현식]
    * 초기식 ;
    * while(조건식){
    *   조건을 만족하는 경우 수행할 구문(반복할 구문);
    *   증감식;
    * }
    *
    * 연습할 부분
    * 1. 증감식이 없는경우
    * 2. 조건식이 true인 경우
    * 3. 초기식, 조건식, 증감식이 없는경우
    * 4. 초기식, 조건식, 증감식 등을 변경하고 실행 값 예측해보기
    * 5. 역순으로 반복문 실행
    * */

    public void testSimpleWhileStatement(){
        /*
        * 1~10까지 1씩 증가 - i값을 출력하는 기본 반복문
        * */

        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }


    public void testWhileExample1(){
        /*
        * 입력한 문자열의 인덱스를 이용하여 하나씩 출력해보기
        *
        * */

        Scanner sc = new Scanner((System.in));
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        /*
        * 아래의 두개의 메소드는 전부 String클래스에서 제공하는 메소드 입니다.
        * charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 긍
        * length() : String 클래스의메소로 문자열의 길이를 int형으로 반환하는 기능
        * index는 0부터 시작학하고 마지막인덱스는 항상 길이보다 한개 작은수를 가진다.
        * 만약 존재하지 않는 인덱스에 접근하게 되면서 String IndexoutofBoundsExceptㅑㅜdl q
        * */


        int strLenght =str.length();
        int index =0;
        while(index< strLenght){
            System.out.println(str.charAt(index));
            strLenght--;
        }
    }

    public void testShileExample2(){
        /*for 구구단을 while로 변경*/
        int dan = 2;
        while(dan<10){
            int su = 1;

            while(su<10){
                System.out.println(dan +"*"+su+"="+(dan*su));
                su++;
            }
            dan++;
        }
    }


}
