package com.ohgiraffers.section02.variable;

public class Application3 {

    public static void main(String[] args) {

        /* 변수의 명명 규칙
            변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다.
            실무적으로는 굉장히 중요, 반드시 숙지
         *
         *  변수의 명명규칙
         *   1. 컴파일 에러를 발생시키는 규칙
         * 	  1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
         *    1-2. 예약어는 사용이 불가능하다. (자바에서 미리 사용하겠다고 compiler와 약속한 키워드들을 예약어라고 한다.)
         *    1-3. 변수명은 대/소문자를 구분한다. (자바는 대/소문자를 엄격하게 구분하는 언어이다.)
         *    1-4. 변수명은 숫자로 시작할 수 없다. (시작만 할 수 없고 숫자를 섞어서 사용하는 것은 가능하다.)
         *    1-5. 특수 기호는 '_'와 '$'만 사용 가능하다. (따라서 공백을 사용할 수 없다.)
         *   2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙
         *    2-1. 변수명의 길이 제한은 없다.(하지만 적당히 해야겠지?)
         *    2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다. (camel-case)
         *    2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다. (타 언어 네이밍 규칙이다.)
         *    2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다. (한글을 취급하는 다양한 방식들이 존재하기 때문에 에러를 유발할 수 있다.)
         *    2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
         *    2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다.
         *    2-7. 명사형으로 작성할 수 있도록 한다.
         *    2-8. boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다.
         * */
        int age = 20;
        //int age = 20; // 동일한 변수명을 사용했기 때문에 에러 발생
        // int true = 1; // 예약어 사용 불가

        int Age = 20; // 변수명은 대소문 판별함
        int _age = 20; // 언더스코어는 사용 가능하다
        int $harp = 20; // $도 사용 가능하다.

        // 암묵적 약속
        // 합성어 일 경우 첫 단어는 소문자, 두번째 시작 단어는 대문자로 시작
        int maxAge = 20;
        int minAge = 10;
        String userName;

        String s;    // 변수가 어떤 의미인지 내포하자, 이런건 힘듬
        String name; // << 이름이구나

        int sum = 0;
        int max = 10;
        int min = 0;
        int cnt = 1;

        String goHome; // 가능하지만 가급적 명사형태로 사용
        String home;
    }
}
