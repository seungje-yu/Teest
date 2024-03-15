package com.ohgiraffers.section02.looping;

public class Application {


    public static void main(String[] args) {
        A_for afor = new A_for();
//        afor.testSimpleForStatement();
//        afor.testForExample();
//        afor.testForExample2();
//        afor.testForExample3();
//        afor.testForExample4();
//        afor.testForExample5();

        A_nestedFor aNestedFor = new A_nestedFor();
//        aNestedFor.printGugudanFromTwoToNice();
//        aNestedFor.printStartInputRowTimes();
//        aNestedFor.printTriangleStars();

        B_while bWhile = new B_while();
//        bWhile.testSimpleWhileStatement();
        C_doWhile cDoWhile = new C_doWhile();
//        cDoWhile.testSimpleDoWhileStatement();
        cDoWhile.testDoWhileExample1();
    }



}
