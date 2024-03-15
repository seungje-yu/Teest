package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
        * 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
        * 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
        *
        * 인원 수 : 29
        * 사탕 개수 : 100
        *
        * 1인당 사탕 개수 : 3
        * 남는 사탕 개수 : 13
        * */


        Scanner sc=new Scanner(System.in);
        System.out.println("사람수 입력하시오:");
        int people=sc.nextInt();

        Scanner cs=new Scanner(System.in);
        System.out.println("사탕갯수 입력하시오:");
        int candy=cs.nextInt();

        int result=0;
        int remainder=0;
        result=candy/people;
        remainder=candy%people;

        System.out.println("동일하게 나눠가진 사탕개수는 "+result+" 나눠주고 남은 사탕개수는 "+remainder+ " 이다" );







    }
}
