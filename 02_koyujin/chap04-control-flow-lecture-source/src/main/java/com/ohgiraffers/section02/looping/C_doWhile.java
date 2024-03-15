package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {

    public void testSimpleDoWhileStatement(){
        /*[do-while문 표현식]
        * 초기식;
        * do{
        *   1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 구문(반복할 구문);
        * 증감식;
        * } while(조건식);
        * */

        do{
            System.out.println("최초 한 번 동작함...");
        } while (false);
        System.out.println("반복문 종료 확인...");
    }

    public void testDoWhileExample1(){
        /*키보드로 문자열 입력 받아 반복적으로 출력
        * 단, exit가 입력되면 반복문을 종료한다.
        *
        * "기준문자열".equals("비교할문자열") : 문자열은 == 비교가 불가능
        * 문자열이 같은 지 비교하는 기능을 String클래스에서 제공
        * 기준문자열과 비교할 문자열의 값이 같으면 true반환, 다르면 false 반환*/

        Scanner sc = new Scanner(System.in);
        String str = "";
        do{
            System.out.print("문자열을 입력하세요:"); //hello
            str = sc.nextLine();
            System.out.println(str);
        } while (str.equals("exit")); //exit과 hello는 다르기 때문에 false -> 반복문 종료
        //그래서 만약 바로 종료되지 않도록 하려면 !로 부정을 해주기 !str.equals("exit");
        System.out.println("프로그램을 종료합니다.");

    }
}
