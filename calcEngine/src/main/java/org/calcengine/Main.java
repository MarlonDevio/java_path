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
        double[] leftVals = {100.0, 200.0d, 450.0d, 20.0d};
        double[] rightVals = {50.0d, 17.0d, 225.0d, 3.0d};
        char[] opCodes = {'+', '-', '/', '*'};
        double[] results = new double[opCodes.length];

        // Check the length of the command line arguments
        if (args.length == 0) {
            // If no arguments are provided, perform calculations with predefined values
            for (int i = 0; i < opCodes.length; i++) {
                // Execute the operation for each pair of values and store the result
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            // Print all the results
            for (double result : results) {
                System.out.println(result);
            }
        } else if (args.length == 1 && args[0].equals("interactive")) {
            executeInteractively();
        }
        else if (args.length == 3) {
            // If three arguments are provided, handle them as an operation and two numbers
            double result = handleCommandLine(args);
            // Print the result of the operation
            System.out.println(result);
        } else {
            // If the number of arguments is not 0 or 3, print an error message
            System.out.println("Please provide an operation code and 2 numeric values");
        }

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
        switch (opCode) {
            case '+' -> result = leftVal + rightVal;
            case '-' -> result = leftVal - rightVal;
            case '/' -> result = leftVal != 0 ? leftVal / rightVal : 0;
            case '*' -> result = leftVal * rightVal;
            default -> System.out.println("didnt work");
        }
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
