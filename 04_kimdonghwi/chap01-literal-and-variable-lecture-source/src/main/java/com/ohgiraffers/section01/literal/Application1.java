package com.ohgiraffers.section01.literal;
public class Application1 {
    public static void main(String[] args) {
        System.out.print("a");
        System.out.print("a");

        System.out.println("b");
        System.out.println("c");

        // ** shortcut **
        System.out.println(); // sout

        // custom shortcut :: Live Templates (Settings -> Editor -> Live Templates)
        // Java -> `syso`(System.out.print($END$))
        System.out.print("hello");

        // Literal: a value that is written exactly as it's meant to be interpreted

        // Ctrl + / : single-line comment/uncomment -> `//`
        // Ctrl + Shift + / : block comment/uncomment -> `/* */`

        System.out.println(123); // print integer
        System.out.println(3.14); // print double

        System.out.println('a'); // print character (single quotes)
        // System.out.println('ab'); // error: too many characters in character literal
        // System.out.println(''); // error: empty character literal

        // System.out.println('1'); // 1 is a character, not integer

        System.out.println("hello"); // print string (double quotes) -> string literal
        System.out.println("123"); // print string (double quotes) -> string literal
        // String is a sequence of characters, and it uses double quotes

        // String can be empty 🤣
        System.out.println(""); // print string (double quotes) -> string literal
        System.out.println("a"); // print string (double quotes) -> string literal

        // ***** Character and String are different *****
        // So these are separate data types

        // boolean (true or false) literal
        System.out.println(true); // print boolean
        System.out.println(false); // print boolean
    }
}