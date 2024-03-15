package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {
        /*
        AND 연산과 OR 연산의 특징
        - 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
        - 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
         */

        // 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함

        // 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오게 되면
        // 뒤의 조건을 확인할 필요 없이 false를 반환한다.
        // 따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 편이 좋다.

        int num1 = 10;

        // 이 밑에가 뒷부분을 수행 안한다는 예제다. false면 뒤에 ++ 전위 연산자를 실행 안하기 때문에 10을 반환한다.
        int result1 = false && ++num1 > 0 ? num1 : num1;
        System.out.println("실행 학인 :  " + result1);

        int num2 = 10;

        // 앞부분이 true 이기 때문에 뒷부분 logic을 실행 안한다. 그러므로 반환 값이 10이다. (++전위 연산자 사용 x)
        int result2 = (true || ++num2 > 0 ? num2 : num2);
        System.out.println("실행 확인 : " + result2);

        // 따라서 연산 횟수를 줄이기 위해서는 || 연산의 경우 앞에 true가 나올 가능성이 높은 조건을 작성하는 편이 좋다.


    }
}
