package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        /*
         * Scanner의 next() 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
         * 그래서 크게 두 가지 사항을 주의해야한다.
         * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력받을 때
         * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next(); //nextLine()으로 써주면 문제없다.
                                 //근데 난 죽어도 next()를 쓸 것이다. 그럼 nextLine()을 써서 남아있는 토큰을 비워라.
        System.out.println("str1 = " + str1);
        //java.util.InputMismatchException 에러가 난다. 이유는 버퍼에 아직 "반갑습니다"가 남아있기 때문.
        sc.nextLine();

        System.out.println("============================");

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);

        /* 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);
        sc.nextLine();

        System.out.println("============================");

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);





    }
}
