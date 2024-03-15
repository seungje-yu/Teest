package com.ogiraggers.section02.looping;


import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        A_for afor = new A_for();
        //afor.testSimpleForStatement();

        //afor.testForExample();
        //afor.testForExample2();
        // afor.testForExample3();
        //afor.testForExample4();
        //afor.printSimpleGugudan();
        A_nestedFor aNestedFor = new A_nestedFor();
        //aNestedFor.printGugudanFromTwoToNine();
        //aNestedFor.printStarInputRowTimes();
        //aNestedFor.printTriangleStars();
        B_while bwhile = new B_while();
        //bwhile.testSimpleWileStatement();
        //bwhile.testWhileExample1();
        C_doWhile cDoWhile = new C_doWhile();
        //cDoWhile.testSimpleDoWhileStatement();
        cDoWhile.testDoWhileExample1();
    }


}
