package com.ohgiraffers.section01.conditional;

public class Application {
    // 실행용클래스
    public static void main(String[] args){

//        A_if aif = new A_if();
//        aif.testNestedIfStatement(); //같은 패키지 안에 있어서 import필요 없음!

        B_ifElse bif = new B_ifElse();
       // bif.testNestedIfElseStatement();

        C_ifElseIf cif = new C_ifElseIf();
      //  cif.testSimpleIfElseIfStatement();

     //   cif.testNestedIfElseIfStatement();

        D_switch dswitch = new D_switch();
        dswitch.testSwitchVendingMachine();
    }
}
