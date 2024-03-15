package com.ohgidraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {

        /*비교 연산자
        * 비교연산자는 피연산자 사이에 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
        * */

        int inum1 = 10;
        int inum2 = 20;

        System.out.println("============== 정수값 비교 ==============");
        System.out.println("inum1과 inum2가 같은지 비교 : "         + (inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : "     + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : "         + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : "       + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작거나 같은지 비교 : " + (inum1 <= inum2));

        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println("============== 실수값 비교 ==============");
        System.out.println("dnum1과 dnum2가 같은지 비교 : "         + (dnum1 == dnum2));
        System.out.println("dnum1과 dnum2가 같지 않은지 비교 : "     + (dnum2 != dnum2));
        System.out.println("dnum1이 dnum2보다 큰지 비교 : "         + (dnum1 > dnum2));
        System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
        System.out.println("dnum1이 dnum2보다 작은지 비교 : "       + (dnum1 < dnum2));
        System.out.println("dnum1이 dnum2보다 작거나 같은지 비교 : " + (dnum1 <= dnum2));


        char ch1 = 'a'; // 97
        char ch2 = 'A'; // 65
        System.out.println("============== 문자값 비교 ==============");
        System.out.println("ch1과 ch2가 같은지 비교 : "         + (ch1 == ch2));
        System.out.println("ch1과 ch2가 같지 않은지 비교 : "     + (ch1 != ch2));
        System.out.println("ch1이 ch2보다 큰지 비교 : "         + (ch1 > ch2));
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1이 ch2보다 작은지 비교 : "       + (ch1 < ch2));
        System.out.println("ch1이 ch2보다 작거나 같은지 비교 : " + (ch1 <= ch2));


        // 논리값 비교는 ==과 != 비교 가능하지만 대소비교는 불가능하다.
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("============== 문자값 비교 ==============");
        System.out.println("ch1과 ch2가 같은지 비교 : "         + (bool1 == bool2));
        System.out.println("ch1과 ch2가 같지 않은지 비교 : "     + (bool1 != bool2));
//        System.out.println("ch1이 ch2보다 큰지 비교 : "         + (bool1 > bool2));
//        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (bool1 >= bool2));
//        System.out.println("ch1이 ch2보다 작은지 비교 : "       + (bool1 < bool2));
//        System.out.println("ch1이 ch2보다 작거나 같은지 비교 : " + (bool1 <= bool2));

        // 문자열값 비교도 == 과 !=은 비교 가능하지만 대소비교는 불가능하다.
        String str1 = "java";
        String str2 = "java";

        System.out.println("============== 문자값 비교 ==============");
        System.out.println("str1과 str2가 같은지 비교 : "         + (str1 == str2));
        System.out.println("str1과 str2가 같지 않은지 비교 : "     + (str1 != str2));
//        System.out.println("str1이 str2보다 큰지 비교 : "         + (str1 > str2));
//        System.out.println("str1이 str2보다 크거나 같은지 비교 : " + (str1 >= str2));
//        System.out.println("str1이 str2보다 작은지 비교 : "       + (str1 < str2));
//        System.out.println("str1이 str2보다 작거나 같은지 비교 : " + (str1 <= str2));

        int x = 10;
        int y = 10;
                
        boolean result = x <= y;

        System.out.println("result = " + result);



















    }
}
