package com.ohgiraffers.section01.conditional;

public class Application1 {
    //실행용 클래스
    public static void main(String[] args) {

        A_if aif = new A_if();
//        aif.testSimpleIfStatement();    //단일 if문

//        aif.testNestedIfStatement();    //중첩 if문

        B_ifElse bIfElse = new B_ifElse();
//        bIfElse.testSimpleIfElseStatement();    //if-else문
//        bIfElse.testNestedIfElseStatement();

        C_ifElseIf cIfElseIf = new C_ifElseIf();
//        cIfElseIf.testSimpleIfElseIfStatement();
//        cIfElseIf.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMacghine();
    }
}
