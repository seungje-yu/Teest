package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {
    public void testSimpleDoWhileStatement(){

        /*[do-while 문 표현식]
        초기식:
        do{
            1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 구문(반복할 구문);
            증감식;
        }while(조건식);
        * */

        do{
            System.out.println("최조 한 번 동작함");
        }while(false);
        System.out.println("반복문 종료 확인...");
    }

    public void testDoWhileExample2(){
        /*키보드로 문자열 입력 받아 반복적으로 출력
        * 단, exit 가 입력되면 반복문을 종료한다.
        *
        * "기존문자열".equals("비교할문자열"):문자열은 ==비교가 불가능하다. 문자열이 같은지를 비교하는 기능을  string 클래스에서 제공
        * 기준문자열과 비교할 문자열의 값이 같으면 true를 반환하고 다르면 false를 반환
        *
        * */

        Scanner sc=new Scanner(System.in);
        String str="";

        do{
            System.out.print("문자열을 입력하세요 : ");
            str=sc.nextLine();
            System.out.println(str);

        }while(!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }
}
