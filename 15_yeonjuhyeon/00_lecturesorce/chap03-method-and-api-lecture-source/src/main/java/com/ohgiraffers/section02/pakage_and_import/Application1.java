package com.ohgiraffers.section02.pakage_and_import;

public class Application1 {
    public static void main(String[] args){
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30, 20);

        System.out.println("30과 20중 더 작은 값은 : " + min);

        // static 메소드의 경우
        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(30,20);
        System.out.println("30과 20 중 더 큰 값음 : " + max);
    }
}
