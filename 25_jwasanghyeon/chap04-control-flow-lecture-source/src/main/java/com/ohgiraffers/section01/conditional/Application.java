package com.ohgiraffers.section01.conditional;
// 같은 package안에 있어서 import 안해도 A_if 클래스 사용가능
public class Application {

    public static void main(String[] args) {
        // 실행용 클래스

        A_if aif = new A_if();
        B_ifElse bif = new B_ifElse();
        C_ifElseIf cif = new C_ifElseIf();
        D_switch dif = new D_switch();
        // aif.testSimpleIfStatement(); // 단일 if문
        // aif.testNestedIfStatement(); // 중첩 if문
        // bif.testSimplesIfElseStatement();   // if-else문
        // bif.testNestedIfElseStatement();    // if-else 중첩...?
        // cif.testSimpleIfElseIfStatement();
        // cif.testNestedIfElseIfStatement();
        // dif.testSimpleSwitchStatement();
        dif.testSwitchVendingMachine();

    }

}
