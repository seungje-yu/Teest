package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    /**
     * [if-else if statement]<br>
     * if(condition1) {<br>
     *    code(if condition1 is true)<br>
     * } else if(condition2) {<br>
     *    code(if condition2 is true)<br>
     * } else {<br>
     *    code(if condition1 and condition2 are false)<br>
     * }
     */
    public void testSimpleIfElseIfStatement() {
        System.out.println("A woodcutter lost his axe in a pond while cutting trees.");
        System.out.println("A mountain spirit appeared in the pond and showed a golden axe, a silver axe, and an iron axe.");
        System.out.println("The spirit asked the woodcutter which of the three axes was his.");

        // Prompt user for input(Scanner, nextLine)
        System.out.println("The spirit said, 'Which of the three axes was yours?'");
        System.out.print("Choose one: golden, silver, or iron: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        // Check woodcutter's answer
        // using equals() method to compare strings
        // The reason we use equals() method to compare strings is that == operator compares the references of the strings, not the content of the strings
        if(answer.equals("golden")) System.out.println("The spirit said, 'You are lying. You are not the owner of the golden axe. I will not give it to you.'");
        else if(answer.equals("silver")) System.out.println("The spirit said, 'You are lying. You are not the owner of the silver axe. I will not give it to you. Go away!'");
        else System.out.println("The spirit said, 'You are honest. You are the owner of the iron axe. I will give all axes to you.'");
    }

    /**
     * [Test Scenario]<br>
     * Professor Yu of ohgiraffers University grades students' test scores by hand and assigns letter grades.
     * If the score is 90 or higher, it is an A, 80 or higher is a B, 70 or higher is a C, 60 or higher is a D, and otherwise it is an F.
     * In addition, he adds '+' to each grade to subdivide the grades, which is somewhat cumbersome.
     * Write a program that automatically inputs students' test scores and outputs their letter grades.
     */
    public void testNestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input(Scanner, nextInt)
        System.out.print("Enter your test point: ");
        int point = sc.nextInt();

        String grade = "";
        if(point >= 90) {
            grade = "A";
            if(point >= 95) grade += '+';
        }
        else if(point >= 80) {
            grade = "B";
            if(point >= 85) grade += '+';
        }
        else if(point >= 70) {
            grade = "C";
            if(point >= 75) grade += '+';
        }
        else if(point >= 60) {
            grade = "D";
            if(point >= 65) grade += '+';
        }
        else grade = "F";

        System.out.println("Your grade is " + grade + ".");

        System.out.println("The program is ending.");

//        StringBuilder result = new StringBuilder();

        // Check student's test point
//        if(point >= 90) {
//            result.append('A');
//            if(point >= 95) result.append('+');
//        }
//        else if(point >= 80) {
//            result.append('B');
//            if(point >= 85) result.append('+');
//        }
//        else if(point >= 70) {
//            result.append('C');
//            if(point >= 75) result.append('+');
//        }
//        else if(point >= 60) {
//            result.append('D');
//            if(point >= 65) result.append('+');
//        }
//        else {
//            result.append('F');
//        }
    }
}
