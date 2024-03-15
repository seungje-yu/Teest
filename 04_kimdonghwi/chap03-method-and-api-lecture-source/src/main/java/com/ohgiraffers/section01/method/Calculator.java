package com.ohgiraffers.section01.method;

public class Calculator {
    /**
     * Instance Method
     * @param first one of the numbers to compare
     * @param second the other number to compare
     * @return the smaller of the two numbers
     */
    public int minNumberOf(int first, int second) {
        return (first > second) ? second : first;
    }

    /**
     * Static Method
     * @param first one of the numbers to compare
     * @param second the other number to compare
     * @return the larger of the two numbers
     */
    public static int maxNumberOf(int first, int second) {
        return (first > second) ? first : second;
    }
}