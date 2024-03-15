package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 두 개의 정수를 입력 받아 변수에 저장하고,
         * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
         * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
         *
         * -- 입력 예시 --
         * 첫 번째 정수 : 4
         * 두 번쨰 정수 : 3
         * 연산 기호를 입력하세요 : +
         *
         * -- 출력 예시 --
         * 4 + 3 = 7
         */


        // if-else 이용
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("첫 번째 정수 : ");
//        int first = sc.nextInt();
//
//        System.out.print("두 번째 정수 : ");
//        int second = sc.nextInt();
//
//        sc.nextLine();
//
//        System.out.print("연산 기호를 입력하세요 : ");
//        String operator = sc.nextLine();
//
//        if(operator.equals("+")) {
//            String result = (first + second) + "";
//            System.out.println(result);
//        } else if(operator.equals("-")) {
//            String result = (first - second) + "";
//            System.out.println(result);
//        } else if(operator.equals("*")) {
//            String result = (first * second) + "";
//            System.out.println(result);
//        } else if(operator.equals("/")) {
//            String result = (first / second) + "";
//            System.out.println(result);
//        } else if(operator.equals("%")) {
//            String result = (first % second) + "";
//            System.out.println(result);
//        } else {
//            System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
//        }


        // switch를 이용
        // 아래 코드에서는 sc.nextLine을 써서 case에 연산자를 String으로 받았는데
        // char operator = sc.next().chatAt(0); 처럼
        // 연산자를 char로 받아서 첫번째 인덱스를 꺼내는 방식으로도 가능하다.

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int first2 = sc.nextInt();

        System.out.print("두번째 정수 : ");
        int second2 = sc.nextInt();

//        sc.nextLine(); // next() 를 쓰면 마지막에 버퍼에 개행이 남아있으니까 nextLine 라인을 앞에 써서 버퍼를 한번 지워줘야한다

        System.out.print("연산 기호를 입력하세요 : ");
        String operator2 =  sc.nextLine();

        String result = "";
        switch (operator2) {
            case "+" :
                result = (first2 + second2) + "";
                break;
            case "-" :
                result = (first2 - second2) + "";
                break;
            case "*" :
                result = (first2 * second2) + "";
                break;
            case "/" :
                result = (first2 / second2) + "";
                break;
            case "%" :
                result = (first2 % second2) + "";
                break;
            default: // 준비된 연산기호 외의 문자를 입력하는 경우
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }
        System.out.println(first2 + " " + operator2 + " " + " " + second2 + " = " + result);
    }
}
