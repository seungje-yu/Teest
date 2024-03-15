package com.ohgiraffers.section4.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*
        * nextLine() : 공백문자를 포함하고, 개행문자 전까지 읽어서 문자열로 반환한다.
        * next()     : 공백문자 혹은 개행문자 전까지 읽어서 문자열로 반환한다.
        * 공백문자 : spacebar, 개행문자 : enter (\n)
        * next()는 단어 단위, nextLine()은 문장 단위라고 보면 된다.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요(nextLine()) : ");
        String a = sc.nextLine();
        System.out.println(a);

        System.out.print("문자열을 입력하세요(next()) : ");
        String b = sc.next();
        System.out.println(b);
      //System.out.println(sc.next()); 띄어쓰기로 없어진 값은 이렇게 하면 출력되긴 한다.
    }
}
