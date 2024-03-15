package com.ohgiraffers.section04.comparison;

public class Application01 {
    public static void main(String[] args) {

//        논리값 비교는 ==과 != 비교 가능하지만 대소비교는 불가능하다. 같다와 같지 않다만 가능


//        문자열값 비교도 ==과 != 비교 가능하지만 대소비교는 불가능.
        String str1 = "java";
        String str2 = "java";

        //밑의 문장은 두 개의 피연산자가 서로 같기를 바라면서 조건
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));

        //밑의 문장은 두 개의 피연산자가 서로 같기 않기를 바라면서 조건
        System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2));
//        System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2));
        
        int x = 10;
        int y = 11;

        boolean result = x <= y;
        System.out.println("result = " + result);

    }
}
