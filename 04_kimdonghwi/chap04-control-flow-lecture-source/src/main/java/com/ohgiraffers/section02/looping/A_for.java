package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    /**
     * For statement<br>
     * <blockquote><pre>{@code
     * for(initialization; condition; iteration) {
     *    code
     * }
     * }</pre></blockquote>
     */
    public void testSimpleForStatement() {
        // Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void testForExample2() {
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
//        String student4 = sc.nextLine();
//        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
//
//        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
//        String student5 = sc.nextLine();
//        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
//
//        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
//        String student6 = sc.nextLine();
//        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
//
//        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
//        String student7 = sc.nextLine();
//        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
//
//        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
//        String student8 = sc.nextLine();
//        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
//
//        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
//        String student9 = sc.nextLine();
//        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
//
//        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
//        String student10 = sc.nextLine();
//        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
//
//        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

        // refactored code
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");
        }

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }

    public void testForExample3() {
        // Generate a random number between 5 and 10 and calculate the sum from 1 to the random number.
        int sum = 0;
        int random = (int) (Math.random() * 6) + 5;   // 5 ~ 10 random number
        System.out.println("random number: " + random);

        for (int i = 1; i <= random; i++) {
            sum += i;
        }

        System.out.println("sum: " + sum);
    }

    public void testForExample4() {
        // Enter two numbers and calculate the sum from the smaller number to the larger number.
        // However, the two numbers are entered as different numbers.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        // Solution 1. Use a for loop to calculate the sum in each branched area.
//        int sum = 0;
//        if(first > second) {
//            for(int i = second; i <= first; i++) {
//                sum += i;
//            }
//        } else {
//            for (int i = first; i <= second; i++) {
//                sum += i;
//            }
//        }

        // Solution 2.
//        int min = 0;
//        int max = 0;
//        // int min = Math.min(first, second);
//        // int max = Math.max(first, second);

//        if(first > second) {
//            min = second;
//            max = first;
//        } else {
//            min = first;
//            max = second;
//        }
        // calculate the sum

        // Solution 3. Use a for loop to calculate the sum after swapping the two numbers.
        // swap the two numbers if the first number is greater than the second number
        // make second to be the greater number
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        // calculate the sum from the smaller number to the larger number
        int sum = 0;
        for (int i = first; i <= second; i++) sum += i;

        System.out.println("sum: " + sum);
    }

    public void printSimpleGugudan() {
        // Enter an integer between 2 and 9 from the keyboard.
        // The entered range of integers is used as the multiplication table.
        // If an integer outside the range is entered, "Only integers between 2 and 9 should be entered." is printed and the program is terminated.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer between 2 and 9(is used as the multiplication table): ");
        int dan = sc.nextInt();

//        if(dan < 2 || dan > 9) {
//            System.out.println("Only integers between 2 and 9 should be entered.");
//            return;
//        } else { ; }// todo: code here

        if(dan >= 2 && dan <= 9) {
            for (int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        } else {
            System.out.println("Only integers between 2 and 9 should be entered.");
        }
    }
}