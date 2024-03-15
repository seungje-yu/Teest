package com.ohgiraffers.section01.conditional;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        //실행용 클래스
        A_if aif = new A_if();
        //aif.testSimpleIfStatement(); //단일 if문
        //aif.testNestedIfStatement();   //중첩 if문
        //aif.test();

        B_ifElse bIfElse = new B_ifElse();
        //bIfElse.testSimpleIfElseStatement(); //if-else문
        //bIfElse.testNestedIfElseStatement();

        C_ifElseIf cIfElseIf = new C_ifElseIf();
        //cIfElseIf.testSimpleIfElseStatement();
       // cIfElseIf.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();
        //dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();
    }
}
