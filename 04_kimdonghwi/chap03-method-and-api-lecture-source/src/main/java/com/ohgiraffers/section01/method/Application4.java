package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        Application4 app4 = new Application4();
        app4.testMethod("GilDong Hong", 20, 'M');

        // app4.testMethod(20, 'M', "John"); // Error
        // must be matched with the number and configuration(like type) of the parameter

        String name = "GilDong Hong";
        int age = 20;
        char gender = 'M';
        app4.testMethod(name, age, gender); // Can pass a variable as an argument
    }

    /**
     * Print the name, age, gender
     * @param name Your name
     * @param age Your age
     * @param gender Your gender(final)
     */
    public void testMethod(String name, int age, final char gender) { // no return type
        // gender = 'F'; // Error : cannot assign a value to final variable
        System.out.println("Your name is " + name + ", age is " + age + ", and Gender is " + gender);
    }
}
