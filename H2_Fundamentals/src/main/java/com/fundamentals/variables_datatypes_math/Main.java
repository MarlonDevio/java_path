package com.fundamentals.variables_datatypes_math;

public class Main {
    public static void main(String[] args) {

        int myVar;
        myVar = 50;
        System.out.println(myVar);
        int anotherVar = 100;
        System.out.println(anotherVar);
        myVar = anotherVar;
        System.out.println(myVar);

        /* FINAL */
        final int maxStudents;
        final int someVariable = 25;
        final int anotherOne;
        maxStudents = 33;
        anotherOne = maxStudents;
        System.out.println(anotherOne);
//        maxStudents = someVariable;
        System.out.println(maxStudents);

        /* + PRIMITIVE DATATYPES -
        - Built in
        - Foundation
        - Four categories
            - Integer
            - Floating point number
            - Char
            - Boolean
         */

        /* *** INT
         * byte -> 8 bits, min: -128, max 127
         * short -> 16 bits, min: -32768, max 32767
         * int -> 32 bits, min -2147483648, max 2147483647
         * long -> L
         * ***/

        /* FLOATING POINT
        * float -> F, 32 bits, smallest : 1.4 x 10 (-45), largest : 3.4 x 10
         (38)
        * double -> 64 bits, 4.9 x 10 (-324), 1.7 x 10 (308)
        * */

        /* CHAR
         * single Unicode character
         * literal values, between single quotes
         * for Unicode points,  followed by 4-digit hex value
         *
         *
         *  */
        char accentedU = '\u00DA';
        System.out.println(accentedU);

        /* BOOLEAN
         * true / false
         *  */


        /*
         * + Primitive datatypes are stored by value
         * */
        int firstValue = 100;
        int otherValue = firstValue;
        ;
        firstValue = 50;
        System.out.println(otherValue);

        /*
         * + Arithmetic
         * */
        int someValue = 5;
        System.out.println(++someValue);
        System.out.println(someValue++);
        System.out.println(someValue);

        // Precedence
        int testNum = 1;
        System.out.println(++testNum * 3);
        testNum = 1;
        System.out.println(testNum++ * 3);
        System.out.println(testNum * 3);
        testNum = testNum++ * 3;
        System.out.println(testNum);
        testNum = testNum++;
        System.out.println(testNum);
        System.out.println(testNum);
        testNum = ++testNum;
        System.out.println(testNum);

        /*+ TYPE CONVERSION

        */
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        long result1 = byteVal;
        short shortTest = (short) longVal;


        char s = 's';
        var b = s;
    }
}
