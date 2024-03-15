package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
    //    자바 Ctrl + Shift + 라인 드래그 후 선택한 라인만 주석됨
    //    자바 Shift + 엠터 : 그냥 라인 내려감
    //    Alt _드래그 하면 세로로 라인 복사함
    //    Ctrl + Shift + 방향키 현재 라인 및드래그한 것 이동
    //    Alt + E 상태바 이동
    //    Shift 2번 클릭 전체 검색
    //    soutv 입력 + Tab 변수가 있을때 자동 완성

//변수의 사용 목적
//1. 값에 의미를 부여하기 위한 묵적
//2. 한 번 저장해둔 값을 재사용하기 위한 목적
//3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다

    System.out.println("========== 값에 의미 부여 테스트 ==========");
    System.out.println("보너스를 포함한 급여: " + (10000000 + 200000) + "원");

    int salary = 1000000;
    int bouns = 200000;
    System.out.println("보너스를 포함한 급여: " + (salary + bouns) + "원");

    //재사용의 목적
    System.out.println("========== 변수에 저장한 값 재사용 테스트 ==========");
    /*10명의 고객에게 100포인트를 지급해주는 내용을 출력하시오*/
        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");

    int point = 100;
        System.out.println("1번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");

        System.out.println("========== 변수에 저장한 값 재사용 테스트 ==========");

/*변수는 하나의 값을 저장하고 사용하기 위한 공간이기 보다, 변하는 값을 저장하기 위한 공간이다.*/
    int sum = 0;

    sum = sum + 10;
        System.out.println("sum 에 10을 더하면 현재 sum의 값은? " + sum);

    sum = sum + 10; // 10 + 10
        System.out.println("sum 에 추가로 10을 더하면 현재 sum의 값은? " + sum);







    }
}
