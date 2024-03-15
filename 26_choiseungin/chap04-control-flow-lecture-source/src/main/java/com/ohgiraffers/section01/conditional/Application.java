package com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {
        // 실행용 클래스

        A_if a_if = new A_if();
        a_if.testSimpleIfStatement();             // 단일 if문

        a_if.testNestedIfStatement();             // 중첩 if문


        B_ifElse bIfElse = new B_ifElse();

        bIfElse.testSimpleIfElseStatement();      // if-else문

        bIfElse.testNestedIfElseStatement();      // 중첩 if-else문


        C_ifElseIf cIfElseIf = new C_ifElseIf();  // if else-if문

        cIfElseIf.testSimpleIfElseIfStatement();

        cIfElseIf.testNestedIfElseIfStatement();


        D_switch dSwitch = new D_switch();

        dSwitch.testSimpleSwitchStatement();

        dSwitch.testSwitchVendingMachine();
    }
}
