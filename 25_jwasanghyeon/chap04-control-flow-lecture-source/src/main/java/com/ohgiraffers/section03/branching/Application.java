package com.ohgiraffers.section03.branching;

public class Application {

    public static void main(String[] args) {

        A_break aBreak = new A_break();
        B_continue bContinue = new B_continue();

        // aBreak.testSimpleBreakStatement();
        // aBreak.testSimpleBreakStatement2();
        // bContinue.testSimpleContinueStatement();
        bContinue.testJumpContinue();
    }
}
