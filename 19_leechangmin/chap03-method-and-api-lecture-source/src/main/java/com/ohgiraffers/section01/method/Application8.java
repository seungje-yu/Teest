package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {
        /*
        * static은 별도의 공간에 저장되어있고, main메서드가 종료될 때 까지 살아있다.
        * 호출하려면 클래스명.메서드명();
        * */
        int result1 = Application8.sumTwoNumbers(10, 20);
        System.out.println("10과 20의 합 : " + result1 + "/" + sumTwoNumbers(10,20));

        // 동일한 클래스 내에 작성된 static 메서드는 클래스명 생략이 가능하다.
    }


    public static int sumTwoNumbers(int first, int second){
        return first + second;
    }
}
