package com.ohgiraffers.section02.variable;

public class Application3 {

    public static void main(String[] args){

        /*
        * 변수의 명명 규칙
        * 변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다.
        * 실무적으로는 굉장히 중요하기 때문에 반드시 숙지해야 하고,
        * 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다.
         */

        /*
         *  변수의 명명규칙
         *   1. 컴파일 에러를 발생시키는 규칙
         * 	  1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
         *    1-2. 예약어는 사용이 불가능하다. (자바에서 미리 사용하겠다고 compiler와 약속한 키워드들을 예약어라고 한다.)
         *    1-3. 변수명은 대/소문자를 구분한다. (자바는 대/소문자를 엄격하게 구분하는 언어이다.)
         *    1-4. 변수명은 숫자로 시작할 수 없다. (시작만 할 수 없고 숫자를 섞어서 사용하는 것은 가능하다.)
         *    1-5. 특수 기호는 '_'와 '$'만 사용 가능하다. (따라서 공백을 사용할 수 없다.)
         *
         *   2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙
         *    2-1. 변수명의 길이 제한은 없다.(하지만 적당히 해야겠지?)
         *    2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다. (camel-case)
         *    2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다. (타 언어 네이밍 규칙이다.)
         *    2.3.1 언더스코어 예외 : 상수 사용할 때 언더스코어 사용
         *    2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다. (한글을 취급하는 다양한 방식들이 존재하기 때문에 에러를 유발할 수 있다.)
         *    2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
         *    2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다. (sum, add, avg ...)
         *    2-7. 명사형으로 작성할 수 있도록 한다. (변수는 명사형태 사용 / 메서드(기능)는 동사형태 사용)
         *    2-8. boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다. (isTrue O, (isFalse, isDead X) is가 앞에 붙어 있으면 보통 boolean 형으로 사용함)
         * */

        int age = 20; // 변수 age를 int 자료형으로 선언과 동시에 20(값)으로 초기화 하였음.
        // int age = 20; // { }(scope = 영역) 안에 동일한 이름의 변수를 선언할 수 있음
        // int true = 1; // true(예약어)는 예약어 이므로 사용 불가
        // int for = 20; // for(예약어)는 예약어 이므로 사용 불가

        // 변수명은 대소문자를 구분한다.
        int Age = 20;
        int True = 10; // true -> 예약어 / True -> 예약어가 아니다.

        // int 1age = 20; // 변수명을 숫자로 시작해서 사용 불가
        // _(언더 스코어)는 사용 가능하다. (처음, 중간, 끝 전부 가능)
        int _age = 20;
        int a_ge = 20;
        int age_ = 20;

        int $harp = 20; // $도 사용 가능하다. (처음, 중간, 끝 전부 가능)
        int har$p = 20;

        // 암묵적 약속
        int abcdefghiasldfjoasldkfjewoasdfllllasdf; // 변수명은 길이 제한이 없으나 가독성이 매우 떨어진다.

        // 합성어일 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작 (상수가 아닌 경우에 Camel-case를 따른다.)
        // class 선언할 때 class 명은 시작 단어를 대문자로 사용하기 때문에 일반 변수명과 구분이 필요함
        int maxAge = 20; // max(큰), age(나이) -> 단어와 단어 연결 사용할 때 두 번째 시작 단어는 대문자
        int minAge = 10;

        // 문자열 같은 경우에도 _(언더 스코어) 사용 가능하지만 두 번째 시작 단어를 대문자로 연결
        String user_name;
        String userName;

        int 나이; // 한글은 권장하지 않는다. (에러가 발생할 수도 있고 전세계 공통 언어인 영어 사용 권장)

        String s; // 변수가 어떤 의미인지 파악하기 힘들어서 사용하지 않는다.
        String name; // 문자열 형태의 이름이 저장되겠구나하고 의미가 바로 파악이 된다.

        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        String goHome; // goHome도 가능하긴 하지만 가급적 변수명에는 명사형 사용하고 메서드명은 동사형으로 사용하는 것을 추천함.
        String Home;

        boolean isAlive = true; // 긍정형으로 추천
        boolean isDead = false; // isDead도 변수명 설정 가능하지만, 부정형보다는 긍정형이 더 나은 방식이다.

    }
}