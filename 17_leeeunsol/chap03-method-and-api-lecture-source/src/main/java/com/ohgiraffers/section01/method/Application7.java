package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        int first = 20;
        int seconde = 10;

        Application7 app7 = new Application7();
        System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first,seconde));
        System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first,seconde));
        System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first,seconde));
        System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumbers(first,seconde));


    }
    public int plusTwoNumbers(int first, int second){
        return first+second;
    }

    public int minusTwoNumbers(int first, int second){
        return first-second;
    }

    public int multipleTwoNumbers(int first,int second){
        return first*second;
    }

    public int divideTwoNumbers(int first, int second){
        return first/second;
    }
}
