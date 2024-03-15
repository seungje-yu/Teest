package com.ohgiraffers.section02.package_and_import;


import com.ohgiraffers.section01.method.Calculator;

import java.util.Date;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf; // Calculator.* 의 의미는 Calculator 클래스의 모든것을 사용하겠다.

public class Application2 {

    public static void main(String[] args) {

        /*
         *  임포트란?
         *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
         *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
         *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
         *   import는 package 선언문과 class 선언문 사이에 작성하며
         *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
         * 
         *   임포트를 안해도 사용할 수 있는 package가 있다. --> java.lang패키지
         * */
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50, 60);
        System.out.println("50과 60 중 더 작은 값은 : " + min);

        int max = maxNumberOf(50, 60);

        System.out.println("50과 60 중 더 큰 값은 : " + max);

        int max2 = maxNumberOf(100, 200);
        System.out.println("100과 200중 더 큰 값은 : " + max2);

        // 하나의 클래스에서 여러가지의 패키지를 쓰고 싶다면 클래스 앞에 풀 패키지명으로 써주면 된다.
        // 최상단의 import 되는 패키지는 자주 사용되는 패키지를 넣으면 좋다!
        Date date = new Date();
        java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());

    }
}
