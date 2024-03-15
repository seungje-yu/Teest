package com.ohgiraffers.section02.variable;

public class Application3 {

    public static void main(String[] args) {

        /* 변수의 명명 규칙
        변수의 이름을 지을 때는 규칙이 있다.
        실무적으로 굉장히 중요, 숙지요망, 좋은 프로그래밍의 첫 단추
         */

        int age = 20;
//        int age = 20;  //동일한 변수명 X
//        int true = 1; //예약어 불가
        int Age = 20;
        int True = 10;
//        int 1age = 29; //숫자로 시작 X
        int _age__ = 20;
        int $harp = 20;

        //암묵적 약속
        int abvdsvwnkofwnekfoewnfekwofnewkfweofnewkfoewnfkowenwko; //적당히
        int maxAge = 20; //합성어는 첫 단어는 소문자, 두번째 단어는 대문자
        int minAge = 10;

        String userName;
        int 나이; // 권장 X
        String s;

        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        String goHome; // 가급적 명사로
        String home;
        boolean isAlive = true;
        boolean isDead = false; // 부정형보다는 긍정형이 낫다.
    }
}
