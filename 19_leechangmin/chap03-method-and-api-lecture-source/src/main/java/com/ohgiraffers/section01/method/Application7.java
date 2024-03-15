package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        Application7 app7 = new Application7();
        int result1 = app7.plusTwoNumbers(10,20);
        int result2 = app7.minusTwoNumbers(10,20);
        int result3 = (int) app7.divideTwoNumbers(10,20);
        int result4 = app7.multipleTwoNumbers(10,20);


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }


    public int plusTwoNumbers(int first, int second){


        return first + second;
    }

    public int minusTwoNumbers(int first, int second){


        return first - second;
    }

    public int multipleTwoNumbers(int first, int second){


        return first * second;
    }

    public double divideTwoNumbers(int first, int second){


        return (double) first / second;
    }
}
