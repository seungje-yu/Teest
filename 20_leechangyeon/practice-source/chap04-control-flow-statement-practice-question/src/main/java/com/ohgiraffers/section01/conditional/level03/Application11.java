package com.ohgiraffers.section01.conditional.level03;

import java.util.Random;
import java.util.Scanner;

public class Application11 {
    public static void main(String[] args) {
        /*
            0 이상 10 이하의 임의의 난수를 발생시키고 사용자에게 정수 한 개를 입력 받아
            난수가 입력한 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력,
            난수가 입력한 정수보다 크면 “입력하신 정수보다 큽니다.”를 출력하세요.

            단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복 되도록 하고
            정답인 경우 “정답입니다, n회 만에 정답을 맞추셨습니다.”처럼 몇 번째에 정답을 맞췄는지 출력하세요.
       */

        int ans = new Random().nextInt(11);
        Scanner sc = new Scanner(System.in);
        int cnt = 1;

        while (true) {
            int input = sc.nextInt();
            if (ans > input) {
                System.out.println("입력하신 정수보다 큽니다.");
            } else if (ans < input) {
                System.out.println("입력하신 정수보다 작습니다.");
            } else {
                System.out.println("정답입니다, " + cnt + "회 만에 정답을 맞추셨습니다.");
                break;
            }
            cnt++;
        }
    }
}
