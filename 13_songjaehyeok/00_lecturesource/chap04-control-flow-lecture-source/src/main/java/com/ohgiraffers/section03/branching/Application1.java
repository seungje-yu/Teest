package com.ohgiraffers.section03.branching;

public class Application1 {
    public static void main(String[] args) {

        A_break aBreak = new A_break();
        //aBreak.testSimpleBreakStatment();
        //aBreak.testSimpleBreakStatement2();
        aBreak.testJumpBreak();

        B_continue bContinue = new B_continue();
        bContinue.testSimpleContinueStaement();
    }
}
