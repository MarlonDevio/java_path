package com.fundamentals.loopingandarrays;

public class DoWileExample {
    public static void main(String[] args) {
        int iVal = 5;
        while(iVal < 5){
            iVal *= 2;
        }
        do {
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 5);
    }


}
