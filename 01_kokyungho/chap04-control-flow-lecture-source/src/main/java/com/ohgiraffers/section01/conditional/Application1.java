package com.ohgiraffers.section01.conditional;

public class Application1 {

    public static void main(String[] args) {

        A_if aif = new A_if();
//        aif.testSimpleIfSatement();   // 단일 if문

//        aif.testNestedIfStatement();    // 중첩 if문

        B_ifElse biIfElse = new B_ifElse();

//        biIfElse.testSimpleIfDelseStatement();  // if-else문

//        biIfElse.testNestedIfElseStatement();   // 중첨 if-else문

        C_ifElseIf cIfElseIf = new C_ifElseIf();

//        cIfElseIf.testSimpleIfElseIfStatement();
//        cIfElseIf.testNestedIfElseStatement();

        D_switch dSwitch = new D_switch();

//        dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();
    }

}
