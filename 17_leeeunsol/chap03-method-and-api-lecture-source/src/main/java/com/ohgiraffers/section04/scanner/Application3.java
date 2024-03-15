package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 스캐너의 next() 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        * 그래서 크게 두 가지 사항을 주의해야한다.
        * 1. next()로 문자열 입력 받은 후 정수,실수,논리값 입력받을 때
        * 2. 정수,실수,논리값 입력 후 next()로 문자열 입력받을 때
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str= sc.next();
        System.out.println("str = " + str);
        //"안녕하세요 반갑습니다."를 입력하면 sc.next에선 공백,개행 전까지의 글자를 표시해주기때문에 안녕하세요 까지만 출력되지만, 입력값을 저장한 버퍼에는 문자열 반갑습니다가 남아있는 상태가된다
        //이때 sc.nextInt를 해버리면 버퍼에 남아있는 문자열 반갑습니다가 들어오기때문에 mistypeException이 발생한다.
        //때문에 sc.nextLine을 사용하여 혹시 버퍼에남아있을수도 있는 문자열을 지우기위해 sc.nextLine을 사용하여 버퍼의 값을 공백을 만든이후 값을 입력받는다.
        sc.nextLine();
        System.out.print("숫자를 입력해주세요. : ");
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);

        /* 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때*/
        System.out.print("다시숫자를 일벽해주세요.");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

        sc.nextLine(); // 숫자 입력후 발생한 개행 문자가 이후에 등장하는 sc.nextLine에 자동 적용되어서 공백입력으로 넘어가게되어 입력받기전에 없애기 위해 한번작성필요
        
        System.out.print("공백이 있는 문자열을 하나 입력해주세요.");
        String str2 =sc.nextLine();
        System.out.println("str2 = " + str2);
    }
}
