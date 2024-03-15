package com.uijin.section02.variable;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 변수의 명명 규칙
         * 변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다.
         * 실무적으로는 굉장히 중요하기 때문에 반드시 숙지해야 하고, 또한 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다.
         */

        int age = 20;
//        int age = 20;     // Variable 'age' is already defined in the scope 에러 발생 -> scope 은 {} 의미. Application3{}에 동일한 변수명 가질 수 없음
//        int true = 1;     // 예약어 사용 불가

        int Age = 10;        // 변수명은 대소문자 구분함
        int True = 10;      // true는 소문자일때 예약어. 대문자는 다른 애로 바라봄

//        int 1age = 20;      // 숫자 시작 안 됨
        int _age = 20;      // 언더스코어는 사용가능. 앞 뒤 중간 다 가능
        int $harp = 20;     // $도 사용 가능. 앞 뒤 중간 다 가능


        // 암묵적 약속
        int asfdasfsdasdafssdsdfsdfssdfsafdsa;      // 이렇게 하지 말기

        // 합성어일 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작
        int maxAge = 20;
        int minAGe = 10;

        String user_name;
        String userName;

        int 나이;     // 권장하지 않는다.

        String s;       // 변수가 어떤 의미인지 파악하기 힘들다.
        String name;        //문자 형태의 이름이 저장되겠구나 의미파악 가능


        int sum = 0;
        int max = 0;
        int min = 0;
        int count = 1;


        String goHome;      // 가능하긴 하지만 가급적 명사 형태 사용하기
        String home;

        boolean isAlive = true;
        boolean isDead = false;     // 가능하긴 하지만 부정형보다는 긍정형이 낫다

    }
}
