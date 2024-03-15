package com.ohgiraffers.section02.looping;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class A_for {

            public void testSimpleForStataement() {

                /*
                 *  [for문 표현식]
                 *  for(초기식; 조건식; 증감식) {
                 *      조건을 만족하는 경우 수행할 구문(반복할 구문);
                 *  }
                 */

                /* 1부터 10까지 1씩 증가하면서 i값을 출력하는 기본 반복문 */
                for(int i = 0; i < 10; ++i){
                    System.out.println(i + 1);
                }


            }

            public void testForExample() {

                Scanner sc = new Scanner(System.in);

//                System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
//                String student1 = sc.nextLine();
//                System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
//
//                System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
//                String student2 = sc.nextLine();
//                System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
//
//                System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
//                String student3 = sc.nextLine();
//                System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
//
//                System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
//                String student4 = sc.nextLine();
//                System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
//
//                System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
//                String student5 = sc.nextLine();
//                System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
//
//                System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
//                String student6 = sc.nextLine();
//                System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
//
//                System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
//                String student7 = sc.nextLine();
//                System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
//
//                System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
//                String student8 = sc.nextLine();
//                System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
//
//                System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
//                String student9 = sc.nextLine();
//                System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
//
//                System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
//                String student10 = sc.nextLine();
//                System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
//
//                System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

                /*
                 * 반복횟수 : 총 10번, 초기식 0 => (i+1) 1 => i
                 * 반복할 내용
                 * 1. 안내문구 출력
                 * 2. 학생 이름을 입력받아 변수에 저장
                 * 3. 저장된 이름을 출력
                 */

                for(int i = 1; i <= 10; ++i) {

                    System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
                    String student = sc.nextLine();
                    System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");

                }

                System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");






















            }

            public void testForExample2() {

                /* 1 ~ 10까지의 합계를 구하시오 */

                int num1 = 1;
                int num2 = 2;
                int num3 = 3;
                int num4 = 4;
                int num5 = 5;
                int num6 = 6;
                int num7 = 7;
                int num8 = 8;
                int num9 = 9;
                int num10 = 10;
                
                /* 결과를 누적시켜 담아줄 변수 선언 */
                int sum2 = 0;
                
                sum2 += num1;
                sum2 += num2;
                sum2 += num3;
                sum2 += num4;
                sum2 += num5;
                sum2 += num6;
                sum2 += num7;
                sum2 += num8;
                sum2 += num9;
                sum2 += num10;

                System.out.println("sum2 = " + sum2);

                /*
                 * 반복횟수 : 10번 반복, 초기식 1, 조건식 10까지
                 * 반복 해야할 내용 :
                 * 1. 변수에 1씩 증가하는 값을 담기
                 * 2. 저장된 값을 sum에 누적시키기
                 */
                int sum3 = 0;
                for(int i = 1; i < 11; ++i) {
                    sum3 += i;
                }
                System.out.println("sum3 = " + sum3);

                /*
                int sum = 0;

                for(int i = 1; i <= 10; ++i) {
                    sum += i;
                }

                System.out.println(sum);
                */



            }

            public void testForExample3() {

                /*
                *  5 ~ 10사이의 난수를 발생기켜서
                *  1부터 발생한 난수까지의 합계를 구하시오.
                * */
                
                //int random = (int) (Math.random() * 6) + 5;
                int random = new Random().nextInt(6) + 5;
                System.out.println("random = " + random);
                
                int sum = 0;
                
                if(random == 5) {

                    sum += 1;
                    sum += 2;
                    sum += 3;
                    sum += 4;
                    sum += 5;

                } else if(random == 6) {
                    sum += 1;
                    sum += 2;
                    sum += 3;
                    sum += 4;
                    sum += 5;
                    sum += 6;

                } else if(random == 7) {

                    sum += 1;
                    sum += 2;
                    sum += 3;
                    sum += 4;
                    sum += 5;
                    sum += 6;
                    sum += 7;

                } else if(random == 8) {

                    sum += 1;
                    sum += 2;
                    sum += 3;
                    sum += 4;
                    sum += 5;
                    sum += 6;
                    sum += 7;
                    sum += 8;

                } else if(random == 9) {

                    sum += 1;
                    sum += 2;
                    sum += 3;
                    sum += 4;
                    sum += 5;
                    sum += 6;
                    sum += 7;
                    sum += 8;
                    sum += 9;

                } else {
                }

                System.out.println("1부터 " + random + "까지의 합은 " + sum);

                System.out.println("===================== 개선된 것 =======================");

                /*
                 *  5 ~ 10사이의 난수를 발생기켜서
                 *  1부터 발생한 난수까지의 합계를 구하시오.
                 * */

                /*
                 * 반복횟수 : 5 ~ 10까지 난수만큼, 초기식 1
                 * 반복할 내용 : 1부터 난수까지의 합
                 */

                //int random = (int) (Math.random() * 6) + 5;
                int random1 = new Random().nextInt(6) + 5;
                System.out.println("random1 = " + random1);

                int sum2 = 0;

                /*
                 * 반복횟수 : 5 ~ 1-까지 난수만큼, 초기식 1
                 * 반복할 내용 : 1부터 난수까지의 합
                 */
                for(int i = 1; i <= random1; ++i){
                    sum2 += i;
                }

                System.out.println("1부터 " + random1 + "까지의 합은 " + sum2);
                

            }

            public void testForExample4() {

                /*
                 * 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요.
                 * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결
                 */

                Scanner sc = new Scanner(System.in);

                System.out.print("첫 번째 정수를 입력하세요 : ");
                int first = sc.nextInt();

                System.out.print("두 번째 정수를 입력하세요 : ");
                int second = sc.nextInt();

                int sum = 0;

                if(first > second) {

                    for(int i = second; i <= first; ++i) {
                        sum += i;
                    }

                } else {

                    for(int i = first; i <= second; ++i){
                        sum += i;
                    }

                }

                System.out.println("sum = " + sum);

                int sum2 = 0;
                int min = 0; // 최소값
                int max = 0; // 최대값

                if(first > second) {  // 두 수 중에 큰 값을 찾기

                    min = second;
                    max = first;

                } else {

                    min = first;
                    max = second;

                }

                for(int i = min; i <= max; ++i){
                    sum2 += i;
                }
                System.out.println("sum2 = " + sum2);

            }

            public void printSimpleGugudan() {

                /*
                 * 키보드로 2 ~ 9 사이의 구구단을 입력받아
                 * 2 ~  9 사이인 경우 해당 단의 구구단을 출력하고,
                 * 그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해야 합니다." 출력
                 */

                Scanner sc = new Scanner(System.in);

                System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
                int dan = sc.nextInt();

                if(dan >= 2 && dan <= 9) {

                    for(int i = 1; i <= 9; ++i) {
                        System.out.println(dan + " * " + i + " = " + (dan * i));
                    }

                }else {
                    System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다.");
                }

            }

}
