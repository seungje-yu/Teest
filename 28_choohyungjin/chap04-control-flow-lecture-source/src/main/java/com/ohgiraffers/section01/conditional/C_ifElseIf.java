package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void testSimpleIfElseIFStatement() {

        /*
         *  [if-else-if문 표현식]
         *  if(조건식1) {
         *      조건식1이 true일 때 실행할 명령문;
         *  } else if(조건식2) {
         *      조건식1이 false이고 조건식2가 true일 때 실행할 명령문;
         *  } else {
         *      위의 조건 2개가 모두 거짓인 경우 실핼할 명령문;
         *  }
         */

        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠트리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타남.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
        System.out.println();

        System.out.print("어떤 도끼가 당신의 도끼입니까? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
        // 도끼의 값을 입력 받음 --> scanner, nextInt() 사용
        Scanner sc = new Scanner(System.in);
//        int answer = sc.nextInt();
//
//        // if-else-if문을 사용하여 산신령이 준 도끼를 출력
//        if (answer == 1) {
//            System.out.println("거짓말쟁이 새꺄! 너의 말은 false다! 너껀 없따!");
//        } else if (answer == 2) {
//            System.out.println("에라이 금도끼도 아니고 중간만 가려고? 어림도없지~");
//        } else {
//            System.out.println("으음 그래그래 너의 말은 true값을 가지는구나~");
//            System.out.println("니놈은 참말로 정직하구나~ 기분이다~ 다줄게~ ");
//            System.out.println("(산신령이 나무꾼에게 도끼를 세 개 모두 주었다.)");
//        }
        String answer = sc.nextLine();

        if(answer.equals("금도끼")) { // 문자열 비교는 equals() 메소드 사용, == 연산자 사용 X
            System.out.println("거짓말쟁이 새꺄! 너의 말은 false다! 너껀 없따!");
        } else if (answer.equals("은도끼")) {
            System.out.println("에라이 금도끼도 아니고 중간만 가려고? 어림도없지~");
        } else {
            System.out.println("으음 그래그래 너의 말은 true값을 가지는구나~");
            System.out.println("니놈은 참말로 정직하구나~ 기분이다~ 다줄게~ ");
            System.out.println("(산신령이 나무꾼에게 도끼를 세 개 모두 주었다.)");
        }

        System.out.println("산신령은 갑자기 명령줄이 다끝나서 사라졌다고 한다..");
    }

    public void testNestedIfElseIfStatement() { // 중첩 if-else-if문 테스트
        /*
         *  ohgiraffers 대학의 유xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         */

        // 학생의 이름과 점수를 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        // if-else-if문을 사용하여 학점 등급을 출력
        String grade = ""; // 학점 등급을 저장할 변수
        if(point >= 90) { // 90점 이상인 경우
            grade = "A";

            if(point >= 95) { // 95점 이상인 경우
                grade += "+";
            }
        } else if(point >= 80) { // 80점 이상인 경우
            grade = "B";

            if(point >= 85) { // 85점 이상인 경우
                grade += "+";
            }
        } else if(point >= 70) { // 70점 이상인 경우
            grade = "C";

            if(point >= 75) {
                grade += "+";
            }

        } else if(point >= 60) {

            grade = "D";

            if(point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";

        }

        System.out.println(name + " 학생의 학점은 " + grade + "입니다.");




    }
}
