package org.calcengine;

import org.w3c.dom.ls.LSOutput;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    void execute(){
        switch (opCode) {
            case '+' -> result = leftVal + rightVal;
            case '-' -> result = leftVal - rightVal;
            case '/' -> result = leftVal != 0 ? leftVal / rightVal : 0;
            case '*' -> result = leftVal * rightVal;
            default -> System.out.println("didnt work");
        }
    }
}
