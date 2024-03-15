package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        //빌드를 시작했을때 미리 저장공간을 차지하고있음
        //static이 안붙은 클래스는 객체생성을 해줘야 메모리공간에 자리를 잡을수있음

        /*
        * static 메소드를 호출하는 방법
        * 클래스명.메소드명();
        *
        * */

        System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10,20));

        //동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능하다.
        System.out.println("10과 20의 합 : " + sumTwoNumbers(10,20));
    }

    public static int sumTwoNumbers(int first, int second){
        return first+second;
    }
}
