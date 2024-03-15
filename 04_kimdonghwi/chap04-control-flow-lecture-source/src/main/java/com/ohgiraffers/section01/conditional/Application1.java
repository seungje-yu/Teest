package com.ohgiraffers.section01.conditional;

public class Application1 {
    public static void main(String[] args) {
        A_if aif = new A_if();
        aif.testSimpleIfStatement();    // single if statement
        aif.testNestedIfStatement();    // nested if statement

        B_ifElse bIfElse = new B_ifElse();
        bIfElse.testSimpleIfElseStatement();    // if-else statement

        C_ifElseIf cIfElseIf = new C_ifElseIf();
        cIfElseIf.testSimpleIfElseIfStatement();    // if-else if statement
        cIfElseIf.testNestedIfElseIfStatement();    // nested if-else if statement

        D_switch dSwitch = new D_switch();
        dSwitch.testSimpleSwitchStatement();    // switch statement
        dSwitch.testSwitchVendingMachine();    // switch statement
    }
}
