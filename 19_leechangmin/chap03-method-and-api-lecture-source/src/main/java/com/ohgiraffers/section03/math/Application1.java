package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {
        /*  API란?
         *  Application Programming Interface는 응용프로그램에서 사용할 수 있도록,
         *    운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
         *  쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을
         *    JDK를 설치하면 사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스)들을 의미한다.
         *  더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말이다.
         *  모든 코드를 우리가 다 외울 수 없으니 API 문서를 별도로 제공해주고 있다.
         *
         * import를 안해도 사용할 수 있는 pakage가 있다. --> java.lang패키지
         *
         *
         * java.lang.Math
         * Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스이다.
         * 모든 메서드가 static이다.
         * (객체의 상태를 관리하지 않고 기능만 제공하는 경우 메모리를 효율적으로 사용하기 위해 자주 사용되는 기법이다.)
         *
         *
         * */

        System.out.println("-7의 절대값 : " + java.lang.Math.abs(-7));
        System.out.println("10과 20중 더 작은 값 : " + Math.min(10, 20) );
        System.out.println("20과 30중 더 큰 값 : " + Math.max(20,30));

        System.out.println("원주율 : " + Math.PI);

        System.out.println("난수 발생 : " + (int) (Math.random() * 10));
        /* 호출할 때 마다 0.0과 1.0 사이의 실수를 무작위로 발생*/




    }
}
