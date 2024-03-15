package com.ohgiraffers.section02.looping;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

//            *  [for문 표현식]
//		 *  for(초기식; 조건식; 증감식) {
//		 *      조건을 만족하는 경우 수행할 구문(반복할 구문);
//		 *  }

        /* 1부터 10까지의 1씩 증가시키면서 i값을 출력하는 기본 반복문 */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
    }
    public void testForExample() {

        Scanner sc = new Scanner(System.in);
//
//            System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
//            String student1 = sc.nextLine();
//            System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
//
//            System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
//            String student2 = sc.nextLine();
//            System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
//
//            System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
//            String student3 = sc.nextLine();
//            System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
//
//            System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
//            String student4 = sc.nextLine();
//            System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
//
//            System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
//            String student5 = sc.nextLine();
//            System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
//
//            System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
//            String student6 = sc.nextLine();
//            System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
//
//            System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
//            String student7 = sc.nextLine();
//            System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
//
//            System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
//            String student8 = sc.nextLine();
//            System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
//
//            System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
//            String student9 = sc.nextLine();
//            System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
//
//            System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
//            String student10 = sc.nextLine();
//            System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
//
//            System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

        /*
         * 반복횟수 : 총 10번 , 초기식
         * 반복할 내용
         * 1.안내문구 출력
         * 학생 이름을 입력받아 변수에 저장
         * 3.저장된 이름을 출력
         *
         * */

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");

        }
        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }
    public void testForExample2() {

            /*1~10까지의 합계를 구하시오, 초기식 1, 조건식 10까지
            * 반복해야할 내용: 변수에 1씩 증가하는 값을 담기
            * 저장된 값을 sum에 누적 시키기
            * *
            /

             */
        int sum2 = 0;
        for (int i = 1; i < 11; i++) {
            sum2 += i;

        }
        System.out.println("sum2 = " + sum2);

    }
    public void testForExample3() {


        /*
         * 5~10사이의 난수를 발생시켜서
         * 1부터 발생한 난수까지의 합계 구해보자
         *
         * */
        int random = (int) (Math.random() * 6) + 5;
        System.out.println("random = " + random);

        int sum2 = 0;
        for (int i = 1; i <= random; i++) {
            sum2 += i;
        }

        System.out.println("sum2 = " + sum2);

    }
    public void testForExample4() {
        /*숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요
         * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 :");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 입력 :");
        int second = sc.nextInt();


        int sum = 0;
        if (first > second) {
            for (int i = second; i <= first; i++) {
                sum += i;
            }
        } else {
            for (int i = first; i <= second; i++) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);

        int sum2=0;
        int min=0; //최솟값
        int max=0; //최댓값

        if (first > second) {//두 수중에 큰 값을 찾기
            min=second;
            max=first;

        } else {
            min=first;
            max=second;

        }
        for (int i = min; i <= max; i++) {
            sum2 += i;
        }
        System.out.println(sum2);
    }
    public void printSimpleGugudan() {

        /*키보드로 2~9 사이의 구구단을 입력받아 2~9 사이인 경우 해당 단의 구구단을 출력하고.
         * 그렇지 않은 경우 반드시 2~9사이의 양수를 입력해야합니다. 출력*/

        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 입력 :");
        int dan = sc.nextInt();

        if (dan >= 2 && dan < 9) {
            for(int su=1; su<=9; su++){
                System.out.println(dan+"*"+su+"="+(dan*su));
            }
        } else {
            System.out.println("반드시 2~9사이의 양수를 입력해야합니다.");
        }
    }


}

