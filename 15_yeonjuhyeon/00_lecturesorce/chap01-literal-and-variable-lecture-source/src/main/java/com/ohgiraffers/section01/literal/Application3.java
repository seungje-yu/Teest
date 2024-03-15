package com.ohgiraffers.section01.literal;

public class Application3 {

        public static void main(String[] args){

                System.out.println("=========== 두 개의 문자열 합치기 ===========");
                System.out.println(9 + 9);                //18  정수
                System.out.println("9" + 9);              //99 문자열
                System.out.println(9 + "9");              //9쪽 문자
                System.out.println("9" + "9");            //99 문자

                System.out.println("=========== 세 개의 문자열 합치기 ===========");
                System.out.println(9 + 9 + "9");          //189 문자열, 연산 방향은 왼쪽에서 오른
                System.out.println(9 + "9" + 9);          //999 문자열
                System.out.println("9" + 9 + 9);          //999 문자열

                //괄호 안에 있는 연산을 우선 수행
                System.out.println("9" + (9 + 9));        //918 문자열





        }


}
