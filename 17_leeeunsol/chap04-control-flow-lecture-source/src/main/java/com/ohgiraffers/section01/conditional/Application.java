package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        //실행용 클래스
//        A_if aIf = new A_if(); // 같은 패키지 안에 있기때문에 import하지않고 사용가능
//        aIf.testSimpleIfStatement();//단일 if문

//        aIf.testNestedIfStatement();//중첩 if문

//        B_ifElse bIfElse = new B_ifElse();
//        bIfElse.testSimpleIfElseStatement(); // if-else문
//        bIfElse.testNestedIfElseStatement();

//        C_ifElseIf cIfElseIf = new C_ifElseIf();
//        cIfElseIf.testSimpleIfElseIfStatement(); //if-elseif
//        cIfElseIf.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();
    }

}
