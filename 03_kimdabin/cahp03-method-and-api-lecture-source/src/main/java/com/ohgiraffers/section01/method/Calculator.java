package com.ohgiraffers.section01.method;

public class Calculator {

    public int minNumbersOf(int first, int second) {
        return (first > second) ? second : first;
    }

    public static int maxNumberOf(int first, int second) {
        return (first > second) ? first : second; 
    }
}
