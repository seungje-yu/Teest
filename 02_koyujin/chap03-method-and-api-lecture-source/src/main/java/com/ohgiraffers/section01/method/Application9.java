package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        int first =  100;
        int second = 50;
        /*non-static 메소드
        * 클래스가 다르더라도 사용하는 방법은 동일
        * 클래스명 사용할이름 = new 클래스명();
        * 사용할이름.메소드명();*/
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);
        System.out.println("두 수 중 최소값은 : " + min);

        /*static 메소드
        * 다른 클래스에 작성한 static 메소드인 경우 호출할 때
        * 클래스명을 반드시 기술해야 한다.
        * 클래스명.메소드명();*/
//        int max = maxNumberOf(first, second); //클래스명 생략하면 에러 발생
        int max = Calculator.MaxNumberOf(first, second);
        System.out.println("두 수 중 최대값은 : " + max);

        /*static 메소드도 non-static 메소드처럼 호출은 가능 but 권장x
        * 이미 메모리에 로딩되어 있는 static 메소드는 여러 객체가 공유하게 됨
        * 그때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에
        * 예상치 못하는 동작을 유발할 수 있기 때문에 사용을 제한해달라는 경고.
        * 시스템이 복잡해질수록 객체의 상태를 추적하기 어려워 유지보수에 악영향 줌*/

        int max2 = calc.MaxNumberOf(first, second);
        System.out.println("두 수 중 더 큰 값은 : " + max2);
    }
}
