package com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {
        // 실행용 클래스
        A_if aif = new A_if();
//        aif.testSimpleIfStatement(); // 단일 if문

//        aif.testNestedIfStatement(); // 중첩 if문

        B_ifElse bIFElse = new B_ifElse();
//        bIFElse.testSimpleIfElseStatement(); // if-else문

//        bIFElse.testNestedIfElseStatement();

        C_ifElseIF cIfElseIF = new C_ifElseIF();
//        cIfElseIF.testSimpleIfElseIFStatement();
//        cIfElseIF.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();
    }
}
