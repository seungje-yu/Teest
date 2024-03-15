package com.ohgiraffers.section04.comparison;

public class Application1 {

    /*
     *  비교연산자의 종류
     *  '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
     *  '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
     *  '>'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 아니면 false를 반환
     *  '>=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 아니면 false를 반환
     *  '<'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 아니면 false를 반환
     *  '<=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true 아니면 false를 반환
     * */
    public static void main(String[] args) {

        char ch1 = 'a'; // 97   
        char ch2 = 'A'; // 65

        System.out.println("======= 문자값 비교 ======");
        System.out.println("ch1 과 ch2 가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("ch1 과 ch2 가 다른지 비교 : " + (ch1 != ch2));
        System.out.println("ch1 이 ch2 보다 큰지 비교 : " + (ch1 > ch2));
        System.out.println("ch1 이 ch2 보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1 이 ch2 보다 작은지 비교 : " + (ch1 < ch2));
        System.out.println("ch1 이 ch2 보다 작거나 같은지 비교 : " + (ch1 <= ch2));

        boolean bool1 = true;
        boolean bool2 = false;

        // 논리값 비교는 같거나 같지 않다만 비교 가능
        System.out.println("======= 문자값 비교 ======");
        System.out.println("bool1 과 bool2 가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1 과 bool2 가 다른지 비교 : " + (bool1 != bool2));
//        System.out.println("bool1 이 bool2 보다 큰지 비교 : " + (bool1 > bool2));
//        System.out.println("bool1 이 bool2 보다 크거나 같은지 비교 : " + (bool1 >= bool2));
//        System.out.println("bool1 이 bool2 보다 작은지 비교 : " + (bool1 < bool2));
//        System.out.println("bool1 이 bool2 보다 작거나 같은지 비교 : " + (bool1 <= bool2));

        // 문자열값 비교도 == 과 != 은 비교 가능하지만 대소비교는 불가능하다.
        String str1 = "java";
        String str2 = "java";

        System.out.println("======= 문자열값 비교 ======");
        System.out.println("str1 과 str2 가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1 과 str2 가 다른지 비교 : " + (str1 != str2));
//        System.out.println("str1 이 str2 보다 큰지 비교 : " + (str1 > str2));
//        System.out.println("str1 이 str2 보다 크거나 같은지 비교 : " + (str1 >= str2));
//        System.out.println("str1 이 str2 보다 작은지 비교 : " + (str1 < str2));
//        System.out.println("str1 이 str2 보다 작거나 같은지 비교 : " + (str1 <= str2));

        int x = 10;
        int y = 11;

        boolean result = x <= y;
        System.out.println("result = " + result);


    }
}
