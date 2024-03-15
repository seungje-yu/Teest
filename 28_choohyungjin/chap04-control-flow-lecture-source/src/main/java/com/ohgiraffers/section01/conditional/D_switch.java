package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {
        /*
         *  [switch문 표현식]
         *  switch(비교할변수) {
         *      case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break; // break문을 사용하여 switch문을 빠져나옴
         *      case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
         *      default : case에 모두 해당하지 않는 경우 실행할 구문; break;
         *
         *  여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다.
         *  따라서 일부 호환이 가능하다.
         *  하지만, switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
         *  실수와 논리는 비교할 수 없다.
         *  또한 정확하게 일치하는 경우만 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다.
         *  case절에는 변수를 사용하지 못한다. (값만 비교 가능)
         *  또한, 문자열 비교는 jdk 1.7 이상부터 가능하다.
         */

        /* 정수 두개와 연산기호 입력 */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("first = " + first);

        System.out.print("두 번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.println("second = " + second);
        System.out.print("연산기호 입력(+,-,*,/,%) : ");
        char op = sc.next().charAt(0); // 문자열 입력을 받기 위해 next() 대신 nextLine() 사용
        System.out.println("op = " + op);

        int result = 0; // 결과값을 저장할 변수

        // switch문을 사용하여 연산기호에 따라 연산을 수행
        switch (op) {
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
                result = first / second; // 0으로 나누면 ArithmeticException 에러 발생
                break;
            case '%' :
                result = first % second;
                break;

                // default문은 생략 가능하다. 생략할 경우 주석으로 생략 이유를 명시해주는 것이 좋다.

        }
        System.out.println("first " + op + " second = " + result);
    }

    public void testSwitchVendingMachine() {

        /*
        * swtich문을 이용해서 문자열 값 비교 및 break 테스트
        * 1. jdk 1.7 이상부터 switch문을 이용하여 문자열 비교 가능
        * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
         */

        System.out.println("- - - - 추형진의 자판기 - - - -");
        System.out.println(" 실론티  데자와  맥콜  솔의눈  레쓰비  미에로화이바  ");
        System.out.println("- - - - - - - - - - - - - - ");
        System.out.println("- - - - 음료 좀 빨리 골라줄래 - - - -");

        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        // 원하는 음료에 맞는 가격을 저장할 변수
        int price = 0;

        switch (selectedDrink) {
            case "실론티" :
                System.out.println("와 실론티를 마셔?");
                price = 1000;

            case "데자와" :
                System.out.println("와 데자와를 마셔?");
                price = 1500;
            case "맥콜" :
                System.out.println("와 맥콜을 마셔?");
                price = 2000;
            case "솔의눈" :
                System.out.println("와 솔의눈을 마셔?");
                price = 2500;
            case "레쓰비" :
                System.out.println("와 레쓰비를 마셔?");
                price = 3000;
            case "미에로화이바" :
                System.out.println("와 미에로화이바를 마셔?");
                price = 3500;

        }
        System.out.println(price + "원입니다(이걸 이돈주고 마셔?).");

        System.out.println("================ 똥믈리에 자판기 ver.2 ===================");

        String order = "";
        switch (selectedDrink) {
            case "실론티" :
                order = "실론티";
                price = 1000;
                break;
            case "데자와" :
                order = "데자와";
                price = 1500;
                break;
            case "맥콜" :
                order = "맥콜";
                price = 2000;
                break;
            case "솔의눈" :
                order = "솔의눈";
                price = 2500;
                break;
            case "레쓰비" :
                order = "레쓰비";
                price = 3000;
                break;
            case "미에로화이바" :
                order = "미에로화이바";
                price = 3500;
                break;

        }
        System.out.println("와,," + order + "를 돈주고 마셔..?");
        System.out.println(price + "원이야..");


    }
}
