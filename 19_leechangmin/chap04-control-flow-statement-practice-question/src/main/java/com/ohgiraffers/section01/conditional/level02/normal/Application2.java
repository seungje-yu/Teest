package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("키를 입력하세요 ex)1.8m : ");
            double height = sc.nextDouble();

            System.out.print("몸무게를 입력하세요 : ");
            int weight = sc.nextInt();

            if (height == 0 || weight == 0){
                break;
            }

            if (height < 0 || weight < 0){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            double bmi = weight / (height * height);

            System.out.println("당신의 BMI : " + bmi);

            if (bmi < 20){
                System.out.println("당신은 저체중입니다.");
            } else if (bmi < 25){
                System.out.println("당신은 정상체중입니다.");
            } else if (bmi < 30){
                System.out.println("당신은 과체중입니다.");
            } else if (bmi >= 30){
                System.out.println("당신은 비만입니다.");
            }




        }
    }
}