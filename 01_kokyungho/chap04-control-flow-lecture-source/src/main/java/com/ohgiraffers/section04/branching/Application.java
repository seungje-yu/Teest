package com.ohgiraffers.section04.branching;

public class Application {

    public static void main(String[] args) {

        A_break aBreak = new A_break();

//        aBreak.testSimpleBreakStatement();
//        aBreak.testSimpleBreakStatement2();
//        aBreak.testJumpBreak();

        B_continue bContinue = new B_continue();

//        bContinue.testSimpleContinueStatement();
        bContinue.testJumpContinue();

    }
}
