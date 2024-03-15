package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement(){
        /*
         * [for문 표현식]
         *  for(초기식; 조건식; 증감식) {
         *      조건을 만족하는 경우 수행할 구문(반복할 구문);
         *  }
         * */

        /*
         * 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문
         * */
        for(int i=0; i<10; i++){
            System.out.println(i+1);
        }
    }

    public void testForExample(){
        Scanner sc = new Scanner(System.in);

//        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
//        String student1 = sc.nextLine();
//        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
//
//        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
//        String student2 = sc.nextLine();
//        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
//
//        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
//        String student3 = sc.nextLine();
//        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
//
//        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");


        /*
        * 반복횟수 : 총 10번, 초기식 0=> (i+1), 1=>i
        * 반복할 내용
        * 1. 안내문구 출력
        * 2. 학생 이름을 입력받아 변수에 저장
        * 3. 저장된 이름을 출력
        *
        * 위의 코드에 비해 유지보수를 진행하기 좋다.
        * */

        for(int i=0;i<10;i++){
            System.out.print((i+1)+" 번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println((i+1)+" 번째 학생의 이름은 " + student+ "입니다.");
        }

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다.");
    }

    public void testForExample2(){
        /*
        * 1~10까지의 합계를 구하시오
        * */

        /*결과를 누적시켜 담아줄변수 선언*/
        int sum = 0;
        /*
        * 반복횟수 : 10번, 초기식 1, 조건식 10까지
        * 반복해야할 내용 :
        * 1. 변수에 1씩 증가하는 값을 담기
        * 2. 저장된 값을 sum에 누적시키기
        * */

        for(int i=1;i<11;i++){
            /*1~10까지 합산*/
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void testForExample3(){

        /* 5~10사이의 난수를 발생시켜서
        * 1부터 난수까지의 합계를 구해보자
        *  */

        int random = (int) (Math.random()*6)+5;

        //합계누적
        int sum=0;
        //a+1을한이유 i가 0이아닌 '<'크다의 부등호를 사용하기위해 +1을함
        //+1을안하려면 'i<=a'로 하면 됨
        for(int i=1; i<(random+1); i++){
            sum += i;
        }
        System.out.println("1부터 " + random + "까지의 합은 " + sum);
    }

    public void testForExample4(){
        /*
        * 숫자 두 개를 입력받아 작은 수에서 큰수 까지의 합계를 구하세요
        * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요. : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요. : ");
        int num2 = sc.nextInt();

        int sum = 0;
        if(num1>num2){
            for (int i=num2 ; i<=num1;i++){
                sum+=i;
            }
        }else{
            for (int i=num1 ; i<=num2;i++){
                sum+=i;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println();

        int min=0; //최소
        int max=0;//최대
        int sum2=0;

        if(num1>num2){
            min=num1;
            max=num2;
        }else{
            min=num2;
            max=num1;
        }
        for (int i=min ; i<=max;i++){
            sum+=i;
        }
        System.out.println("sum2 = " + sum2);
    }

    public void testForExample5(){
        /*
        * 키보드로 2~9 사이의 구구단을 입력받아
        * 2~9사이인 경우 해당 단의 구구단을 출력하고,
        * 그렇지 않은 경우 "반드시 2~9사이의 양수를 입력해야합니다." 출력
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
        int dan = sc.nextInt();

        if (2<=dan && dan<=9){
            for(int i=1;i<10;i++){
                System.out.println(dan + " * " + i +" = " + (dan * i));
            }
        }else{
            System.out.println("반드시 2~9사이의 양수를 입력해야합니다.");
        }

    }
}
