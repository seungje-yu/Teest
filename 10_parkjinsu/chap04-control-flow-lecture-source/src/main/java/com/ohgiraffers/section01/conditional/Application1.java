package com.ohgiraffers.section01.conditional;

public class Application1 {
    // Application --> 실행용 클래스 / xxx.java -> 기능용 클래스
    public static void main(String[] args) {

        A_if aif = new A_if();
        B_ifElse bifElse = new B_ifElse();
        C_ifElseIf cifElse = new C_ifElseIf();
        D_switch dSwitch = new D_switch();



//        aif.testSimpleIfStatement(); //단일 if
//        aif.testNestedIfStatement(); //중첩 if
//        bifElse.testSimpleIfElseStatement(); //중첩 if
//        bifElse.testNestedIfElseStatement();
//        cifElse.testSimpleIfElseIfStatement();
//        cifElse.testNestedIfElseIfStatement();
//        dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();

    }
}
