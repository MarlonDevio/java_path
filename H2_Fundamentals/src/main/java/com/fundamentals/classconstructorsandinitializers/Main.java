package com.fundamentals.classconstructorsandinitializers;

public class Main {
    public static void main(String[] args) {
        Passenger bob = new Passenger();
        bob.setCheckedBags(3);
        System.out.println(bob.getCheckedBags());
        Passenger nia = new Passenger(2);
        System.out.println(nia.getFreeBags());

//        Passenger cheapJoe = new Passenger(0.4d);
       Passenger geetha = new Passenger(2);
       Passenger santiago = new Passenger(2,3);
    }
}
