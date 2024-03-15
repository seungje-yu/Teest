package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSwitchStatement() {
        // 정수 두 개와 연산 기호 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("first = " + first);
        System.out.print("두번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.println("second = " + second);
        System.out.print("연산 기호 입력(+, _, *, /, %) : ");
        char op = sc.next().charAt(0);
        System.out.println("op = " + op);

        // 연산의 결과를 저장할 변수
        int result = 0;
        switch (op){
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                result = first / second;
                break;
            case '%' :
                result = first % second;
                break;
            /*
             * default문은 생략 가능하지만 생략하느 경우 주석으로 이유를 작성해주는 것이 좋다.
             */
        }

        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    public void testSwitchVendingMachine(){
        /*
         * switch문을 이용해서 문자열 값 비교 및 break 테스트
         */

        System.out.println("===========vending machine===========");
        System.out.println(" 사이다  콜라  환타  박카스  핫식스  ");
        System.out.println("===========vending machine===========");
        System.out.print("음료를 선택해주세요. : ");

        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        //원하는 음료에 맞는 가격을 저장할 변수
        int price = 0;
        switch (selectedDrink) {
            case "사이다" :
                System.out.println("사이다를 선택하였습니다.");
                price = 500;
            case  "콜라" :
                System.out.println("콜라를 선택하였습니다.");
                price = 600;
            case "환타" :
                System.out.println("환타를 선택하였습니다.");
                price = 700;
            case "박카스" :
                System.out.println("박카스를 선택하였습니다.");
                price = 2000;
            case  "핫식스" :
                System.out.println("핫식스를 선택하였습니다.");
                price = 3000;
        }
        System.out.println(price + "원을 투입해주세요!");

        System.out.println("=========== 개선된 자판기 ===========");

        String order = "";
        switch (selectedDrink) {
            case "사이다" :
                order = "사이다";
                price = 500;
                break;
            case  "콜라" :
                order = "콜라";
                price = 600;
                break;

            case "환타" :
                order = "환타";
                price = 700;
                break;
            case "박카스" :
                order = "박카스";
                price = 2000;
                break;
            case  "핫식스" :
                order = "핫식스";
                price = 3000;
        }
        System.out.println(order + "를 선택하였습니다");
        System.out.println(price + "원을 투입해주세요!");

    }

}
