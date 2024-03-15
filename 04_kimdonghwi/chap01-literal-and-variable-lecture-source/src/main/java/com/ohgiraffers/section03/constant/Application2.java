package com.ohgiraffers.section03.constant;

public class Application2 {
    /**
     * Naming rules for constants
     * <p>
     * It is same as the naming rules for variables
     * however, there are some differences in the implicit rules among developers
     * <p>
     * 1. All letters are written in uppercase
     * 2. Words are separated by underscores(_)
     * @param args The arguments of the program
     */
    public static void main(String[] args) {
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40; // not recommended : It makes harder to distinguish between constants and variables

        final int MAX_AGE = 20; // use underscore(_) to separate words
        final int MIN_AGE = 10;
        final int minAge = 30;  // not recommended
    }
}
