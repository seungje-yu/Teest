package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {
        /**  [for문 표현식]
         *  for(초기식; 조건식; 증감식) {
         *      조건을 만족하는 경우 수행할 구문(반복할 구문);
         *  }*/

//        1부터 10까지 1씩 증가시키면서 i 값을 출력하는 기본 반복문
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public void testForExample() {
        Scanner sc = new Scanner(System.in);

        /*System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");

        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
        String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");

        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
        String student3 = sc.nextLine();
        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");

        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
        String student4 = sc.nextLine();
        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");

        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
        String student5 = sc.nextLine();
        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");

        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
        String student6 = sc.nextLine();
        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");

        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
        String student7 = sc.nextLine();
        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");

        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
        String student8 = sc.nextLine();
        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");

        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
        String student9 = sc.nextLine();
        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");

        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
        String student10 = sc.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");*/

        /*
         * 반복 횟수 : 10회, 초기값 0 -> (i + 1) 1 -> i
         * 반복할 내용
         * 1. 안내문구 출력
         * 2. 학생 이름을 입력받아 변수에 저장
         * 3. 저장된 이름을 출력
         * */

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String studentName = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + studentName + "입니다.");
        }

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }

    public void testForExample2() {
        /* 1부터 10까지의 합을 구하시오 */

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }

    public void testForExample3() {
        /*
         * 5에서 10 사이의 난수를 발생시켜서
         * 1부터 난수까지의 합을 구하시오.
         * */

        int randomNumber = (int) (Math.random() * 6) + 5;
//        int randomNumber = new Random().nextInt(6) + 5;
        System.out.println("randomNumber = " + randomNumber);

        int sum = 0;

        for (int i = 1; i <= randomNumber; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }

    public void testForExample4() {
        /*
        * 숫자 두 개를 입력받아 작은 수에서 큰 수까지의 합을 구하시오.
        * 단, 두 숫자는 같은 숫자를 입력되지 않는다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();
        int sum = 0;
        int smaller = num1 > num2 ? num2 : num1;
        int bigger = num1 > num2 ? num1 : num2;
        for (int i = smaller; i <= bigger; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void printSimpleGugudan() {
        /*
        * 키보드로 2 ~ 9 사이의 구구단을 입력받아
        * 2 ~ 9 사이인 경우 해당 단의 구구단을 출력하고
        * 그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해야 합니다." 출력
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
        int dan = sc.nextInt();
        if (2 <= dan && dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다.");
        }
    }
}
