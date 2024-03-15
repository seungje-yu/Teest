package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args){


        //1. Scanner 객체 생성
//        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);        -- java.lang은 생략 가능
//        java.util.Scanner sc = new java.util.Scanner(System.in);                  -- java.util을 import하여 생략
//        다른 패키지에 있는 클래스 사용시 패키지명 생략하기 위해 사용하는 구문 사용(import)
//        Alt + Enter 하면 자동 import됨

        Scanner sc = new Scanner(System.in);

        // 자료형별 값 입력 받기
        // 1. 문자열 입력 받기
        // nextLine() : 입력받은 값을 문자열로 반환해준다.
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        // 2. 정수값 받기
        // nextInt() : 입력받은 값을 int형으로 반환한다.
        /*
         숫자가 아닌 값을 입력하게 되면 InputMismatchException이 발생
         int 범위를 초과한 값을 받게 되면 역시나 InputMismatchException이 발생한다.
         */
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다");

        System.out.print("금액을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + "원 입니다.");

        System.out.print("키를 입력하세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + "cm 입니다.");

        System.out.print("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 " + number + "입니다.");

        // 논리형값 받기
        // nextBoolean() : 입력받은 값을 boolean형으로 반환

        System.out.print("참과 거짓 중에 한가지를 true or false로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.print("입력하신 논리 값은 " + "입니다.");

        // 문자형 받기
        sc.nextLine();   //이건 예외케이스에 들어가는데, 나중에 다시 나옴
        System.out.print("아무 문자나 입려해주세요 : ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");

    }
}
