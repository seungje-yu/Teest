package com.ohgiraffers.section4.scanner;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 스캐너의 next() 메서드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        * 그래서 크게 두 가지 사항을 주의해야한다.
        * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력받을 때
        *   next()를 사용하고 띄어쓰기를 사용하면 발생하는데 버퍼에 띄어쓰기 이후의 값이 남아있기 때문이다.
        * 2. 정수, 실수, 논리값 입력 후 next(), nextLine()으로 -문자열- 입력받을 떄.
        *   next숫자() 메서드가 아마도 숫자만 인식하고 enter(\n)을 버퍼에 남겨두는 것 같다.
        *
        *
        *   내가 알기론 이걸로 이상해지면 nextLine()으로 사용을 하거나
        *   스캐너변수명.nextLine()하면 된다. ex) scanner.nextLine();
        *   >>이러면 의도치 않은 입력이 발생하지 않는다.
        * */

        Scanner scn = new Scanner(System.in);
//        System.out.print("내용을 입력해 주세요 : ");
//        String str1 = scn.next();
//        System.out.println(str1);
//        scn.nextLine();
//        System.out.print("정수를 입력해 주세요 : ");
//        int inum1 = scn.nextInt();
//        System.out.println(inum1);

        System.out.print("정수를 입력해 주세요 : ");
        int inum2 = scn.nextInt();
        System.out.println(inum2);
        scn.nextLine();
        System.out.print("문자열을 입력해 주세요 : ");
        String str2 = scn.nextLine();
        System.out.println(str2);
        System.out.print("논리형을 입력해 주세요 : ");
        boolean isTrue = scn.nextBoolean();
        System.out.println(isTrue);
        scn.nextLine();
        System.out.print("문자열을 입력해 주세요 : ");
        String str3 = scn.nextLine();
        System.out.println(str3);

    }
}
