package com.ohgiraffers.section02.variable;

public class Application3 {

    public static void main(String[] args) {

		int age = 20;
//		int age = 20;	//동일한 변수명을 가지므로 에러 발생

//		int true = 1;	//예약어 사용 불가
//		int for = 20;	//예약어 사용 불가

		//변수명은 대소문자를 구분
		int Age = 20;
		int True = 10;

		//int 1age = 20;	//숫자로 시작해서 에러발생
		int _age = 20;		//언더스코어는 사용 가능하다 처음도 가능하고 중간이나 끝에도 가능하다.
		int $harp = 20;		//$도 사용 가능하다.

		//암묵적 약속
		int abcdefghialabcdefghialabcdefghialabcdefghialabcdefghialabcdefghial;

		//합성어의 첫 단어는 소문자, 두번째 시작 단어는 대문자로 시작
		int maxAge = 20;
		int minAge = 10;

		String user_name;
		String userName;

		int 나이;		//권장하지 않음

		String s;		//변수가 어떤 의미인지 파악하기 어렵다.
		String name;	//문자열 형태의 이름이 저장되겠구나하고 의미가 파악된다.

		int sum = 0;
		int max = 10;
		int min = 0;
		int count = 1;

		String goHome;	// 가능하지만 가급적 명사형으로 짓는다.
		String home;

		boolean isAlive = true;
		boolean isDead = false; //부정형보다는 긍정형이 더 낫다.
	}
}
