package com.ohgiraffers.section02.pakage_and_import;
//import com.ohgiraffers.section01.method.*;
import com.ohgiraffers.section01.method.Calculator;

//import static com.ohgiraffers.section01.method.Calculator.*;




import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

import  java.util.Date;
//import  java.sql.Date;

//        F2 오류난 곳으로
//        Alt + 엠터 = import class 임포트 보여줌
public class application2 {
    public static void main(String[] args) {
        /*
        * 팩키지,인포트,클래스
        * F2 오류난 곳으로
        * Alt + 엠터 = impor class 보여줌
        * */

        /*  임포트란?
		 *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
		 *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
         *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
         *   import는 package 선언문과 class 선언문 사이에 작성하며
		 *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
         */

         /*  임포트를 안해도 사용할 수 있는 package가 있다 --> java.lang패키지   */

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50, 60);
        System.out.println("50과 60 중 더 작은 값은 : " + min);

        int max = Calculator.maxNumberOf(50,60);
        System.out.println("50과 60중 더 큰 값은 : " + max);

        int max2 = maxNumberOf(100, 200);
        System.out.println("100과 200중 더 큰 값은 : " + max);

        Date date = new Date();
        java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());
    }
}
