package com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatemnet(){
        /*
        * break문은 반복문 내에서 사용한다.
        * 해당 반복문을 빠져 나올 때 사용하며, 반복문의 조건문 판단 결과와 상관없이 반복문을 빠져 나올 때 사용한다.
        * 일반적으로 if(조건식){break;} 처럼 사용된다.
        * 단, switch문은 반복문이 아니지만 예외적으로 사요된다.
        * */

        int sum = 0;
        int i = 1;
        while(true){
            sum += i;
            i++;
            if(i > 100){
                break;
                //return으로 변경할경우 출력문에 오류가발생
                // return이 발생하는 순간 이후의 코드는 실행하지않기때문에 발생(속한 반복무 포함 함수내에서 더 이상 진행X ),
                // break는 속한 반복문에서 탈출한 이후에 진행할 코드가 있으면 사용
            }
        }
        System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
    }

    public void testSimpleBreakStatement2(){
        /*
        * 구구단 2~9단까지 출력
        * 단, 각 단의 수가 5보다 큰 경우는 출력을 생략한다.
        * */
        for(int i=2 ; i<=9 ; i++){

            for(int j=1 ; j<=9; j++){
                if(j >5){
                    break;
                }
                System.out.println(i+" * " + j + " = " +(i*j));
            }
            System.out.println();

        }
    }

    public void testJumpBreak(){

        /*라벨을 활용하여 break뒤에 돌아갈 라벨명을 입력하면 라벨명이있는곳까지 돌아감*/
        label : //라벨
        for(;;){
            for (int i=0 ; i<10;i++){
                System.out.println(i);
                if(i==3){
                    break label;
                }
            }
        }
    }

}
