package com.ohgiraffers.section02.variable;

public class Application1 {

    /*
    * 변수의 사용 목적
    * 1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드를 읽기 쉬워지고, 협업 및 유지보수에 유리하기 때문이다.)
    * 2. 한 번 저장해둔 값을 재사용하기 위한 목적(변수를 이용하여 코드를 작성하면, 값을 변경할 때도 보다 간편하게 변경할 수 있다.)
    * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.(변하는 값을 저장하기 위한 공간이다.)
    * */

    public static void main(String[] args) {
        System.out.println("=========================== 값에 의미 부여 테스트 ===========================");
        System.out.println("보너스를 포함한 급여 : " + (10000000 + 200000) + "원");
//      자료형 변수명 = 값;
        int salary = 10000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        //재사용의 목적
        System.out.println("=========================== 변수의 저장한 값 재사용 테스트 ===========================");

        /*for (int i = 1; i <=10; i++){
            int point = 1000;
            System.out.println(i + "번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        }*/

        /*int sonnim = 1;
        int point = 100;
        while(sonnim <= 10){
            System.out.println(sonnim + "번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
            sonnim++;
        }*/
        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");
        //한 번에 다 하려하지 말고 차근차근 끊어서 진행해보자!


        System.out.println("=========================== 변수의 저장한 값 변경 테스트 ===========================");

        /*변수는 하나의 값을 저장하고 사용하기 위한 공간이기 보다, 변하는 값을 저장하기 위한 공간이다.
        * */
        int sum = 0;

//      공간      값
        sum = sum + 10;

        System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);
        sum += 10;
        System.out.println("sum에 10이 있었으니 10을 추가로 더하면? " + sum);
        sum += 10;
        System.out.println("sum에 20이 있었으니 10을 추가로 더하면? " + sum);


    }
}