package com.ohgiraffers.section04.scanner;

import java.util.Scanner; // Scanner 클래스 import

public class Application1 {
    public static void main(String[] args) {

    /*
    * 콘솔 화면에 값을 입력 받아 출력
     */

        // 1. Scanner 객체 생성
//        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
//        java.util.Scanner sc = new java.util.Scanner(System.in);
        // 다른 패키지에 있는 클래스 사용시 패키지명 생략하기 위해 import 사용
        Scanner sc = new Scanner(System.in);

        // 2. 자료형별 값 입력 받기
        // 2-1. 문자열 입력 받기
        // nextLine() : 입력받은 값을 문자열로 반환
        System.out.print("이름을 입력하세요: "); // print() : 줄바꿈 없이 출력, println() : 줄바꿈 후 출력
        String name = sc.nextLine(); // 입력받은 문자열을 name 변수에 저장
        System.out.println("이름: " + name + "님"); // +는 문자열 연결 연산자

        // 2-2. 정수값 입력 받기
        // nextInt() : 입력받은 값을 정수(int)로 반환
        /*
        * 숫자가 아닌 값을 입력하면 InputMismatchException 발생
        * int 범위를 벗어나는 값을 입력하면 InputMismatchException 발생
         */
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt(); // 입력받은 정수값을 age 변수에 저장
        System.out.println("나이: " + age + "세");

        // nextLong() : 입력받은 값을 정수(long)로 반환
        // nextInt()와 Exception 발생 조건 동일
        System.out.print("금액를 입력하세요: ");
        long money = sc.nextLong(); // 입력받은 정수값을 money 변수에 저장
        System.out.println("금액: " + money + "원");

        // 2-3. 실수값 입력 받기
        // nextFloat() : 입력받은 값을 실수(float)로 반환
        System.out.print("키를 입력하세요: ");
        float height = sc.nextFloat(); // 입력받은 실수값을 height 변수에 저장
        System.out.println("키: " + height + "cm");

        // nextDouble() : 입력받은 값을 실수(double)로 반환
        System.out.print("원하는 실수를 입력하세요: ");
        double value = sc.nextDouble(); // 입력받은 실수값을 value 변수에 저장
        System.out.println("입력한 실수: " + value + "입니다.");

        // 2-4. 논리값 입력 받기
        // nextBoolean() : 입력받은 값을 논리값(boolean)으로 반환
        System.out.print("true/false을 입력하세요: ");
        boolean isTrue = sc.nextBoolean(); // 입력받은 논리값을 isTrue 변수에 저장
        System.out.println("입력한 값은 " + isTrue + "입니다.");

        // 2-5. 문자형값 입력 받기
        // .charAt(0) : 입력받은 문자열의 첫 글자를 char로 반환
        // 문자를 직접 입력 받는 기능은 제공하지 않는다.
        // 따라서 문자열을 입력 받고, 입력받은 문자에서 원하는 순번째 문자를 추출해서 사용해야한다.
        // java.lang.String에 있는 charAt(int index) 메소드 사용

        // index를 정수형으로 입력하면 문자열에서 해당 순번의 문자를 반환
        // index는 0부터 시작, 컴퓨터에서 주로 사용되는 방식.
        // 만약 존재하지 않는 인덱스를 입력하면 StringIndexOutOfBoundsException 발생

        sc.nextLine(); // nextInt() 등으로 입력받은 엔터값을 제거하기 위해 사용
        System.out.print("아무 문자나 입력해: ");
        char ch = sc.nextLine().charAt(0); // 입력받은 문자열의 첫 글자를 ch 변수에 저장
        System.out.println("입력한 문자: " + ch);





    }
}
