package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if aif = new A_if();

//        aif.testSimpleIfStatement(); // 단일 if문 테스트
//        aif.testNestedIfStatement(); // 중첩 if문 테스트

        B_ifElse bIfElse = new B_ifElse();

//        bIfElse.testSimpleIfElseStatement(); // if-else문 테스트
//        bIfElse.testNestedIfElseStatement(); // 중첩 if-else문 테스트

        C_ifElseIf cIfElseIf = new C_ifElseIf();

//        cIfElseIf.testSimpleIfElseIFStatement(); // if-else-if문 테스트
//        cIfElseIf.testNestedIfElseIfStatement();
        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();
    }
}
