package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        //1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문
        //int i = 0;
//        for (int i = 1 ; i < 11 ; i++){
//            System.out.println("i = " + i);
//        }
//        System.out.println("for문 종료합니다.");
    }

    public void testForStudentName(){
        Scanner sc = new Scanner(System.in);

        /*
         * 반복 횟수 : 총 10번, 초기식 0
         * 반복할 내용
         * 1. 안내문구 출력
         * 2. 학생의 이름을 입력 받아서 변수에 저장
         * 3. 저장된 이름을 출력
         */

        for (int i = 1; i < 11 ; i++){
            System.out.println(i + "번째 학생의 이름을 입력하세요. : ");
            String name = sc.next();
            System.out.println(i + "번쨰 학생의 이름은 " + name + "입니다.");
        }
        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다.");
    }

    public void testForExample2(){
        // 1부터 10까지의 합계를 구하세요.
       int num1 = 1;
       int num2 = 2;
       int num3 = 3;
       int num4 = 4;
       int num5 = 5;
       int num6 = 6;
       int num7 = 7;
       int num8 = 8;
       int num9 = 9;
       int num10 = 10;

       int sum = 0;
       sum += num1;
       sum += num2;
       sum += num3;
       sum += num4;
       sum += num5;
       sum += num6;
       sum += num7;
       sum += num8;
       sum += num9;
       sum += num10;

        System.out.println(sum);

        /*
         * 반복 횟수 : 10번, 초기식 1 ~ 조건식 10까지
         * 반복해야할 내용
         * 1. 변수에 1씩 증가하는 값 담기
         * 2. 저장된 값을 sum에 누적시키기
         *
         */

        int sum2 = 0;
        for (int i = 1; i < 11; i++){
            sum2 += i;
            //System.out.println(sum2);
        }
        System.out.println(sum2);



    }

    public void testForExample3(){

        /*
         * 5 ~ 10 사이의 난수를 발생시켜서 1부터 발생한 난수까지의 합계를 구하기
         */

        // 난수를 만들기 두가지 방법
//        int random = (int)(Math.random() * 6) + 5;
        int random = new Random().nextInt(6) + 5;
        int sum2 = 0;
        for(int i = 1; i <= random; i++){
            sum2 += i;
        }
        System.out.println("1부터 " + random + "까지의 합은 " + sum2);
        System.out.println("====================나의 식======================");
        // 내가 만든 식
        System.out.println("난수는 " + random);
        int origin = random;
        int sum = 0;

        for (; random > 0 ; random--){
            sum += random;
            System.out.println((sum - random) + "+" + (random) + "=" + sum);
        }

        System.out.println("1부터 " + origin + "까지의 합은 " + sum);
    }
}
