package com.ohgiraffers.section01.conditional;


public class Application1 {

    public static void main(String[] args) {
        //실행용 클래스
        A_if aif= new A_if();
        //aif.testSimpleIfStatement(); //단일 if문

        //aif.testNestedIfStatement(); //중첩 if문

        B_ifElse bif = new B_ifElse();
        //bif.testSimpleIfElseStatement();
        bif.testNestedIfElseStatment();

        C_ifElseIf cif = new C_ifElseIf();
        //cif.testSimpleIfElseIfstatement();
        cif.testNestedIfElseIfStatement();

        D_Switch dSwitch = new D_Switch();
        //dSwitch.TestSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();


    }
}
