package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args){

        int first = 100;
        int second = 50;

        //non-static 메소드
        Calculator calc = new Calculator();  //객체 생성
        int min = calc.minNumberOf(first, second);
        System.out.println("두 수 중 최소값은 : " + min);

        //static 메소드
       // int max = maxNumberOf(first, second); --> 클래스명 생략으로 오류
        int max = Calculator.maxNumberOf(first,second);
        System.out.println("두 수 중 최대값은 : " + max);


        /*
        static 메소드도 non-static 메소드처럼 호출은 가능하다.
        하지만, 권장하지 않음!!
        이미 메모리에 로딩되어 있는 static 메소드는 여러 객체가 공유하게 된다.
        그 때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을
        유발할 수 있기 때문에 사용을 제한해 달라는 경고이다.
        시스템이 복잡해질수록 객체의 상태를 추적하기 어려워 유지보수에 악영향을 준다.
         */
        int max2 = calc.maxNumberOf(first,second);
        System.out.println(max2);
    }
}
