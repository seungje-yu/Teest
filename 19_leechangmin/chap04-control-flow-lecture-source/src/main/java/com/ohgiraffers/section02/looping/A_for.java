package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {


        /*  [for문 표현식]
         *  for(초기식; 조건식; 증감식) {
         *      조건을 만족하는 경우 수행할 구문(반복할 구문);
         *  }
         * */

        // 1부터 10 까지 i를 증가시키며 i를 출력하는 반복문

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }



        //for문을 안쓰면?
    public void testForExample(){
        Scanner sc = new Scanner(System.in);

        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
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

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }

    public void myMy(){
        /*
         * 반복횟수 : 총 10번, 초기식 > 맘대로
         * 반복할 내용 :
         *   1. 안내문구 출력
         *   2. 학생 이름 입력받아 변수에 저장
         *   3. 저장된 이름 출력
         * */

        int cnt = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.print((i+1) + "번째 학생의 이름을 입력해 주세요 : ");
            String student = sc.nextLine();
            System.out.println((i+1) + "번째 학생의 이름은 " + student + "입니다.");
            cnt++;
        }
        System.out.println(cnt + "명의 학생의 이름을 입력하고 출력했습니다.");



    }

    public void testForExample2(){

        // 1 ~ 10 까지의 합계를 구하시오

        int total = 0;
        for (int i = 0; i < 10; i++){
            total += (i+1);
        }
        System.out.println("1 ~ 10을 더한 총합 : " + total);
    }

    public void testForExample3() {

        /*
         * 5 ~ 10 사이의 난수를 발생시켜서
         * 1부터 발생한 난수까지의 합계를 구해보자
         * */

        int randNum = (int) (Math.random() * 6 + 5);
        int total = 0;
        for (int i = 1; i <= randNum; i++){
            total += i;
        }

//        if (randNum == 5) {
//            total += 1;
//            total += 2;
//            total += 3;
//            total += 4;
//            total += 5;
//            total += 6;
//            total += 7;
//            total += 8;
//            total += 9;
//        } else if (randNum == 6) {
//            total += 1;
//            total += 2;
//            total += 3;
//            total += 4;
//            total += 5;
//            total += 6;
//        } else if (randNum == 7) {
//            total += 1;
//            total += 2;
//            total += 3;
//            total += 4;
//            total += 5;
//            total += 6;
//            total += 7;
//        } else if (randNum == 8) {
//            total += 1;
//            total += 2;
//            total += 3;
//            total += 4;
//            total += 5;
//            total += 6;
//            total += 7;
//            total += 8;
//        } else if (randNum == 9) {
//            total += 1;
//            total += 2;
//            total += 3;
//            total += 4;
//            total += 5;
//            total += 6;
//            total += 7;
//            total += 8;
//            total += 9;
//        } else if (randNum == 10) {
//            total += 1;
//            total += 2;
//            total += 3;
//            total += 4;
//            total += 5;
//            total += 6;
//            total += 7;
//            total += 8;
//            total += 9;
//            total += 10;
//        }
        System.out.println("randNum = " + randNum);
        System.out.println("1부터 " + randNum + "까지의 합은 " + total);
    }





}
