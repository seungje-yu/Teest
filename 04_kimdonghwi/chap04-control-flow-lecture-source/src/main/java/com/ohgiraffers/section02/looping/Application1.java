package com.ohgiraffers.section02.looping;

public class Application1 {
    public static void main(String[] args) {
        A_for aFor = new A_for();
        aFor.testSimpleForStatement();    // for statement
        aFor.testForExample2();
        aFor.testForExample3();
        aFor.testForExample4();
        aFor.printSimpleGugudan();

        A_nestedFor aNestedFor = new A_nestedFor();
        aNestedFor.printGugudanFromTwoToNine();    // nested for statement
        aNestedFor.printStarsInputRowTimes();
        aNestedFor.printGugudanOf(3);
        aNestedFor.printStarts(5);
        aNestedFor.printTriangleStars();

        B_while bWhile = new B_while();
        bWhile.testSimpleWhileStatement();    // while statement
        bWhile.testWhileExample1();
        bWhile.testWhileExample2();

        C_doWhile cDoWhile = new C_doWhile();
        cDoWhile.testSimpleDoWhileStatement();    // do-while statement
    }
}
