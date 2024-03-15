package com.ohgiraffers.section02.pakage_and_import;
//패키지가 없으면 다른 클래스에서 import 할 수 없다. default 클래스가 된다.
public class Application1 {

    public static void main(String[] args) {

        /*
        * 패키지란?
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성하는 것을 말한다.
        * 같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만,
        *   패키지가 다르면 동일한 이름을 가진 클래스를 만들 수 도 있다.
        * 클래스명은 원래 패키지명을 포함하고 있기 때문이다.
        *   예)com.ohgiraffers.section01.method.Calculator (이게 클래스명이다.)
        * 지금까지 클래스명에 패키지명을 함께 사용하지 않은 이유는 동일한 패키지 내에서 사용했기 때문이다.
        * 그렇기 때문에 서로 다른 패키지에 존재하는 클래스를 사용하는 경우에는
        *   클래스명 앞에 패키지명을 명시해서 풀 클래스 이름으로 사용해야 한다.
        * */

        /*
        * 다른 패키지에 있는 메서드를 import 없이 사용하려면 패키지명에 클래스명까지 다 써야한다.
        * */
            //non-static의 경우
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30,20);
        System.out.println("더 적은 값 : " + min);

            //static의 경우
        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(20, 30);
        System.out.println("더 큰 값 : " + max);

    }



}
