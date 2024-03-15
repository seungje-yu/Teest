package com.ohgiraffers.section01.literal;

public class Application2 {
    /**
     * Arithmetic Operations
     * @param args The arguments of the program
     */
    public static void main(String[] args) {
        // Operations between integers
        System.out.println(123 + 456);  // 579 : add operation
        System.out.println(123 - 23);   // 100 : subtract operation
        System.out.println(123 * 10);   // 1230 : multiply operation
        System.out.println(123 / 10);   // 12 : divide operation
        System.out.println(123 % 10);   // 3 : remainder operation

        // Operations between doubles
        System.out.println(1.23 + 1.23);    // 2.46 : add operation
        System.out.println(1.23 - 0.23);    // 1.0 : subtract operation
        System.out.println(1.23 * 10.0);    // 12.3 : multiply operation
        System.out.println(1.23 / 10.0);    // 0.123 : divide operation
        System.out.println(1.23 % 3.0);     // 1.23 : remainder operation(some error can occur)

        // Operations between integers and doubles
        // ** Operations between integers and doubles => double(extend) **
        System.out.println(123 + 0.5); // 123.5 : add operation(double)
        System.out.println(123 - 0.5); // 122.5 : subtract operation(double)
        System.out.println(123 * 0.5); // 61.5 : multiply operation(double)
        System.out.println(123 / 0.5); // 246.0 : divide operation(double)
        System.out.println(123 % 0.5); // 0.0 : remainder operation(double)

        // Operations between characters
        // ** Operations between characters => integer **
        System.out.println('a' + 'b'); // 195 : add operation
        System.out.println('a' - 'b'); // -1 : subtract operation
        System.out.println('a' * 'b'); // 9506 : multiply operation
        System.out.println('a' / 'b'); // 0 : divide operation
        System.out.println('a' % 'b'); // 97 : remainder operation

        // Operations between characters and integers
        // ** Operations between characters and integers => integer **
        System.out.println('a' + 1); // 98 : add operation
        System.out.println('a' - 1); // 96 : subtract operation
        System.out.println('a' * 2); // 194 : multiply operation
        System.out.println('a' / 2); // 48 : divide operation
        System.out.println('a' % 2); // 1 : remainder operation

        // Operations between characters and doubles
        // ** Operations between characters and doubles => double(extend) **
        System.out.println('a' + 1.0);  // 98.0 : add operation(double)
        System.out.println('a' - 1.0);  // 96.0 : subtract operation(double)
        System.out.println('a' * 2.0);  // 194.0 : multiply operation(double)
        System.out.println('a' / 2.0);  // 48.0 : divide operation(double)
        System.out.println('a' % 2.0);  // 1.0 : remainder operation(double)

        // ** Conclusion: Characters in java are represented by their ASCII values in integer form. **

        // Operations between strings
        System.out.println("Hello" + "World");      // HelloWorld : add operation => concatenation of strings
        // System.out.println("Hello" - "World");   // Error : subtract operation(Operating cannot be applied)
        // System.out.println("Hello" * "World");   // Error : multiply operation(Operating cannot be applied)
        // System.out.println("Hello" / "World");   // Error : divide operation(Operating cannot be applied)
        // System.out.println("Hello" % "World");   // Error : remainder operation(Operating cannot be applied)

        // Operations between strings and another data type
        // ** Operations between strings and another data type => concatenation of strings **
        System.out.println("HelloWorld" + 123);     // HelloWorld123 : add operation => concatenation of strings
        System.out.println("HelloWorld" + 123.456); // HelloWorld123.456 : add operation => concatenation of strings
        System.out.println("HelloWorld" + 'a');     // HelloWorlda : add operation => concatenation of strings
        System.out.println("HelloWorld" + true);    // HelloWorldtrue : add operation => concatenation of strings

        // Operations between strings that contains numbers
        System.out.println("123" + "456");  // 123456 : add operation => concatenation of strings

        // Operations between boolean values => cannot be applied
        // System.out.println(true + false);    // Error : add operation(Operating cannot be applied)
        // System.out.println(true - false);    // Error : subtract operation(Operating cannot be applied)
        // System.out.println(true * false);    // Error : multiply operation(Operating cannot be applied)
        // System.out.println(true / false);    // Error : divide operation(Operating cannot be applied)
        // System.out.println(true % false);    // Error : remainder operation(Operating cannot be applied)

        // System.out.println(true + 1);        // Error : add operation(Operating cannot be applied)
        // System.out.println(true - 1);        // Error : subtract operation(Operating cannot be applied)
        // System.out.println(true * 2);        // Error : multiply operation(Operating cannot be applied)
        // System.out.println(true / 2);        // Error : divide operation(Operating cannot be applied)
        // System.out.println(true % 2);        // Error : remainder operation(Operating cannot be applied)

        // System.out.println(true + 'a');      // Error : add operation(Operating cannot be applied)
        // System.out.println(true - 'a');      // Error : subtract operation(Operating cannot be applied)
        // System.out.println(true * 'a');      // Error : multiply operation(Operating cannot be applied)
        // System.out.println(true / 'a');      // Error : divide operation(Operating cannot be applied)
        // System.out.println(true % 'a');      // Error : remainder operation(Operating cannot be applied)

        // System.out.println(true + "Hello");   // Error : add operation(Operating cannot be applied)
        // System.out.println(true - "Hello");   // Error : subtract operation(Operating cannot be applied)
        // System.out.println(true * "Hello");   // Error : multiply operation(Operating cannot be applied)
        // System.out.println(true / "Hello");   // Error : divide operation(Operating cannot be applied)
        // System.out.println(true % "Hello");   // Error : remainder operation(Operating cannot be applied)
    }
}