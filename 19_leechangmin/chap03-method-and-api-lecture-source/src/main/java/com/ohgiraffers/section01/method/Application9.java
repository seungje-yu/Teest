package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        /*
         * non-static 메서드
         *
         * 클래스가 다르더라도 사용하는 방법은 동일하다.
         * 클래스명 사용할이름 = new 클래스명();
         * 사용할이름.메서드명();
         * */

        Calculator calc = new Calculator();

        int first = 100;
        int second = 50;

        int min = calc.minNumberOf(first, second);
        int max = Calculator.maxNumberOf(first,second);
        System.out.println(min);
        System.out.println(max);


        /*
        * static 메서드
        * 다른 클래스에 작성한 static메서드인 경우 호출할 때 클래스명을 반드시 기술해야한다.
        * 클래스명.메서드명();
        * */
//        int max = maxNumberOf(first, second); 클래스명을 생략하면 에러발생
        int max1 = Calculator.maxNumberOf(first, second);
//        int how = calc.maxNumberOf(first, second);
// static 메서드를 굳이 객체로 사용하면 충돌에 의한 오류가 나타날 수 있다. 클래스명.메서드명();이 안전하다.
        // 추후 유지보수시 객체 상태 추적에 어려움을 줄 수 있다.
        // static은 결국 메모리(ram) 공간을 사용하기 때문에 꼭 필요할 때 최소한으로 쓰는 것이 좋다.




    }


    public static void test(){

    }
}
