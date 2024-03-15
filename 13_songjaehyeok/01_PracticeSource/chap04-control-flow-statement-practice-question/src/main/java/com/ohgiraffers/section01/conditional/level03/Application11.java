package com.ohgiraffers.section01.conditional.level03;

import java.util.Random;
import java.util.Scanner;

public class Application11 {

    public static void main(String[] args) {

        /*
            10 이하의 임의의 난수를 발생시키고 사용자에게 정수 한 개를 입력 받아
            난수가 입력한 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력,
            난수가 입력한 정수보다 크면 “입력하신 정수보다 큽니다.”를 출력하세요.

            단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복 되도록 하고
            정답인 경우 “정답입니다, n회 만에 정답을 맞추셨습니다.”처럼 몇 번째에 정답을 맞췄는지 출력하세요.
       */
        Random ran = new Random();
        int num = ran.nextInt(10);
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(true){
            System.out.print("사용자의 정수는 : ");
            int num1 = sc.nextInt();
            if (num1!=num){
               if ( num < num1){
                   System.out.println("입력하신 정수보다 작습니다.");
               }
               else{
                   System.out.println("입력하신 정수보다 큽니다.");
               }
               cnt+=1;
            }
            else {
                System.out.println("정답입니다 " + cnt + "회 만에 정답을 맞추셧습니다.");
                break;
            }

        }

    }
}
