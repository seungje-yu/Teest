package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        /*  [for문 표현식]
         *  for(초기식; 조건식; 증감식) {
         *      조건을 만족하는 경우 수행할 구문(반복할 구문);
         *  }*/

        /*1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문*/
        for(int i = 1; i<=10; i++) {
            System.out.println(i);
        }
//        for(int i =0; i<10; i++) {
//            System.out.println(i + 1);
//        } //같은 결과값
    }

    public void testForExample(){
        Scanner sc = new Scanner(System.in);
        //
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

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
        */
        /*
        * 반복횟수 : 총 10번, 초기식 0 -> i+1  1 -> i
        * 반복할 내용
        * 1.안내문구 출력
        * 2.학생 이름을 입력받아 변수에 저장
        * 3.저장된 이름 출력
        * */
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");
        }
        System.out.println("10명의 학생의 이름을 입력 받고 출력하는 기능을 완료했습니다.");
    }

    public void testForExample2(){
       /* num1 = 1;
        num2 = 2;
        num3 = 3;
        num4 = 4;
        num5 = 5;
        num6 = 6;
        num7 = 7;
        num8 = 8;
        num9 = 9;
        num10 =10;

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

        System.out.println("sum =" + sum);*/

        /*1~10까지의 합계를 구하시오*/
        /*반복횟수 : 10번 반복, 초기식 1, 조건식 10까지
        * 반복할 내용
        * 1. 변수에 1씩 증가하는 값을 담기
        * 2. 저장된 값을 sum에 누적시키기
        * */
        int sum1 = 0;
        for(int i = 1; i<=10; i++) {
            sum1 += i;
        }
        System.out.println("1~10까지의 합: " + sum1);
    }

    public void testForExample3(){
        /*5~10사이의 난수를 발생시켜서
        * 1부터 발생한 난수까지의 합계를 구해보자*/

//        int random = (int)(Math.random() * 6) + 5;
        int random = new Random().nextInt(6) + 5;
        System.out.println("random = " + random);

        int sum =0;

        if(random == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if(random == 6){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if(random == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
        } else if(random == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
        } else if (random == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }

        System.out.println("1부터 " + random + "까지의 합은 " +  sum);

        int sum2 = 0;
        //방법1
       /* for (int i = 0; i < random; i++){
            sum2 += i;
        }
        System.out.println("1부터 " + random + "까지의 합은 " + (sum2 + random));*/
        //방법2
        for(int i = 1; i<= random; i++) {
            sum2 += i;
        }
        System.out.println("1부터 " + random + "까지의 합은" + sum2);
    }
}
