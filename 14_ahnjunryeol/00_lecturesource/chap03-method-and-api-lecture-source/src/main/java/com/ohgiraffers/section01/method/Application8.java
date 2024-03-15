package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {
        // static은 저장되는 공간이 별도로 있다
        // static은 빌드에서 실행시킬때 사용할 것들을 모두 선점해놓는다.
        // 메모리공간에 자리를 잡고 있는것.
        // 스태틱이 안붙어있는 내용들은 호출할 시점에 객체를 만들어주어야
        // 메모리공간에 할당이 된다.

        /*
        * static 메소드를 호출하는 방법
        * 클래스명.메소드명();
        * */
        System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10, 20));

        // 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능하다.
        System.out.println("10과 20의 합 : " + sumTwoNumbers(10,20));

    }

    public static int sumTwoNumbers(int first, int second) {

        return first + second;
    }
}
