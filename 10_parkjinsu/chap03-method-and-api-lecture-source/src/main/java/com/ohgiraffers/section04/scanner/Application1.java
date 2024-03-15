package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 콘솔 화면에 값을 입력받아 출력
        *
        * 1. Scanner 객체 생성
        * 다른 패키지에 있는 클래스 사용시 패키지명 생략하기 위해 사용하는 구문사용(import)
        * */

//        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        Scanner sc = new Scanner(System.in);

        //자료형별 값 입력 받기

        /*문자열 입력 받기*/
        /* nextLine() : 입력받은 값을 문자열로 반환해준다.
         */
        System.out.print("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 : " + name + "입니다.");

        //정수값 받기 : nextInt() : int형으로 반환.
        // 숫자가 아닌 값을 입력하게 되면 InputMismatchException이 발생 (범위 초과도 동일)

        System.out.print("나이를 입력하세요");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 : " + age + "입니다.");

        // nextLong() : 입력받은 값을 long형으로 반환한다.

        System.out.print("금액을 입력해주세요");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + "원입니다.");

        //nextfloat() : 입력받은 값을 float형으로 반환
        System.out.print("키를 입력하세요");
        float height = sc.nextFloat();
        System.out.println("당신의 키는 " + height + "입니다.");

        //논리형값
        System.out.print("true or false 중 하나를 입력하세요");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력 논리값은 " + isTrue + "입니다.");

        // 문자형 값 입력받기
        // 문자를 직접 입력 받는 기능은 제공하지 않는다. 따라서 문자열을 입력받고 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용
        // java.lang.String에 charAt(int index)를 사용.

        //index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자형으로 반환해주는 기능.
        //index는 0부터 시작하는 숫자체계이며 컴퓨터에서 주로 사용
        // IndexOutOfBoundsException -> index 바운더리 벗어남

        sc.nextLine(); // 이건 예외케이스 -> 뒤에 다시 다룰 예정
        System.out.print("아무 문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다");
    }
}
