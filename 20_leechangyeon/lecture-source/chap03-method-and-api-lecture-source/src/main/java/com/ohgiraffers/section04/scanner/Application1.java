package com.ohgiraffers.section04.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        * 콘솔 화면에 값을 입력받아 출력
        * */

/*         1. Scanner 객체 생성
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in); // java.lang 생략 가능
        java.util.Scanner sc = new java.util.Scanner(System.in); // 다른 패키지의 클래스 사용 시 패키지명을 생략하기 위해 import*/
        Scanner sc = new Scanner(System.in);

/*        자료형별 값 입력받기
        문자열 입력 받기
        nextLine() : 입력받은 값을 문자열로 반환*/
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

/*        정수값 받기
        nextInt() : 입력받은 값을 int형으로 반환한다.
        숫자가 아닌 값을 입력하게 되면 InputMismatchException 발생
        int 범위를 초고한 값을 입력받게 되면 InputMismatchException 발생*/
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");

        /*
        * nextLong() : 입력받은 값을 long형으로 반환
        * nextInt와 Exception이 발생하는 이유는 동일
        * */
        System.out.print("금액을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + "원 입니다.");

        /*
        * 실수형 값 입력받기
        * nextFloat() : 입력받은 값을 float형으로 반환
        * */
        System.out.print("키를 입력하세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + "cm 입니다.");

        /*
        * nextDouble() : 입력받은 값을 double형으로 반환
        * */
        System.out.print("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 " + number + "입니다.");

        /*
        * 논리형 값 입력받기
        * nextBoolean() : 입력받은 값을 boolean형으로 반환
        * */
        System.out.print("참과 거짓 중에 한 가지를 true or false로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");

        /* 문자형 값 입력받기
        *  
        * 문자를 직접 입력받는 기능은 제공하지 않음
        * 문자열을 입력받고 원하는 문자를 뽑아내 사용
        * java.lang.String의 charAt(int index) 사용
        * 문자열의 index 위치에 해당하는 문자를 char 타입으로 반환
        * index는 0부터 시작
        * index가 범위를 벗어나면 IndexOutofBoundsException 발생
        * */
        
        sc.nextLine();
        System.out.print("아무 문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");
    }
}
