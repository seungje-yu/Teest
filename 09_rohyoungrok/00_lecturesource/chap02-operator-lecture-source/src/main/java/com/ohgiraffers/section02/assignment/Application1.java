package com.ohgiraffers.section02.assignment;

public class Application1 {

    public static void main(String[] args) {

        int num = 12;
        System.out.println("num = " + num); //12

        //3증가시
        num = num + 3;
        System.out.println("num = " + num); //15
        
        num += 3;
        System.out.println("num = " + num); //18

        num -= 5;
        System.out.println("num = " + num); //13

        num *= 2;
        System.out.println("num = " + num); //26

        num /= 2;
        System.out.println("num = " + num); //13

        num =- 5;
        System.out.println("num = " + num); // -5
    }
}
