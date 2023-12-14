package com.fundamentals.loopingandarrays;

public class While {
    public static void main(String[] args) {
        int someValue = 4;
        int factorial = 1;
        while(someValue > factorial){
            factorial*= someValue;
            someValue--;
        }
        System.out.println(factorial);


    }
}
