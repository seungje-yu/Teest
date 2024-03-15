package com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {

        A_if aif = new A_if();
//        aif.testSimpleIfStatement(); //단일

//        aif.testNestedIfStatement(); //중첩

        B_ifElse bifElse = new B_ifElse();
//        bifElse.testSimpleIfElseStatement();
//        bifElse.testNestedIfElseStatement();

        C_ifElseIf cIfElseIf = new C_ifElseIf();
//        cIfElseIf.testSimpleIfElseIfStatement();

//        cIfElseIf.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStatement();

        dSwitch.testSwitchVendingMachine();

    }
}
