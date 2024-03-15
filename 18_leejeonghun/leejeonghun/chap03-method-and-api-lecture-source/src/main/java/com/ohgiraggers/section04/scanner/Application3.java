package com.ohgiraggers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        
        /* 
         * 스캐너의 next() 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
         * 그래서 크게 두 가지 사항을 주의해야 한다.
         * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력받을 때
         * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next();
        System.out.println("str1 : " + str1);
        sc.nextLine();  // next()를 사용하여 밀려서 들어올 때는 다음과 같은 방법으로 해결 가능
        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1 : " + num1);

        /* 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 : " + num2);

        sc.nextLine();  // nextInt()를 사용하면 버퍼에 숫자 + \n 이 들어가는데 nextInt()는 숫자만 인식하여 버퍼에 /n이 남아있다. 따라서 이후 사용한 nextLine()에는 \n이 들어가기 때문에 넘어가는 현상이 발생한다.
                        // 따라서 nextLine()을 사용하여 버퍼를 비워주는 작업이 필요하다.

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 : " + str2);
    }
}
