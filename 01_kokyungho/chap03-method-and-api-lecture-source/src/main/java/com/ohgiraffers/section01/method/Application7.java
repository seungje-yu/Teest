package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        int first = 20;
        int second = 10;

        Application7 app7 = new Application7();
        int sum = app7.plusTwoNumvers(first, second);
        System.out.println("두 수를 더한 결과 : " + sum);
        System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first, second));
        System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
        System.out.println("두 수를 나눈 결과 : " + app7.devideTwoNumbers(first, second));

    }

    public int plusTwoNumvers(int first, int second){

        return first + second;
    }

    public int minusTwoNumbers(int first, int second){
        return first - second;
    }

    public int multipleTwoNumbers(int first, int second){
        return first * second;
    }

    public int devideTwoNumbers(int first, int second){
        return first / second;
    }
}
