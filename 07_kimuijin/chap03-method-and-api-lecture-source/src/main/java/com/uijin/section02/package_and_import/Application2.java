package com.uijin.section02.package_and_import;

import com.uijin.section01.method.Calculator;

import java.util.Date;
//import java.sql.Date;     // 두 번 임포트 못함 (스태틱 하나 논스태틱 하나는 가능)
import static com.uijin.section01.method.Calculator.*;      // * 하면 모든 걸 가져오겠다. 맨 마지막에만 사용함

public class Application2 {

    public static void main(String[] args) {

        /*  임포트란?
		 *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
		 *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
         *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
         *   import는 package 선언문과 class 선언문 사이에 작성하며
		 *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
		 *
		 * 임포트를 안 해도 사용할 수 있는 package가 있다. --> java.lang 패키지
         */

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50, 60);
        System.out.println("50과 60 중 더 작은 값은 : " + min);

        int max = Calculator.maxNumberOf(50, 60);
        System.out.println("50과 60 중 더 큰 값은 : " + max);

        int max2 = Calculator.maxNumberOf(100, 200);
        System.out.println("100과 200 중 더 큰 값은 : " + max2);

        Date date = new Date();
        java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());        // 하나의 클래스에서 여러가지 임포트 해야하면 이렇게 씀. 가장 많이 쓰는 걸 위에 올림



    }
}
