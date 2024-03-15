package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    /**
     * [switch statement]<br>
     * switch(comparison variable) <br>
     * - case comparison value1: statement to execute if comparison value1 matches + break; <br>
     * - case comparison value2: statement to execute if comparison value2 matches + break; <br>
     * - default: statement to execute if neither comparison value1 nor comparison value2 matches + break; <br>
     * <br>
     * Executing logic that matches multiple comparison values is similar to if-else-if. <br>
     * Some compatibility is possible, but only integers, characters, and strings can be compared with a switch statement. <br>
     * In other words, real numbers and logical values cannot be compared. <br>
     * You can write logic to execute only if the value of the comparison target matches exactly, and you cannot compare the size. <br>
     * Variables cannot be used in the case clause, only constants can be used. <br><br>
     * - Note: String comparison is possible from Java 7. <br>
     */
    public void testSimpleSwitchStatement() {
        // Enter two integers and an operator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int first = sc.nextInt();
        System.out.print("Enter second integer number: ");
        int second = sc.nextInt();
        System.out.print("Enter an operator(+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        // Calculate the result
        int result = 0;
        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;   // FIXME: must process an exception: division by zero
            case '%':
                result = first % second;
                break;
            default:
                System.out.println("Invalid operator");
        } // default can be omitted, but it is better to specify the reason for omission in the comment
        System.out.println(first + " " + op + " " + second + " = " + result); // e.g. 5 + 3 = 8

        // must process an exception: division by zero
        // TODO: add a try-catch block to handle the exception when dividing by zero
    }

    /**
     * Test string value comparison and break using the switch statement
     * 1. String comparison is possible from JDK 7
     * 2. If you do not use break, it will not stop and move to the next case
     */
    public void testSwitchVendingMachine() {
        System.out.println("========== Vending Machine ==========");
        System.out.println("Cider, Cola, Fanta, Bacchus, Hot6");
        System.out.println("=====================================");
        System.out.print("Choose a drink: ");

        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        int price = 0;

        // non break case test
//        switch (selectedDrink) {
//            case "Cider":
//                System.out.println("You chose Cider.");
//                price = 500;
//            case "Cola":
//                System.out.println("You chose Cola.");
//                price = 600;
//            case "Fanta":
//                System.out.println("You chose Fanta.");
//                price = 700;
//            case "Bacchus":
//                System.out.println("You chose Bacchus.");
//                price = 2000;
//            case "Hot6":
//                System.out.println("You chose Hot6.");
//                price = 3000;
//            default:
//                System.out.println("Invalid drink");
//        }
//        System.out.println("The price of " + selectedDrink + " is " + price + " won.");
//        System.out.println("plz pay the price.");

        // break case test
        System.out.println("========= IMPROVED VENDING MACHINE =========");

        String order = "";
        switch (selectedDrink) {
            case "Cider":
                order = "Cider";
                price = 500;
                break;
            case "Cola":
                order = "Cola";
                price = 600;
                break;
            case "Fanta":
                order = "Fanta";
                price = 700;
                break;
            case "Bacchus":
                order = "Bacchus";
                price = 2000;
                break;
            case "Hot6":
                order = "Hot6";
                price = 3000;
                break;
            default:
                System.out.println("Invalid drink");
                break;
        }
        System.out.println("The price of " + order + " is " + price + " won.");
        System.out.println("plz pay the price.");
    }
}