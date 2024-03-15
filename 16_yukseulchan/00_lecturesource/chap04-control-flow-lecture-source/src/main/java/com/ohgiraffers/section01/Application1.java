package com.ohgiraffers.section01;

public class Application1 {
    public static void main(String[] args) {
        // 실행용클래스
        A_if aif = new A_if();
//        aif.testSimpleIfStatement(); // 단일 if문
//        aif.testNestedIfStatement(); // 중첩 if문

        B_ifElse bIfElse = new B_ifElse();
//        bIfElse.testSimpleOfElseStatement(); // if-else문
//        bIfElse.testNestedIfElseStatement();

//        C_ifElseIf cifElse = new C_ifElseIf();
//        cifElse.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStetment();
        dSwitch.testSwitchVendingMachine();
    }
}
