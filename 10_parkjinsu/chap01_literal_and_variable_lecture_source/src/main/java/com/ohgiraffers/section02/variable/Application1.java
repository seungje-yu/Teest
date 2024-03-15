package com.ohgiraffers.section02.variable;

public class Application1 {


    /*
    * 변수의 사용 목적
    * 1. 값에 의미 부여, 협업 및 유지보수 용이
    * 2. 한 번 저장한 값 재사용 목적
    * 3. 시간에 따라 변하는 값 저장 및 사용*/
    public static void main(String[] args){
        System.out.println("================값에 의미 부여==============");
        System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");


        //의미 부여
        int salary = 1000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        //재사용
        /* 10명의 고객에게 100 포인트를 지급해주는 내용을 출력하세요*/

        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println();


        int point = 100;
        System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");

        System.out.println("================변수에 저장된 값 테스트==============");

        //변수는 변하는 값을 저장하는 공간이다.
        System.out.println();

        int sum = 0;
        sum = sum + 10;
        System.out.println("sum에 10을 더하면 현재 sum의 값은" + sum);

        sum = sum + 10;
        System.out.println("sum에 10이 있었으니 10을 추가로 더하면?" + sum);
        sum = sum + 10;
        System.out.println("sum에 20이 있었으니 10을 추가로 더하면?" + sum);
    }
}
