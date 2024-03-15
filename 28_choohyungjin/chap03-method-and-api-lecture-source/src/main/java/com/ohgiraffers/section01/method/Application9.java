package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        /* Non-static method
        *
        * 클래스가 다르더라도 사용하는 방법은 동일
        * 클래스명 사용할이름(변수명) = new 클래스명();
        * 사용할이름(변수명).메소드명();
         */
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);
        System.out.println("두 수 중 최소값은 : " + min);

        /* Static method
        * 다른 클래스에 작성한 static 메소드인 경우 호출 할 때 클래스명을 반드시 기술해야한다.
        * 클래스명.메소드명();
         */
//        int max = maxNumberOf(first, second); // Error, maxNumberOf is not defined in this class
        int max = Calculator.maxNumberOf(first, second);
        System.out.println("두 수 중 최대값은 : " + max);

        /*
        * static 메소드도 non-static 메소드처럼 인스턴스를 통해서 호출할 수 있다.
        * 하지만 이 방법은 권장하지 않는다.
        * 이때 메모리에 로딩되어 있는 static 메소드는 여러 객체가 공유하게 된다
        * 그 때 객첼 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발할 수 있기 때문에
        * 사용을 제한해 달라는 경고이다. 시스템이 복잡해질수록 객체의 상태를 추적하기 어려워 유지보수에 악영향을 줌.
        * 클래스명.메소드명(); 으로 호출하는 것이 좋다.
         */
        int max2 = calc.maxNumberOf(first, second); // 경고, static 메소드는 인스턴스를 통해서 호출할 수 있지만 권장하지 않는다.
        System.out.println("두 수 중 최대값은 : " + max2);
    }
}
