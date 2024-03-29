package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {
        /*
        *  AND 연산과 OR 연산의 특징
        * 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
        * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
        * */

        /*논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
        *
        * 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오게되면
        * 두;의 조건을 확인할 필요 없이 false를 반환한다.
        * 따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
        * */
        int num1 = 10;

        int result1 = (false && ++num1 > 0) ? num1 : num1;
        System.out.println("&& 실행확인 : " + result1);

        result1 = (true && ++num1 > 0) ? num1 : num1;
        System.out.println("&& 실행확인 : " + result1);

        int num2 = 10;
        int result2 = (true || ++num2 > 0) ? num2 : num2;
        System.out.println("|| 실행확인 : " + result2);

        result2 = (false || ++num2 > 0) ? num2 : num2;
        System.out.println("|| 실행확인 : " + result2);
        /*&&, ||의 논리식은 각각 앞의 결과가 false, true가 되면
        * 뒤의 조건을 확인하지 않고 각각 false, true를 반환한다.
        * 연산 횟수를 줄이기 위해서는 &&연산은 false를, ||연산은 true가 나올 가능성이 높은 조건을 앞에 두는 것이 좋다.
        * */









    }
}
