package com.ogiraggers.section01.conditional;

public class Application1 {
    public static void main(String[] args) {
        // 실행 클래스
        A_if aif = new A_if();
        // aif.testSimpleIfStatement(); //단일 if문

        // aif.testNestedIfElseStatement();


        B_if bIfElse = new B_if();
        //bIfElse.testSimpleIfElseStatement(); //if - else 문
        //bIfElse.testNestedIfElseStatement(); //다중 if-else문

        C_ifElseIf cIfElseIf = new C_ifElseIf();
        //cIfElseIf.testSimpleElseIfStatement();
        // cIfElseIf.testNestedIfElseIfStatement();
        D_switch dSwitch = new D_switch();
        //dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachin();
    }
}
