package com.ohgiraffers.section04.scanner;


import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 콘솔 화면에 값을 입력 받아 출력
        * */

        /* 1. Scanner 객체 생성*/
//        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in); //java.lang 삭제 (기본제공)
//        java.util.Scanner sc = new java.util.Scanner(System.in);  //import java.util
        //다른 패키지에 있는 클래스 사용시 패키지명 생략하기 위해 사용하는 구문사용(import)
        Scanner sc = new Scanner(System.in);

        //자료형별 값 입력받기

        //문자열 입력받기 -> nextLine() : 입력받은 값을 문자열로 반환
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 "+name + "입니다.");
        System.out.println();

        // 정수값 받기 -> nextInt() : 입력받은 값을 int형으로 반환한다.
        // 숫자가 아닌 값을 입력하게 되면 inputMismatchException이 발생
        //int 범위를 초과한 값을 입력받게 되면 역시나 같은 오류발생
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age +"입니다.");
        System.out.println();

        //nextLong() : 입력받은 값을 long형으로 반환
        // nextInt()와 Exception이 발생하는 이유는 동일하다.

        System.out.print("금액을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 급액은 " + money+"원 입니다.");
        System.out.println();

        // 실수형값 입력받기 -> nextFloat() 입력받은 값을 float형으로 반환
        System.out.print("키를 입력하세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 "+height+"cm 입니다.");
        System.out.println();

        // nextDouble() : 입력받은 값을 double형으로 반환
        System.out.println("원하는 실수를 입력하세요");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 " + number + "입니다.");
        System.out.println();

        //논리형 값 입력받기 - > nextBolean():입력받은 값을 boolean형으로 반환
        System.out.println("참과 거짓 중에 한 가지를 true or false로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");
        System.out.println();

        /* 문자형 값 입력받기*/
        //문자를 직접 입력 바든ㄴ 기능은 제공하지않는다.
        //따라서 문자열을 입력 받고, 입력받은 문자에서 원한느 순번째 문자를 분리해서 사용해야한다.
        //java.lang.String에 charAt(int index)를 사용한다.

        //index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자형으로 반환해주는 기능을한다. index는 0부터 시작하는 숫자체계이며 컴퓨터에서 주로사용되는 방식이다. 만약 존재하지않는 인덱스를 입력하게되면 INdexOutOfBoundsException이 발생한다.
        sc.nextLine(); // 이건 예외케이스에 들어가는건데  뒤에서 다시 다룰예정
        System.out.print("아무문자나 입력해주세요.");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");
    }
}
