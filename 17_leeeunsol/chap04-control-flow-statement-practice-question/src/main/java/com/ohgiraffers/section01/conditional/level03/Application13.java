package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application13 {

    public static void main(String[] args) {

        /*
        * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
        * 
        *
        * 정수하나를 입력하세요 : 5
        *         1 x 8 + 1 = 9
        *        12 x 8 + 2 = 98
        *       123 x 8 + 3 = 987
        *      1234 x 8 + 4 = 9876
        *     12345 x 8 + 5 = 98765
        *
        *
        *             1 x 8 + 1 = 9
        *            12 x 8 + 2 = 98
        *           123 x 8 + 3 = 987
        *          1234 x 8 + 4 = 9876
        *         12345 x 8 + 5 = 98765
        *        123456 x 8 + 6 = 987654
        *       1234567 x 8 + 7 = 9876543
        *      12345678 x 8 + 8 = 98765432
        *     123456789 x 8 + 9 = 987654321
        * 정수하나를 입력하세요 : 9
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();
        int x = 0;

        for (int i = 1; i <= num; i++) {
            //i값을 1의 자리에 넣음
            x +=i;
            for(int j = num; j>=(i+1);j--){
                //공백생성
                System.out.print(" ");
            }
            System.out.print(x + " X 8 + " + i + " = " + (x*8+i));
            //x값에 X10을 해서 1의 자리를 0으로 만들어줌
            x *=10;
            System.out.println();

        }

    }
//
    public void cheat(){
        //아직 안배운 String 정수변환 사용..
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();
        String str = "";
        for (int i = 1; i <= num; i++) {
            for(int j = num; j>=(i+1);j--){
                System.out.print(" ");
            }
            str += i;
            System.out.print(str+" X 8 + "+i+" = "+(Integer.parseInt(str)*8+i));
            System.out.println();

        }}

}
