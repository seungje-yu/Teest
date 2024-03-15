package com.ohgiraffers.section02.pakage_and_import;

import com.ohgiraffers.section01.method.Calculator; //non-static

import java.util.Date;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf; //static (사용하지 않을 경우 회색처리됨)
import static com.ohgiraffers.section01.method.Calculator.*; //패키지 안의 모든 클래스를 칭함
public class Application2 {
    public static void main(String[] args){
        // non-static
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50,60);
        System.out.println("50과 60 중 더 작은 값은 : " + min);


        //static
        int max = Calculator.maxNumberOf(50,60);
        System.out.println("50과 60중에 더 큰 값은 : " + max);

        int max2 = maxNumberOf(100,200);
        System.out.println("100과 200중 더 큰 값은 : " + max2);

        Date date = new Date();
        java.sql.Date data2 = new java.sql.Date(System.currentTimeMillis());
    }
}
