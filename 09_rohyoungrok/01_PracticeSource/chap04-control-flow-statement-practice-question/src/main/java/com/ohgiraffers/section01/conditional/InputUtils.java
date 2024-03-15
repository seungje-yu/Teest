package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputUtils() { }

    public static int inputNumberWith(String text) {
        System.out.print(text + ": ");
        return SCANNER.nextInt();
    }
    public static double inputDoubleWith(String text) {
        System.out.print(text + ": ");
        return SCANNER.nextDouble();
    }

    public static String inputWith(String text) {
        System.out.print(text + ": ");
        return SCANNER.nextLine();
    }
}
