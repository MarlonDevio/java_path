package org.calcengine;

import java.util.Scanner;

// calc

/**
 * The Main class is the entry point of the program.
 * It contains the main method and other utility methods
 * for executing calculations and handling user input.
 */
public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations(){
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d,'/');
        equations[1] = create(25.0d, 92.0d,'+');
        equations[2] = create(225.0d, 17.0d,'-');
        equations[3] = create(11.0d, 3.0d,'*');

        for(MathEquation equation : equations){
            equation.execute();
            System.out.println("Result = " + equation.result);
        }
    }


    private static MathEquation create(double leftVal, double rightVal,
                                       char opCode) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;
        return equation;
    }

    /**
     * Executes the program interactively by prompting the user to enter an operation and two numbers.
     * The user input is split into an array of strings.
     */
    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        String[] userInput = scanner.nextLine().split(" ");
        performOperation(userInput);
    }


    private static void performOperation(String[] parts){
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }
    /**
     * Handles the command line arguments and performs the calculation.
     *
     * @param args The command line arguments.
     * @return The result of the calculation.
     */
    private static double handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        return result;
    }


    /**
     * Executes the specified arithmetic operation on the given operands.
     *
     * @param opCode   the arithmetic operation code ('+', '-', '*', '/')
     * @param leftVal  the left operand
     * @param rightVal the right operand
     * @return the result of the arithmetic operation
     */
    static double execute(char opCode, double leftVal, double rightVal) {
        double result = 0;

        return result;
    }


    /**
     * Converts the given operation name to its corresponding operation code.
     *
     * @param operationName the name of the operation
     * @return the operation code
     */
    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    /**
     * Converts a word representation of a number to its corresponding numerical value.
     *
     * @param word the word representation of the number
     * @return the numerical value of the word
     */
    static double valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine"};
        double value = 0d;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        return value;
    }

}
