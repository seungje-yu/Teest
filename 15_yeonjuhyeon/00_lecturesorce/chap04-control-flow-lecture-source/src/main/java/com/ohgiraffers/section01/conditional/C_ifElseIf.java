package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    public void testSimpleIfElseIfStatement() {

        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.print("어느 도끼가 너의 도끼 인냐? (1. 금도끼), (2. 은도끼), (3. 쇠도끼) : ");

        Scanner sc = new Scanner(System.in);
        //     int answer = sc.nextInt();
//
//        if (answer == 1){
//            System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼도 줄 수 없구나! 욕심쟁이!!");
//        }else if(answer ==2){
//            System.out.println("욕심히 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 썩 꺼지거라");
//        }else{
//            System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라");
//        }
//
//        System.out.println("-끝-");
//

        String answers = sc.nextLine();
        sc.nextLine();

        if (answers.equals("금도끼")) {
            System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼도 줄 수 없구나! 욕심쟁이!!");
        } else if (answers.equals("은도끼")) {
            System.out.println("욕심히 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 썩 꺼지거라");
        } else {
            System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라");
        }
    }

    public void testNestedIfElseIfStatement() {

        /*  ohgiraffers 대학의 유xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        String grade = "";
        if (point >= 90) {
            grade = "A";

            if (point >= 95) {
                grade += "+";

            }
        } else if (point >= 80) {
            grade = "B";
            if (point >= 85) {
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if (point >= 60) {
            grade = "D";
            if (point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }
        System.out.println(grade);
    }
}

