package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        실행용 클래스
        A_if aIf = new A_if();
//        aIf.testSimpleIfStatement(); // 단일 if문
//        aIf.testNestedIfStatement(); // 중첩 if문

        B_ifElse bIfElse = new B_ifElse();
//        bIfElse.testSimpleIfElseStatement(); // if-else문
//        bIfElse.testNestedIfElseStatement();

        C_ifElseIf cIfElseIf = new C_ifElseIf();
//        cIfElseIf.testSimpleIfElseIfStatement();
//        cIfElseIf.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();
    }
}
